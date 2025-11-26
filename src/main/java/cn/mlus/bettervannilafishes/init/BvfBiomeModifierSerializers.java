package cn.mlus.bettervannilafishes.init;


import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.data.BvfBiomeSpawnCostModifier;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;


public class BvfBiomeModifierSerializers {
    public static final DeferredRegister<MapCodec<? extends BiomeModifier>> SERIALIZERS = DeferredRegister.create(NeoForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, BetterVannilaFishes.MODID);

    private static boolean isInitialised = false;

    public static final DeferredHolder<MapCodec<? extends BiomeModifier>, MapCodec<BvfBiomeSpawnCostModifier>> ADD_MOB_SPAWN_COST = SERIALIZERS.register("inferium_ore", () ->
            RecordCodecBuilder.mapCodec(builder -> builder.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(BvfBiomeSpawnCostModifier::biomes)
            ).apply(builder, BvfBiomeSpawnCostModifier::new)));

    /**
     * Registers the {@link DeferredRegister} instance with the mod event bus.
     * <p>
     * This should be called during mod construction.
     *
     * @param modEventBus The mod event bus
     */
    public static void register(final IEventBus modEventBus) {
        if (isInitialised) {
            throw new IllegalStateException("Already initialised");
        }

        SERIALIZERS.register(modEventBus);

        isInitialised = true;
    }
}
