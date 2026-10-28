package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.dermochelyscoriacea.DermochelysCoriacea;
import net.minecraft.resources.ResourceLocation;

public class DermochelysCoriaceaModel extends BvfModel<DermochelysCoriacea> {
    @Override
    public ResourceLocation getModelResource(DermochelysCoriacea entity) {
        return BetterVannilaFishes.prefix("geo/entity/dermochelys_coriacea" + (entity.isBaby() ? "_baby" : "") + ".geo.json");
    }

    @Override
    public ResourceLocation getAnimationResource(DermochelysCoriacea entity) {
        return BetterVannilaFishes.prefix("animations/entity/dermochelys_coriacea" + (entity.isBaby() ? "_baby" : "") + ".animation.json");
    }

    @Override
    public ResourceLocation getTextureResource(DermochelysCoriacea entity) {
        if (entity.isBaby()) return BetterVannilaFishes.prefix("textures/entity/dermochelys_coriacea_baby.png");
        return BetterVannilaFishes.prefix("textures/entity/dermochelys_coriacea" + (entity.getVariant() == 1 ? "_gray" : "") + ".png");
    }
}
