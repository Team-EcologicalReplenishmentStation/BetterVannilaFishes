package cn.mlus.bettervannilafishes.entity.epinephelus;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class EpinephelusMelanostigma extends BvfEpinephelusEntity {
    public EpinephelusMelanostigma(EntityType<? extends WaterAnimal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected Item getBucketItem() {
        return BvfItems.EPINEPHELUS_MELANOSTIGMA_BUCKET.get();
    }

    @Override
    public float getMinScale() {
        return 0.7F;
    }

    @Override
    public float getMaxScale() {
        return 1.1F;
    }
}

