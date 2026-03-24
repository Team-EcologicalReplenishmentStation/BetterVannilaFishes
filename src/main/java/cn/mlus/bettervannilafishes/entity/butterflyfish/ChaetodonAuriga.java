package cn.mlus.bettervannilafishes.entity.butterflyfish;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ChaetodonAuriga extends BvfButterflyfishEntity {
    public ChaetodonAuriga(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public float getMinScale() {
        return 0.9f;
    }

    @Override
    public float getMaxScale() {
        return 1.1f;
    }

    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.CHAETODON_AURIGA_BUCKET.get());
    }
}
