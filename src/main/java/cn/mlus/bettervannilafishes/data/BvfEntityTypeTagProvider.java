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
                BvfEntities.EPINEPHELUS_LANCEOLATUS.get(),
                BvfEntities.EPINEPHELUS_ITAJARA.get(),
                BvfEntities.EPINEPHELUS_MELANOSTIGMA.get(),
                BvfEntities.ACANTHURUS_ACHILLES.get(),
                BvfEntities.ACANTHURUS_LEUCOSTERNON.get(),
                BvfEntities.PARACANTHURUS_HEPATUS.get(),
                BvfEntities.ACANTHURUS_TRIOSTEGUS.get(),
                BvfEntities.ACANTHURUS_NIGRICANS.get(),
                BvfEntities.ACANTHURUS_LINEATUS.get(),
                BvfEntities.CHAETODON_STRIATUS.get(),
                BvfEntities.CHAETODON_UNIMACULATUS.get(),
                BvfEntities.CHAETODON_AURIGA.get(),
                BvfEntities.CHAETODON_COLLARE.get(),
                BvfEntities.CHAETODON_RETICULATUS.get(),
                BvfEntities.CHAETODON_SPECULUM.get(),
                BvfEntities.CHANNA_ARGUS.get(),
                BvfEntities.CHANNA_MICROPELTES.get(),
                BvfEntities.ELOPICHTHYS_BAMBUSA.get()
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
                BvfEntities.EPINEPHELUS_LANCEOLATUS.get(),
                BvfEntities.EPINEPHELUS_ITAJARA.get(),
                BvfEntities.EPINEPHELUS_MELANOSTIGMA.get(),
                BvfEntities.ACANTHURUS_ACHILLES.get(),
                BvfEntities.ACANTHURUS_LEUCOSTERNON.get(),
                BvfEntities.PARACANTHURUS_HEPATUS.get(),
                BvfEntities.ACANTHURUS_TRIOSTEGUS.get(),
                BvfEntities.ACANTHURUS_NIGRICANS.get(),
                BvfEntities.ACANTHURUS_LINEATUS.get(),
                BvfEntities.CHAETODON_STRIATUS.get(),
                BvfEntities.CHAETODON_UNIMACULATUS.get(),
                BvfEntities.CHAETODON_AURIGA.get(),
                BvfEntities.CHAETODON_COLLARE.get(),
                BvfEntities.CHAETODON_RETICULATUS.get(),
                BvfEntities.CHAETODON_SPECULUM.get()
        );

        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.SPEARFISH.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.DOSIDICUS_GIGAS.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.CHANNA_MICROPELTES.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.CHANNA_ARGUS.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.ELOPICHTHYS_BAMBUSA.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.MEGALOPS_ATLANTICUS.get());
        this.tag(BvfTagKeys.TOP_PREDATOR)
                .add(BvfEntities.GALEOCERDO_CUVIER.get())
                .add(BvfEntities.EPINEPHELUS_LANCEOLATUS.get())
                .add(BvfEntities.EPINEPHELUS_ITAJARA.get())
                .add(BvfEntities.EPINEPHELUS_MELANOSTIGMA.get())
                .add(BvfEntities.HUSO_DAURICUS.get());

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
                .add(BvfEntities.CHANNA_MICROPELTES.get())
                .add(BvfEntities.CHANNA_ARGUS.get())
                .add(BvfEntities.ELOPICHTHYS_BAMBUSA.get())
                .add(BvfEntities.AMPHIPRION_OCELLARIS.get())
                .add(BvfEntities.PREMNAS_BIACULEATUS.get())
                .add(BvfEntities.AMPHIPRION_POLYMNUS.get())
                .add(BvfEntities.AMPHIPRION_PERIDERAION.get())
                .add(BvfEntities.AMPHIPRION_CLARKII.get())
                .add(BvfEntities.AMPHIPRION_PERCULA.get())
                .add(BvfEntities.AMPHIPRION_AKINDYNOS.get())
                .add(BvfEntities.AMPHIPRION_BICINCTUS.get())
                .add(BvfEntities.AMPHIPRION_CHRYSOGASTER.get())
                .add(BvfEntities.AMPHIPRION_CHRYSOPTERUS.get())
                .add(BvfEntities.AMPHIPRION_LATEZONATUS.get())
                .add(BvfEntities.AMPHIPRION_MCCULLOCHI.get())
                .add(BvfEntities.AMPHIPRION_MELANOPUS.get())
                .add(BvfEntities.AMPHIPRION_TRICINCTUS.get())
                .add(BvfEntities.BETTA_SPLENDENS.get())
                .add(BvfEntities.BETTA_IMBELLIS.get())
                .add(BvfEntities.BETTA_SMARAGDINA.get())
                .add(BvfEntities.BETTA_PICTA.get())
                .add(BvfEntities.BETTA_SIMPLEX.get())
                .add(BvfEntities.BETTA_BROWNORUM.get());
    }
}
