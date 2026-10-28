package cn.mlus.bettervannilafishes.entity.dermochelyscoriacea;

import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.galeocerdo.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.behavior.BehaviorUtils;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.navigation.AmphibiousPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.Comparator;
import java.util.EnumSet;

public class DermochelysCoriacea extends Animal implements BvfEntity<DermochelysCoriacea>, software.bernie.geckolib.animatable.GeoEntity {
    private static final double NORMAL_SWIM_SPEED = 0.5D;
    private static final double ESCAPING_SWIM_SPEED = 0.6D;
    private static final double WATER_ACCELERATION = 0.035D;
    private static final EntityDataAccessor<Integer> VARIANT = SynchedEntityData.defineId(DermochelysCoriacea.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Integer> LAND_WALK_FRAME = SynchedEntityData.defineId(DermochelysCoriacea.class, EntityDataSerializers.INT);
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final GeneralAnimator<DermochelysCoriacea> animator = new GeneralAnimator<>(this);

    public DermochelysCoriacea(EntityType<? extends DermochelysCoriacea> type, Level level) {
        super(type, level);
        this.moveControl = new DermochelysCoriaceaMoveControl(this);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(VARIANT, 0);
        builder.define(LAND_WALK_FRAME, -1);
    }

    @Override
    protected @NotNull PathNavigation createNavigation(@NotNull Level level) {
        return new AmphibiousPathNavigation(this, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new PanicGoal(this, 1D) {
            @Override
            public boolean canUse() {
                return super.canUse() && !onGround();
            }

            @Override
            public void start() {
                super.start();
                DermochelysCoriacea.this.setEscaping(true);
            }

            @Override
            public void stop() {
                super.stop();
                DermochelysCoriacea.this.setEscaping(false);
            }
        });
        this.goalSelector.addGoal(1, new AvoidTigerSharkGoal(this));
        this.goalSelector.addGoal(2, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(3, new RandomSwimmingGoal(this, 1.0D, 1));
        this.goalSelector.addGoal(4, new RandomStrollGoal(this, 0.7D, 120, false));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "main", 5, state -> {
            RawAnimation animation = RawAnimation.begin();
            if (this.isInWater()) {
                animation.thenLoop(this.isBaby() ? "animation.swim" : this.isSprinting() ? "animation.quickly_swim" : "animation.swim");
            } else if (this.getLandWalkFrame() >= 0) {
                animation.thenLoop("animation.walk");
            } else {
                animation.thenLoop("animation.idle");
            }
            return state.setAndContinue(animation);
        }));
    }

    @Override
    public void tick() {
        if (!this.level().isClientSide) this.updateLandWalkFrame();
        super.tick();
        if (this.level().isClientSide) this.animator.tick();
    }

    @Override
    public void travel(@NotNull Vec3 travelVector) {
        if (this.isEffectiveAi() && this.isInWater()) {
            this.moveRelative(this.getSpeed(), travelVector);
            this.move(MoverType.SELF, this.getDeltaMovement());
            // Keep Dermochelys coriacea neutrally buoyant while its move control selects a new target.
            this.setDeltaMovement(this.getDeltaMovement().scale(0.9D));
        } else {
            super.travel(travelVector);
        }
    }

    private void updateLandWalkFrame() {
        if (this.isInWater() || this.getNavigation().isDone()) {
            this.entityData.set(LAND_WALK_FRAME, -1);
            return;
        }

        int frame = this.getLandWalkFrame();
        int cycleLength = this.isBaby() ? 15 : 30;
        this.entityData.set(LAND_WALK_FRAME, frame < 0 ? 0 : (frame + 1) % cycleLength);
    }

    private int getLandWalkFrame() {
        return this.entityData.get(LAND_WALK_FRAME);
    }

    private boolean canMoveOnLand() {
        int frame = this.getLandWalkFrame();
        return frame >= 0 && frame <= 15;
    }

    private void setEscaping(boolean escaping) {
        this.setSprinting(escaping);
        if (this.getAttribute(NeoForgeMod.SWIM_SPEED) != null) {
            this.getAttribute(NeoForgeMod.SWIM_SPEED).setBaseValue(escaping ? ESCAPING_SWIM_SPEED : NORMAL_SWIM_SPEED);
        }
    }

    @Override
    public boolean canDrownInFluidType(net.neoforged.neoforge.fluids.FluidType type) {
        return type != NeoForgeMod.WATER_TYPE.value() && super.canDrownInFluidType(type);
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Variant", this.getVariant());
    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        if (tag.contains("Variant", 99)) this.setVariant(tag.getInt("Variant"));
    }

