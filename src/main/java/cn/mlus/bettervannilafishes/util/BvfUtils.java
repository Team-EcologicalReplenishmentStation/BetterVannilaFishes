package cn.mlus.bettervannilafishes.util;


import net.minecraft.world.entity.Mob;

public class BvfUtils {

    public static boolean isMoving(Mob mob) {
        return mob.getX() != mob.xOld || mob.getZ() != mob.zOld;
    }
}