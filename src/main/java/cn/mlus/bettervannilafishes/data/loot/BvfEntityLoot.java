package cn.mlus.bettervannilafishes.data.loot;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.data.loot.packs.VanillaEntityLoot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.stream.Stream;

public class BvfEntityLoot extends VanillaEntityLoot {
    @Override
    public void generate() {
        this.add(BvfEntities.BVC_HADDOCK_COD.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.HADDOCK_COD.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.BVC_ATLANTIC_COD.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ATLANTIC_COD.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.BVC_PACIFIC_COD.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PACIFIC_COD.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.BVC_SALMON_MALE.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.MALE_SALMON.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.BVC_SALMON_FEMALE.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.FEMALE_SALMON.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.BVC_SALMON_PACIFIC.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PACIFIC_SALMON.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.YELLOW_FIN_PUFFER.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.YELLOW_FIN_PUFFER.get()))));
        this.add(BvfEntities.OBSCURE_PUFFER.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.OBSCURE_PUFFER.get()))));
        this.add(BvfEntities.PORCUPINE_FISH.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PORCUPINE_FISH.get()))));
        this.add(BvfEntities.NAUTILUS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(Items.NAUTILUS_SHELL))));
    }

    @Override
    protected @NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        return ForgeRegistries.ENTITY_TYPES.getValues().stream().filter(entities -> Objects.requireNonNull(ForgeRegistries.ENTITY_TYPES.getKey(entities)).getNamespace().equals(BetterVannilaFishes.MODID));
    }
}
