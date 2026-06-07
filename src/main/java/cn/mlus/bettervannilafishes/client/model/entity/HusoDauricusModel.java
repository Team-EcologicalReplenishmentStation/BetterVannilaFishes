package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.husodauricus.HusoDauricus;
import net.minecraft.resources.ResourceLocation;

public class HusoDauricusModel extends BvfModel<HusoDauricus> {
    @Override
    public ResourceLocation getTextureResource(HusoDauricus entity) {
        String path = switch (entity.getVariant().getId()) {
            case 0 -> "textures/entity/huso_dauricus.png";
            case 1 -> "textures/entity/huso_dauricus_dark.png";
            case 2 -> "textures/entity/huso_dauricus_deep.png";
            default -> "textures/entity/huso_dauricus.png";
        };
        return BetterVannilaFishes.prefix(path);
    }
}
