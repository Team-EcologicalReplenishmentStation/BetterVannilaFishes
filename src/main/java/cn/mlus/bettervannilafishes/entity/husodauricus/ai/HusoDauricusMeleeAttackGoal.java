package cn.mlus.bettervannilafishes.entity.husodauricus.ai;

import cn.mlus.bettervannilafishes.entity.husodauricus.HusoDauricus;
import cn.mlus.bettervannilafishes.util.TickHelper;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import org.jetbrains.annotations.NotNull;

public class HusoDauricusMeleeAttackGoal extends MeleeAttackGoal {
    private final HusoDauricus mob;

    public HusoDauricusMeleeAttackGoal(HusoDauricus pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
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
    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = 60;
    }

    @Override
    public void stop() {
        LivingEntity livingentity = this.mob.getTarget();
        if (!EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(livingentity)) {
            this.mob.setTarget(null);
        }

        this.mob.setAggressive(false);
    }

    @Override
    protected void checkAndPerformAttack(LivingEntity target, double pDistToEnemySqr) {
        if (!this.isTimeToAttack()) {
            return;
        }
        if (pDistToEnemySqr > 2.25D) {
            return;
        }
        this.resetAttackCooldown();
        this.mob.triggerAnim("extra", "attack");
        TickHelper.tickLater(this.mob.level(), 6, () -> {
            this.mob.swing(InteractionHand.MAIN_HAND);
            this.mob.doHurtTarget(target);
            this.ticksUntilNextPathRecalculation = 60 + this.mob.getRandom().nextInt(10);
        });
    }
}
