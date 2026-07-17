package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.init.BvfBiomeModifierSerializers;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;

public class BvfBiomeSpawnCostModifier implements BiomeModifier {

    @Override
    public void modify(final Holder<Biome> biome, final Phase phase, final ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            if(biome.is(BiomeTags.IS_OCEAN)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_HADDOCK_COD.get(),0.25,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_PACIFIC_COD.get(),0.25,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_ATLANTIC_COD.get(),0.25,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_SALMON_PACIFIC.get(),0.25,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.YELLOW_FIN_PUFFER.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.OBSCURE_PUFFER.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.PORCUPINE_FISH.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.NAUTILUS.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.FEATHER_STAR.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ZHIKONG_SCALLOP.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BAY_SCALLOP.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.YESSO_SCALLOP.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.SPEARFISH.get(),0.8,0.35);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ROOSTERFISH.get(),0.8,0.35);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.GALEOCERDO_CUVIER.get(),1.5,0.35);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ALOPIAS_VULPINUS.get(),1.5,0.35);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.NEGAPRION_ACUTIDENS.get(),1.2,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.NEGAPRION_BREVIROSTRIS.get(),1.2,0.4);

                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_OCELLARIS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.PREMNAS_BIACULEATUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_POLYMNUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_PERIDERAION.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_CLARKII.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_PERCULA.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_AKINDYNOS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_BICINCTUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_CHRYSOGASTER.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_CHRYSOPTERUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_LATEZONATUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_MCCULLOCHI.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_MELANOPUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AMPHIPRION_TRICINCTUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_ACHILLES.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.PARACANTHURUS_HEPATUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_NIGRICANS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ACANTHURUS_LINEATUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_STRIATUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_UNIMACULATUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_AURIGA.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_COLLARE.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_RETICULATUS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHAETODON_SPECULUM.get(),0.3,0.25);

                builder.getMobSpawnSettings().addMobCharge(BvfEntities.EPINEPHELUS_LANCEOLATUS.get(),1.2,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.EPINEPHELUS_ITAJARA.get(),1.2,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.EPINEPHELUS_MELANOSTIGMA.get(),1.2,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.HUSO_DAURICUS.get(),1.2,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.MEGALOPS_ATLANTICUS.get(),1.0,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.KATSUWONUS_PELAMIS.get(),0.2,0.35);
            }
            if(biome.is(BiomeTags.IS_RIVER)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_SALMON_MALE.get(),0.25,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_SALMON_FEMALE.get(),0.25,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.OBSCURE_PUFFER.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AUSTRALOHEROS_FACETUS.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CICHLASOMA_BIMACULATUM.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.KROBIA_GUIANENSIS.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.AEQUIDENS_TETRAMERUS.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ASTRONOTUS_OCELLATUS.get(),0.4,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHANNA_MICROPELTES.get(),0.8,0.35);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHANNA_ARGUS.get(),0.8,0.35);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.ELOPICHTHYS_BAMBUSA.get(),1.2,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.HUSO_DAURICUS.get(),1.2,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_SPLENDENS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_IMBELLIS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_SMARAGDINA.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_PICTA.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_SIMPLEX.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_BROWNORUM.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BLACK_CARP.get(),0.25,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.GRASS_CARP.get(),0.25,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.SILVER_CARP.get(),0.25,0.3);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BIGHEAD_CARP.get(),0.25,0.3);
            }
            if(biome.is(Biomes.SWAMP) || biome.is(Biomes.MANGROVE_SWAMP)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHANNA_MICROPELTES.get(),0.8,0.35);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.CHANNA_ARGUS.get(),0.8,0.35);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_SPLENDENS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_IMBELLIS.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_SMARAGDINA.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_PICTA.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_SIMPLEX.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BETTA_BROWNORUM.get(),0.3,0.25);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.NEGAPRION_ACUTIDENS.get(),1.2,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.NEGAPRION_BREVIROSTRIS.get(),1.2,0.4);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.MEGALOPS_ATLANTICUS.get(),1.0,0.4);
            }
            if(biome.is(BiomeTags.IS_DEEP_OCEAN)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.DOSIDICUS_GIGAS.get(),1.0,0.45);
            }
        }
    }

    @Override
    public Codec<? extends BiomeModifier> codec() {
        return BvfBiomeModifierSerializers.ADD_MOB_SPAWN_COST.get();
    }

    public static Codec<BvfBiomeSpawnCostModifier> makeCodec() {
        return Codec.unit(BvfBiomeSpawnCostModifier::new);
    }
}

