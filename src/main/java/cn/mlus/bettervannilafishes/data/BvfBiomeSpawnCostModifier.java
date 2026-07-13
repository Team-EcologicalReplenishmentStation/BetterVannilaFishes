package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BvfBiomeSpawnCostModifier implements BiomeModifier {

    private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(BetterVannilaFishes.prefix("add_spawn_cost"), ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, BetterVannilaFishes.MODID);
    @Override
    public void modify(final Holder<Biome> biome, final Phase phase, final ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            if(biome.is(BiomeTags.IS_OCEAN)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_HADDOCK_COD.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_PACIFIC_COD.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_ATLANTIC_COD.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_SALMON_PACIFIC.get(),0.8,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.YELLOW_FIN_PUFFER.get(), 0.8,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.OBSCURE_PUFFER.get(), 0.8,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.PORCUPINE_FISH.get(), 0.8,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.NAUTILUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.FEATHER_STAR.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.SPEARFISH.get(),0.7,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ROOSTERFISH.get(),0.7,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.GALEOCERDO_CUVIER.get(),0.8,0.8);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_OCELLARIS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.PREMNAS_BIACULEATUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_POLYMNUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_PERIDERAION.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_CLARKII.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_PERCULA.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_ACHILLES.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.PARACANTHURUS_HEPATUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_NIGRICANS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_LINEATUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_STRIATUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_UNIMACULATUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_AURIGA.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_COLLARE.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_RETICULATUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_SPECULUM.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.EPINEPHELUS_LANCEOLATUS.get(),0.7,0.7);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.EPINEPHELUS_ITAJARA.get(),0.7,0.7);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.EPINEPHELUS_MELANOSTIGMA.get(),0.7,0.7);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.HUSO_DAURICUS.get(),1,0.7);
            }
            if(biome.is(BiomeTags.IS_RIVER)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_SALMON_MALE.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_SALMON_FEMALE.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.OBSCURE_PUFFER.get(), 0.8,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AUSTRALOHEROS_FACETUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CICHLASOMA_BIMACULATUM.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.KROBIA_GUIANENSIS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AEQUIDENS_TETRAMERUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ASTRONOTUS_OCELLATUS.get(),0.7,0.2);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHANNA_MICROPELTES.get(),0.8,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHANNA_ARGUS.get(),0.8,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ELOPICHTHYS_BAMBUSA.get(),1.2,0.6);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.HUSO_DAURICUS.get(),1,0.7);
            }
            if(biome.is(Biomes.SWAMP) || biome.is(Biomes.MANGROVE_SWAMP)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHANNA_MICROPELTES.get(),0.8,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHANNA_ARGUS.get(),0.8,0.3);
            }
            if(biome.is(BiomeTags.IS_DEEP_OCEAN)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.DOSIDICUS_GIGAS.get(),0.7,0.2);
            }
        }
    }

    @Override
    public Codec<? extends BiomeModifier> codec() {
        return SERIALIZER.get();
    }

    public static Codec<BvfBiomeSpawnCostModifier> makeCodec() {
        return Codec.unit(BvfBiomeSpawnCostModifier::new);
    }
}

