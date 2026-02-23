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


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
