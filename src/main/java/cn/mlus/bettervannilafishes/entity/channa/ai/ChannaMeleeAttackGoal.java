package cn.mlus.bettervannilafishes.entity.channa.ai;

import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.util.TickHelper;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;

public class ChannaMeleeAttackGoal extends MeleeAttackGoal {
    BvfAbstractFish mob;
    public ChannaMeleeAttackGoal(BvfAbstractFish pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
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
        this.mob.getAttribute(NeoForgeMod.SWIM_SPEED).setBaseValue(2);
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
        TickHelper.tickLater(this.mob.level(),5, () ->{
            if (target.isAlive() && this.mob.isWithinMeleeAttackRange(target)) {
                this.mob.swing(InteractionHand.MAIN_HAND);
                this.mob.doHurtTarget(target);
                this.ticksUntilNextPathRecalculation = 60 + this.mob.getRandom().nextInt(10);
            }
        });
    }
}
