package cn.mlus.bettervannilafishes.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.packs.VanillaBlockLoot;

public class BvfBlockLoot extends VanillaBlockLoot {
    public BvfBlockLoot(HolderLookup.Provider p_344962_) {
        super(p_344962_);
    }

    @Override
    protected void generate() {
//        this.add(BvcBlocks.ATLANTIC_COD_SPECIMEN.get(), block -> this.createSingleItemTable(BvcItems.ATLANTIC_COD_SPECIMEN.get()));
    }

//    @Override
//    protected Iterable<Block> getKnownBlocks() {
//        return BvfBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
//    }
}
