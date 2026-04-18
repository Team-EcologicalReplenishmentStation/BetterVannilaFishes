package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BvfBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(BetterVannilaFishes.MODID);
    public static final DeferredHolder<Block,Block> ATLANTIC_COD_SPECIMEN = BLOCKS.register("atlantic_cod_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ATLANTIC_COD_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> PACIFIC_COD_SPECIMEN = BLOCKS.register("pacific_cod_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PACIFIC_COD_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> HADDOCK_COD_SPECIMEN = BLOCKS.register("haddock_cod_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.HADDOCK_COD_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> PACIFIC_SALMON_SPECIMEN = BLOCKS.register("pacific_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PACIFIC_SALMON_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> MALE_SALMON_SPECIMEN = BLOCKS.register("male_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.MALE_SALMON_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> FEMALE_SALMON_SPECIMEN = BLOCKS.register("female_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.FEMALE_SALMON_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> SPEARFISH_SPECIMEN = BLOCKS.register("spearfish_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.SPEARFISH_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> GALEOCERDO_CUVIER_SPECIMEN = BLOCKS.register("galeocerdo_cuvier_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.GALEOCERDO_CUVIER_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> EPINEPHELUS_LANCEOLATUS_SPECIMEN = BLOCKS.register("epinephelus_lanceolatus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.EPINEPHELUS_LANCEOLATUS_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> EPINEPHELUS_ITAJARA_SPECIMEN = BLOCKS.register("epinephelus_itajara_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.EPINEPHELUS_ITAJARA_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> EPINEPHELUS_MELANOSTIGMA_SPECIMEN = BLOCKS.register("epinephelus_melanostigma_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.EPINEPHELUS_MELANOSTIGMA_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> AUSTRALOHEROS_FACETUS_SPECIMEN = BLOCKS.register("australoheros_facetus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AUSTRALOHEROS_FACETUS_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> CICHLASOMA_BIMACULATUM_SPECIMEN = BLOCKS.register("cichlasoma_bimaculatum_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CICHLASOMA_BIMACULATUM_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> KROBIA_GUIANENSIS_SPECIMEN = BLOCKS.register("krobia_guianensis_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.KROBIA_GUIANENSIS_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> AEQUIDENS_TETRAMERUS_SPECIMEN = BLOCKS.register("aequidens_tetramerus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AEQUIDENS_TETRAMERUS_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> GYMNOGEOPHAGUS_BALZANII_SPECIMEN = BLOCKS.register("gymnogeophagus_balzanii_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.GYMNOGEOPHAGUS_BALZANII_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> ASTRONOTUS_OCELLATUS_SPECIMEN = BLOCKS.register("astronotus_ocellatus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ASTRONOTUS_OCELLATUS_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> CHANNA_MICROPELTES_SPECIMEN = BLOCKS.register("channa_micropeltes_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHANNA_MICROPELTES_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> CHANNA_ARGUS_SPECIMEN = BLOCKS.register("channa_argus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHANNA_ARGUS_SPECIMEN::get));
    public static final DeferredHolder<Block,Block> ELOPICHTHYS_BAMBUSA_SPECIMEN = BLOCKS.register("elopichthys_bambusa_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ELOPICHTHYS_BAMBUSA_SPECIMEN::get));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
