package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionAcutidensEntity;
import net.minecraft.resources.ResourceLocation;

public class NegaprionAcutidensModel extends BvfModel<NegaprionAcutidensEntity> {
    @Override
    public ResourceLocation getTextureResource(NegaprionAcutidensEntity entity) {
        String path = "textures/entity/negaprion_acutidens";
        path = switch (entity.getVariant().getId()) {
            case 0 -> path + ".png";
            case 1 -> path + "_oreo.png";
            case 2 -> path + "_light.png";
            default -> "textures/entity/negaprion_acutidens";
        };

        return BetterVannilaFishes.prefix(path);
    }
}
