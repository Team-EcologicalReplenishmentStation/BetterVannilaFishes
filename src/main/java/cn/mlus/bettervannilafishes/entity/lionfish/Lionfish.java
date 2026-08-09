package cn.mlus.bettervannilafishes.entity.lionfish;

import cn.mlus.bettervannilafishes.client.animator.BvfFishAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.RawAnimation;

import java.util.function.Predicate;

public abstract class Lionfish extends BvfAbstractFish implements BvfEntity<Lionfish> {
    private static final Predicate<LivingEntity> PREDATOR = entity ->
            entity.getType().is(BvfTagKeys.PREDATOR) || entity.getType().is(BvfTagKeys.TOP_PREDATOR);

    private final GeneralAnimator<Lionfish> animator;

    public Lionfish(EntityType<? extends net.minecraft.world.entity.animal.AbstractFish> type, Level level) {
        super(type, level);
        this.animator = new BvfFishAnimator<>(this);
    }

    @Override
    protected boolean shouldAvoidPlayers() { return false; }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new AvoidEntityGoal<>(this, LivingEntity.class, 12.0F, 1.0D, 2.0D, PREDATOR::test));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        AnimationController<Lionfish> main = new AnimationController<>(this, "main", 5, state -> {
            RawAnimation animation = RawAnimation.begin();
            if (!isInWater()) animation.thenLoop("animation.flop");
            else if (isSprinting()) animation.thenLoop("animation.quickly_swim");
            else if (state.isMoving()) animation.thenLoop("animation.swim");
            else animation.thenLoop("animation.idle");
            return state.setAndContinue(animation);
        });
        controllers.add(main);
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide) animator.tick();
    }

    @Override
    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.TROPICAL_FISH_FLOP;
    }

    @Override
    public boolean doHurtTarget(@NotNull net.minecraft.world.entity.Entity target) {
        return super.doHurtTarget(target);
    }

    @Override
    public void playerTouch(@NotNull Player player) {
        if (player instanceof ServerPlayer && player.hurt(this.damageSources().mobAttack(this), 2.0F)) {
            player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 0));
        }
    }

    @Override
    public boolean hurt(@NotNull net.minecraft.world.damagesource.DamageSource source, float amount) {
        boolean hurt = super.hurt(source, amount);
        if (hurt && source.getEntity() instanceof Player player) {
            player.hurt(this.damageSources().thorns(this), 2.0F);
            player.addEffect(new MobEffectInstance(MobEffects.POISON, 200, 0));
        }
        return hurt;
    }

    public static net.minecraft.world.entity.ai.attributes.AttributeSupplier.@NotNull Builder createAttributes() {
        return net.minecraft.world.entity.Mob.createMobAttributes()
                .add(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH, 6.0D)
                .add(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED, 0.7D)
                .add(net.minecraftforge.common.ForgeMod.SWIM_SPEED.get(), 1.2D);
    }

    @Override
    public GeneralAnimator<Lionfish> getAnimator() {
        return animator;
    }
}
