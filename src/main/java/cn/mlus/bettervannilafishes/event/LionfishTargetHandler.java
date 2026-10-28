package cn.mlus.bettervannilafishes.event;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.galeocerdo.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.entity.lionfish.Lionfish;
import net.minecraft.world.entity.Mob;
import net.neoforged.neoforge.event.entity.living.LivingChangeTargetEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = BetterVannilaFishes.MODID)
public final class LionfishTargetHandler {
    private LionfishTargetHandler() {
    }

    @SubscribeEvent
    public static void onLivingChangeTarget(LivingChangeTargetEvent event) {
        if (!(event.getNewAboutToBeSetTarget() instanceof Lionfish lionfish)
                || event.getEntity() instanceof GaleocerdoCuvierEntity) {
            return;
        }

        if (event.getEntity() instanceof Mob mob && mob.getLastHurtByMob() == lionfish) {
            return;
        }

        event.setCanceled(true);
    }
}
