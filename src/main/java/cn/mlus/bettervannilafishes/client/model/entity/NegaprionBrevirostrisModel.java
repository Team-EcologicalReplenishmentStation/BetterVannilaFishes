package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionBrevirostrisEntity;
import net.minecraft.resources.ResourceLocation;

public class NegaprionBrevirostrisModel extends BvfModel<NegaprionBrevirostrisEntity> {
    @Override
    public ResourceLocation getTextureResource(NegaprionBrevirostrisEntity entity) {
        String path = "textures/entity/negaprion_brevirostris";
        path = switch (entity.getVariant().getId()) {
            case 0 -> path + ".png";
            case 1 -> path + "_dark.png";
            default -> "textures/entity/negaprion_brevirostris";
        };

        return BetterVannilaFishes.prefix(path);
    }
}
