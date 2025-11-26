package cn.mlus.bettervannilafishes;

import cn.mlus.bettervannilafishes.init.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

import java.util.Locale;

@Mod(BetterVannilaFishes.MODID)
public class BetterVannilaFishes {
    public static final String MODID = "bettervannilafishes";

    public BetterVannilaFishes(FMLJavaModLoadingContext context) {
        GeckoLib.initialize();

        IEventBus eventBus = context.getModEventBus();
        BvfEntities.register(eventBus);
        BvfBlocks.register(eventBus);
        BvfBlockEntities.register(eventBus);
        BvfItems.register(eventBus);
        BvfCreativeTab.register(eventBus);
        BvfBiomeModifierSerializers.register(eventBus);
        BvfMobEffects.register(eventBus);
    }

    public static ResourceLocation prefix(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name.toLowerCase(Locale.ROOT));
    }
}
