package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.clownfish.BvfClownfishEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class ClownfishModel extends BvfModel<BvfClownfishEntity> {
    @Override
    public ResourceLocation getModelResource(BvfClownfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "geo/entity/clownfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BvfClownfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "textures/entity/" + BuiltInRegistries.ENTITY_TYPE.getKey(entity.getType()).getPath() + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(BvfClownfishEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "animations/entity/clownfish.animation.json");
    }
}
