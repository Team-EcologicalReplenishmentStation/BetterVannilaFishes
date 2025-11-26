package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.cod.BvfCodEntity;
import net.minecraft.resources.ResourceLocation;

public class CodModel extends BvfModel<BvfCodEntity> {
    @Override
    public ResourceLocation getModelResource(BvfCodEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"geo/entity/cod.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(BvfCodEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"animations/entity/cod.animation.json");
    }
}
