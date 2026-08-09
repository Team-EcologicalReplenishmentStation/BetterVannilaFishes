package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.SmallFishSpecimen;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BvfBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterVannilaFishes.MODID);
    public static final RegistryObject<Block> ATLANTIC_COD_SPECIMEN = BLOCKS.register("atlantic_cod_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ATLANTIC_COD_SPECIMEN));
    public static final RegistryObject<Block> PACIFIC_COD_SPECIMEN = BLOCKS.register("pacific_cod_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PACIFIC_COD_SPECIMEN));
    public static final RegistryObject<Block> HADDOCK_COD_SPECIMEN = BLOCKS.register("haddock_cod_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.HADDOCK_COD_SPECIMEN));
    public static final RegistryObject<Block> PACIFIC_SALMON_SPECIMEN = BLOCKS.register("pacific_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PACIFIC_SALMON_SPECIMEN));
    public static final RegistryObject<Block> MALE_SALMON_SPECIMEN = BLOCKS.register("male_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.MALE_SALMON_SPECIMEN));
    public static final RegistryObject<Block> FEMALE_SALMON_SPECIMEN = BLOCKS.register("female_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.FEMALE_SALMON_SPECIMEN));
    public static final RegistryObject<Block> SPEARFISH_SPECIMEN = BLOCKS.register("spearfish_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.SPEARFISH_SPECIMEN));
    public static final RegistryObject<Block> ROOSTERFISH_SPECIMEN = BLOCKS.register("roosterfish_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ROOSTERFISH_SPECIMEN));
    public static final RegistryObject<Block> GALEOCERDO_CUVIER_SPECIMEN = BLOCKS.register("galeocerdo_cuvier_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.GALEOCERDO_CUVIER_SPECIMEN));
    public static final RegistryObject<Block> ALOPIAS_VULPINUS_SPECIMEN = BLOCKS.register("alopias_vulpinus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ALOPIAS_VULPINUS_SPECIMEN));
    public static final RegistryObject<Block> NEGAPRION_ACUTIDENS_SPECIMEN = BLOCKS.register("negaprion_acutidens_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.NEGAPRION_ACUTIDENS_SPECIMEN));
    public static final RegistryObject<Block> NEGAPRION_BREVIROSTRIS_SPECIMEN = BLOCKS.register("negaprion_brevirostris_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.NEGAPRION_BREVIROSTRIS_SPECIMEN));
    public static final RegistryObject<Block> EPINEPHELUS_LANCEOLATUS_SPECIMEN = BLOCKS.register("epinephelus_lanceolatus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.EPINEPHELUS_LANCEOLATUS_SPECIMEN));
    public static final RegistryObject<Block> EPINEPHELUS_ITAJARA_SPECIMEN = BLOCKS.register("epinephelus_itajara_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.EPINEPHELUS_ITAJARA_SPECIMEN));
    public static final RegistryObject<Block> EPINEPHELUS_MELANOSTIGMA_SPECIMEN = BLOCKS.register("epinephelus_melanostigma_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.EPINEPHELUS_MELANOSTIGMA_SPECIMEN));
    public static final RegistryObject<Block> AUSTRALOHEROS_FACETUS_SPECIMEN = BLOCKS.register("australoheros_facetus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AUSTRALOHEROS_FACETUS_SPECIMEN));
    public static final RegistryObject<Block> CICHLASOMA_BIMACULATUM_SPECIMEN = BLOCKS.register("cichlasoma_bimaculatum_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CICHLASOMA_BIMACULATUM_SPECIMEN));
    public static final RegistryObject<Block> KROBIA_GUIANENSIS_SPECIMEN = BLOCKS.register("krobia_guianensis_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.KROBIA_GUIANENSIS_SPECIMEN));
    public static final RegistryObject<Block> AEQUIDENS_TETRAMERUS_SPECIMEN = BLOCKS.register("aequidens_tetramerus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AEQUIDENS_TETRAMERUS_SPECIMEN));
    public static final RegistryObject<Block> GYMNOGEOPHAGUS_BALZANII_SPECIMEN = BLOCKS.register("gymnogeophagus_balzanii_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.GYMNOGEOPHAGUS_BALZANII_SPECIMEN));
    public static final RegistryObject<Block> ASTRONOTUS_OCELLATUS_SPECIMEN = BLOCKS.register("astronotus_ocellatus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ASTRONOTUS_OCELLATUS_SPECIMEN));
    public static final RegistryObject<Block> CHANNA_MICROPELTES_SPECIMEN = BLOCKS.register("channa_micropeltes_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHANNA_MICROPELTES_SPECIMEN));
    public static final RegistryObject<Block> CHANNA_ARGUS_SPECIMEN = BLOCKS.register("channa_argus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHANNA_ARGUS_SPECIMEN));
    public static final RegistryObject<Block> ELOPICHTHYS_BAMBUSA_SPECIMEN = BLOCKS.register("elopichthys_bambusa_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ELOPICHTHYS_BAMBUSA_SPECIMEN));
    public static final RegistryObject<Block> HUSO_DAURICUS_SPECIMEN = BLOCKS.register("huso_dauricus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.HUSO_DAURICUS_SPECIMEN));
    public static final RegistryObject<Block> KATSUWONUS_PELAMIS_SPECIMEN = BLOCKS.register("katsuwonus_pelamis_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.KATSUWONUS_PELAMIS_SPECIMEN));
    public static final RegistryObject<Block> MEGALOPS_ATLANTICUS_SPECIMEN = BLOCKS.register("megalops_atlanticus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.MEGALOPS_ATLANTICUS_SPECIMEN));
    public static final RegistryObject<Block> BLACK_CARP_SPECIMEN = BLOCKS.register("black_carp_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BLACK_CARP_SPECIMEN));
    public static final RegistryObject<Block> GRASS_CARP_SPECIMEN = BLOCKS.register("grass_carp_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.GRASS_CARP_SPECIMEN));
    public static final RegistryObject<Block> SILVER_CARP_SPECIMEN = BLOCKS.register("silver_carp_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.SILVER_CARP_SPECIMEN));
    public static final RegistryObject<Block> BIGHEAD_CARP_SPECIMEN = BLOCKS.register("bighead_carp_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BIGHEAD_CARP_SPECIMEN));
    public static final RegistryObject<Block> OBSCURE_PUFFER_SPECIMEN = BLOCKS.register("obscure_puffer_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.OBSCURE_PUFFER_SPECIMEN));
    public static final RegistryObject<Block> SOARING_LIONFISH_SPECIMEN = BLOCKS.register("soaring_lionfish_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.SOARING_LIONFISH_SPECIMEN));
    public static final RegistryObject<Block> RINGED_LIONFISH_SPECIMEN = BLOCKS.register("ringed_lionfish_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.RINGED_LIONFISH_SPECIMEN));
    public static final RegistryObject<Block> RADIANT_LIONFISH_SPECIMEN = BLOCKS.register("radiant_lionfish_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.RADIANT_LIONFISH_SPECIMEN));
    public static final RegistryObject<Block> YELLOW_FIN_PUFFER_SPECIMEN = BLOCKS.register("yellow_fin_puffer_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.YELLOW_FIN_PUFFER_SPECIMEN));
    public static final RegistryObject<Block> PORCUPINE_FISH_SPECIMEN = BLOCKS.register("porcupine_fish_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PORCUPINE_FISH_SPECIMEN));
    public static final RegistryObject<Block> BETTA_SPLENDENS_SPECIMEN = BLOCKS.register("betta_splendens_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_SPLENDENS_SPECIMEN));
    public static final RegistryObject<Block> BETTA_IMBELLIS_SPECIMEN = BLOCKS.register("betta_imbellis_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_IMBELLIS_SPECIMEN));
    public static final RegistryObject<Block> BETTA_SMARAGDINA_SPECIMEN = BLOCKS.register("betta_smaragdina_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_SMARAGDINA_SPECIMEN));
    public static final RegistryObject<Block> BETTA_PICTA_SPECIMEN = BLOCKS.register("betta_picta_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_PICTA_SPECIMEN));
    public static final RegistryObject<Block> BETTA_SIMPLEX_SPECIMEN = BLOCKS.register("betta_simplex_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_SIMPLEX_SPECIMEN));
    public static final RegistryObject<Block> BETTA_BROWNORUM_SPECIMEN = BLOCKS.register("betta_brownorum_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_BROWNORUM_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_ACHILLES_SPECIMEN = BLOCKS.register("acanthurus_achilles_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_ACHILLES_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_LEUCOSTERNON_SPECIMEN = BLOCKS.register("acanthurus_leucosternon_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_LEUCOSTERNON_SPECIMEN));
    public static final RegistryObject<Block> PARACANTHURUS_HEPATUS_SPECIMEN = BLOCKS.register("paracanthurus_hepatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PARACANTHURUS_HEPATUS_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_TRIOSTEGUS_SPECIMEN = BLOCKS.register("acanthurus_triostegus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_TRIOSTEGUS_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_NIGRICANS_SPECIMEN = BLOCKS.register("acanthurus_nigricans_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_NIGRICANS_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_LINEATUS_SPECIMEN = BLOCKS.register("acanthurus_lineatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_LINEATUS_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_STRIATUS_SPECIMEN = BLOCKS.register("chaetodon_striatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_STRIATUS_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_UNIMACULATUS_SPECIMEN = BLOCKS.register("chaetodon_unimaculatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_UNIMACULATUS_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_AURIGA_SPECIMEN = BLOCKS.register("chaetodon_auriga_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_AURIGA_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_COLLARE_SPECIMEN = BLOCKS.register("chaetodon_collare_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_COLLARE_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_RETICULATUS_SPECIMEN = BLOCKS.register("chaetodon_reticulatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_RETICULATUS_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_SPECULUM_SPECIMEN = BLOCKS.register("chaetodon_speculum_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_SPECULUM_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_OCELLARIS_SPECIMEN = BLOCKS.register("amphiprion_ocellaris_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_OCELLARIS_SPECIMEN));
    public static final RegistryObject<Block> PREMNAS_BIACULEATUS_SPECIMEN = BLOCKS.register("premnas_biaculeatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PREMNAS_BIACULEATUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_POLYMNUS_SPECIMEN = BLOCKS.register("amphiprion_polymnus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_POLYMNUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_PERIDERAION_SPECIMEN = BLOCKS.register("amphiprion_perideraion_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_PERIDERAION_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_CLARKII_SPECIMEN = BLOCKS.register("amphiprion_clarkii_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_CLARKII_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_PERCULA_SPECIMEN = BLOCKS.register("amphiprion_percula_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_PERCULA_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_AKINDYNOS_SPECIMEN = BLOCKS.register("amphiprion_akindynos_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_AKINDYNOS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_BICINCTUS_SPECIMEN = BLOCKS.register("amphiprion_bicinctus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_BICINCTUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_CHRYSOGASTER_SPECIMEN = BLOCKS.register("amphiprion_chrysogaster_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_CHRYSOGASTER_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_CHRYSOPTERUS_SPECIMEN = BLOCKS.register("amphiprion_chrysopterus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_CHRYSOPTERUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_LATEZONATUS_SPECIMEN = BLOCKS.register("amphiprion_latezonatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_LATEZONATUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_MCCULLOCHI_SPECIMEN = BLOCKS.register("amphiprion_mccullochi_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_MCCULLOCHI_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_MELANOPUS_SPECIMEN = BLOCKS.register("amphiprion_melanopus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_MELANOPUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_TRICINCTUS_SPECIMEN = BLOCKS.register("amphiprion_tricinctus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_TRICINCTUS_SPECIMEN));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
