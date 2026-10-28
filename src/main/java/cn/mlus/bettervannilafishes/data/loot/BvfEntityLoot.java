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
        this.add(BvfEntities.BVC_MELANOGRAMMUS_AEGLEFINUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.MELANOGRAMMUS_AEGLEFINUS.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.BVC_GADUS_MORHUA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.GADUS_MORHUA.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.BVC_GADUS_MACROCEPHALUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.GADUS_MACROCEPHALUS.get()))
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
        this.add(BvfEntities.TAKIFUGU_XANTHOPTERUS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.TAKIFUGU_XANTHOPTERUS.get()))));
        this.add(BvfEntities.TAKIFUGU_OBSCURUS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.TAKIFUGU_OBSCURUS.get()))));
        this.add(BvfEntities.PTEROIS_VOLITANS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PTEROIS_VOLITANS.get()))));
        this.add(BvfEntities.PTEROIS_LUNULATA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PTEROIS_LUNULATA.get()))));
        this.add(BvfEntities.PTEROIS_RADIATA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.PTEROIS_RADIATA.get()))));
        this.add(BvfEntities.DERMOCHELYS_CORIACEA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.DERMOCHELYS_CORIACEA.get()))));
        this.add(BvfEntities.DIODON_HOLOCANTHUS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.DIODON_HOLOCANTHUS.get()))));
        this.add(BvfEntities.NAUTILUS_POMPILIUS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(Items.NAUTILUS_SHELL))));
        this.add(BvfEntities.COMATULIDA.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.COMATULIDA_TENTACLE.get()))));
        this.add(BvfEntities.ZHIKONG_SCALLOP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.SCALLOP_MEAT.get()))));
        this.add(BvfEntities.BAY_SCALLOP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.SCALLOP_MEAT.get()))));
        this.add(BvfEntities.YESSO_SCALLOP.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.SCALLOP_MEAT.get()))));
        this.add(BvfEntities.KAJIKIA_AUDAX.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.KAJIKIA_AUDAX.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.NEMATISTIUS_PECTORALIS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.NEMATISTIUS_PECTORALIS.get()))
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
        this.add(BvfEntities.ALOPIAS_VULPINUS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ALOPIAS_VULPINUS.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.SHARK_FIN.get()))
                        .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F)))));
        this.add(BvfEntities.NEGAPRION_ACUTIDENS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.NEGAPRION_ACUTIDENS.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE))))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.SHARK_FIN.get()))
                        .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F))))
        );
        this.add(BvfEntities.NEGAPRION_BREVIROSTRIS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.NEGAPRION_BREVIROSTRIS.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE))))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.SHARK_FIN.get()))
                        .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F))))
        );
        this.add(BvfEntities.EPINEPHELUS_LANCEOLATUS.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.EPINEPHELUS_LANCEOLATUS.get())))
        );
        this.add(BvfEntities.EPINEPHELUS_ITAJARA.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.EPINEPHELUS_ITAJARA.get())))
        );
        this.add(BvfEntities.EPINEPHELUS_TUKULA.get(),LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.EPINEPHELUS_TUKULA.get())))
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
        this.add(BvfEntities.ACANTHURUS_LEUCOPAREIUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ACANTHURUS_LEUCOPAREIUS.get()))));
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
        this.add(BvfEntities.CHAETODON_XANTHURUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHAETODON_XANTHURUS.get()))));
        this.add(BvfEntities.CHAETODON_RETICULATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHAETODON_RETICULATUS.get()))));
        this.add(BvfEntities.CHAETODON_SPECULUM.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHAETODON_SPECULUM.get()))));
        this.add(BvfEntities.CICHLA_ORINOCENSIS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CICHLA_ORINOCENSIS.get()))));
        this.add(BvfEntities.CICHLA_JARIINA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CICHLA_JARIINA.get()))));
        this.add(BvfEntities.CICHLA_KELBERI.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CICHLA_KELBERI.get()))));
        this.add(BvfEntities.CICHLA_PIQUITI.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CICHLA_PIQUITI.get()))));
        this.add(BvfEntities.CICHLA_PINIMA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CICHLA_PINIMA.get()))));
        this.add(BvfEntities.CICHLA_OCELLARIS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CICHLA_OCELLARIS.get()))));
        this.add(BvfEntities.CHANNA_MICROPELTES.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHANNA_MICROPELTES.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.CHANNA_ARGUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CHANNA_ARGUS.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.ELOPICHTHYS_BAMBUSA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.ELOPICHTHYS_BAMBUSA.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.AMPHIPRION_OCELLARIS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_OCELLARIS.get()))));
        this.add(BvfEntities.AMPHIPRION_BIACULEATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_BIACULEATUS.get()))));
        this.add(BvfEntities.AMPHIPRION_POLYMNUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_POLYMNUS.get()))));
        this.add(BvfEntities.AMPHIPRION_THIELLEI.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_THIELLEI.get()))));
        this.add(BvfEntities.AMPHIPRION_PERCULA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_PERCULA.get()))));
        this.add(BvfEntities.AMPHIPRION_PERIDERAION.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_PERIDERAION.get()))));
        this.add(BvfEntities.AMPHIPRION_CLARKII.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_CLARKII.get()))));
        this.add(BvfEntities.AMPHIPRION_BICINCTUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_BICINCTUS.get()))));
        this.add(BvfEntities.AMPHIPRION_EPHIPPIUM.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_EPHIPPIUM.get()))));
        this.add(BvfEntities.AMPHIPRION_CHRYSOPTERUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_CHRYSOPTERUS.get()))));
        this.add(BvfEntities.AMPHIPRION_FRENATUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_FRENATUS.get()))));
        this.add(BvfEntities.AMPHIPRION_MCCULLOCHI.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_MCCULLOCHI.get()))));
        this.add(BvfEntities.AMPHIPRION_MELANOPUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_MELANOPUS.get()))));
        this.add(BvfEntities.AMPHIPRION_TRICINCTUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.AMPHIPRION_TRICINCTUS.get()))));
        this.add(BvfEntities.BETTA_SPLENDENS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.BETTA_SPLENDENS.get()))));
        this.add(BvfEntities.BETTA_SIAMORIENTALIS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.BETTA_SIAMORIENTALIS.get()))));
        this.add(BvfEntities.BETTA_SMARAGDINA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.BETTA_SMARAGDINA.get()))));
        this.add(BvfEntities.BETTA_PICTA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.BETTA_PICTA.get()))));
        this.add(BvfEntities.BETTA_SIMPLEX.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.BETTA_SIMPLEX.get()))));
        this.add(BvfEntities.BETTA_FUSCA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.BETTA_FUSCA.get()))));
        this.add(BvfEntities.MEGALOPS_ATLANTICUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.MEGALOPS_ATLANTICUS.get()))));
        this.add(BvfEntities.KATSUWONUS_PELAMIS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.KATSUWONUS_PELAMIS.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.DOSIDICUS_GIGAS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.HUMBOLDT_SQUID.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE))))
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(Items.INK_SAC))
                        .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 1.0F)))));
        this.add(BvfEntities.HUSO_DAURICUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.HUSO_DAURICUS.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE))))
                .apply(LootingEnchantFunction.lootingMultiplier(UniformGenerator.between(0.0F, 2.0F))));
        this.add(BvfEntities.MYLOPHARYNGODON_PICEUS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.MYLOPHARYNGODON_PICEUS.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.CTENOPHARYNGODON_IDELLA.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.CTENOPHARYNGODON_IDELLA.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.HYPOPHTHALMICHTHYS_MOLITRIX.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.HYPOPHTHALMICHTHYS_MOLITRIX.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
        this.add(BvfEntities.HYPOPHTHALMICHTHYS_NOBILIS.get(), LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(BvfItems.HYPOPHTHALMICHTHYS_NOBILIS.get()))
                        .apply(SmeltItemFunction.smelted().when(LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, ENTITY_ON_FIRE)))));
    }

    @Override
    protected @NotNull Stream<EntityType<?>> getKnownEntityTypes() {
        return ForgeRegistries.ENTITY_TYPES.getValues().stream().filter(entities -> Objects.requireNonNull(ForgeRegistries.ENTITY_TYPES.getKey(entities)).getNamespace().equals(BetterVannilaFishes.MODID));
    }
}
