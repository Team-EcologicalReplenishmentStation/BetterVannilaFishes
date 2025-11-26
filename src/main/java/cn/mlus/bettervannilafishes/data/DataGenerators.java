package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.data.language.BvfChineseLanguangeProvider;
import cn.mlus.bettervannilafishes.data.language.BvfEnglishLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = BetterVannilaFishes.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new BvfItemModelProvider(output,helper));
        generator.addProvider(event.includeClient(), new BvfEnglishLanguageProvider(output));
        generator.addProvider(event.includeClient(), new BvfChineseLanguangeProvider(output));
        generator.addProvider(event.includeServer(), new BvfRecipeProvider(output));
        generator.addProvider(event.includeServer(), new ModDatapackEntries(output, lookupProvider));
        generator.addProvider(event.includeServer(), new BvfLootTableProvider(output));

        BvfBlockTagProvider blockTagsProvider = new BvfBlockTagProvider(output, lookupProvider, helper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new BvfItemTagProvider(output, lookupProvider, blockTagsProvider.contentsGetter(), helper));
    }
}