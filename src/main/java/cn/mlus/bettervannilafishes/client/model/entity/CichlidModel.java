package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.cichlid.BvfCichlidEntity;
import net.minecraft.resources.ResourceLocation;

public class CichlidModel extends BvfModel<BvfCichlidEntity> {
    @Override
    public ResourceLocation getModelResource(BvfCichlidEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "geo/entity/cichlid.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(BvfCichlidEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "animations/entity/cichlid.animation.json");
    }
}
