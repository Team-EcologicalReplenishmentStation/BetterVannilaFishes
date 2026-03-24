package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.butterflyfish.BvfButterflyfishEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class ButterflyfishModel extends BvfModel<BvfButterflyfishEntity> {
    @Override
    public ResourceLocation getModelResource(BvfButterflyfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "geo/entity/butterflyfish.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(BvfButterflyfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "animations/entity/butterflyfish.animation.json");
    }

    @Override
    public ResourceLocation getTextureResource(BvfButterflyfishEntity entity) {
        String entityId = BuiltInRegistries.ENTITY_TYPE.getKey(entity.getType()).getPath();
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "textures/entity/" + entityId + ".png");
    }
}
