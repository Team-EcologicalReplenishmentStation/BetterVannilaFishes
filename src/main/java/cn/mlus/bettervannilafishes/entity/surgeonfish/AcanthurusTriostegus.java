package cn.mlus.bettervannilafishes.entity.surgeonfish;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class AcanthurusTriostegus extends BvfSurgeonfishEntity {
    public AcanthurusTriostegus(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public float getMinScale() {
        return 1.0f;
    }

    @Override
    public float getMaxScale() {
        return 1.2f;
    }

    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.ACANTHURUS_TRIOSTEGUS_BUCKET.get());
    }
}
