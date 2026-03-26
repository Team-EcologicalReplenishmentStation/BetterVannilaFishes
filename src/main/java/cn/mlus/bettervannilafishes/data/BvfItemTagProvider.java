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
                .add(BvfItems.HADDOCK_COD.get())
                .add(BvfItems.ATLANTIC_COD.get())
                .add(BvfItems.PACIFIC_COD.get())
                .add(BvfItems.MALE_SALMON.get())
                .add(BvfItems.FEMALE_SALMON.get())
                .add(BvfItems.PACIFIC_SALMON.get())
                .add(BvfItems.SPEARFISH.get())
                .add(BvfItems.GALEOCERDO_CUVIER.get())
                .add(BvfItems.HUMBOLDT_SQUID.get())
                .add(BvfItems.EPINEPHELUS_LANCEOLATUS.get())
                .add(BvfItems.EPINEPHELUS_ITAJARA.get())
                .add(BvfItems.EPINEPHELUS_MELANOSTIGMA.get())
                .add(BvfItems.ACANTHURUS_ACHILLES.get())
                .add(BvfItems.ACANTHURUS_LEUCOSTERNON.get())
                .add(BvfItems.ACANTHURUS_LINEATUS.get())
                .add(BvfItems.ACANTHURUS_NIGRICANS.get())
                .add(BvfItems.ACANTHURUS_TRIOSTEGUS.get())
                .add(BvfItems.PARACANTHURUS_HEPATUS.get())
                .add(BvfItems.CHAETODON_STRIATUS.get())
                .add(BvfItems.CHAETODON_UNIMACULATUS.get())
                .add(BvfItems.CHAETODON_AURIGA.get())
                .add(BvfItems.CHAETODON_COLLARE.get())
                .add(BvfItems.CHAETODON_RETICULATUS.get())
                .add(BvfItems.CHAETODON_SPECULUM.get())
                .add(BvfItems.AUSTRALOHEROS_FACETUS.get())
                .add(BvfItems.CICHLASOMA_BIMACULATUM.get())
                .add(BvfItems.KROBIA_GUIANENSIS.get())
                .add(BvfItems.AEQUIDENS_TETRAMERUS.get())
                .add(BvfItems.GYMNOGEOPHAGUS_BALZANII.get())
                .add(BvfItems.ASTRONOTUS_OCELLATUS.get())
                .add(BvfItems.AMPHIPRION_OCELLARIS.get())
                .add(BvfItems.PREMNAS_BIACULEATUS.get())
                .add(BvfItems.AMPHIPRION_POLYMNUS.get())
                .add(BvfItems.AMPHIPRION_PERIDERAION.get())
                .add(BvfItems.AMPHIPRION_CLARKII.get())
                .add(BvfItems.AMPHIPRION_PERCULA.get())
                .addTag(BvfTagKeys.PUFFER);

