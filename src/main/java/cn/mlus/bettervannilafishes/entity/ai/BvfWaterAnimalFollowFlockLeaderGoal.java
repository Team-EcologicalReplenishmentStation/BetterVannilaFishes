package cn.mlus.bettervannilafishes.entity.ai;

import cn.mlus.bettervannilafishes.entity.BvfWaterAnimal;
import com.mojang.datafixers.DataFixUtils;
import net.minecraft.world.entity.ai.goal.Goal;

import java.util.List;
import java.util.function.Predicate;

public class BvfWaterAnimalFollowFlockLeaderGoal extends Goal {
    private static final int INTERVAL_TICKS = 200;
    private final BvfWaterAnimal mob;
    private int timeToRecalcPath;
    private int nextStartTick;

    public BvfWaterAnimalFollowFlockLeaderGoal(BvfWaterAnimal pFish) {
        this.mob = pFish;
        this.nextStartTick = this.nextStartTick(pFish);
    }

    protected int nextStartTick(BvfWaterAnimal pTaskOwner) {
        return reducedTickDelay(200 + pTaskOwner.getRandom().nextInt(200) % 20);
    }

    public boolean canUse() {
        if (this.mob.hasFollowers()) {
            return false;
        } else if (this.mob.isFollower()) {
            return true;
        } else if (this.nextStartTick > 0) {
            --this.nextStartTick;
            return false;
        } else {
            this.nextStartTick = this.nextStartTick(this.mob);
            Predicate<BvfWaterAnimal> $$0 = (p_25258_) -> p_25258_.canBeFollowed() || !p_25258_.isFollower();
            List<? extends BvfWaterAnimal> $$1 = this.mob.level().getEntitiesOfClass(this.mob.getClass(), this.mob.getBoundingBox().inflate(14.0, 14.0, 14.0), $$0);
            BvfWaterAnimal $$2 = DataFixUtils.orElse($$1.stream().filter(BvfWaterAnimal::canBeFollowed).findAny(), this.mob);
            $$2.addFollowers($$1.stream().filter((p_25255_) -> !p_25255_.isFollower()));
            return this.mob.isFollower();
        }
    }

    public boolean canContinueToUse() {
        return this.mob.isFollower() && this.mob.inRangeOfLeader();
    }

    public void start() {
        this.timeToRecalcPath = 0;
    }

    public void stop() {
        this.mob.stopFollowing();
    }

    public void tick() {
        if (--this.timeToRecalcPath <= 0) {
            this.timeToRecalcPath = this.adjustedTickDelay(10);
            this.mob.pathToLeader();
        }
    }
}
