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

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
