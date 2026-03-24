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
import net.minecraft.world.level.storage.loot.functions.LootingEnchantFunction;
import net.minecraft.world.level.storage.loot.functions.SmeltItemFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
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
        this.add(BvfEntities.FEATHER_STAR.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.FEATHER_STAR_TENTACLE.get()))));
        this.add(BvfEntities.SPEARFISH.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.SPEARFISH.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.GALEOCERDO_CUVIER.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.GALEOCERDO_CUVIER.get())))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.SHARK_FIN.get()))
                        .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F))))
        );
        this.add(BvfEntities.ACANTHURUS_ACHILLES.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ACANTHURUS_ACHILLES.get()))));
        this.add(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ACANTHURUS_LEUCOSTERNON.get()))));
        this.add(BvfEntities.PARACANTHURUS_HEPATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PARACANTHURUS_HEPATUS.get()))));
        this.add(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ACANTHURUS_TRIOSTEGUS.get()))));
        this.add(BvfEntities.ACANTHURUS_NIGRICANS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ACANTHURUS_NIGRICANS.get()))));
        this.add(BvfEntities.ACANTHURUS_LINEATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ACANTHURUS_LINEATUS.get()))));
        this.add(BvfEntities.CHAETODON_STRIATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHAETODON_STRIATUS.get()))));
        this.add(BvfEntities.CHAETODON_UNIMACULATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHAETODON_UNIMACULATUS.get()))));
        this.add(BvfEntities.CHAETODON_AURIGA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHAETODON_AURIGA.get()))));
        this.add(BvfEntities.CHAETODON_COLLARE.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHAETODON_COLLARE.get()))));
        this.add(BvfEntities.CHAETODON_RETICULATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHAETODON_RETICULATUS.get()))));
        this.add(BvfEntities.CHAETODON_SPECULUM.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHAETODON_SPECULUM.get()))));
        // Cichlid (丽鱼) - 掉落各自的物品
        this.add(BvfEntities.AUSTRALOHEROS_FACETUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AUSTRALOHEROS_FACETUS.get()))));
        this.add(BvfEntities.CICHLASOMA_BIMACULATUM.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CICHLASOMA_BIMACULATUM.get()))));
        this.add(BvfEntities.KROBIA_GUIANENSIS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.KROBIA_GUIANENSIS.get()))));
        this.add(BvfEntities.AEQUIDENS_TETRAMERUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AEQUIDENS_TETRAMERUS.get()))));
        this.add(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.GYMNOGEOPHAGUS_BALZANII.get()))));
        this.add(BvfEntities.ASTRONOTUS_OCELLATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ASTRONOTUS_OCELLATUS.get()))));
        this.add(BvfEntities.AMPHIPRION_OCELLARIS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_OCELLARIS.get()))));
        this.add(BvfEntities.PREMNAS_BIACULEATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PREMNAS_BIACULEATUS.get()))));
        this.add(BvfEntities.AMPHIPRION_POLYMNUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_POLYMNUS.get()))));
        this.add(BvfEntities.AMPHIPRION_PERIDERAION.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_PERIDERAION.get()))));
        this.add(BvfEntities.AMPHIPRION_CLARKII.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_CLARKII.get()))));
        this.add(BvfEntities.AMPHIPRION_PERCULA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_PERCULA.get()))));
        this.add(BvfEntities.DOSIDICUS_GIGAS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.HUMBOLDT_SQUID.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE))))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(Items.INK_SAC))
                        .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F)))));
    }

    @Override
    protected @NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        return ForgeRegistries.ENTITY_TYPES.getValues().stream().filter(entities -> Objects.requireNonNull(ForgeRegistries.ENTITY_TYPES.getKey(entities)).getNamespace().equals(BetterVannilaFishes.MODID));
    }
}
