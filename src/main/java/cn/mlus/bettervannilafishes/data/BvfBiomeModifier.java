package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BvfBiomeModifier
{
    public static void register(BootstrapContext<BiomeModifier> context) {
        removeSpawn(context, "cod_ocean", BiomeTags.IS_OCEAN, EntityType.COD);
        removeSpawn(context,"salmon_ocean", BiomeTags.IS_OCEAN, EntityType.SALMON);
        removeSpawn(context,"pufferfish_ocean", BiomeTags.IS_OCEAN, EntityType.PUFFERFISH);
//        removeSpawn(context,"tropical_fish_ocean", BiomeTags.IS_OCEAN, EntityType.TROPICAL_FISH);
        removeSpawn(context,"cod_river", BiomeTags.IS_RIVER, EntityType.COD);
        removeSpawn(context,"salmon_river", BiomeTags.IS_RIVER, EntityType.SALMON);

        addSpawn(context,"haddock_cod", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.BVC_HADDOCK_COD.get(),12,3,9));
        addSpawn(context,"atlantic_cod", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.BVC_ATLANTIC_COD.get(),10,3,9));
        addSpawn(context,"pacific_cod", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.BVC_PACIFIC_COD.get(),12,3,9));
        addSpawn(context, "male_salmon", BiomeTags.IS_RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.BVC_SALMON_MALE.get(), 12, 2, 6));
        addSpawn(context, "female_salmon", BiomeTags.IS_RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.BVC_SALMON_FEMALE.get(), 12, 2, 6));
        addSpawn(context, "atlantic_salmon", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.BVC_SALMON_PACIFIC.get(), 12, 3, 9));
        addSpawn(context, "yellow_fin_puffer", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.YELLOW_FIN_PUFFER.get(), 7, 1, 1));
        addSpawn(context, "porcupine_fish", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.PORCUPINE_FISH.get(), 7, 1, 1));
        addSpawn(context, "obscure_puffer_ocean", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.OBSCURE_PUFFER.get(), 7, 1, 1));
        addSpawn(context, "obscure_puffer_river", BiomeTags.IS_RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.OBSCURE_PUFFER.get(), 8, 3, 4));
        addSpawn(context, "nautilus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.NAUTILUS.get(), 6, 1, 1));
    }

    private static void addSpawn(BootstrapContext<BiomeModifier> context, String name, TagKey<Biome> biomes, MobSpawnSettings.SpawnerData... spawns) {
        register(context, "add_spawn/" + name, () -> new BiomeModifiers.AddSpawnsBiomeModifier(context.lookup(Registries.BIOME).getOrThrow(biomes), List.of(spawns)));
    }

    private static void addSpawn(BootstrapContext<BiomeModifier> context, String name, ResourceKey<Biome> biome, MobSpawnSettings.SpawnerData... spawns){
        register(context, "add_spawn/" + name, () -> new BiomeModifiers.AddSpawnsBiomeModifier(HolderSet.direct(context.lookup(Registries.BIOME).getOrThrow(biome)), List.of(spawns)));
    }

    private static void removeSpawn(BootstrapContext<BiomeModifier> context, String name, TagKey<Biome> biomes, EntityType<?>... types) {
        register(context, "remove_spawn/" + name, () -> new BiomeModifiers.RemoveSpawnsBiomeModifier(context.lookup(Registries.BIOME).getOrThrow(biomes), HolderSet.direct(Stream.of(types).map(BuiltInRegistries.ENTITY_TYPE::wrapAsHolder).collect(Collectors.toList()))));
    }

    private static void register(BootstrapContext<BiomeModifier> context, String name, Supplier<? extends BiomeModifier> modifier) {
        context.register(ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, BetterVannilaFishes.prefix(name)), modifier.get());
    }

    @SafeVarargs
    private static void addFeature(BootstrapContext<BiomeModifier> context, String name, TagKey<Biome> biomes, GenerationStep.Decoration step, ResourceKey<PlacedFeature>... features) {
        register(context, "add_feature/" + name, () -> new BiomeModifiers.AddFeaturesBiomeModifier(context.lookup(Registries.BIOME).getOrThrow(biomes), featureSet(context, features), step));
    }

    @SafeVarargs
    private static HolderSet<PlacedFeature> featureSet(BootstrapContext<?> context, ResourceKey<PlacedFeature>... features) {
        return HolderSet.direct(Stream.of(features).map(placedFeatureKey -> context.lookup(Registries.PLACED_FEATURE).getOrThrow(placedFeatureKey)).collect(Collectors.toList()));
    }
}
