package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BvfBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, BetterVannilaFishes.MODID);
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> ATLANTIC_COD_SPECIMEN = BLOCK_ENTITIES.register("atlantic_cod_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ATLANTIC_COD_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> PACIFIC_COD_SPECIMEN = BLOCK_ENTITIES.register("pacific_cod_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PACIFIC_COD_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> HADDOCK_COD_SPECIMEN = BLOCK_ENTITIES.register("haddock_cod_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.HADDOCK_COD_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> PACIFIC_SALMON_SPECIMEN = BLOCK_ENTITIES.register("pacific_salmon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PACIFIC_SALMON_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> MALE_SALMON_SPECIMEN = BLOCK_ENTITIES.register("male_salmon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.MALE_SALMON_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> FEMALE_SALMON_SPECIMEN = BLOCK_ENTITIES.register("female_salmon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.FEMALE_SALMON_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> SPEARFISH_SPECIMEN = BLOCK_ENTITIES.register("spearfish_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.SPEARFISH_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> GALEOCERDO_CUVIER_SPECIMEN = BLOCK_ENTITIES.register("galeocerdo_cuvier_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.GALEOCERDO_CUVIER_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> NEGAPRION_ACUTIDENS_SPECIMEN = BLOCK_ENTITIES.register("negaprion_acutidens_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.NEGAPRION_ACUTIDENS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> NEGAPRION_BREVIROSTRIS_SPECIMEN = BLOCK_ENTITIES.register("negaprion_brevirostris_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.NEGAPRION_BREVIROSTRIS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> EPINEPHELUS_LANCEOLATUS_SPECIMEN = BLOCK_ENTITIES.register("epinephelus_lanceolatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.EPINEPHELUS_LANCEOLATUS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> EPINEPHELUS_ITAJARA_SPECIMEN = BLOCK_ENTITIES.register("epinephelus_itajara_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.EPINEPHELUS_ITAJARA_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> EPINEPHELUS_MELANOSTIGMA_SPECIMEN = BLOCK_ENTITIES.register("epinephelus_melanostigma_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.EPINEPHELUS_MELANOSTIGMA_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> AUSTRALOHEROS_FACETUS_SPECIMEN = BLOCK_ENTITIES.register("australoheros_facetus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AUSTRALOHEROS_FACETUS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> CICHLASOMA_BIMACULATUM_SPECIMEN = BLOCK_ENTITIES.register("cichlasoma_bimaculatum_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CICHLASOMA_BIMACULATUM_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> KROBIA_GUIANENSIS_SPECIMEN = BLOCK_ENTITIES.register("krobia_guianensis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.KROBIA_GUIANENSIS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> AEQUIDENS_TETRAMERUS_SPECIMEN = BLOCK_ENTITIES.register("aequidens_tetramerus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AEQUIDENS_TETRAMERUS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> GYMNOGEOPHAGUS_BALZANII_SPECIMEN = BLOCK_ENTITIES.register("gymnogeophagus_balzanii_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.GYMNOGEOPHAGUS_BALZANII_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> ASTRONOTUS_OCELLATUS_SPECIMEN = BLOCK_ENTITIES.register("astronotus_ocellatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ASTRONOTUS_OCELLATUS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> CHANNA_MICROPELTES_SPECIMEN = BLOCK_ENTITIES.register("channa_micropeltes_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHANNA_MICROPELTES_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> CHANNA_ARGUS_SPECIMEN = BLOCK_ENTITIES.register("channa_argus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHANNA_ARGUS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> ELOPICHTHYS_BAMBUSA_SPECIMEN = BLOCK_ENTITIES.register("elopichthys_bambusa_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ELOPICHTHYS_BAMBUSA_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> HUSO_DAURICUS_SPECIMEN = BLOCK_ENTITIES.register("huso_dauricus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.HUSO_DAURICUS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> MEGALOPS_ATLANTICUS_SPECIMEN = BLOCK_ENTITIES.register("megalops_atlanticus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.MEGALOPS_ATLANTICUS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> OBSCURE_PUFFER_SPECIMEN = BLOCK_ENTITIES.register("obscure_puffer_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.OBSCURE_PUFFER_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> YELLOW_FIN_PUFFER_SPECIMEN = BLOCK_ENTITIES.register("yellow_fin_puffer_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.YELLOW_FIN_PUFFER_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> PORCUPINE_FISH_SPECIMEN = BLOCK_ENTITIES.register("porcupine_fish_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PORCUPINE_FISH_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> KATSUWONUS_PELAMIS_SPECIMEN = BLOCK_ENTITIES.register("katsuwonus_pelamis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.KATSUWONUS_PELAMIS_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> BLACK_CARP_SPECIMEN = BLOCK_ENTITIES.register("black_carp_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BLACK_CARP_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> GRASS_CARP_SPECIMEN = BLOCK_ENTITIES.register("grass_carp_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.GRASS_CARP_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> SILVER_CARP_SPECIMEN = BLOCK_ENTITIES.register("silver_carp_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.SILVER_CARP_SPECIMEN.get()).build(null));
    public static final DeferredHolder<BlockEntityType<?>,BlockEntityType<FishSpecimenBlockEntity>> BIGHEAD_CARP_SPECIMEN = BLOCK_ENTITIES.register("bighead_carp_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BIGHEAD_CARP_SPECIMEN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
