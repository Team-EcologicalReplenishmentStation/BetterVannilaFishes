package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.lionfish.Lionfish;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class LionfishModel extends BvfModel<Lionfish> {
    @Override
    public ResourceLocation getModelResource(Lionfish entity) {
        return BetterVannilaFishes.prefix("geo/entity/lionfish.geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(Lionfish entity) {
        return BetterVannilaFishes.prefix("animations/entity/lionfish.animation.json");
    }

    @Override
    public ResourceLocation getTextureResource(Lionfish entity) {
        String entityName = BuiltInRegistries.ENTITY_TYPE.getKey(entity.getType()).getPath();
        return BetterVannilaFishes.prefix("textures/entity/" + entityName + ".png");
    }
}
