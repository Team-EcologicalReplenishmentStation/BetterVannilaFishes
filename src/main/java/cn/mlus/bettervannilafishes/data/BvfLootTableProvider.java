package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.data.loot.BvfEntityLoot;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class BvfLootTableProvider extends LootTableProvider {
    public BvfLootTableProvider(PackOutput pOutput) {
        super(pOutput, Set.of(), List.of(
                new SubProviderEntry(BvfEntityLoot::new, LootContextParamSets.ENTITY)));
    }

}
