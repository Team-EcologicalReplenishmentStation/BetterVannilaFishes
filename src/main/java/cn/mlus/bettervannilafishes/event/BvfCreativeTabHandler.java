package cn.mlus.bettervannilafishes.event;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@EventBusSubscriber
public class BvfCreativeTabHandler {
    @SubscribeEvent
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(BvfItems.HADDOCK_COD_SPAWN_EGG.get());
            event.accept(BvfItems.ATLANTIC_COD_SPAWN_EGG.get());
            event.accept(BvfItems.PACIFIC_COD_SPAWN_EGG.get());
            event.accept(BvfItems.MALE_SALMON_SPAWN_EGG.get());
            event.accept(BvfItems.FEMALE_SALMON_SPAWN_EGG.get());
            event.accept(BvfItems.PACIFIC_SALMON_SPAWN_EGG.get());
            event.accept(BvfItems.YELLOW_FIN_PUFFER_SPAWN_EGG.get());
            event.accept(BvfItems.OBSCURE_PUFFER_SPAWN_EGG.get());
            event.accept(BvfItems.NAUTILUS_SPAWN_EGG.get());
        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS){
            event.accept(BvfItems.HADDOCK_COD.get());
            event.accept(BvfItems.ATLANTIC_COD.get());
            event.accept(BvfItems.PACIFIC_COD.get());
            event.accept(BvfItems.MALE_SALMON.get());
            event.accept(BvfItems.FEMALE_SALMON.get());
            event.accept(BvfItems.PACIFIC_SALMON.get());
            event.accept(BvfItems.YELLOW_FIN_PUFFER.get());
            event.accept(BvfItems.OBSCURE_PUFFER.get());
        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept(BvfItems.ENCHANTED_PUFFERFISH.get());
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.insertAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.HADDOCK_COD_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.ATLANTIC_COD_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.PACIFIC_COD_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.MALE_SALMON_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.FEMALE_SALMON_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.PACIFIC_SALMON_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.YELLOW_FIN_PUFFER_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.OBSCURE_PUFFER_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.NAUTILUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(BvfItems.HADDOCK_COD_SPECIMEN.get());
            event.accept(BvfItems.ATLANTIC_COD_SPECIMEN.get());
            event.accept(BvfItems.PACIFIC_COD_SPECIMEN.get());
            event.accept(BvfItems.PACIFIC_SALMON_SPECIMEN.get());
            event.accept(BvfItems.MALE_SALMON_SPECIMEN.get());
            event.accept(BvfItems.FEMALE_SALMON_SPECIMEN.get());
        }
    }
}
