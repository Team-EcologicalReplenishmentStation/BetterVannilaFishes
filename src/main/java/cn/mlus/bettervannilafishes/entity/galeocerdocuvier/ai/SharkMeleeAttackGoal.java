package cn.mlus.bettervannilafishes.entity.galeocerdocuvier.ai;

import cn.mlus.bettervannilafishes.effect.BvfBleedingEffect;
import cn.mlus.bettervannilafishes.entity.BvfWaterAnimal;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.navigation.SharkNavigation;
import cn.mlus.bettervannilafishes.util.TickHelper;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;

public class SharkMeleeAttackGoal extends MeleeAttackGoal {
    BvfWaterAnimal mob;
    public SharkMeleeAttackGoal(BvfWaterAnimal pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        this.mob = pMob;
    }

    @Override
    public boolean canUse() {
        return super.canUse() && mob.getTarget().isInWater();
    }

    @Override
    public boolean canContinueToUse() {
        return super.canContinueToUse() && mob.getTarget().isInWater();
    }

    @Override
    public void start() {
        super.start();
        this.mob.getAttribute(NeoForgeMod.SWIM_SPEED).setBaseValue(4);
    }

    @Override
    public void stop() {
        LivingEntity livingentity = this.mob.getTarget();
        if (!EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(livingentity)) {
            this.mob.setTarget(null);
        }

        this.mob.setAggressive(false);
        this.mob.getAttribute(NeoForgeMod.SWIM_SPEED).setBaseValue(1);
    }

    @Override
    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = 60;
    }

    @Override
    protected void checkAndPerformAttack(@NotNull LivingEntity target) {
        if (!this.canPerformAttack(target)) {
            return;
        }

        this.resetAttackCooldown();
        this.mob.triggerAnim("extra","attack");

        TickHelper.tickLater(this.mob.level(),15, () ->{
            if (target.isAlive() && this.mob.isWithinMeleeAttackRange(target)) {
                this.mob.swing(InteractionHand.MAIN_HAND);
                this.mob.doHurtTarget(target);
                BvfBleedingEffect.giveBleedingEffect(target,2,5);
                this.ticksUntilNextPathRecalculation = 60 + this.mob.getRandom().nextInt(10);
                ((SharkNavigation)this.mob.getNavigation()).alterCreatePath(target,0,-1);
            }
        });
    }
}
