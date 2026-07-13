package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BvfBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BetterVannilaFishes.MODID);
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ATLANTIC_COD_SPECIMEN = BLOCK_ENTITIES.register("atlantic_cod_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ATLANTIC_COD_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PACIFIC_COD_SPECIMEN = BLOCK_ENTITIES.register("pacific_cod_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PACIFIC_COD_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> HADDOCK_COD_SPECIMEN = BLOCK_ENTITIES.register("haddock_cod_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.HADDOCK_COD_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PACIFIC_SALMON_SPECIMEN = BLOCK_ENTITIES.register("pacific_salmon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PACIFIC_SALMON_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> MALE_SALMON_SPECIMEN = BLOCK_ENTITIES.register("male_salmon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.MALE_SALMON_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> FEMALE_SALMON_SPECIMEN = BLOCK_ENTITIES.register("female_salmon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.FEMALE_SALMON_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> SPEARFISH_SPECIMEN = BLOCK_ENTITIES.register("spearfish_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.SPEARFISH_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ROOSTERFISH_SPECIMEN = BLOCK_ENTITIES.register("roosterfish_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ROOSTERFISH_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> GALEOCERDO_CUVIER_SPECIMEN = BLOCK_ENTITIES.register("galeocerdo_cuvier_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.GALEOCERDO_CUVIER_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> NEGAPRION_ACUTIDENS_SPECIMEN = BLOCK_ENTITIES.register("negaprion_acutidens_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.NEGAPRION_ACUTIDENS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> NEGAPRION_BREVIROSTRIS_SPECIMEN = BLOCK_ENTITIES.register("negaprion_brevirostris_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.NEGAPRION_BREVIROSTRIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> EPINEPHELUS_LANCEOLATUS_SPECIMEN = BLOCK_ENTITIES.register("epinephelus_lanceolatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.EPINEPHELUS_LANCEOLATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> EPINEPHELUS_ITAJARA_SPECIMEN = BLOCK_ENTITIES.register("epinephelus_itajara_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.EPINEPHELUS_ITAJARA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> EPINEPHELUS_MELANOSTIGMA_SPECIMEN = BLOCK_ENTITIES.register("epinephelus_melanostigma_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.EPINEPHELUS_MELANOSTIGMA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AUSTRALOHEROS_FACETUS_SPECIMEN = BLOCK_ENTITIES.register("australoheros_facetus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AUSTRALOHEROS_FACETUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CICHLASOMA_BIMACULATUM_SPECIMEN = BLOCK_ENTITIES.register("cichlasoma_bimaculatum_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CICHLASOMA_BIMACULATUM_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> KROBIA_GUIANENSIS_SPECIMEN = BLOCK_ENTITIES.register("krobia_guianensis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.KROBIA_GUIANENSIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AEQUIDENS_TETRAMERUS_SPECIMEN = BLOCK_ENTITIES.register("aequidens_tetramerus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AEQUIDENS_TETRAMERUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> GYMNOGEOPHAGUS_BALZANII_SPECIMEN = BLOCK_ENTITIES.register("gymnogeophagus_balzanii_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.GYMNOGEOPHAGUS_BALZANII_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ASTRONOTUS_OCELLATUS_SPECIMEN = BLOCK_ENTITIES.register("astronotus_ocellatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ASTRONOTUS_OCELLATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHANNA_MICROPELTES_SPECIMEN = BLOCK_ENTITIES.register("channa_micropeltes_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHANNA_MICROPELTES_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHANNA_ARGUS_SPECIMEN = BLOCK_ENTITIES.register("channa_argus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHANNA_ARGUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ELOPICHTHYS_BAMBUSA_SPECIMEN = BLOCK_ENTITIES.register("elopichthys_bambusa_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ELOPICHTHYS_BAMBUSA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> HUSO_DAURICUS_SPECIMEN = BLOCK_ENTITIES.register("huso_dauricus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.HUSO_DAURICUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> KATSUWONUS_PELAMIS_SPECIMEN = BLOCK_ENTITIES.register("katsuwonus_pelamis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.KATSUWONUS_PELAMIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> MEGALOPS_ATLANTICUS_SPECIMEN = BLOCK_ENTITIES.register("megalops_atlanticus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.MEGALOPS_ATLANTICUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BLACK_CARP_SPECIMEN = BLOCK_ENTITIES.register("black_carp_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BLACK_CARP_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> GRASS_CARP_SPECIMEN = BLOCK_ENTITIES.register("grass_carp_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.GRASS_CARP_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> SILVER_CARP_SPECIMEN = BLOCK_ENTITIES.register("silver_carp_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.SILVER_CARP_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BIGHEAD_CARP_SPECIMEN = BLOCK_ENTITIES.register("bighead_carp_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BIGHEAD_CARP_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> OBSCURE_PUFFER_SPECIMEN = BLOCK_ENTITIES.register("obscure_puffer_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.OBSCURE_PUFFER_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> YELLOW_FIN_PUFFER_SPECIMEN = BLOCK_ENTITIES.register("yellow_fin_puffer_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.YELLOW_FIN_PUFFER_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PORCUPINE_FISH_SPECIMEN = BLOCK_ENTITIES.register("porcupine_fish_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PORCUPINE_FISH_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_SPLENDENS_SPECIMEN = BLOCK_ENTITIES.register("betta_splendens_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_SPLENDENS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_IMBELLIS_SPECIMEN = BLOCK_ENTITIES.register("betta_imbellis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_IMBELLIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_SMARAGDINA_SPECIMEN = BLOCK_ENTITIES.register("betta_smaragdina_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_SMARAGDINA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_PICTA_SPECIMEN = BLOCK_ENTITIES.register("betta_picta_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_PICTA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_SIMPLEX_SPECIMEN = BLOCK_ENTITIES.register("betta_simplex_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_SIMPLEX_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_BROWNORUM_SPECIMEN = BLOCK_ENTITIES.register("betta_brownorum_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_BROWNORUM_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_ACHILLES_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_achilles_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_ACHILLES_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_LEUCOSTERNON_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_leucosternon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_LEUCOSTERNON_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PARACANTHURUS_HEPATUS_SPECIMEN = BLOCK_ENTITIES.register("paracanthurus_hepatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PARACANTHURUS_HEPATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_TRIOSTEGUS_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_triostegus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_TRIOSTEGUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_NIGRICANS_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_nigricans_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_NIGRICANS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_LINEATUS_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_lineatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_LINEATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_STRIATUS_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_striatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_STRIATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_UNIMACULATUS_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_unimaculatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_UNIMACULATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_AURIGA_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_auriga_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_AURIGA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_COLLARE_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_collare_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_COLLARE_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_RETICULATUS_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_reticulatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_RETICULATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_SPECULUM_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_speculum_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_SPECULUM_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_OCELLARIS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_ocellaris_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_OCELLARIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PREMNAS_BIACULEATUS_SPECIMEN = BLOCK_ENTITIES.register("premnas_biaculeatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PREMNAS_BIACULEATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_POLYMNUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_polymnus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_POLYMNUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_PERIDERAION_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_perideraion_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_PERIDERAION_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_CLARKII_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_clarkii_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_CLARKII_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_PERCULA_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_percula_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_PERCULA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_AKINDYNOS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_akindynos_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_AKINDYNOS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_BICINCTUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_bicinctus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_BICINCTUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_CHRYSOGASTER_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_chrysogaster_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_CHRYSOGASTER_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_CHRYSOPTERUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_chrysopterus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_CHRYSOPTERUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_LATEZONATUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_latezonatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_LATEZONATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_MCCULLOCHI_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_mccullochi_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_MCCULLOCHI_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_MELANOPUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_melanopus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_MELANOPUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_TRICINCTUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_tricinctus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_TRICINCTUS_SPECIMEN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
