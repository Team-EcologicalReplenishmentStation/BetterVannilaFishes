package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BvfEntityTypeTagProvider extends EntityTypeTagsProvider {
    public BvfEntityTypeTagProvider(PackOutput p_256095_, CompletableFuture<HolderLookup.Provider> p_256572_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_256095_, p_256572_, BetterVannilaFishes.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(EntityTypeTags.CAN_BREATHE_UNDER_WATER).add(
                BvfEntities.BVC_ATLANTIC_COD.get(),
                BvfEntities.BVC_PACIFIC_COD.get(),
                BvfEntities.BVC_HADDOCK_COD.get(),
                BvfEntities.BVC_SALMON_FEMALE.get(),
                BvfEntities.BVC_SALMON_MALE.get(),
                BvfEntities.BVC_SALMON_PACIFIC.get(),
                BvfEntities.OBSCURE_PUFFER.get(),
                BvfEntities.YELLOW_FIN_PUFFER.get(),
                BvfEntities.NAUTILUS.get()
        );

        this.tag(EntityTypeTags.NOT_SCARY_FOR_PUFFERFISH).add(
                BvfEntities.NAUTILUS.get(),
                BvfEntities.PORCUPINE_FISH.get(),
                BvfEntities.OBSCURE_PUFFER.get(),
                BvfEntities.YELLOW_FIN_PUFFER.get(),
                BvfEntities.BVC_ATLANTIC_COD.get(),
                BvfEntities.BVC_PACIFIC_COD.get(),
                BvfEntities.BVC_HADDOCK_COD.get(),
                BvfEntities.BVC_SALMON_FEMALE.get(),
                BvfEntities.BVC_SALMON_MALE.get(),
                BvfEntities.BVC_SALMON_PACIFIC.get()
        );
    }
}
