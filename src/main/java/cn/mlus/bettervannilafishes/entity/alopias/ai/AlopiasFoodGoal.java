package cn.mlus.bettervannilafishes.entity.alopias.ai;

import cn.mlus.bettervannilafishes.entity.alopias.AlopiasVulpinusEntity;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.item.ItemEntity;

import java.util.Comparator;
import java.util.EnumSet;

public class AlopiasFoodGoal extends Goal {
    private final AlopiasVulpinusEntity shark;
    private final double speed;
    private final double range;
    private ItemEntity food;
    public AlopiasFoodGoal(AlopiasVulpinusEntity shark, double speed, double range) {
        this.shark = shark; this.speed = speed; this.range = range;
        setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
    }
    @Override public boolean canUse() {
        if (shark.getTarget() != null) return false;
        food = shark.level().getEntitiesOfClass(ItemEntity.class, shark.getBoundingBox().inflate(range),
                item -> item.isAlive() && item.isInWater() && item.getItem().is(ItemTags.FISHES)).stream()
                .min(Comparator.comparingDouble(shark::distanceToSqr)).orElse(null);
        return food != null;
    }
    @Override public boolean canContinueToUse() { return food != null && food.isAlive() && shark.getTarget() == null; }
    @Override public void tick() {
        shark.getLookControl().setLookAt(food, 20, 20);
        shark.getNavigation().moveTo(food, speed);
        if (shark.distanceToSqr(food) < 3.0) {
            shark.triggerAnim("extra", "eat");
            food.discard();
        }
    }
    @Override public void stop() { food = null; shark.getNavigation().stop(); }
}
