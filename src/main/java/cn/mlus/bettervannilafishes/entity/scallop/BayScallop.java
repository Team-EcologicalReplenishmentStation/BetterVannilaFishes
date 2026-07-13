package cn.mlus.bettervannilafishes.entity.scallop;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BayScallop extends ScallopEntity {
    public BayScallop(EntityType<? extends WaterAnimal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.BAY_SCALLOP_BUCKET.get());
    }
}
