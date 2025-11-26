package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfItems;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BvfItemTagProvider extends ItemTagsProvider{

    public BvfItemTagProvider(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, BetterVannilaFishes.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(ItemTags.FISHES)
                .add(BvfItems.HADDOCK_COD.value())
                .add(BvfItems.ATLANTIC_COD.value())
                .add(BvfItems.PACIFIC_COD.value())
                .add(BvfItems.MALE_SALMON.value())
                .add(BvfItems.FEMALE_SALMON.value())
                .add(BvfItems.PACIFIC_SALMON.value())
                .add(BvfItems.YELLOW_FIN_PUFFER.value())
                .add(BvfItems.OBSCURE_PUFFER.value());

//        this.tag(ErsTagKeys.KNOWN_FISH)
//                .add(BvfItems.HADDOCK_COD.value())
//                .add(BvfItems.ATLANTIC_COD.value())
//                .add(BvfItems.PACIFIC_COD.value())
//                .add(BvfItems.MALE_SALMON.value())
//                .add(BvfItems.FEMALE_SALMON.value())
//                .add(BvfItems.PACIFIC_SALMON.value())
//                .add(BvfItems.YELLOW_FIN_PUFFER.value())
//                .add(BvfItems.OBSCURE_PUFFER.value());

        this.tag(BvfTagKeys.PUFFER)
                .add(BvfItems.YELLOW_FIN_PUFFER.value())
                .add(BvfItems.OBSCURE_PUFFER.value());
    }
}