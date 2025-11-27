package cn.mlus.bettervannilafishes.data.loot;

import cn.mlus.bettervannilafishes.init.BvfEntities;
import cn.mlus.bettervannilafishes.init.BvfItems;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.packs.VanillaEntityLoot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.stream.Stream;

public class BvfEntityLoot extends VanillaEntityLoot {
    public BvfEntityLoot(HolderLookup.Provider p_346214_) {
        super(p_346214_);
    }

    private final Set<EntityType<?>> knownEntityTypes = new ReferenceOpenHashSet<>();

    @Override
    public void generate() {
        this.add(BvfEntities.BVC_HADDOCK_COD.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.HADDOCK_COD.value()))
                        .apply(SmeltItemFunction.smelted().when(shouldSmeltLoot()))));
        this.add(BvfEntities.BVC_ATLANTIC_COD.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ATLANTIC_COD.value()))
                        .apply(SmeltItemFunction.smelted().when(shouldSmeltLoot()))));
        this.add(BvfEntities.BVC_PACIFIC_COD.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PACIFIC_COD.value()))
                        .apply(SmeltItemFunction.smelted().when(shouldSmeltLoot()))));
        this.add(BvfEntities.BVC_SALMON_MALE.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.MALE_SALMON.value()))
                        .apply(SmeltItemFunction.smelted().when(shouldSmeltLoot()))));
        this.add(BvfEntities.BVC_SALMON_FEMALE.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.FEMALE_SALMON.value()))
                        .apply(SmeltItemFunction.smelted().when(shouldSmeltLoot()))));
        this.add(BvfEntities.BVC_SALMON_PACIFIC.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PACIFIC_SALMON.value()))
                        .apply(SmeltItemFunction.smelted().when(shouldSmeltLoot()))));
        this.add(BvfEntities.YELLOW_FIN_PUFFER.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.YELLOW_FIN_PUFFER.value()))));
        this.add(BvfEntities.OBSCURE_PUFFER.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.OBSCURE_PUFFER.value()))));
        this.add(BvfEntities.PORCUPINE_FISH.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PORCUPINE_FISH.value()))));
        this.add(BvfEntities.NAUTILUS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(Items.NAUTILUS_SHELL))));
    }

    protected void add(@NotNull Holder<EntityType<?>> typeProvider, @NotNull LootTable.Builder table) {
        add(typeProvider.value(), table);
    }

    @Override
    protected void add(@NotNull EntityType<?> type, @NotNull LootTable.Builder table) {
        //Overwrite the core register method to add to our list of known entity types
        //Note: This isn't the actual core method as that one takes a ResourceLocation, but all our things wil pass through this one
        super.add(type, table);
        knownEntityTypes.add(type);
    }

    @NotNull
    @Override
    protected Stream<EntityType<?>> getKnownEntityTypes() {
        return knownEntityTypes.stream();
    }
}
