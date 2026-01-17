package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.GaleocerdoCuvierEntity;
import net.minecraft.resources.ResourceLocation;

public class GaleocerdoCuvierModel extends BvfModel<GaleocerdoCuvierEntity> {
    @Override
    public ResourceLocation getTextureResource(GaleocerdoCuvierEntity entity) {
        String path = "textures/entity/galeocerdo_cuvier";
        path = switch (entity.getVariant().getId()) {
            case 0 -> path + ".png";
            case 1 -> path + "_contrast.png";
            case 2 -> path + "_white.png";
            default -> "textures/entity/galeocerdo_cuvier";
        };

        return BetterVannilaFishes.prefix(path);
    }
}
