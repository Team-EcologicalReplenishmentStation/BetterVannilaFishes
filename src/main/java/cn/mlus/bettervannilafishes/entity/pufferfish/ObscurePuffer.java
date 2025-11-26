package cn.mlus.bettervannilafishes.entity.pufferfish;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ObscurePuffer extends BvfPufferfishEntity {
    public ObscurePuffer(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(
                BvfItems.OBSCURE_PUFFER_BUCKET);
    }
}
