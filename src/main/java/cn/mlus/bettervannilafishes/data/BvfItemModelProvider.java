package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
public class BvfItemModelProvider extends ItemModelProvider {
    public BvfItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, BetterVannilaFishes.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        this.simpleItem(BvfItems.HADDOCK_COD_SPAWN_EGG.get());
        this.simpleItem(BvfItems.ATLANTIC_COD_SPAWN_EGG.get());
        this.simpleItem(BvfItems.PACIFIC_COD_SPAWN_EGG.get());
        this.simpleItem(BvfItems.MALE_SALMON_SPAWN_EGG.get());
        this.simpleItem(BvfItems.FEMALE_SALMON_SPAWN_EGG.get());
        this.simpleItem(BvfItems.PACIFIC_SALMON_SPAWN_EGG.get());
        this.simpleItem(BvfItems.YELLOW_FIN_PUFFER_SPAWN_EGG.get());
        this.simpleItem(BvfItems.OBSCURE_PUFFER_SPAWN_EGG.get());
        this.simpleItem(BvfItems.PORCUPINE_FISH_SPAWN_EGG.get());
        this.simpleItem(BvfItems.NAUTILUS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.FEATHER_STAR_SPAWN_EGG.get());
        this.simpleItem(BvfItems.SPEARFISH_SPAWN_EGG.get());
        this.simpleItem(BvfItems.GALEOCERDO_CUVIER_SPAWN_EGG.get());
        this.simpleItem(BvfItems.ACANTHURUS_ACHILLES_SPAWN_EGG.get());
        this.simpleItem(BvfItems.ACANTHURUS_LEUCOSTERNON_SPAWN_EGG.get());
        this.simpleItem(BvfItems.PARACANTHURUS_HEPATUS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.ACANTHURUS_TRIOSTEGUS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.ACANTHURUS_NIGRICANS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.ACANTHURUS_LINEATUS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.AUSTRALOHEROS_FACETUS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.CICHLASOMA_BIMACULATUM_SPAWN_EGG.get());
        this.simpleItem(BvfItems.KROBIA_GUIANENSIS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.AEQUIDENS_TETRAMERUS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.GYMNOGEOPHAGUS_BALZANII_SPAWN_EGG.get());
        this.simpleItem(BvfItems.ASTRONOTUS_OCELLATUS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.AMPHIPRION_OCELLARIS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.PREMNAS_BIACULEATUS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.AMPHIPRION_POLYMNUS_SPAWN_EGG.get());
        this.simpleItem(BvfItems.AMPHIPRION_PERIDERAION_SPAWN_EGG.get());
        this.simpleItem(BvfItems.AMPHIPRION_CLARKII_SPAWN_EGG.get());
        this.simpleItem(BvfItems.AMPHIPRION_PERCULA_SPAWN_EGG.get());

        this.simpleItem(BvfItems.HADDOCK_COD_BUCKET.get());
        this.simpleItem(BvfItems.ATLANTIC_COD_BUCKET.get());
        this.simpleItem(BvfItems.PACIFIC_COD_BUCKET.get());
        this.simpleItem(BvfItems.MALE_SALMON_BUCKET.get());
        this.simpleItem(BvfItems.FEMALE_SALMON_BUCKET.get());
        this.simpleItem(BvfItems.PACIFIC_SALMON_BUCKET.get());
        this.simpleItem(BvfItems.YELLOW_FIN_PUFFER_BUCKET.get());
        this.simpleItem(BvfItems.OBSCURE_PUFFER_BUCKET.get());
        this.simpleItem(BvfItems.PORCUPINE_FISH_BUCKET.get());
        this.simpleItem(BvfItems.NAUTILUS_BUCKET.get());
        this.simpleItem(BvfItems.FEATHER_STAR_BUCKET.get());
        this.simpleItem(BvfItems.SPEARFISH_BUCKET.get());
        this.simpleItem(BvfItems.GALEOCERDO_CUVIER_BUCKET.get());
        this.simpleItem(BvfItems.ACANTHURUS_ACHILLES_BUCKET.get());
        this.simpleItem(BvfItems.ACANTHURUS_LEUCOSTERNON_BUCKET.get());
        this.simpleItem(BvfItems.PARACANTHURUS_HEPATUS_BUCKET.get());
        this.simpleItem(BvfItems.ACANTHURUS_TRIOSTEGUS_BUCKET.get());
        this.simpleItem(BvfItems.ACANTHURUS_NIGRICANS_BUCKET.get());
        this.simpleItem(BvfItems.ACANTHURUS_LINEATUS_BUCKET.get());
        this.simpleItem(BvfItems.AUSTRALOHEROS_FACETUS_BUCKET.get());
        this.simpleItem(BvfItems.CICHLASOMA_BIMACULATUM_BUCKET.get());
        this.simpleItem(BvfItems.KROBIA_GUIANENSIS_BUCKET.get());
        this.simpleItem(BvfItems.AEQUIDENS_TETRAMERUS_BUCKET.get());
        this.simpleItem(BvfItems.GYMNOGEOPHAGUS_BALZANII_BUCKET.get());
        this.simpleItem(BvfItems.ASTRONOTUS_OCELLATUS_BUCKET.get());
        this.simpleItem(BvfItems.AMPHIPRION_OCELLARIS_BUCKET.get());
        this.simpleItem(BvfItems.PREMNAS_BIACULEATUS_BUCKET.get());
        this.simpleItem(BvfItems.AMPHIPRION_POLYMNUS_BUCKET.get());
        this.simpleItem(BvfItems.AMPHIPRION_PERIDERAION_BUCKET.get());
        this.simpleItem(BvfItems.AMPHIPRION_CLARKII_BUCKET.get());
        this.simpleItem(BvfItems.AMPHIPRION_PERCULA_BUCKET.get());

