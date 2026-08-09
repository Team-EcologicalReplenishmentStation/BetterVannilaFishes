package cn.mlus.bettervannilafishes.entity.elopichthys;

import cn.mlus.bettervannilafishes.client.animator.BvfFishAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.GeneralBodyControl;
import cn.mlus.bettervannilafishes.entity.ai.BvfFishMoveControl;
import cn.mlus.bettervannilafishes.entity.ai.goal.MoveTowardsFoodGoal;
import cn.mlus.bettervannilafishes.entity.elopichthys.ai.ElopichthysMeleeAttackGoal;
import cn.mlus.bettervannilafishes.init.BvfItems;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import cn.mlus.bettervannilafishes.util.BvfUtils;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;

import java.util.function.Predicate;

public class ElopichthysBambusa extends BvfAbstractFish implements BvfEntity<ElopichthysBambusa> {
    private final GeneralAnimator<ElopichthysBambusa> animator;

    public ElopichthysBambusa(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new BvfFishMoveControl(this, false);
        this.animator = new BvfFishAnimator<>(this);
    }

    @Override
    public GeneralAnimator<ElopichthysBambusa> getAnimator() {
        return this.animator;
    }

    @Override
    protected @NotNull BodyRotationControl createBodyControl() {
        return new GeneralBodyControl(this, 10);
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide) {
            this.animator.tick();
        }
    }

    @Override
    protected void registerGoals() {
        this.randomSwimmingGoal = new RandomSwimmingGoal(this, 1, 120);
        Predicate<Entity> dangerousEntity = EntitySelector.NO_SPECTATORS.and(
                entity -> entity instanceof Player || entity.getType().is(BvfTagKeys.TOP_PREDATOR));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, LivingEntity.class, 12.0F, 2.4f, 2.4f, dangerousEntity::test) {
            @Override
            public boolean canUse() {
                super.canUse();
                if (this.toAvoid == null) {
                    this.mob.setSprinting(false);
                    return false;
                }
                Vec3 pathPos = net.minecraft.world.entity.ai.util.DefaultRandomPos.getPosAway(this.mob, 32, 7, this.toAvoid.position());
                if (pathPos == null) {
                    return false;
                }
                if (this.toAvoid.distanceToSqr(pathPos.x, pathPos.y, pathPos.z) < this.toAvoid.distanceToSqr(this.mob)) {
                    return false;
                }
                this.path = this.pathNav.createPath(pathPos.x, pathPos.y, pathPos.z, 0);
                return this.path != null;
            }

            @Override
            public void start() {
                super.start();
                this.mob.setSprinting(true);
            }

            @Override
            public void stop() {
                super.stop();
                this.mob.setSprinting(false);
            }
        });

        this.goalSelector.addGoal(2, new ElopichthysMeleeAttackGoal(this, 2.4D, false));
        this.goalSelector.addGoal(3, new MoveTowardsFoodGoal(this, 1.2D, 8.0F));
        this.goalSelector.addGoal(3, this.randomSwimmingGoal);
        this.goalSelector.addGoal(4, new TryFindWaterGoal(this));

        this.targetSelector.addGoal(0, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, AbstractFish.class, 10, true, false,
                target -> target.getType() != this.getType()
                        && !target.getType().is(BvfTagKeys.PREDATOR)
                        && !target.getType().is(BvfTagKeys.TOP_PREDATOR)));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<ElopichthysBambusa> main = new AnimationController<>(this, "main", 10, state -> {
            RawAnimation builder = RawAnimation.begin();
            if (isInWater()) {
                if (state.isMoving() || BvfUtils.isYMoving(this)) {
                    builder.thenLoop(isSprinting() ? "animation.quickly_swim" : "animation.swim");
                } else {
                    builder.thenLoop("animation.idle");
                }
            } else {
                builder.thenLoop("animation.flop");
            }
            return state.setAndContinue(builder);
        });
        AnimationController<ElopichthysBambusa> extra = new AnimationController<>(this, "extra", 2, state -> PlayState.STOP)
                .triggerableAnim("attack", RawAnimation.begin().thenPlay("animation.attack"))
                .triggerableAnim("eat", RawAnimation.begin().thenPlay("animation.attack"));
        controllerRegistrar.add(main, extra);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0)
                .add(Attributes.ARMOR, 0.0)
                .add(Attributes.ATTACK_DAMAGE, 6.0)
                .add(Attributes.FOLLOW_RANGE, 48.0)
                .add(Attributes.MOVEMENT_SPEED, 0.75)
                .add(ForgeMod.SWIM_SPEED.get(), 2f);
    }

    private float getMinScale() {
        return 0.9f;
    }

    private float getMaxScale() {
        return 1.2f;
    }

    @Override
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData, @Nullable CompoundTag pDataTag) {
        if (pReason != MobSpawnType.BUCKET) {
            this.setScale(Mth.randomBetween(this.random, getMinScale(), getMaxScale()));
        }
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
    }

    @Override
    public void aiStep() {
        if (!this.isInWater()) {
            this.setOnGround(false);
            this.hasImpulse = false;
        }
        super.aiStep();
    }

    @Override
    public boolean removeWhenFarAway(double pDistanceToClosestPlayer) {
        return false;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.TROPICAL_FISH_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource pDamageSource) {
        return SoundEvents.TROPICAL_FISH_HURT;
    }

    @Override
    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.TROPICAL_FISH_FLOP;
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.ELOPICHTHYS_BAMBUSA_BUCKET.get());
    }
}

