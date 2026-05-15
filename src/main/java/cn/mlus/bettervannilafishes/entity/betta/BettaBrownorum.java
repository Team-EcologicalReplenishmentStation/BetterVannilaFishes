package cn.mlus.bettervannilafishes.entity.betta;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BettaBrownorum extends BvfBettaEntity {
    public BettaBrownorum(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.BETTA_BROWNORUM_BUCKET.get());
    }
}
