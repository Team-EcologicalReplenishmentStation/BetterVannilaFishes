package cn.mlus.bettervannilafishes.event;

import cn.mlus.bettervannilafishes.block.FishSpecimen;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber
public class SpecimenCraftHandler {
    @SubscribeEvent
    public static void onCrafting(PlayerEvent.ItemCraftedEvent event) {
        CraftingContainer inv = (CraftingContainer) event.getInventory();
        ItemStack result = event.getCrafting();

        if (result.getItem() instanceof BlockItem item && item.getBlock() instanceof FishSpecimen) {
            for (int i = 0; i < inv.getContainerSize(); i++) {
                ItemStack stack = inv.getItem(i);
                if(!stack.is(ItemTags.FISHES))
                    continue;
                CustomData customData = stack.get(DataComponents.CUSTOM_DATA);
                if (customData != null && customData.contains("Scale")) {
                    CustomData.update(DataComponents.CUSTOM_DATA, result, (data) -> data.put("Scale", customData.copyTag().get("Scale")));
                    break;
                }
            }
        }
    }
}
