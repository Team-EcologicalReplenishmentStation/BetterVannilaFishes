package cn.mlus.bettervannilafishes.item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.Item.TooltipContext;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Locale;

public class RawFishItem extends Item {
    public RawFishItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @NotNull TooltipContext pContext, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pContext, pTooltipComponents, pIsAdvanced);
        CustomData data = pStack.get(DataComponents.CUSTOM_DATA);
        if (data != null && data.contains("Scale")) {
            float scale = data.copyTag().getFloat("Scale");
            pTooltipComponents.add(Component.literal("Scale:" + String.format(Locale.ROOT, "%.2f", scale)));
        }
    }
}
