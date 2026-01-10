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

    public MoveTowardsFoodGoal(PathfinderMob pMob, double pSpeedModifier, float pWithin) {
        this.mob = pMob;
        this.speedModifier = pSpeedModifier;
        this.within = pWithin;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }


    public boolean canUse() {
        List<ItemEntity> entities = this.mob.level().getEntitiesOfClass(ItemEntity.class, this.mob.getBoundingBox().inflate(20),
                itemEntity -> itemEntity.isAlive() && itemEntity.getItem().is(ItemTags.FISHES));

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
        if (target != null) {
            if(mob instanceof BvfAbstractFish entity){
                entity.triggerAnim("extra", "eat");
            }
            target.discard();
        }
    }

    public boolean canContinueToUse() {
        return !this.mob.getNavigation().isDone() && this.target.isAlive() && this.target.distanceToSqr(this.mob) < (double)(this.within * this.within);
    }


    public void start() {
        this.mob.getNavigation().moveTo(this.wantedX, this.wantedY, this.wantedZ, this.speedModifier);
    }
}
