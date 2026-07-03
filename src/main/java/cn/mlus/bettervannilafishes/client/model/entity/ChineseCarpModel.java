package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.chinesecarp.ChineseCarpEntity;
import net.minecraft.resources.ResourceLocation;

public class ChineseCarpModel extends BvfModel<ChineseCarpEntity> {
    @Override
    public ResourceLocation getAnimationResource(ChineseCarpEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "animations/entity/chinese_carp.animation.json");
    }
}
