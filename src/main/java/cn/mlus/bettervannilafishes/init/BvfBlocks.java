package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BvfBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.createBlocks(BetterVannilaFishes.MODID);
    public static final DeferredHolder<Block,Block> ATLANTIC_COD_SPECIMEN = BLOCKS.register("atlantic_cod_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion()));
    public static final DeferredHolder<Block,Block> PACIFIC_COD_SPECIMEN = BLOCKS.register("pacific_cod_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion()));
    public static final DeferredHolder<Block,Block> HADDOCK_COD_SPECIMEN = BLOCKS.register("haddock_cod_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion()));
    public static final DeferredHolder<Block,Block> PACIFIC_SALMON_SPECIMEN = BLOCKS.register("pacific_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion()));
    public static final DeferredHolder<Block,Block> MALE_SALMON_SPECIMEN = BLOCKS.register("male_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion()));
    public static final DeferredHolder<Block,Block> FEMALE_SALMON_SPECIMEN = BLOCKS.register("female_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
