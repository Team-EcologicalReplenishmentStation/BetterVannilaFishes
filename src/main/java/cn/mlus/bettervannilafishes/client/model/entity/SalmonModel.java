package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.salmon.BvfSalmonEntity;
import net.minecraft.resources.ResourceLocation;

public class SalmonModel extends BvfModel<BvfSalmonEntity> {
    @Override
    public ResourceLocation getAnimationResource(BvfSalmonEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"animations/entity/salmon.animation.json");
    }
}
