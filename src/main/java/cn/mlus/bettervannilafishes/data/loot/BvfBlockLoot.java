package cn.mlus.bettervannilafishes.data.loot;

import cn.mlus.bettervannilafishes.init.BvfBlocks;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class BvfBlockLoot extends VanillaBlockLoot {
    @Override
    protected void generate() {
//        this.add(BvcBlocks.ATLANTIC_COD_SPECIMEN.get(), block -> this.createSingleItemTable(BvcItems.ATLANTIC_COD_SPECIMEN.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BvfBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
