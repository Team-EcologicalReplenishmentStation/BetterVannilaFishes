package cn.mlus.bettervannilafishes.entity.surgeonfish;

import cn.mlus.bettervannilafishes.client.animator.BvfFishAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.GeneralBodyControl;
import cn.mlus.bettervannilafishes.entity.ai.BvfFishMoveControl;
import cn.mlus.bettervannilafishes.util.BvfUtils;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;

import java.util.UUID;

public abstract class BvfSurgeonfishEntity extends BvfAbstractFish implements BvfEntity<BvfSurgeonfishEntity> {
    public BvfSurgeonfishEntity(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new BvfFishMoveControl(this,false);
        animator = new BvfFishAnimator<>(this);
    }

    private final GeneralAnimator<BvfSurgeonfishEntity> animator;
    public GeneralAnimator<BvfSurgeonfishEntity> getAnimator() {
        return animator;
    }

    @Override
    protected @NotNull BodyRotationControl createBodyControl() {
        return new GeneralBodyControl(this,10);
    }

    @Override
    public void tick() {
        super.tick();
        if(level().isClientSide)
            animator.tick();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<BvfSurgeonfishEntity> main = new AnimationController<>(this, "main", 5, state -> {
            RawAnimation builder = RawAnimation.begin();
            if(isInWater()){
                if(BvfUtils.isMoving(this)){
                    if (isSprinting()) {
                        builder.thenLoop("animation.swim");
                    } else {
                        builder.thenLoop("animation.slow_swim");
                    }
                }else {
                    builder.thenLoop("animation.idle");
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
                .add(Attributes.MAX_HEALTH, 6.0)
                .add(Attributes.MOVEMENT_SPEED,0.4)
                .add(ForgeMod.SWIM_SPEED.get(),0.6);
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
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @org.jetbrains.annotations.Nullable SpawnGroupData pSpawnData, @org.jetbrains.annotations.Nullable CompoundTag pDataTag) {
        if (pReason == MobSpawnType.BUCKET) {
            return pSpawnData;
        } else {
            this.setScale(Mth.randomBetween(this.random, getMinScale(), getMaxScale()));
            return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
        }
    }

    @Override
    public int getMaxSchoolSize() {
        return 6;
    }

    private static final UUID SPEED_MODIFIER_SPRINTING_UUID = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
    private static final AttributeModifier SPEED_MODIFIER_SPRINTING = new AttributeModifier(SPEED_MODIFIER_SPRINTING_UUID, "Sprinting speed boost", 0.70D,AttributeModifier.Operation.MULTIPLY_TOTAL);

    @Override
    public void setSprinting(boolean pSprinting) {
        this.setSharedFlag(3, pSprinting);
        if (this.level().isClientSide) {
            return;
        }

        if (this.level().getServer() == null) {
            return;
        }

        if (this.level().getServer().isSameThread()) {
            this.applySprintingSpeedModifier(pSprinting);
            return;
        }

        this.level().getServer().execute(() -> {
            if (!this.isRemoved()) {
                this.applySprintingSpeedModifier(this.isSprinting());
            }
        });
    }

    private void applySprintingSpeedModifier(boolean sprinting) {
        AttributeInstance attributeinstance = this.getAttribute(Attributes.MOVEMENT_SPEED);
        if (attributeinstance == null) {
            return;
        }

        if (attributeinstance.getModifier(SPEED_MODIFIER_SPRINTING_UUID) != null) {
            attributeinstance.removeModifier(SPEED_MODIFIER_SPRINTING);
        }

        if (sprinting) {
            attributeinstance.addTransientModifier(SPEED_MODIFIER_SPRINTING);
        }
    }
}
