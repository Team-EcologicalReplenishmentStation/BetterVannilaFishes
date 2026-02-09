package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.surgeonfish.BvfSurgeonfishEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class SurgeonfishModel extends BvfModel<BvfSurgeonfishEntity> {
    @Override
    public ResourceLocation getModelResource(BvfSurgeonfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "geo/entity/surgeonfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BvfSurgeonfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "textures/entity/" + BuiltInRegistries.ENTITY_TYPE.getKey(entity.getType()).getPath() + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(BvfSurgeonfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "animations/entity/surgeonfish.animation.json");
    }
}
