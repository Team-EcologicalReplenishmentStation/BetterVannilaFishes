package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
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
    public static final RegistryObject<Block> GALEOCERDO_CUVIER_SPECIMEN = BLOCKS.register("galeocerdo_cuvier_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.GALEOCERDO_CUVIER_SPECIMEN));
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

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
