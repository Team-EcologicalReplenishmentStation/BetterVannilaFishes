package cn.mlus.bettervannilafishes.entity.galeocerdocuvier.ai;

import cn.mlus.bettervannilafishes.effect.BvfBleedingEffect;
import cn.mlus.bettervannilafishes.entity.BvfWaterAnimal;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.navigation.SharkNavigation;
import cn.mlus.bettervannilafishes.util.TickHelper;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.NotNull;

public class SharkMeleeAttackGoal extends MeleeAttackGoal {
    BvfWaterAnimal mob;
    private final int bleedingStep;
    private final int maxBleedingAmp;

    public SharkMeleeAttackGoal(BvfWaterAnimal pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        this(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen, 2, 5);
    }

    public SharkMeleeAttackGoal(BvfWaterAnimal pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen, int bleedingStep, int maxBleedingAmp) {
        super(pMob, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        this.mob = pMob;
        this.bleedingStep = bleedingStep;
        this.maxBleedingAmp = maxBleedingAmp;
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
        this.mob.getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(4);
    }

    @Override
    public void stop() {
        super.stop();
        LivingEntity livingentity = this.mob.getTarget();
        if (!EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(livingentity)) {
            this.mob.setTarget(null);
        }

        this.mob.setAggressive(false);
        this.mob.getAttribute(ForgeMod.SWIM_SPEED.get()).setBaseValue(1);
    }

    @Override
    protected void resetAttackCooldown() {
        this.ticksUntilNextAttack = 60;
    }

    @Override
    protected void checkAndPerformAttack(@NotNull LivingEntity pEnemy, double pDistToEnemySqr) {
        double d0 = this.getAttackReachSqr(pEnemy) - 5;
        if (pDistToEnemySqr <= d0 && this.getTicksUntilNextAttack() <= 0) {
            this.resetAttackCooldown();
            this.mob.triggerAnim("extra","attack");
            TickHelper.tickLater(this.mob.level(),15, () ->{
                this.mob.swing(InteractionHand.MAIN_HAND);
                this.mob.doHurtTarget(pEnemy);
                BvfBleedingEffect.giveBleedingEffect(pEnemy, this.bleedingStep, this.maxBleedingAmp);
                this.ticksUntilNextPathRecalculation = 60 + this.mob.getRandom().nextInt(10);
                ((SharkNavigation)this.mob.getNavigation()).alterCreatePath(pEnemy,0,-1);
            });
        }
    }
}
