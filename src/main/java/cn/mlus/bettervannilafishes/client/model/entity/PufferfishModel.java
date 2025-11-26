package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.pufferfish.BvfPufferfishEntity;
import net.minecraft.resources.ResourceLocation;

public class PufferfishModel extends BvfModel<BvfPufferfishEntity> {
    @Override
    public ResourceLocation getModelResource(BvfPufferfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"geo/entity/pufferfish.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(BvfPufferfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"animations/entity/pufferfish.animation.json");
    }
}
