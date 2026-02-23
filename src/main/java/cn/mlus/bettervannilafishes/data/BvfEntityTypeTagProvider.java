package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.init.BvfEntities;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BvfEntityTypeTagProvider extends EntityTypeTagsProvider {
    public BvfEntityTypeTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.SPEARFISH.get()).add(BvfEntities.DOSIDICUS_GIGAS.get());
        this.tag(BvfTagKeys.TOP_PREDATOR).add(BvfEntities.GALEOCERDO_CUVIER.get());
    }
}