//        this.tag(ErsTagKeys.KNOWN_FISH)
//                .add(BvfItems.HADDOCK_COD.get())
//                .add(BvfItems.ATLANTIC_COD.get())
//                .add(BvfItems.PACIFIC_COD.get())
//                .add(BvfItems.MALE_SALMON.get())
//                .add(BvfItems.FEMALE_SALMON.get())
//                .add(BvfItems.PACIFIC_SALMON.get())
//                .add(BvfItems.YELLOW_FIN_PUFFER.get())
//                .add(BvfItems.OBSCURE_PUFFER.get())
//                .add(BvfItems.PORCUPINE_FISH.get())
//                .add(BvfItems.SPEARFISH.get())
//                .add(BvfItems.ACANTHURUS_ACHILLES.get())
//                .add(BvfItems.ACANTHURUS_LEUCOSTERNON.get())
//                .add(BvfItems.ACANTHURUS_LINEATUS.get())
//                .add(BvfItems.ACANTHURUS_NIGRICANS.get())
//                .add(BvfItems.ACANTHURUS_TRIOSTEGUS.get())
//                .add(BvfItems.PARACANTHURUS_HEPATUS.get())
//                .add(BvfItems.AUSTRALOHEROS_FACETUS.get())
//                .add(BvfItems.CICHLASOMA_BIMACULATUM.get())
//                .add(BvfItems.KROBIA_GUIANENSIS.get())
//                .add(BvfItems.AEQUIDENS_TETRAMERUS.get())
//                .add(BvfItems.GYMNOGEOPHAGUS_BALZANII.get())
//                .add(BvfItems.ASTRONOTUS_OCELLATUS.get())
//                .add(BvfItems.AMPHIPRION_OCELLARIS.get())
//                .add(BvfItems.PREMNAS_BIACULEATUS.get())
//                .add(BvfItems.AMPHIPRION_POLYMNUS.get())
//                .add(BvfItems.AMPHIPRION_PERIDERAION.get())
//                .add(BvfItems.AMPHIPRION_CLARKII.get())
//                .add(BvfItems.AMPHIPRION_PERCULA.get());

        this.tag(BvfTagKeys.PUFFER)
                .add(BvfItems.YELLOW_FIN_PUFFER.get())
                .add(BvfItems.OBSCURE_PUFFER.get())
                .add(BvfItems.PORCUPINE_FISH.get());

        this.tag(ItemTags.AXOLOTL_TEMPT_ITEMS)
                .add(BvfItems.HADDOCK_COD_BUCKET.get())
                .add(BvfItems.ATLANTIC_COD_BUCKET.get())
                .add(BvfItems.PACIFIC_COD_BUCKET.get())
                .add(BvfItems.MALE_SALMON_BUCKET.get())
                .add(BvfItems.FEMALE_SALMON_BUCKET.get())
                .add(BvfItems.PACIFIC_SALMON_BUCKET.get())
                .add(BvfItems.YELLOW_FIN_PUFFER_BUCKET.get())
                .add(BvfItems.OBSCURE_PUFFER_BUCKET.get())
                .add(BvfItems.PORCUPINE_FISH_BUCKET.get())
                .add(BvfItems.EPINEPHELUS_LANCEOLATUS_BUCKET.get())
                .add(BvfItems.EPINEPHELUS_ITAJARA_BUCKET.get())
                .add(BvfItems.EPINEPHELUS_MELANOSTIGMA_BUCKET.get())
                .add(BvfItems.ACANTHURUS_ACHILLES_BUCKET.get())
                .add(BvfItems.ACANTHURUS_LEUCOSTERNON_BUCKET.get())
                .add(BvfItems.ACANTHURUS_LINEATUS_BUCKET.get())
                .add(BvfItems.ACANTHURUS_NIGRICANS_BUCKET.get())
                .add(BvfItems.ACANTHURUS_TRIOSTEGUS_BUCKET.get())
                .add(BvfItems.PARACANTHURUS_HEPATUS_BUCKET.get())
                .add(BvfItems.CHAETODON_STRIATUS_BUCKET.get())
                .add(BvfItems.CHAETODON_UNIMACULATUS_BUCKET.get())
                .add(BvfItems.CHAETODON_AURIGA_BUCKET.get())
                .add(BvfItems.CHAETODON_COLLARE_BUCKET.get())
                .add(BvfItems.CHAETODON_RETICULATUS_BUCKET.get())
                .add(BvfItems.CHAETODON_SPECULUM_BUCKET.get())
                .add(BvfItems.AUSTRALOHEROS_FACETUS_BUCKET.get())
                .add(BvfItems.CICHLASOMA_BIMACULATUM_BUCKET.get())
                .add(BvfItems.KROBIA_GUIANENSIS_BUCKET.get())
                .add(BvfItems.AEQUIDENS_TETRAMERUS_BUCKET.get())
                .add(BvfItems.GYMNOGEOPHAGUS_BALZANII_BUCKET.get())
                .add(BvfItems.ASTRONOTUS_OCELLATUS_BUCKET.get())
                .add(BvfItems.AMPHIPRION_OCELLARIS_BUCKET.get())
                .add(BvfItems.PREMNAS_BIACULEATUS_BUCKET.get())
                .add(BvfItems.AMPHIPRION_POLYMNUS_BUCKET.get())
                .add(BvfItems.AMPHIPRION_PERIDERAION_BUCKET.get())
                .add(BvfItems.AMPHIPRION_CLARKII_BUCKET.get())
                .add(BvfItems.AMPHIPRION_PERCULA_BUCKET.get());
    }
}