package cn.mlus.bettervannilafishes.entity.surgeonfish;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class AcanthurusLeucosternon extends BvfSurgeonfishEntity {
    public AcanthurusLeucosternon(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.ACANTHURUS_LEUCOSTERNON_BUCKET.get());
    }
}
