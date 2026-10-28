package cn.mlus.bettervannilafishes.event;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.galeocerdo.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.entity.lionfish.Lionfish;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BetterVannilaFishes.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public final class LionfishTargetHandler {
    private LionfishTargetHandler() {
    }

    @SubscribeEvent
    public static void onLivingChangeTarget(LivingChangeTargetEvent event) {
        if (!(event.getNewTarget() instanceof Lionfish lionfish)
                || event.getEntity() instanceof GaleocerdoCuvierEntity) {
            return;
        }

        if (event.getEntity() instanceof Mob mob && mob.getLastHurtByMob() == lionfish) {
            return;
        }

        event.setCanceled(true);
    }
}
