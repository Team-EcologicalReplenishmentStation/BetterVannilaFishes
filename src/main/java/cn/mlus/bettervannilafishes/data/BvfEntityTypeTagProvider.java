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
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.KAJIKIA_AUDAX.get()).add(BvfEntities.NEMATISTIUS_PECTORALIS.get()).add(BvfEntities.DOSIDICUS_GIGAS.get()).add(BvfEntities.CHANNA_MICROPELTES.get()).add(BvfEntities.CHANNA_ARGUS.get()).add(BvfEntities.ELOPICHTHYS_BAMBUSA.get()).add(BvfEntities.MEGALOPS_ATLANTICUS.get());
        this.tag(BvfTagKeys.TOP_PREDATOR)
                .add(BvfEntities.GALEOCERDO_CUVIER.get())
                .add(BvfEntities.EPINEPHELUS_LANCEOLATUS.get())
                .add(BvfEntities.EPINEPHELUS_ITAJARA.get())
                .add(BvfEntities.EPINEPHELUS_TUKULA.get())
                .add(BvfEntities.HUSO_DAURICUS.get());

        this.tag(EntityTypeTags.AXOLOTL_HUNT_TARGETS)
                .add(BvfEntities.BVC_MELANOGRAMMUS_AEGLEFINUS.get())
                .add(BvfEntities.BVC_GADUS_MORHUA.get())
                .add(BvfEntities.BVC_GADUS_MACROCEPHALUS.get())
                .add(BvfEntities.BVC_SALMON_MALE.get())
                .add(BvfEntities.BVC_SALMON_FEMALE.get())
                .add(BvfEntities.BVC_SALMON_PACIFIC.get())
                .add(BvfEntities.TAKIFUGU_XANTHOPTERUS.get())
                .add(BvfEntities.TAKIFUGU_OBSCURUS.get())
                .add(BvfEntities.DIODON_HOLOCANTHUS.get())
                .add(BvfEntities.ACANTHURUS_ACHILLES.get())
                .add(BvfEntities.ACANTHURUS_LEUCOSTERNON.get())
                .add(BvfEntities.ACANTHURUS_LINEATUS.get())
                .add(BvfEntities.ACANTHURUS_LEUCOPAREIUS.get())
                .add(BvfEntities.ACANTHURUS_TRIOSTEGUS.get())
                .add(BvfEntities.PARACANTHURUS_HEPATUS.get())
                .add(BvfEntities.CHAETODON_STRIATUS.get())
                .add(BvfEntities.CHAETODON_UNIMACULATUS.get())
                .add(BvfEntities.CHAETODON_AURIGA.get())
                .add(BvfEntities.CHAETODON_XANTHURUS.get())
                .add(BvfEntities.CHAETODON_RETICULATUS.get())
                .add(BvfEntities.CHAETODON_SPECULUM.get())
                .add(BvfEntities.CICHLA_ORINOCENSIS.get())
                .add(BvfEntities.CICHLA_JARIINA.get())
                .add(BvfEntities.CICHLA_KELBERI.get())
                .add(BvfEntities.CICHLA_PIQUITI.get())
                .add(BvfEntities.CICHLA_PINIMA.get())
                .add(BvfEntities.CICHLA_OCELLARIS.get())
                .add(BvfEntities.CHANNA_MICROPELTES.get())
                .add(BvfEntities.CHANNA_ARGUS.get())
                .add(BvfEntities.ELOPICHTHYS_BAMBUSA.get())
                .add(BvfEntities.AMPHIPRION_OCELLARIS.get())
                .add(BvfEntities.AMPHIPRION_BIACULEATUS.get())
                .add(BvfEntities.AMPHIPRION_POLYMNUS.get())
                .add(BvfEntities.AMPHIPRION_THIELLEI.get())
                .add(BvfEntities.AMPHIPRION_PERCULA.get())
                .add(BvfEntities.AMPHIPRION_PERIDERAION.get())
                .add(BvfEntities.AMPHIPRION_CLARKII.get())
                .add(BvfEntities.AMPHIPRION_BICINCTUS.get())
                .add(BvfEntities.AMPHIPRION_EPHIPPIUM.get())
                .add(BvfEntities.AMPHIPRION_CHRYSOPTERUS.get())
                .add(BvfEntities.AMPHIPRION_FRENATUS.get())
                .add(BvfEntities.AMPHIPRION_MCCULLOCHI.get())
                .add(BvfEntities.AMPHIPRION_MELANOPUS.get())
                .add(BvfEntities.AMPHIPRION_TRICINCTUS.get())
                .add(BvfEntities.BETTA_SPLENDENS.get())
                .add(BvfEntities.BETTA_SIAMORIENTALIS.get())
                .add(BvfEntities.BETTA_SMARAGDINA.get())
                .add(BvfEntities.BETTA_PICTA.get())
                .add(BvfEntities.BETTA_SIMPLEX.get())
                .add(BvfEntities.BETTA_FUSCA.get())
                .add(BvfEntities.MYLOPHARYNGODON_PICEUS.get())
                .add(BvfEntities.CTENOPHARYNGODON_IDELLA.get())
                .add(BvfEntities.HYPOPHTHALMICHTHYS_MOLITRIX.get())
                .add(BvfEntities.HYPOPHTHALMICHTHYS_NOBILIS.get());
    }
}
