package cn.mlus.bettervannilafishes.entity.clownfish;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class AmphiprionMelanopus extends BvfClownfishEntity {
    public AmphiprionMelanopus(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.AMPHIPRION_MELANOPUS_BUCKET.get());
    }
}
