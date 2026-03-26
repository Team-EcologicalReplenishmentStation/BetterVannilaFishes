package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.epinephelus.BvfEpinephelusEntity;
import net.minecraft.resources.ResourceLocation;

public class EpinephelusModel extends BvfModel<BvfEpinephelusEntity> {
    @Override
    public ResourceLocation getModelResource(BvfEpinephelusEntity entity) {
        return BetterVannilaFishes.prefix("geo/entity/epinephelus.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(BvfEpinephelusEntity entity) {
        return BetterVannilaFishes.prefix("animations/entity/epinephelus.animation.json");
    }
}

