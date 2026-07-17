package cn.mlus.bettervannilafishes.entity;

import cn.mlus.bettervannilafishes.entity.ai.BvfFishMoveControl;
import cn.mlus.bettervannilafishes.entity.ai.BvfFollowFlockLeaderGoal;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.behavior.BehaviorUtils;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Math;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public abstract class BvfAbstractFish extends AbstractFish implements GeoEntity{
    @Nullable
    private BvfAbstractFish leader;
    private int schoolSize = 1;

    public BvfAbstractFish(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new BvfFishMoveControl(this,true);
        this.lookControl = new SmoothSwimmingLookControl(this,10);
    }

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    protected static final EntityDataAccessor<Integer> DATA_VARIANT = SynchedEntityData.defineId(BvfAbstractFish.class, EntityDataSerializers.INT);

    protected static final EntityDataAccessor<Float> SCALE = SynchedEntityData.defineId(BvfAbstractFish.class, EntityDataSerializers.FLOAT);

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        entityData.define(DATA_VARIANT, 0);
        entityData.define(SCALE, 1.0f);
    }

    public float getScale(){
        return entityData.get(SCALE);
    }

    public void setScale(float scale){
        entityData.set(SCALE, Math.clamp(scale, 0.8f, 1.2f));
    }

    private boolean killedByTrident = false;

    @Override
    public void die(DamageSource pDamageSource) {
        this.killedByTrident = pDamageSource.is(DamageTypes.TRIDENT);
        super.die(pDamageSource);
    }

    @Nullable
    @Override
    public ItemEntity spawnAtLocation(@NotNull ItemStack pStack) {
        if (pStack.is(ItemTags.FISHES) && this.killedByTrident) {
            pStack.getOrCreateTag().putFloat("Scale", getScale());
        }
        return super.spawnAtLocation(pStack);
    }

    public void travel(@NotNull Vec3 pTravelVector) {
        if (this.isEffectiveAi() && this.isInWater()) {
            this.moveRelative(this.getSpeed(), pTravelVector);
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.9));
            if (this.getTarget() == null) {
                this.setDeltaMovement(this.getDeltaMovement().add(0.0, -0.005, 0.0));
            }
        } else {
            super.travel(pTravelVector);
        }
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        compoundTag.putFloat("Scale", getScale());
    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        setScale(compound.getFloat("Scale"));
    }

    @Override
    public @NotNull EntityDimensions getDimensions(@NotNull Pose pPose) {
        float scale = getScale();
        return this.getType().getDimensions().scale(scale);
    }

    @Override
    public int getMaxSpawnClusterSize() {
        return 10;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<BvfAbstractFish> main = new AnimationController<>(this, "main", 0, state -> {
            RawAnimation builder = RawAnimation.begin();
            if(isInWater()){
                if (isSprinting()) {
                    builder.thenLoop("animation.swim");
                } else {
                    builder.thenLoop("animation.slow_swim");
                }
            }else {
                builder.thenLoop("animation.flop");
            }

            return state.setAndContinue(builder);
        });

        controllerRegistrar.add(main);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 12.0)
                .add(Attributes.MOVEMENT_SPEED,0.7)
                .add(ForgeMod.SWIM_SPEED.get(),1.2);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Nullable
    public RandomSwimmingGoal randomSwimmingGoal;

    @Override
    protected void registerGoals() {
        this.randomSwimmingGoal = new RandomSwimmingGoal(this,1,200){
            @Nullable
            @Override
            protected Vec3 getPosition() {
                return BehaviorUtils.getRandomSwimmablePos(this.mob, 35, 7);
            }
        };

        Predicate<Entity> var = EntitySelector.NO_SPECTATORS.or((Entity e) -> e instanceof Player || e.getType().is(BvfTagKeys.PREDATOR) || e.getType().is(BvfTagKeys.TOP_PREDATOR));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, LivingEntity.class, 14.0F, 1f, 2f, var::test){
            @Override
            public boolean canUse() {
                super.canUse();
                if (this.toAvoid == null) {
                    this.mob.setSprinting(false);
                    return false;
                } else {
                    Vec3 $$0 = DefaultRandomPos.getPosAway(this.mob, 32, 7, this.toAvoid.position());
                    if ($$0 == null) {
                        return false;
                    } else if (this.toAvoid.distanceToSqr($$0.x, $$0.y, $$0.z) < this.toAvoid.distanceToSqr(this.mob)) {
                        return false;
                    } else {
                        this.path = this.pathNav.createPath($$0.x, $$0.y, $$0.z, 0);
                        return this.path != null;
                    }
                }
            }

            @Override
            public void start() {
                super.start();
                this.mob.setSprinting(true);
                this.mob.getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(4);
            }

            @Override
            public void stop() {
                super.stop();
                this.mob.setSprinting(false);
                this.mob.getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(1.2);
            }
        });
        this.goalSelector.addGoal(2, this.randomSwimmingGoal);
        this.goalSelector.addGoal(3, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(5, new BvfFollowFlockLeaderGoal(this));
    }

    @Override
    protected @NotNull BodyRotationControl createBodyControl() {
        return new GeneralBodyControl(this);
    }

    public int getMaxSchoolSize() {
        return super.getMaxSpawnClusterSize();
    }

    protected boolean canRandomSwim() {
        return !this.isFollower();
    }

    public boolean isFollower() {
        return this.leader != null && this.leader.isAlive();
    }

    public BvfAbstractFish startFollowing(BvfAbstractFish pLeader) {
        this.leader = pLeader;
        pLeader.addFollower();
        return pLeader;
    }

    public void stopFollowing() {
        this.leader.removeFollower();
        this.leader = null;
    }

    private void addFollower() {
        ++this.schoolSize;
    }

    private void removeFollower() {
        --this.schoolSize;
    }

    public boolean canBeFollowed() {
        return this.hasFollowers() && this.schoolSize < this.getMaxSchoolSize();
    }

    private int stuckTicks = 0;
    private Vec3 lastStuckPos = Vec3.ZERO;

    public void tick() {
        super.tick();
        if (this.hasFollowers() && this.level().random.nextInt(200) == 1) {
            List<? extends BvfAbstractFish> $$0 = this.level().getEntitiesOfClass(this.getClass(), this.getBoundingBox().inflate(14.0, 14.0, 14.0));
            if ($$0.size() <= 1) {
                this.schoolSize = 1;
            }
        }

        if (!this.level().isClientSide && this.isInWater() && this.tickCount % 20 == 0) {
            if (this.distanceToSqr(this.lastStuckPos) < 0.04D) {
                this.stuckTicks++;
                if (this.stuckTicks >= 3) {
                    this.getNavigation().stop();
                    if (this.randomSwimmingGoal != null) {
                        this.randomSwimmingGoal.trigger();
                    }
                    this.stuckTicks = 0;
                }
            } else {
                this.stuckTicks = 0;
            }
            this.lastStuckPos = this.position();
        }
    }

    public boolean hasFollowers() {
        return this.schoolSize > 1;
    }

    public boolean inRangeOfLeader() {
        return this.distanceToSqr(this.leader) <= 225.0;
    }

    public void pathToLeader() {
        if (this.isFollower()) {
            this.getNavigation().moveTo(this.leader, this.random.nextIntBetweenInclusive(8,12) * 0.1f);
        }

    }

    public void addFollowers(Stream<? extends BvfAbstractFish> pFollowers) {
        pFollowers.limit(this.getMaxSchoolSize() - this.schoolSize).filter((p_27538_) -> p_27538_ != this).forEach((p_27536_) -> p_27536_.startFollowing(this));
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData, @Nullable CompoundTag pDataTag) {
        super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
        if (pSpawnData == null) {
            pSpawnData = new BvfAbstractFish.SchoolSpawnGroupData(this);
        } else {
            this.startFollowing(((BvfAbstractFish.SchoolSpawnGroupData)pSpawnData).leader);
        }

        return pSpawnData;
    }

    public static class SchoolSpawnGroupData implements SpawnGroupData {
        public final BvfAbstractFish leader;

        public SchoolSpawnGroupData(BvfAbstractFish pLeader) {
            this.leader = pLeader;
        }
    }

    @Override
    public void saveToBucketTag(ItemStack pStack) {
        this.addAdditionalSaveData(pStack.getOrCreateTag());
    }
    @Override
    public void loadFromBucketTag(@NotNull CompoundTag pTag) {
        this.readAdditionalSaveData(pTag);
    }

}
