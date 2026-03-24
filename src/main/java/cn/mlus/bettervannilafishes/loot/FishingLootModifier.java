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
            BvfItems.HADDOCK_COD,
            BvfItems.HADDOCK_COD,
            BvfItems.HADDOCK_COD,
            BvfItems.ATLANTIC_COD,
            BvfItems.ATLANTIC_COD,
            BvfItems.ATLANTIC_COD,
            BvfItems.PACIFIC_COD,
            BvfItems.PACIFIC_COD,
            BvfItems.MALE_SALMON,
            BvfItems.MALE_SALMON,
            BvfItems.FEMALE_SALMON,
            BvfItems.FEMALE_SALMON,
            BvfItems.PACIFIC_SALMON,
            BvfItems.PACIFIC_SALMON,
            BvfItems.YELLOW_FIN_PUFFER,
            BvfItems.OBSCURE_PUFFER,
            BvfItems.PORCUPINE_FISH,
            BvfItems.SPEARFISH,
            BvfItems.SPEARFISH,
            BvfItems.GALEOCERDO_CUVIER,
            BvfItems.HUMBOLDT_SQUID,
            BvfItems.HUMBOLDT_SQUID,
            BvfItems.ACANTHURUS_ACHILLES,
            BvfItems.ACANTHURUS_LEUCOSTERNON,
            BvfItems.PARACANTHURUS_HEPATUS,
            BvfItems.ACANTHURUS_TRIOSTEGUS,
            BvfItems.ACANTHURUS_NIGRICANS,
            BvfItems.ACANTHURUS_LINEATUS,
            BvfItems.CHAETODON_STRIATUS,
            BvfItems.CHAETODON_UNIMACULATUS,
            BvfItems.CHAETODON_AURIGA,
            BvfItems.CHAETODON_COLLARE,
            BvfItems.CHAETODON_RETICULATUS,
            BvfItems.CHAETODON_SPECULUM,
            BvfItems.AUSTRALOHEROS_FACETUS,
            BvfItems.CICHLASOMA_BIMACULATUM,
            BvfItems.KROBIA_GUIANENSIS,
            BvfItems.AEQUIDENS_TETRAMERUS,
            BvfItems.GYMNOGEOPHAGUS_BALZANII,
            BvfItems.ASTRONOTUS_OCELLATUS,
            BvfItems.AMPHIPRION_OCELLARIS,
            BvfItems.PREMNAS_BIACULEATUS,
            BvfItems.AMPHIPRION_POLYMNUS,
            BvfItems.AMPHIPRION_PERIDERAION,
            BvfItems.AMPHIPRION_CLARKII,
            BvfItems.AMPHIPRION_PERCULA
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
