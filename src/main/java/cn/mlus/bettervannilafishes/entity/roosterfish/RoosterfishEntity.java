package cn.mlus.bettervannilafishes.entity.roosterfish;

import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.client.animator.SpearFishAnimator;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.GeneralBodyControl;
import cn.mlus.bettervannilafishes.entity.ai.goal.MoveTowardsFoodGoal;
import cn.mlus.bettervannilafishes.entity.butterflyfish.BvfButterflyfishEntity;
import cn.mlus.bettervannilafishes.entity.clownfish.BvfClownfishEntity;
import cn.mlus.bettervannilafishes.entity.surgeonfish.BvfSurgeonfishEntity;
import cn.mlus.bettervannilafishes.init.BvfItems;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import cn.mlus.bettervannilafishes.util.TickHelper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.behavior.BehaviorUtils;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.TropicalFish;
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

public class RoosterfishEntity extends BvfAbstractFish implements BvfEntity<RoosterfishEntity> {
    private final GeneralAnimator<RoosterfishEntity> animator;

    public RoosterfishEntity(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.animator = new SpearFishAnimator<>(this);
    }

    @Override
    public GeneralAnimator<RoosterfishEntity> getAnimator() {
        return animator;
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide) {
            animator.tick();
        }
    }

    @Override
    protected void registerGoals() {
        this.randomSwimmingGoal = new RandomSwimmingGoal(this, 1, 35) {
            @Nullable
            @Override
            protected Vec3 getPosition() {
                Vec3 pos = BehaviorUtils.getRandomSwimmablePos(this.mob, 35, 3);
                if (pos != null && pos.y < 55) {
                    pos = pos.add(0, 55 - pos.y, 0);
                }
                return pos;
            }
        };

        Predicate<Entity> avoid = EntitySelector.NO_SPECTATORS.and((Entity e) -> e instanceof Player || e.getType().is(BvfTagKeys.TOP_PREDATOR));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, LivingEntity.class, 16.0F, 1.0D, 2.0D, avoid::test) {
            @Override
            public boolean canUse() {
                super.canUse();
                if (this.toAvoid == null) {
                    return false;
                }

                Vec3 pos = DefaultRandomPos.getPosAway(this.mob, 32, 7, this.toAvoid.position());
                if (pos == null) {
                    return false;
                } else if (this.toAvoid.distanceToSqr(pos.x, pos.y, pos.z) < this.toAvoid.distanceToSqr(this.mob)) {
                    return false;
                } else {
                    this.path = this.pathNav.createPath(pos.x, pos.y, pos.z, 0);
                    return this.path != null;
                }
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

        this.goalSelector.addGoal(2, new RoosterfishMeleeAttackGoal(this, 1.35D, false));
        this.goalSelector.addGoal(3, this.randomSwimmingGoal);
        this.goalSelector.addGoal(4, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(5, new MoveTowardsFoodGoal(this, 1.25F, 20F));

        this.targetSelector.addGoal(0, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, AbstractFish.class, 180, true, false, RoosterfishEntity::isSmallTropicalFish));
    }

    private static boolean isSmallTropicalFish(@Nullable LivingEntity entity) {
        return entity instanceof AbstractFish fish
                && !(fish instanceof RoosterfishEntity)
                && fish.getBbWidth() <= 0.7F
                && (fish instanceof TropicalFish
                || fish instanceof BvfClownfishEntity
                || fish instanceof BvfButterflyfishEntity
                || fish instanceof BvfSurgeonfishEntity);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<RoosterfishEntity> main = new AnimationController<>(this, "main", 0, state -> {
            RawAnimation builder = RawAnimation.begin();
            if (isInWater()) {
                if (isSprinting()) {
                    builder.thenLoop("animation.quickly_swim");
                } else {
                    builder.thenLoop("animation.swim");
                }
            } else {
                builder.thenLoop("animation.flop");
            }

            return state.setAndContinue(builder);
        });

        AnimationController<RoosterfishEntity> extra = new AnimationController<>(this, "extra", 0, state -> PlayState.STOP)
                .triggerableAnim("attack", RawAnimation.begin().thenPlay("animation.attack"))
                .triggerableAnim("eat", RawAnimation.begin().thenPlay("animation.attack"));

        controllerRegistrar.add(main, extra);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 12.0D)
                .add(Attributes.MOVEMENT_SPEED, 1.0D)
                .add(ForgeMod.SWIM_SPEED.get(), 1.6D)
                .add(Attributes.ATTACK_DAMAGE, 3.0D)
                .add(Attributes.FOLLOW_RANGE, 48.0D);
    }

    @Override
    public int getMaxSpawnClusterSize() {
        return 2;
    }

    @Override
    public int getMaxSchoolSize() {
        return 2;
    }

    @Override
    protected @NotNull BodyRotationControl createBodyControl() {
        return new GeneralBodyControl(this);
    }

    @Override
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData, @Nullable CompoundTag pDataTag) {
        if (pReason != MobSpawnType.BUCKET) {
            this.setScale(Mth.randomBetween(this.random, 0.8F, 1.2F));
        }
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.COD_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource pDamageSource) {
        return SoundEvents.COD_HURT;
    }

    @Override
    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.ROOSTERFISH_BUCKET.get());
    }

    private static class RoosterfishMeleeAttackGoal extends MeleeAttackGoal {
        private final RoosterfishEntity roosterfish;

        private RoosterfishMeleeAttackGoal(RoosterfishEntity pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
            super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
            this.roosterfish = pMob;
        }

        @Override
        public boolean canUse() {
            return super.canUse() && this.roosterfish.getTarget() != null && this.roosterfish.getTarget().isInWater();
        }

        @Override
        public boolean canContinueToUse() {
            return super.canContinueToUse() && this.roosterfish.getTarget() != null && this.roosterfish.getTarget().isInWater();
        }

        @Override
        public void start() {
            super.start();
            this.roosterfish.setSprinting(true);
        }

        @Override
        public void stop() {
            super.stop();
            this.roosterfish.setSprinting(false);
            this.roosterfish.setAggressive(false);
        }

        @Override
        protected void resetAttackCooldown() {
            this.ticksUntilNextAttack = 30;
        }

        @Override
        protected void checkAndPerformAttack(@NotNull LivingEntity pEnemy, double pDistToEnemySqr) {
            if (pDistToEnemySqr <= this.getAttackReachSqr(pEnemy) && this.getTicksUntilNextAttack() <= 0) {
                this.resetAttackCooldown();
                this.roosterfish.setAggressive(true);
                this.roosterfish.triggerAnim("extra", "attack");
                TickHelper.tickLater(this.roosterfish.level(), 8, () -> {
                    if (pEnemy.isAlive() && this.roosterfish.distanceToSqr(pEnemy) <= this.getAttackReachSqr(pEnemy) + 2.0D) {
                        this.roosterfish.swing(InteractionHand.MAIN_HAND);
                        this.roosterfish.doHurtTarget(pEnemy);
                    }
                });
            }
        }
    }
}