        this.simpleItem(BvfItems.HADDOCK_COD.get());
        this.simpleItem(BvfItems.ATLANTIC_COD.get());
        this.simpleItem(BvfItems.PACIFIC_COD.get());
        this.simpleItem(BvfItems.MALE_SALMON.get());
        this.simpleItem(BvfItems.FEMALE_SALMON.get());
        this.simpleItem(BvfItems.PACIFIC_SALMON.get());
        this.simpleItem(BvfItems.YELLOW_FIN_PUFFER.get());
        this.simpleItem(BvfItems.OBSCURE_PUFFER.get());
        this.simpleItem(BvfItems.PORCUPINE_FISH.get());
        this.simpleItem(BvfItems.FEATHER_STAR_TENTACLE.get());
        this.simpleItem(BvfItems.SPEARFISH.get());
        this.simpleItem(BvfItems.COOKED_SPEARFISH.get());
        this.simpleItem(BvfItems.GALEOCERDO_CUVIER.get());
        this.simpleItem(BvfItems.SHARK_FIN.get());
        this.simpleItem(BvfItems.ACANTHURUS_ACHILLES.get());
        this.simpleItem(BvfItems.ACANTHURUS_LEUCOSTERNON.get());
        this.simpleItem(BvfItems.PARACANTHURUS_HEPATUS.get());
        this.simpleItem(BvfItems.ACANTHURUS_TRIOSTEGUS.get());
        this.simpleItem(BvfItems.ACANTHURUS_NIGRICANS.get());
        this.simpleItem(BvfItems.ACANTHURUS_LINEATUS.get());
        this.simpleItem(BvfItems.AUSTRALOHEROS_FACETUS.get());
        this.simpleItem(BvfItems.CICHLASOMA_BIMACULATUM.get());
        this.simpleItem(BvfItems.KROBIA_GUIANENSIS.get());
        this.simpleItem(BvfItems.AEQUIDENS_TETRAMERUS.get());
        this.simpleItem(BvfItems.GYMNOGEOPHAGUS_BALZANII.get());
        this.simpleItem(BvfItems.ASTRONOTUS_OCELLATUS.get());
        // Clownfish (小丑鱼/双锯鱼) Food
        this.simpleItem(BvfItems.AMPHIPRION_OCELLARIS.get());
        this.simpleItem(BvfItems.PREMNAS_BIACULEATUS.get());
        this.simpleItem(BvfItems.AMPHIPRION_POLYMNUS.get());
        this.simpleItem(BvfItems.AMPHIPRION_PERIDERAION.get());
        this.simpleItem(BvfItems.AMPHIPRION_CLARKII.get());
        this.simpleItem(BvfItems.AMPHIPRION_PERCULA.get());

        this.simpleItem(BvfItems.HADDOCK_COD_SPECIMEN.get());
        this.simpleItem(BvfItems.ATLANTIC_COD_SPECIMEN.get());
        this.simpleItem(BvfItems.PACIFIC_COD_SPECIMEN.get());
        this.simpleItem(BvfItems.PACIFIC_SALMON_SPECIMEN.get());
        this.simpleItem(BvfItems.MALE_SALMON_SPECIMEN.get());
        this.simpleItem(BvfItems.FEMALE_SALMON_SPECIMEN.get());
        this.simpleItem(BvfItems.SPEARFISH_SPECIMEN.get());
        this.simpleItem(BvfItems.GALEOCERDO_CUVIER_SPECIMEN.get());
    }

    private void simpleItem(Item item) {
        String path = BuiltInRegistries.ITEM.getKey(item).getPath();
        this.withExistingParent(path, this.mcLoc("item/generated"))
                .texture("layer0", this.modLoc("item/" + path));
    }
}
