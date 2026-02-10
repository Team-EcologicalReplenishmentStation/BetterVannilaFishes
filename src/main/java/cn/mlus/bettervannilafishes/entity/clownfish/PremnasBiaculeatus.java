package cn.mlus.bettervannilafishes.entity.clownfish;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class PremnasBiaculeatus extends BvfClownfishEntity {
    public PremnasBiaculeatus(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.PREMNAS_BIACULEATUS_BUCKET.get());
    }
}
