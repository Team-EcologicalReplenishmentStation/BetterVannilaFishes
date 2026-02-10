package cn.mlus.bettervannilafishes.event;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BetterVannilaFishes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
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
            event.accept(BvfItems.PORCUPINE_FISH_SPAWN_EGG.get());
            event.accept(BvfItems.NAUTILUS_SPAWN_EGG.get());
            event.accept(BvfItems.FEATHER_STAR_SPAWN_EGG.get());
            event.accept(BvfItems.SPEARFISH_SPAWN_EGG.get());
            event.accept(BvfItems.GALEOCERDO_CUVIER_SPAWN_EGG.get());
            // Surgeonfish (刺尾鱼)
            event.accept(BvfItems.ACANTHURUS_ACHILLES_SPAWN_EGG.get());
            event.accept(BvfItems.ACANTHURUS_LEUCOSTERNON_SPAWN_EGG.get());
            event.accept(BvfItems.PARACANTHURUS_HEPATUS_SPAWN_EGG.get());
            event.accept(BvfItems.ACANTHURUS_TRIOSTEGUS_SPAWN_EGG.get());
            event.accept(BvfItems.ACANTHURUS_NIGRICANS_SPAWN_EGG.get());
            event.accept(BvfItems.ACANTHURUS_LINEATUS_SPAWN_EGG.get());
            // Cichlid (丽鱼)
            event.accept(BvfItems.AUSTRALOHEROS_FACETUS_SPAWN_EGG.get());
            event.accept(BvfItems.CICHLASOMA_BIMACULATUM_SPAWN_EGG.get());
            event.accept(BvfItems.KROBIA_GUIANENSIS_SPAWN_EGG.get());
            event.accept(BvfItems.AEQUIDENS_TETRAMERUS_SPAWN_EGG.get());
            event.accept(BvfItems.GYMNOGEOPHAGUS_BALZANII_SPAWN_EGG.get());
            event.accept(BvfItems.ASTRONOTUS_OCELLATUS_SPAWN_EGG.get());
            // Clownfish (小丑鱼/双锯鱼)
            event.accept(BvfItems.AMPHIPRION_OCELLARIS_SPAWN_EGG.get());
            event.accept(BvfItems.PREMNAS_BIACULEATUS_SPAWN_EGG.get());
            event.accept(BvfItems.AMPHIPRION_POLYMNUS_SPAWN_EGG.get());
            event.accept(BvfItems.AMPHIPRION_PERIDERAION_SPAWN_EGG.get());
            event.accept(BvfItems.AMPHIPRION_CLARKII_SPAWN_EGG.get());
            event.accept(BvfItems.AMPHIPRION_PERCULA_SPAWN_EGG.get());
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
            event.accept(BvfItems.PORCUPINE_FISH.get());
            event.accept(BvfItems.SPEARFISH.get());
            event.accept(BvfItems.COOKED_SPEARFISH.get());
            event.accept(BvfItems.GALEOCERDO_CUVIER.get());
            event.accept(BvfItems.SHARK_FIN.get());
            // Surgeonfish (刺尾鱼)
            event.accept(BvfItems.ACANTHURUS_ACHILLES.get());
            event.accept(BvfItems.ACANTHURUS_LEUCOSTERNON.get());
            event.accept(BvfItems.PARACANTHURUS_HEPATUS.get());
            event.accept(BvfItems.ACANTHURUS_TRIOSTEGUS.get());
            event.accept(BvfItems.ACANTHURUS_NIGRICANS.get());
            event.accept(BvfItems.ACANTHURUS_LINEATUS.get());
            // Cichlid (丽鱼)
            event.accept(BvfItems.AUSTRALOHEROS_FACETUS.get());
            event.accept(BvfItems.CICHLASOMA_BIMACULATUM.get());
            event.accept(BvfItems.KROBIA_GUIANENSIS.get());
            event.accept(BvfItems.AEQUIDENS_TETRAMERUS.get());
            event.accept(BvfItems.GYMNOGEOPHAGUS_BALZANII.get());
            event.accept(BvfItems.ASTRONOTUS_OCELLATUS.get());
            // Clownfish (小丑鱼/双锯鱼)
            event.accept(BvfItems.AMPHIPRION_OCELLARIS.get());
            event.accept(BvfItems.PREMNAS_BIACULEATUS.get());
            event.accept(BvfItems.AMPHIPRION_POLYMNUS.get());
            event.accept(BvfItems.AMPHIPRION_PERIDERAION.get());
            event.accept(BvfItems.AMPHIPRION_CLARKII.get());
            event.accept(BvfItems.AMPHIPRION_PERCULA.get());
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(BvfItems.FEATHER_STAR_TENTACLE.get());
        }

        if(event.getTabKey() == CreativeModeTabs.COMBAT){
            event.accept(BvfItems.ENCHANTED_PUFFERFISH.get());
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES){
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.HADDOCK_COD_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.ATLANTIC_COD_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.PACIFIC_COD_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.MALE_SALMON_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.FEMALE_SALMON_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.PACIFIC_SALMON_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.YELLOW_FIN_PUFFER_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.OBSCURE_PUFFER_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.PORCUPINE_FISH_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.NAUTILUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.FEATHER_STAR_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.SPEARFISH_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.GALEOCERDO_CUVIER_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            // Surgeonfish (刺尾鱼)
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.ACANTHURUS_ACHILLES_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.ACANTHURUS_LEUCOSTERNON_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.PARACANTHURUS_HEPATUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.ACANTHURUS_TRIOSTEGUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.ACANTHURUS_NIGRICANS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.ACANTHURUS_LINEATUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            // Cichlid (丽鱼)
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.AUSTRALOHEROS_FACETUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.CICHLASOMA_BIMACULATUM_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.KROBIA_GUIANENSIS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.AEQUIDENS_TETRAMERUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.GYMNOGEOPHAGUS_BALZANII_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.ASTRONOTUS_OCELLATUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            // Clownfish (小丑鱼/双锯鱼)
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.AMPHIPRION_OCELLARIS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.PREMNAS_BIACULEATUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.AMPHIPRION_POLYMNUS_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.AMPHIPRION_PERIDERAION_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.AMPHIPRION_CLARKII_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(Items.AXOLOTL_BUCKET.getDefaultInstance(), BvfItems.AMPHIPRION_PERCULA_BUCKET.get().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(BvfItems.HADDOCK_COD_SPECIMEN.get());
            event.accept(BvfItems.ATLANTIC_COD_SPECIMEN.get());
            event.accept(BvfItems.PACIFIC_COD_SPECIMEN.get());
            event.accept(BvfItems.PACIFIC_SALMON_SPECIMEN.get());
            event.accept(BvfItems.MALE_SALMON_SPECIMEN.get());
            event.accept(BvfItems.FEMALE_SALMON_SPECIMEN.get());
            event.accept(BvfItems.SPEARFISH_SPECIMEN.get());
            event.accept(BvfItems.GALEOCERDO_CUVIER_SPECIMEN.get());
        }
    }
}
