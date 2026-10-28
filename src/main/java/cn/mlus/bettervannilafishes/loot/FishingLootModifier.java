package cn.mlus.bettervannilafishes.loot;

import cn.mlus.bettervannilafishes.init.BvfItems;
import cn.mlus.bettervannilafishes.init.BvfLootModifiers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

public class FishingLootModifier extends LootModifier {

    public static final Codec<FishingLootModifier> CODEC = RecordCodecBuilder.create(instance ->
            codecStart(instance).apply(instance, FishingLootModifier::new));

    private static final Set<Item> VANILLA_FISH = Set.of(
            Items.COD, Items.SALMON, Items.TROPICAL_FISH, Items.PUFFERFISH
    );

    private static final List<RegistryObject<Item>> FISH_ITEMS = List.of(
            BvfItems.MELANOGRAMMUS_AEGLEFINUS,
            BvfItems.MELANOGRAMMUS_AEGLEFINUS,
            BvfItems.MELANOGRAMMUS_AEGLEFINUS,
            BvfItems.GADUS_MORHUA,
            BvfItems.GADUS_MORHUA,
            BvfItems.GADUS_MORHUA,
            BvfItems.GADUS_MACROCEPHALUS,
            BvfItems.GADUS_MACROCEPHALUS,
            BvfItems.MALE_SALMON,
            BvfItems.MALE_SALMON,
            BvfItems.FEMALE_SALMON,
            BvfItems.FEMALE_SALMON,
            BvfItems.PACIFIC_SALMON,
            BvfItems.PACIFIC_SALMON,
            BvfItems.TAKIFUGU_XANTHOPTERUS,
            BvfItems.TAKIFUGU_OBSCURUS,
            BvfItems.DIODON_HOLOCANTHUS,
            BvfItems.KAJIKIA_AUDAX,
            BvfItems.KAJIKIA_AUDAX,
            BvfItems.GALEOCERDO_CUVIER,
            BvfItems.EPINEPHELUS_LANCEOLATUS,
            BvfItems.EPINEPHELUS_ITAJARA,
            BvfItems.EPINEPHELUS_TUKULA,
            BvfItems.HUMBOLDT_SQUID,
            BvfItems.HUMBOLDT_SQUID,
            BvfItems.ACANTHURUS_ACHILLES,
            BvfItems.ACANTHURUS_LEUCOSTERNON,
            BvfItems.PARACANTHURUS_HEPATUS,
            BvfItems.ACANTHURUS_TRIOSTEGUS,
            BvfItems.ACANTHURUS_LEUCOPAREIUS,
            BvfItems.ACANTHURUS_LINEATUS,
            BvfItems.CHAETODON_STRIATUS,
            BvfItems.CHAETODON_UNIMACULATUS,
            BvfItems.CHAETODON_AURIGA,
            BvfItems.CHAETODON_XANTHURUS,
            BvfItems.CHAETODON_RETICULATUS,
            BvfItems.CHAETODON_SPECULUM,
            BvfItems.CICHLA_ORINOCENSIS,
            BvfItems.CICHLA_JARIINA,
            BvfItems.CICHLA_KELBERI,
            BvfItems.CICHLA_PIQUITI,
            BvfItems.CICHLA_PINIMA,
            BvfItems.CICHLA_OCELLARIS,
            BvfItems.CHANNA_MICROPELTES,
            BvfItems.CHANNA_ARGUS,
            BvfItems.ELOPICHTHYS_BAMBUSA,
            BvfItems.AMPHIPRION_OCELLARIS,
            BvfItems.AMPHIPRION_BIACULEATUS,
            BvfItems.AMPHIPRION_POLYMNUS,
            BvfItems.AMPHIPRION_THIELLEI,
            BvfItems.AMPHIPRION_PERCULA,
            BvfItems.AMPHIPRION_PERIDERAION
    );

    public FishingLootModifier(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        boolean hasFish = generatedLoot.stream().anyMatch(stack -> VANILLA_FISH.contains(stack.getItem()));
        if (hasFish) {
            generatedLoot.removeIf(stack -> VANILLA_FISH.contains(stack.getItem()));
            Item fish = FISH_ITEMS.get(context.getRandom().nextInt(FISH_ITEMS.size())).get();
            generatedLoot.add(new ItemStack(fish));
        }
        return generatedLoot;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return BvfLootModifiers.FISHING_LOOT.get();
    }
}

