package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.megalops.MegalopsAtlanticusEntity;
import net.minecraft.resources.ResourceLocation;

public class MegalopsAtlanticusModel extends BvfModel<MegalopsAtlanticusEntity> {
    @Override
    public ResourceLocation getModelResource(MegalopsAtlanticusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "geo/entity/megalops_atlanticus.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(MegalopsAtlanticusEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "animations/entity/megalops_atlanticus.animation.json");
    }
}
