package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.init.BvfEntities;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
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
        this.tag(BvfTagKeys.TOP_PREDATOR)
                .add(BvfEntities.GALEOCERDO_CUVIER.get())
                .add(BvfEntities.EPINEPHELUS_LANCEOLATUS.get())
                .add(BvfEntities.EPINEPHELUS_ITAJARA.get())
                .add(BvfEntities.EPINEPHELUS_MELANOSTIGMA.get());

        this.tag(EntityTypeTags.AXOLOTL_HUNT_TARGETS)
                .add(BvfEntities.BVC_HADDOCK_COD.get())
                .add(BvfEntities.BVC_ATLANTIC_COD.get())
                .add(BvfEntities.BVC_PACIFIC_COD.get())
                .add(BvfEntities.BVC_SALMON_MALE.get())
                .add(BvfEntities.BVC_SALMON_FEMALE.get())
                .add(BvfEntities.BVC_SALMON_PACIFIC.get())
                .add(BvfEntities.YELLOW_FIN_PUFFER.get())
                .add(BvfEntities.OBSCURE_PUFFER.get())
                .add(BvfEntities.PORCUPINE_FISH.get())
                .add(BvfEntities.ACANTHURUS_ACHILLES.get())
                .add(BvfEntities.ACANTHURUS_LEUCOSTERNON.get())
                .add(BvfEntities.ACANTHURUS_LINEATUS.get())
                .add(BvfEntities.ACANTHURUS_NIGRICANS.get())
                .add(BvfEntities.ACANTHURUS_TRIOSTEGUS.get())
                .add(BvfEntities.PARACANTHURUS_HEPATUS.get())
                .add(BvfEntities.CHAETODON_STRIATUS.get())
                .add(BvfEntities.CHAETODON_UNIMACULATUS.get())
                .add(BvfEntities.CHAETODON_AURIGA.get())
                .add(BvfEntities.CHAETODON_COLLARE.get())
                .add(BvfEntities.CHAETODON_RETICULATUS.get())
                .add(BvfEntities.CHAETODON_SPECULUM.get())
                .add(BvfEntities.AUSTRALOHEROS_FACETUS.get())
                .add(BvfEntities.CICHLASOMA_BIMACULATUM.get())
                .add(BvfEntities.KROBIA_GUIANENSIS.get())
                .add(BvfEntities.AEQUIDENS_TETRAMERUS.get())
                .add(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get())
                .add(BvfEntities.ASTRONOTUS_OCELLATUS.get())
                .add(BvfEntities.AMPHIPRION_OCELLARIS.get())
                .add(BvfEntities.PREMNAS_BIACULEATUS.get())
                .add(BvfEntities.AMPHIPRION_POLYMNUS.get())
                .add(BvfEntities.AMPHIPRION_PERIDERAION.get())
                .add(BvfEntities.AMPHIPRION_CLARKII.get())
                .add(BvfEntities.AMPHIPRION_PERCULA.get());
    }
}
