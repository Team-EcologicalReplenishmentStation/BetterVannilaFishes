package cn.mlus.bettervannilafishes;

import cn.mlus.bettervannilafishes.init.*;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

import java.util.Locale;

@Mod(BetterVannilaFishes.MODID)
public class BetterVannilaFishes {
    public static final String MODID = "bettervannilafishes";

    public BetterVannilaFishes(IEventBus modEventBus, ModContainer modContainer) {
        BvfEntities.register(modEventBus);
        BvfBlocks.register(modEventBus);
        BvfBlockEntities.register(modEventBus);
        BvfItems.register(modEventBus);
        BvfBiomeModifierSerializers.register(modEventBus);
        BvfMobEffects.register(modEventBus);
    }

    public static ResourceLocation prefix(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name.toLowerCase(Locale.ROOT));
    }
}
