package cn.mlus.bettervannilafishes.entity.ai.goal;

import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;

public class MoveTowardsFoodGoal extends Goal {
    private final PathfinderMob mob;
    @Nullable
    private ItemEntity target;
    private double wantedX;
    private double wantedY;
    private double wantedZ;
    private final double speedModifier;
    private final float within;
    private int nextSearchTick;

    public MoveTowardsFoodGoal(PathfinderMob pMob, double pSpeedModifier, float pWithin) {
        this.mob = pMob;
        this.speedModifier = pSpeedModifier;
        this.within = Math.min(pWithin, 8.0F);
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }


    public boolean canUse() {
        if (--this.nextSearchTick > 0) return false;
        this.nextSearchTick = 20;
        if (!this.mob.isInWater()) return false;
        List<ItemEntity> entities = this.mob.level().getEntitiesOfClass(ItemEntity.class, this.mob.getBoundingBox().inflate(this.within),
                itemEntity -> itemEntity.isAlive() && itemEntity.isInWater() && itemEntity.getItem().is(ItemTags.FISHES));

        if(!entities.isEmpty()){
            this.target = entities.get(0);
        }

        if (this.target == null) {
            return false;
        } else if (this.target.distanceToSqr(this.mob) > (double)(this.within * this.within)) {
            return false;
        } else {
            Vec3 vec3 = DefaultRandomPos.getPosTowards(this.mob, 16, 7, this.target.position(), (float)Math.PI / 2F);
            if (vec3 == null) {
                return false;
            } else {
                this.wantedX = vec3.x;
                this.wantedY = vec3.y;
                this.wantedZ = vec3.z;
                return true;
            }
        }
    }

    @Override
    public void stop() {
        if (this.mob.isInWater() && target != null && target.isAlive() && target.isInWater()
                && target.distanceToSqr(this.mob) <= 2.25D) {
            if(mob instanceof BvfAbstractFish entity){
                entity.triggerAnim("extra", "eat");
            }
            target.discard();
        }
        target = null;
    }

    public boolean canContinueToUse() {
        return this.mob.isInWater() && this.target != null && this.target.isAlive() && this.target.isInWater()
                && this.target.distanceToSqr(this.mob) < (double) (this.within * this.within);
    }


    public void start() {
        this.mob.getNavigation().moveTo(this.wantedX, this.wantedY, this.wantedZ, this.speedModifier);
    }

    @Override
    public void tick() {
        if (this.mob.isInWater() && this.target != null && this.target.isAlive() && this.target.isInWater()
                && this.target.distanceToSqr(this.mob) <= 2.25D) {
            if (this.mob instanceof BvfAbstractFish entity) {
                entity.triggerAnim("extra", "eat");
            }
            this.target.discard();
            this.target = null;
            this.mob.getNavigation().stop();
        } else if (this.mob.isInWater() && this.target != null && this.target.isAlive() && this.target.isInWater()) {
            // Re-target the item when water navigation finishes at an approximate node.
            this.mob.getNavigation().moveTo(this.target, this.speedModifier);
        }
    }
}
