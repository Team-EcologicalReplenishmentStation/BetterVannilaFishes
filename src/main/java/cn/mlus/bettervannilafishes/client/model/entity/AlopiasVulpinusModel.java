package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.alopias.AlopiasVulpinusEntity;
import net.minecraft.resources.ResourceLocation;

public class AlopiasVulpinusModel extends BvfModel<AlopiasVulpinusEntity> {
    @Override public ResourceLocation getTextureResource(AlopiasVulpinusEntity entity) {
        return BetterVannilaFishes.prefix("textures/entity/alopias_vulpinus" + (entity.getVariant().getId() == 1 ? "_dark" : "") + ".png");
    }
}
