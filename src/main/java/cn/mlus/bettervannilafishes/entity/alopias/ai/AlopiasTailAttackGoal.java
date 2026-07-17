package cn.mlus.bettervannilafishes.entity.alopias.ai;

import cn.mlus.bettervannilafishes.entity.alopias.AlopiasVulpinusEntity;
import cn.mlus.bettervannilafishes.util.TickHelper;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;

public class AlopiasTailAttackGoal extends MeleeAttackGoal {
    private final AlopiasVulpinusEntity shark;
    public AlopiasTailAttackGoal(AlopiasVulpinusEntity shark, double speed) {
        super(shark, speed, false);
        this.shark = shark;
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
        super.stop();
        LivingEntity livingentity = this.mob.getTarget();
        if (!EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(livingentity)) {
            this.mob.setTarget(null);
        }

        this.mob.setAggressive(false);
        this.mob.getAttribute(NeoForgeMod.SWIM_SPEED).setBaseValue(1);
    }

    @Override protected void resetAttackCooldown() { this.ticksUntilNextAttack = 45; }
    @Override protected void checkAndPerformAttack(@NotNull LivingEntity target) {
        resetAttackCooldown();
        shark.triggerAnim("extra", "tail_attack");
        TickHelper.tickLater(shark.level(), 10, () -> {
            if (target.isAlive() && shark.isWithinMeleeAttackRange(target)) {
                shark.swing(InteractionHand.MAIN_HAND);
                shark.doHurtTarget(target);
            }
        });
    }
}
