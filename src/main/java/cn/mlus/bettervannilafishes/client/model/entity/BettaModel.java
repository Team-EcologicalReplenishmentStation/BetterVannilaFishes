package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.betta.BvfBettaEntity;
import net.minecraft.resources.ResourceLocation;

public class BettaModel extends BvfModel<BvfBettaEntity> {
    @Override
    public ResourceLocation getModelResource(BvfBettaEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "geo/entity/betta.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(BvfBettaEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "animations/entity/betta.animation.json");
    }
}
