package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.scallop.ScallopEntity;
import net.minecraft.resources.ResourceLocation;

public class ScallopModel extends BvfModel<ScallopEntity> {
    @Override
    public ResourceLocation getModelResource(ScallopEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "geo/entity/scallop.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(ScallopEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "animations/entity/scallop.animation.json");
    }
}