    @Override
    public @Nullable SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor level, @NotNull DifficultyInstance difficulty,
                                                   @NotNull MobSpawnType reason, @Nullable SpawnGroupData spawnData) {
        this.setVariant(level.getRandom().nextInt(2));
        if (level.getRandom().nextFloat() < 0.2F) this.setBaby(true);
        return super.finalizeSpawn(level, difficulty, reason, spawnData);
    }

    public int getVariant() {
        return this.entityData.get(VARIANT);
    }

    public void setVariant(int variant) {
        this.entityData.set(VARIANT, Mth.clamp(variant, 0, 1));
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 60.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.FOLLOW_RANGE, 24.0D)
                .add(NeoForgeMod.SWIM_SPEED, NORMAL_SWIM_SPEED);
    }

    @Override
    public boolean isFood(net.minecraft.world.item.ItemStack stack) {
        return false;
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(@NotNull ServerLevel level, @NotNull AgeableMob partner) {
        DermochelysCoriacea baby = BvfEntities.DERMOCHELYS_CORIACEA.get().create(level);
        if (baby != null) baby.setVariant(level.random.nextInt(2));
        return baby;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public GeneralAnimator<DermochelysCoriacea> getAnimator() {
        return this.animator;
    }

    @Override
    public float getScale() {
        return 1.0F;
    }

    @Override
    public @NotNull EntityDimensions getDefaultDimensions(@NotNull Pose pose) {
        return super.getDefaultDimensions(pose).scale(this.isBaby() ? 0.35F : 1.0F);
    }

    private static class AvoidTigerSharkGoal extends Goal {
        private final DermochelysCoriacea dermochelysCoriacea;
        private GaleocerdoCuvierEntity shark;

        AvoidTigerSharkGoal(DermochelysCoriacea dermochelysCoriacea) {
            this.dermochelysCoriacea = dermochelysCoriacea;
            this.setFlags(EnumSet.of(Flag.MOVE));
        }

        @Override
        public boolean canUse() {
            this.shark = this.dermochelysCoriacea.level().getEntitiesOfClass(GaleocerdoCuvierEntity.class,
                            this.dermochelysCoriacea.getBoundingBox().inflate(20.0D), GaleocerdoCuvierEntity::isAlive).stream()
                    .min(Comparator.comparingDouble(this.dermochelysCoriacea::distanceToSqr))
                    .orElse(null);
            return this.shark != null;
        }

        @Override
        public boolean canContinueToUse() {
            return this.shark != null && this.shark.isAlive() && this.dermochelysCoriacea.distanceToSqr(this.shark) < 576.0D;
        }

        @Override
        public void start() {
            this.dermochelysCoriacea.setEscaping(true);
            this.moveAway();
        }

        @Override
        public void tick() {
            if (this.dermochelysCoriacea.tickCount % 5 == 0) this.moveAway();
        }

        private void moveAway() {
            if (this.shark == null) return;
            Vec3 away = this.dermochelysCoriacea.position().subtract(this.shark.position());
            if (away.lengthSqr() < 1.0E-4D) away = new Vec3(1.0D, 0.0D, 0.0D);
            Vec3 destination = this.dermochelysCoriacea.position().add(away.normalize().scale(18.0D));
            if (!this.dermochelysCoriacea.getNavigation().moveTo(destination.x, destination.y, destination.z, 2.0D)) {
                this.dermochelysCoriacea.getMoveControl().setWantedPosition(destination.x, destination.y, destination.z, 2.0D);
            }
        }

        @Override
        public void stop() {
            this.dermochelysCoriacea.setEscaping(false);
            this.shark = null;
        }
    }

    private static class DermochelysCoriaceaMoveControl extends MoveControl {
        private final DermochelysCoriacea dermochelysCoriacea;

        DermochelysCoriaceaMoveControl(DermochelysCoriacea dermochelysCoriacea) {
            super(dermochelysCoriacea);
            this.dermochelysCoriacea = dermochelysCoriacea;
        }

        @Override
        public void tick() {
            if (!this.dermochelysCoriacea.isInWater()) {
                if (this.dermochelysCoriacea.canMoveOnLand()) {
                    super.tick();
                } else {
                    this.dermochelysCoriacea.setSpeed(0.0F);
                    this.dermochelysCoriacea.setXxa(0.0F);
                    this.dermochelysCoriacea.setZza(0.0F);
                    Vec3 movement = this.dermochelysCoriacea.getDeltaMovement();
                    this.dermochelysCoriacea.setDeltaMovement(0.0D, movement.y, 0.0D);
                }
                return;
            }

            if (this.operation == Operation.MOVE_TO && !this.dermochelysCoriacea.getNavigation().isDone()) {
                double dx = this.wantedX - this.dermochelysCoriacea.getX();
                double dy = this.wantedY - this.dermochelysCoriacea.getY();
                double dz = this.wantedZ - this.dermochelysCoriacea.getZ();
                double horizontal = Math.sqrt(dx * dx + dz * dz);
                float yaw = (float)(Mth.atan2(dz, dx) * Mth.RAD_TO_DEG) - 90.0F;
                this.dermochelysCoriacea.setYRot(this.rotlerp(this.dermochelysCoriacea.getYRot(), yaw, 8.0F));
                this.dermochelysCoriacea.yBodyRot = this.dermochelysCoriacea.getYRot();
                float speed = (float)(this.speedModifier
                        * this.dermochelysCoriacea.getAttributeValue(Attributes.MOVEMENT_SPEED)
                        * this.dermochelysCoriacea.getAttributeValue(NeoForgeMod.SWIM_SPEED));
                this.dermochelysCoriacea.setSpeed(speed);
                this.dermochelysCoriacea.setDeltaMovement(this.dermochelysCoriacea.getDeltaMovement().add(
                        dx / Math.max(horizontal, 1.0D) * speed * WATER_ACCELERATION,
                        dy * speed * WATER_ACCELERATION,
                        dz / Math.max(horizontal, 1.0D) * speed * WATER_ACCELERATION));
            } else if (this.dermochelysCoriacea.getNavigation().isDone()) {
                Vec3 pos = BehaviorUtils.getRandomSwimmablePos(this.dermochelysCoriacea, 32, 7);
                if (pos != null) this.dermochelysCoriacea.getNavigation().moveTo(pos.x, pos.y, pos.z, 1.0D);
            }
        }
    }
}
