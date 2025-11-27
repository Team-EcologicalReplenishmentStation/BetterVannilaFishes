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

        this.simpleItem(BvfItems.HADDOCK_COD.get());
        this.simpleItem(BvfItems.ATLANTIC_COD.get());
        this.simpleItem(BvfItems.PACIFIC_COD.get());
        this.simpleItem(BvfItems.MALE_SALMON.get());
        this.simpleItem(BvfItems.FEMALE_SALMON.get());
        this.simpleItem(BvfItems.PACIFIC_SALMON.get());
        this.simpleItem(BvfItems.YELLOW_FIN_PUFFER.get());
        this.simpleItem(BvfItems.OBSCURE_PUFFER.get());
        this.simpleItem(BvfItems.PORCUPINE_FISH.get());

        this.simpleItem(BvfItems.HADDOCK_COD_SPECIMEN.get());
        this.simpleItem(BvfItems.ATLANTIC_COD_SPECIMEN.get());
        this.simpleItem(BvfItems.PACIFIC_COD_SPECIMEN.get());
        this.simpleItem(BvfItems.PACIFIC_SALMON_SPECIMEN.get());
        this.simpleItem(BvfItems.MALE_SALMON_SPECIMEN.get());
        this.simpleItem(BvfItems.FEMALE_SALMON_SPECIMEN.get());
    }

    private void simpleItem(Item item) {
        String path = BuiltInRegistries.ITEM.getKey(item).getPath();
        this.withExistingParent(path, this.mcLoc("item/generated"))
                .texture("layer0", this.modLoc("item/" + path));
    }
}
