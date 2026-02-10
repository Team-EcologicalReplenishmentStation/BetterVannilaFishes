package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
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
                BvfEntities.NAUTILUS.get(),
                BvfEntities.AUSTRALOHEROS_FACETUS.get(),
                BvfEntities.CICHLASOMA_BIMACULATUM.get(),
                BvfEntities.KROBIA_GUIANENSIS.get(),
                BvfEntities.AEQUIDENS_TETRAMERUS.get(),
                BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(),
                BvfEntities.ASTRONOTUS_OCELLATUS.get(),
                BvfEntities.AMPHIPRION_OCELLARIS.get(),
                BvfEntities.PREMNAS_BIACULEATUS.get(),
                BvfEntities.AMPHIPRION_POLYMNUS.get(),
                BvfEntities.AMPHIPRION_PERIDERAION.get(),
                BvfEntities.AMPHIPRION_CLARKII.get(),
                BvfEntities.AMPHIPRION_PERCULA.get(),
                BvfEntities.ACANTHURUS_ACHILLES.get(),
                BvfEntities.ACANTHURUS_LEUCOSTERNON.get(),
                BvfEntities.PARACANTHURUS_HEPATUS.get(),
                BvfEntities.ACANTHURUS_TRIOSTEGUS.get(),
                BvfEntities.ACANTHURUS_NIGRICANS.get(),
                BvfEntities.ACANTHURUS_LINEATUS.get()
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
                BvfEntities.BVC_SALMON_PACIFIC.get(),
                BvfEntities.AUSTRALOHEROS_FACETUS.get(),
                BvfEntities.CICHLASOMA_BIMACULATUM.get(),
                BvfEntities.KROBIA_GUIANENSIS.get(),
                BvfEntities.AEQUIDENS_TETRAMERUS.get(),
                BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(),
                BvfEntities.ASTRONOTUS_OCELLATUS.get(),
                BvfEntities.AMPHIPRION_OCELLARIS.get(),
                BvfEntities.PREMNAS_BIACULEATUS.get(),
                BvfEntities.AMPHIPRION_POLYMNUS.get(),
                BvfEntities.AMPHIPRION_PERIDERAION.get(),
                BvfEntities.AMPHIPRION_CLARKII.get(),
                BvfEntities.AMPHIPRION_PERCULA.get(),
                BvfEntities.ACANTHURUS_ACHILLES.get(),
                BvfEntities.ACANTHURUS_LEUCOSTERNON.get(),
                BvfEntities.PARACANTHURUS_HEPATUS.get(),
                BvfEntities.ACANTHURUS_TRIOSTEGUS.get(),
                BvfEntities.ACANTHURUS_NIGRICANS.get(),
                BvfEntities.ACANTHURUS_LINEATUS.get()
        );

        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.SPEARFISH.get());
        this.tag(BvfTagKeys.TOP_PREDATOR).add(BvfEntities.GALEOCERDO_CUVIER.get());
    }
}
