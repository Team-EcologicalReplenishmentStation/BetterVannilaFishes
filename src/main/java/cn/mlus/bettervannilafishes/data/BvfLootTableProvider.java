package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.data.loot.BvfEntityLoot;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class BvfLootTableProvider extends LootTableProvider {
    public BvfLootTableProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> provider) {
        super(pOutput, Collections.emptySet(), List.of(
                new SubProviderEntry(BvfEntityLoot::new, LootContextParamSets.ENTITY)),provider);
    }

}
