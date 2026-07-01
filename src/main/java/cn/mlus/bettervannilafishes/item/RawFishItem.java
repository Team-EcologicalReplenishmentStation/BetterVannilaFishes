package cn.mlus.bettervannilafishes.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Locale;

public class RawFishItem extends Item {
    public RawFishItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        if (pStack.hasTag() && pStack.getTag().contains("Scale")) {
            float scale = pStack.getTag().getFloat("Scale");
            pTooltipComponents.add(Component.literal("Scale:" + String.format(Locale.ROOT, "%.2f", scale)));
        }
    }
}
