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
import net.minecraft.world.level.biome.Biomes;
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
        removeSpawn(context,"tropical_fish_ocean", BiomeTags.IS_OCEAN, EntityType.TROPICAL_FISH);
        removeSpawn(context,"cod_river", BiomeTags.IS_RIVER, EntityType.COD);
        removeSpawn(context,"salmon_river", BiomeTags.IS_RIVER, EntityType.SALMON);
        removeSpawn(context, "squid_ocean", BiomeTags.IS_OCEAN, EntityType.SQUID);
        removeSpawn(context, "squid_river", BiomeTags.IS_RIVER, EntityType.SQUID);

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
        addSpawn(context, "feather_star", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.FEATHER_STAR.get(), 8, 2, 4));
        addSpawn(context, "spearfish", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.SPEARFISH.get(), 5, 1, 2));
        addSpawn(context, "galeocerdo_cuvier", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.GALEOCERDO_CUVIER.get(), 1, 1, 1));
        addSpawn(context, "epinephelus_lanceolatus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.EPINEPHELUS_LANCEOLATUS.get(), 1, 1, 1));
        addSpawn(context, "epinephelus_itajara", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.EPINEPHELUS_ITAJARA.get(), 1, 1, 1));
        addSpawn(context, "epinephelus_melanostigma", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.EPINEPHELUS_MELANOSTIGMA.get(), 1, 1, 1));
        addSpawn(context, "acanthurus_achilles", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.ACANTHURUS_ACHILLES.get(), 6, 2, 4));
        addSpawn(context, "acanthurus_leucosternon", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), 6, 2, 4));
        addSpawn(context, "paracanthurus_hepatus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.PARACANTHURUS_HEPATUS.get(), 6, 2, 4));
        addSpawn(context, "acanthurus_triostegus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), 6, 2, 4));
        addSpawn(context, "acanthurus_nigricans", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.ACANTHURUS_NIGRICANS.get(), 6, 2, 4));
        addSpawn(context, "acanthurus_lineatus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.ACANTHURUS_LINEATUS.get(), 6, 2, 4));
        addSpawn(context, "chaetodon_striatus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.CHAETODON_STRIATUS.get(), 6, 2, 4));
        addSpawn(context, "chaetodon_unimaculatus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.CHAETODON_UNIMACULATUS.get(), 6, 2, 4));
        addSpawn(context, "chaetodon_auriga", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.CHAETODON_AURIGA.get(), 6, 2, 4));
        addSpawn(context, "chaetodon_collare", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.CHAETODON_COLLARE.get(), 6, 2, 4));
        addSpawn(context, "chaetodon_reticulatus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.CHAETODON_RETICULATUS.get(), 6, 2, 4));
        addSpawn(context, "chaetodon_speculum", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.CHAETODON_SPECULUM.get(), 6, 2, 4));
        addSpawn(context, "amphiprion_ocellaris", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.AMPHIPRION_OCELLARIS.get(), 6, 2, 4));
        addSpawn(context, "premnas_biaculeatus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.PREMNAS_BIACULEATUS.get(), 6, 2, 4));
        addSpawn(context, "amphiprion_polymnus", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.AMPHIPRION_POLYMNUS.get(), 6, 2, 4));
        addSpawn(context, "amphiprion_perideraion", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.AMPHIPRION_PERIDERAION.get(), 6, 2, 4));
        addSpawn(context, "amphiprion_clarkii", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.AMPHIPRION_CLARKII.get(), 6, 2, 4));
        addSpawn(context, "amphiprion_percula", BiomeTags.IS_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.AMPHIPRION_PERCULA.get(), 6, 2, 4));
        addSpawn(context, "australoheros_facetus", BiomeTags.IS_RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.AUSTRALOHEROS_FACETUS.get(), 6, 1, 2));
        addSpawn(context, "cichlasoma_bimaculatum", BiomeTags.IS_RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.CICHLASOMA_BIMACULATUM.get(), 6, 1, 2));
        addSpawn(context, "krobia_guianensis", BiomeTags.IS_RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.KROBIA_GUIANENSIS.get(), 6, 1, 2));
        addSpawn(context, "aequidens_tetramerus", BiomeTags.IS_RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.AEQUIDENS_TETRAMERUS.get(), 6, 1, 2));
        addSpawn(context, "gymnogeophagus_balzanii", BiomeTags.IS_RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(), 6, 1, 2));
        addSpawn(context, "astronotus_ocellatus", BiomeTags.IS_RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.ASTRONOTUS_OCELLATUS.get(), 6, 1, 2));
        addSpawn(context, "channa_micropeltes_river", Biomes.RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.CHANNA_MICROPELTES.get(), 2, 1, 1));
        addSpawn(context, "channa_micropeltes_swamp", Biomes.SWAMP, new MobSpawnSettings.SpawnerData(BvfEntities.CHANNA_MICROPELTES.get(), 2, 1, 1));
        addSpawn(context, "channa_micropeltes_mangrove_swamp", Biomes.MANGROVE_SWAMP, new MobSpawnSettings.SpawnerData(BvfEntities.CHANNA_MICROPELTES.get(), 2, 1, 1));
        addSpawn(context, "channa_argus_river", Biomes.RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.CHANNA_ARGUS.get(), 2, 1, 1));
        addSpawn(context, "channa_argus_swamp", Biomes.SWAMP, new MobSpawnSettings.SpawnerData(BvfEntities.CHANNA_ARGUS.get(), 2, 1, 1));
        addSpawn(context, "channa_argus_mangrove_swamp", Biomes.MANGROVE_SWAMP, new MobSpawnSettings.SpawnerData(BvfEntities.CHANNA_ARGUS.get(), 2, 1, 1));
        addSpawn(context, "elopichthys_bambusa_river", Biomes.RIVER, new MobSpawnSettings.SpawnerData(BvfEntities.ELOPICHTHYS_BAMBUSA.get(), 2, 1, 1));
        addSpawn(context, "dosidicus_gigas", BiomeTags.IS_DEEP_OCEAN, new MobSpawnSettings.SpawnerData(BvfEntities.DOSIDICUS_GIGAS.get(), 5, 1, 3));
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
