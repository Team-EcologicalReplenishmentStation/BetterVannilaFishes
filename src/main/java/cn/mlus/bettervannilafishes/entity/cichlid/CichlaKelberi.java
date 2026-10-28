package cn.mlus.bettervannilafishes.entity.cichlid;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class CichlaKelberi extends BvfCichlidEntity {
    public CichlaKelberi(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public float getMinScale() {
        return 0.8f;
    }

    @Override
    public float getMaxScale() {
        return 1.0f;
    }

    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.CICHLA_KELBERI_BUCKET.get());
    }
}
