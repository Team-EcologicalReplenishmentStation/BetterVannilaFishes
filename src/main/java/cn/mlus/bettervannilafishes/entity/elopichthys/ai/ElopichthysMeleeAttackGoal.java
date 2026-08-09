package cn.mlus.bettervannilafishes.entity.elopichthys.ai;

import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.util.TickHelper;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import org.jetbrains.annotations.NotNull;

public class ElopichthysMeleeAttackGoal extends MeleeAttackGoal {
    BvfAbstractFish mob;
    public ElopichthysMeleeAttackGoal(BvfAbstractFish pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        this.mob = pMob;
    }

    @Override
    public boolean canUse() {
        LivingEntity target = this.mob.getTarget();
        return target != null && target.isInWater() && super.canUse();
    }

    @Override
    public boolean canContinueToUse() {
        LivingEntity target = this.mob.getTarget();
        return target != null && target.isInWater() && super.canContinueToUse();
    }

    @Override
    public void start() {
        super.start();
        this.mob.setSprinting(true);
    }

    @Override
    public void stop() {
        super.stop();
        LivingEntity livingentity = this.mob.getTarget();
        if (!EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(livingentity)) {
            this.mob.setTarget(null);
        }

        this.mob.setAggressive(false);
        this.mob.setSprinting(false);
    }

    @Override
    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = 60;
    }

    @Override
    protected void checkAndPerformAttack(@NotNull LivingEntity pEnemy, double pDistToEnemySqr) {
        if (pDistToEnemySqr > this.getAttackReachSqr(pEnemy) || this.getTicksUntilNextAttack() > 0) {
            return;
        }

        this.resetAttackCooldown();
        this.mob.triggerAnim("extra", "attack");
        TickHelper.tickLater(this.mob.level(), 5, () -> {
            if (pEnemy.isAlive() && this.mob.distanceToSqr(pEnemy) <= this.getAttackReachSqr(pEnemy) + 1.0D) {
                this.mob.swing(InteractionHand.MAIN_HAND);
                this.mob.doHurtTarget(pEnemy);
                this.ticksUntilNextPathRecalculation = 60 + this.mob.getRandom().nextInt(10);
            }
        });
    }
}
