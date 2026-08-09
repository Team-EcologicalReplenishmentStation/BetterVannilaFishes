package cn.mlus.bettervannilafishes.entity.katsuwonus;

import cn.mlus.bettervannilafishes.client.animator.BvfFishAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.ai.BvfFollowFlockLeaderGoal;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animation.PlayState;

public class KatsuwonusPelamisEntity extends BvfAbstractFish implements BvfEntity<KatsuwonusPelamisEntity>, Bucketable {
    private final GeneralAnimator<KatsuwonusPelamisEntity> animator;

    public KatsuwonusPelamisEntity(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
        this.animator = new BvfFishAnimator<>(this);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<KatsuwonusPelamisEntity> main = new AnimationController<>(this, "main", 0, state -> {
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
        AnimationController<KatsuwonusPelamisEntity> extra = new AnimationController<>(this, "extra", 0, state -> PlayState.STOP)
                .triggerableAnim("attack", RawAnimation.begin().thenPlay("animation.attack"));
        controllerRegistrar.add(main, extra);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 15.0)
                .add(Attributes.MOVEMENT_SPEED, 1.0)
                .add(Attributes.ATTACK_DAMAGE, 3.0)
                .add(Attributes.FOLLOW_RANGE, 32.0)
                .add(NeoForgeMod.SWIM_SPEED, 1.5);
    }

    @Override
    public GeneralAnimator<KatsuwonusPelamisEntity> getAnimator() {
        return animator;
    }

    @Override
    public float getScale() {
        return 1.0f;
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide()) {
            animator.tick();
        }
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.5D, false) {
            @Override
            protected void checkAndPerformAttack(@NotNull LivingEntity target) {
                if (!this.canPerformAttack(target)) {
                    return;
                }

                KatsuwonusPelamisEntity.this.triggerAnim("extra", "attack");
                KatsuwonusPelamisEntity.this.doHurtTarget(target);
                resetAttackCooldown();
            }
        });
        this.goalSelector.addGoal(5, new BvfFollowFlockLeaderGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, AbstractFish.class, 80, true, false,
                target -> target.getType() != this.getType() && target.getBbWidth() <= 0.7F));
    }

    @Override
    public int getMaxSchoolSize() {
        return 8;
    }

    @Override
    protected @NotNull InteractionResult mobInteract(@NotNull Player pPlayer, @NotNull InteractionHand pHand) {
        return Bucketable.bucketMobPickup(pPlayer, pHand, this).orElse(super.mobInteract(pPlayer, pHand));
    }

    @Override
    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.KATSUWONUS_PELAMIS_BUCKET.get());
    }
}
