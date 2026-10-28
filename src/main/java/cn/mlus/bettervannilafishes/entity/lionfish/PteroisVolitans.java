package cn.mlus.bettervannilafishes.entity.lionfish;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class PteroisVolitans extends Lionfish {
    public PteroisVolitans(EntityType<? extends AbstractFish> type, Level level) {
        super(type, level);
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.PTEROIS_VOLITANS_BUCKET.get());
    }
}
