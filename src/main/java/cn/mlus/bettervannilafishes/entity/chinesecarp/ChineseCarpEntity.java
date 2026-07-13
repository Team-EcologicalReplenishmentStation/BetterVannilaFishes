package cn.mlus.bettervannilafishes.entity.chinesecarp;

import cn.mlus.bettervannilafishes.client.animator.BvfFishAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
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
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;

public abstract class ChineseCarpEntity extends BvfAbstractFish implements BvfEntity<ChineseCarpEntity> {
    private final GeneralAnimator<ChineseCarpEntity> animator;

    public ChineseCarpEntity(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.animator = new BvfFishAnimator<>(this);
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide) {
            animator.tick();
        }
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 12.0)
                .add(Attributes.MOVEMENT_SPEED,1)
                .add(ForgeMod.SWIM_SPEED.get(),1.5);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<BvfAbstractFish> main = new AnimationController<>(this, "main", 0, state -> {
            RawAnimation builder = RawAnimation.begin();
            if(isInWater()){
                if (isSprinting()) {
                    builder.thenLoop("animation.quickly_swim");
                } else {
                    builder.thenLoop("animation.swim");
                }
            }else {
                builder.thenLoop("animation.flop");
            }

            return state.setAndContinue(builder);
        });

        controllerRegistrar.add(main);
    }

    @Override
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData, @Nullable CompoundTag pDataTag) {
        if (pReason != MobSpawnType.BUCKET) {
            this.setScale(Mth.randomBetween(this.random, 0.8f, 1.2f));
        }
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
    }

    @Override
    public GeneralAnimator<ChineseCarpEntity> getAnimator() {
        return animator;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.SALMON_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.SALMON_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource pDamageSource) {
        return SoundEvents.SALMON_HURT;
    }

    @Override
    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.SALMON_FLOP;
    }
}
