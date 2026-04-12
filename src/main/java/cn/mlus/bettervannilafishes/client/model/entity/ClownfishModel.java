package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.clownfish.BvfClownfishEntity;
import net.minecraft.resources.ResourceLocation;

public class ClownfishModel extends BvfModel<BvfClownfishEntity> {
    @Override
    public ResourceLocation getModelResource(BvfClownfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "geo/entity/clownfish.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(BvfClownfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "animations/entity/clownfish.animation.json");
    }
}
