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
                BvfEntities.BVC_GADUS_MORHUA.get(),
                BvfEntities.BVC_GADUS_MACROCEPHALUS.get(),
                BvfEntities.BVC_MELANOGRAMMUS_AEGLEFINUS.get(),
                BvfEntities.BVC_SALMON_FEMALE.get(),
                BvfEntities.BVC_SALMON_MALE.get(),
                BvfEntities.BVC_SALMON_PACIFIC.get(),
                BvfEntities.TAKIFUGU_OBSCURUS.get(),
                BvfEntities.TAKIFUGU_XANTHOPTERUS.get(),
                BvfEntities.NAUTILUS_POMPILIUS.get(),
                BvfEntities.CICHLA_ORINOCENSIS.get(),
                BvfEntities.CICHLA_PIQUITI.get(),
                BvfEntities.CICHLA_JARIINA.get(),
                BvfEntities.CICHLA_KELBERI.get(),
                BvfEntities.CICHLA_PINIMA.get(),
                BvfEntities.CICHLA_OCELLARIS.get(),
                BvfEntities.AMPHIPRION_OCELLARIS.get(),
                BvfEntities.AMPHIPRION_FRENATUS.get(),
                BvfEntities.AMPHIPRION_POLYMNUS.get(),
                BvfEntities.AMPHIPRION_PERIDERAION.get(),
                BvfEntities.AMPHIPRION_CLARKII.get(),
                BvfEntities.AMPHIPRION_PERCULA.get(),
                BvfEntities.EPINEPHELUS_LANCEOLATUS.get(),
                BvfEntities.EPINEPHELUS_ITAJARA.get(),
                BvfEntities.EPINEPHELUS_TUKULA.get(),
                BvfEntities.ACANTHURUS_ACHILLES.get(),
                BvfEntities.ACANTHURUS_LEUCOSTERNON.get(),
                BvfEntities.PARACANTHURUS_HEPATUS.get(),
                BvfEntities.ACANTHURUS_TRIOSTEGUS.get(),
                BvfEntities.ACANTHURUS_LEUCOPAREIUS.get(),
                BvfEntities.ACANTHURUS_LINEATUS.get(),
                BvfEntities.CHAETODON_STRIATUS.get(),
                BvfEntities.CHAETODON_UNIMACULATUS.get(),
                BvfEntities.CHAETODON_AURIGA.get(),
                BvfEntities.CHAETODON_XANTHURUS.get(),
                BvfEntities.CHAETODON_RETICULATUS.get(),
                BvfEntities.CHAETODON_SPECULUM.get(),
                BvfEntities.CHANNA_ARGUS.get(),
                BvfEntities.CHANNA_MICROPELTES.get(),
                BvfEntities.ELOPICHTHYS_BAMBUSA.get()
        );

        this.tag(EntityTypeTags.NOT_SCARY_FOR_PUFFERFISH).add(
                BvfEntities.NAUTILUS_POMPILIUS.get(),
                BvfEntities.DIODON_HOLOCANTHUS.get(),
                BvfEntities.TAKIFUGU_OBSCURUS.get(),
                BvfEntities.TAKIFUGU_XANTHOPTERUS.get(),
                BvfEntities.BVC_GADUS_MORHUA.get(),
                BvfEntities.BVC_GADUS_MACROCEPHALUS.get(),
                BvfEntities.BVC_MELANOGRAMMUS_AEGLEFINUS.get(),
                BvfEntities.BVC_SALMON_FEMALE.get(),
                BvfEntities.BVC_SALMON_MALE.get(),
                BvfEntities.BVC_SALMON_PACIFIC.get(),
                BvfEntities.CICHLA_ORINOCENSIS.get(),
                BvfEntities.CICHLA_PIQUITI.get(),
                BvfEntities.CICHLA_JARIINA.get(),
                BvfEntities.CICHLA_KELBERI.get(),
                BvfEntities.CICHLA_PINIMA.get(),
                BvfEntities.CICHLA_OCELLARIS.get(),
                BvfEntities.AMPHIPRION_OCELLARIS.get(),
                BvfEntities.AMPHIPRION_FRENATUS.get(),
                BvfEntities.AMPHIPRION_POLYMNUS.get(),
                BvfEntities.AMPHIPRION_PERIDERAION.get(),
                BvfEntities.AMPHIPRION_CLARKII.get(),
                BvfEntities.AMPHIPRION_PERCULA.get(),
                BvfEntities.EPINEPHELUS_LANCEOLATUS.get(),
                BvfEntities.EPINEPHELUS_ITAJARA.get(),
                BvfEntities.EPINEPHELUS_TUKULA.get(),
                BvfEntities.ACANTHURUS_ACHILLES.get(),
                BvfEntities.ACANTHURUS_LEUCOSTERNON.get(),
                BvfEntities.PARACANTHURUS_HEPATUS.get(),
                BvfEntities.ACANTHURUS_TRIOSTEGUS.get(),
                BvfEntities.ACANTHURUS_LEUCOPAREIUS.get(),
                BvfEntities.ACANTHURUS_LINEATUS.get(),
                BvfEntities.CHAETODON_STRIATUS.get(),
                BvfEntities.CHAETODON_UNIMACULATUS.get(),
                BvfEntities.CHAETODON_AURIGA.get(),
                BvfEntities.CHAETODON_XANTHURUS.get(),
                BvfEntities.CHAETODON_RETICULATUS.get(),
                BvfEntities.CHAETODON_SPECULUM.get()
        );

        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.KAJIKIA_AUDAX.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.NEMATISTIUS_PECTORALIS.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.DOSIDICUS_GIGAS.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.CHANNA_MICROPELTES.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.CHANNA_ARGUS.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.ELOPICHTHYS_BAMBUSA.get());
        this.tag(BvfTagKeys.PREDATOR).add(BvfEntities.MEGALOPS_ATLANTICUS.get());
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
