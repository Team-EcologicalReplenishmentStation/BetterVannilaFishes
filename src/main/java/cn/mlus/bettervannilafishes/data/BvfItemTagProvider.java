package cn.mlus.bettervannilafishes.data;

import cn.aurorian.ers.init.ErsTagKeys;
import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfItems;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
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
                .add(BvfItems.HADDOCK_COD.get())
                .add(BvfItems.ATLANTIC_COD.get())
                .add(BvfItems.PACIFIC_COD.get())
                .add(BvfItems.MALE_SALMON.get())
                .add(BvfItems.FEMALE_SALMON.get())
                .add(BvfItems.PACIFIC_SALMON.get())
                .addTag(BvfTagKeys.PUFFER);

        this.tag(ErsTagKeys.KNOWN_FISH)
                .add(BvfItems.HADDOCK_COD.get())
                .add(BvfItems.ATLANTIC_COD.get())
                .add(BvfItems.PACIFIC_COD.get())
                .add(BvfItems.MALE_SALMON.get())
                .add(BvfItems.FEMALE_SALMON.get())
                .add(BvfItems.PACIFIC_SALMON.get())
                .add(BvfItems.YELLOW_FIN_PUFFER.get())
                .add(BvfItems.OBSCURE_PUFFER.get())
                .add(BvfItems.PORCUPINE_FISH.get());

        this.tag(BvfTagKeys.PUFFER)
                .add(BvfItems.YELLOW_FIN_PUFFER.get())
                .add(BvfItems.OBSCURE_PUFFER.get())
                .add(BvfItems.PORCUPINE_FISH.get());
    }
}