package cn.mlus.bettervannilafishes.entity.ai.navigation;

import java.util.Objects;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.Path;
import net.minecraft.world.phys.Vec3;

public class LargeFishNavigation extends WaterBoundPathNavigation {
    public LargeFishNavigation(Mob mob, Level level) {
        super(mob, level);
    }

    @Override
    protected void followThePath() {
        Path path = Objects.requireNonNull(this.path);
        Vec3 pos = this.getTempMobPos();
        float threshold = Math.max(1.0F, this.mob.getBbWidth());

        if (isAt(path, threshold)) {
            path.setNextNodeIndex(path.getNextNodeIndex() + 1);
        } else if (hasOvershotNode(path, pos, threshold)) {
            path.setNextNodeIndex(path.getNextNodeIndex() + 1);
        }

        this.doStuckDetection(pos);
    }

    private boolean isAt(Path path, float threshold) {
        Vec3 target = path.getNextEntityPos(this.mob);
        return Mth.abs((float) (this.mob.getX() - target.x)) < threshold
                && Mth.abs((float) (this.mob.getZ() - target.z)) < threshold
                && Math.abs(this.mob.getY() - target.y) < 1.0D;
    }

    private boolean hasOvershotNode(Path path, Vec3 pos, float threshold) {
        Vec3 target = path.getNextEntityPos(this.mob);
        double dx = pos.x - target.x;
        double dz = pos.z - target.z;
        double distSq = dx * dx + dz * dz;
        if (distSq < threshold * threshold) {
            return false;
        }
        Vec3 nextTarget = path.getEntityPosAtNode(this.mob, Math.min(path.getNextNodeIndex() + 1, path.getNodeCount() - 1));
        double nextDx = nextTarget.x - target.x;
        double nextDz = nextTarget.z - target.z;
        double dot = dx * nextDx + dz * nextDz;
        return dot > 0.0D;
    }

    private boolean atElevationChange(Path path) {
        int curr = path.getNextNodeIndex();
        int end = Math.min(path.getNodeCount(), curr + Mth.ceil(this.mob.getBbWidth() * 0.5F) + 1);
        int currY = path.getNode(curr).y;

        for (int i = curr + 1; i < end; ++i) {
            if (path.getNode(i).y != currY) {
                return true;
            }
        }

        return false;
    }
}
