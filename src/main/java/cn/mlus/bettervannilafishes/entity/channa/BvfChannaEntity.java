package cn.mlus.bettervannilafishes.entity.channa;

import cn.mlus.bettervannilafishes.client.animator.BvfFishAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.GeneralBodyControl;
import cn.mlus.bettervannilafishes.entity.ai.BvfFishMoveControl;
import cn.mlus.bettervannilafishes.entity.channa.ai.ChannaMeleeAttackGoal;
import cn.mlus.bettervannilafishes.entity.cichlid.BvfCichlidEntity;
import cn.mlus.bettervannilafishes.entity.salmon.BvfSalmonEntity;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import cn.mlus.bettervannilafishes.util.BvfUtils;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;

import java.util.function.Predicate;

public abstract class BvfChannaEntity extends BvfAbstractFish implements BvfEntity<BvfChannaEntity> {
    public BvfChannaEntity(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new BvfFishMoveControl(this, false);
        animator = new BvfFishAnimator<>(this);
    }

    private final GeneralAnimator<BvfChannaEntity> animator;

    @Override
    public GeneralAnimator<BvfChannaEntity> getAnimator() {
        return animator;
    }

    @Override
    protected @NotNull BodyRotationControl createBodyControl() {
        return new GeneralBodyControl(this, 10);
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
        this.randomSwimmingGoal = new RandomSwimmingGoal(this, 1, 120);

        Predicate<Entity> dangerousEntity = EntitySelector.NO_SPECTATORS.or((Entity e) -> e instanceof Player || e.getType().is(BvfTagKeys.TOP_PREDATOR));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, LivingEntity.class, 12.0F, 1f, 1.8f, dangerousEntity::test) {
            @Override
            public boolean canUse() {
                super.canUse();
                if (this.toAvoid == null) {
                    this.mob.setSprinting(false);
                    return false;
                } else {
                    Vec3 pathPos = DefaultRandomPos.getPosAway(this.mob, 32, 7, this.toAvoid.position());
                    if (pathPos == null) {
                        return false;
                    } else if (this.toAvoid.distanceToSqr(pathPos.x, pathPos.y, pathPos.z) < this.toAvoid.distanceToSqr(this.mob)) {
                        return false;
                    } else {
                        this.path = this.pathNav.createPath(pathPos.x, pathPos.y, pathPos.z, 0);
                        return this.path != null;
                    }
                }
            }

            @Override
            public void start() {
                super.start();
                this.mob.setSprinting(true);
                this.mob.getAttribute(NeoForgeMod.SWIM_SPEED).setBaseValue(2);
            }

            @Override
            public void stop() {
                super.stop();
                this.mob.setSprinting(false);
                this.mob.getAttribute(NeoForgeMod.SWIM_SPEED).setBaseValue(1);
            }
        });

        this.goalSelector.addGoal(2, new ChannaMeleeAttackGoal(this, 1D, false));
        this.goalSelector.addGoal(3, this.randomSwimmingGoal);

        this.targetSelector.addGoal(0, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, BvfCichlidEntity.class, 120, true, false,
                target -> target.getType() != BvfChannaEntity.this.getType()));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, BvfSalmonEntity.class, 120, true, false,
                target -> true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Salmon.class, 80, true, false,
                target -> true));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<BvfChannaEntity> main = new AnimationController<>(this, "main", 10, state -> {
            RawAnimation builder = RawAnimation.begin();
            if (isInWater()) {
                if (state.isMoving() || BvfUtils.isYMoving(this)) {
                    if (isSprinting()) {
                        builder.thenLoop("animation.quickly_swim");
                    } else {
                        builder.thenLoop("animation.swim");
                    }
                } else {
                    builder.thenLoop("animation.idle");
                }
            } else {
                builder.thenLoop("animation.flop");
            }

            return state.setAndContinue(builder);
        });

        AnimationController<BvfChannaEntity> extra = new AnimationController<>(this, "extra", 2, state -> PlayState.STOP)
                .triggerableAnim("attack", RawAnimation.begin().thenPlay("animation.attack"));
        controllerRegistrar.add(main,extra);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 16.0)
                .add(Attributes.ARMOR, 2.0)
                .add(Attributes.ATTACK_DAMAGE, 2.0)
                .add(Attributes.FOLLOW_RANGE, 24.0)
                .add(Attributes.MOVEMENT_SPEED, 0.5)
                .add(NeoForgeMod.SWIM_SPEED, 1f);
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

    protected SoundEvent getDeathSound() {
        return SoundEvents.TROPICAL_FISH_DEATH;
    }

    protected SoundEvent getHurtSound(@NotNull DamageSource pDamageSource) {
        return SoundEvents.TROPICAL_FISH_HURT;
    }

    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.TROPICAL_FISH_FLOP;
    }

    public abstract float getMinScale();

    public abstract float getMaxScale();

    @Override
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData) {
        if (pReason == MobSpawnType.BUCKET) {
            return pSpawnData;
        } else {
            this.setScale(Mth.randomBetween(this.random, getMinScale(), getMaxScale()));
            return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData);
        }
    }

    @Override
    protected void handleAirSupply(int airSupply) {
    }

    @Override
    public abstract @NotNull ItemStack getBucketItemStack();
}
