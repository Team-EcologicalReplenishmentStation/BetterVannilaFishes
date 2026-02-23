package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.squid.DosidicusGigasEntity;
import net.minecraft.resources.ResourceLocation;

public class DosidicusGigasModel extends BvfModel<DosidicusGigasEntity> {
    @Override
    public ResourceLocation getTextureResource(DosidicusGigasEntity entity) {
        if(entity.hasCustomName()) {
            if("Squid".equals(entity.getCustomName().getString())){
                return BetterVannilaFishes.prefix("textures/entity/dosidicus_gigas_squid.png");
            }
            if("Mostl".equals(entity.getCustomName().getString())){
                return BetterVannilaFishes.prefix("textures/entity/dosidicus_gigas_mostl.png");
            }
        }

        int colorState = entity.getColorState();
        String colorName = DosidicusGigasEntity.COLOR_NAMES[Math.min(colorState, DosidicusGigasEntity.COLOR_NAMES.length - 1)];
        return BetterVannilaFishes.prefix("textures/entity/dosidicus_gigas_" + colorName + ".png");
    }
}
