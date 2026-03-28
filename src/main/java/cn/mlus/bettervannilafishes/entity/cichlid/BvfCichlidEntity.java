package cn.mlus.bettervannilafishes.entity.cichlid;

import cn.mlus.bettervannilafishes.client.animator.BvfFishAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.GeneralBodyControl;
import cn.mlus.bettervannilafishes.entity.ai.BvfFishMoveControl;
import cn.mlus.bettervannilafishes.util.BvfUtils;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;

public abstract class BvfCichlidEntity extends BvfAbstractFish implements BvfEntity<BvfCichlidEntity> {
    public BvfCichlidEntity(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new BvfFishMoveControl(this,false);
        animator = new BvfFishAnimator<>(this);
    }

    private final GeneralAnimator<BvfCichlidEntity> animator;
    public GeneralAnimator<BvfCichlidEntity> getAnimator() {
        return animator;
    }

    @Override
    protected @NotNull BodyRotationControl createBodyControl() {
        return new GeneralBodyControl(this, 10);
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide)
            animator.tick();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<BvfCichlidEntity> main = new AnimationController<>(this, "main", 5, state -> {
            RawAnimation builder = RawAnimation.begin();
            if (isInWater()) {
                if (BvfUtils.isMoving(this)) {
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

        controllerRegistrar.add(main);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 8.0)
                .add(Attributes.MOVEMENT_SPEED, 0.5)
                .add(NeoForgeMod.SWIM_SPEED, 1.0f);
    }

    public abstract @NotNull ItemStack getBucketItemStack();

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
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @org.jetbrains.annotations.Nullable SpawnGroupData pSpawnData) {
        if (pReason == MobSpawnType.BUCKET) {
            return pSpawnData;
        } else {
            this.setScale(Mth.randomBetween(this.random, getMinScale(), getMaxScale()));
            return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData);
        }
    }

    @Override
    public int getMaxSchoolSize() {
        return 6;
    }
}
