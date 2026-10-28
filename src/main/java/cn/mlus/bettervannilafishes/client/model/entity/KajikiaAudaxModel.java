package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.kajikiaaudax.KajikiaAudaxEntity;
import net.minecraft.resources.ResourceLocation;

public class KajikiaAudaxModel extends BvfModel<KajikiaAudaxEntity> {
    @Override
    public ResourceLocation getTextureResource(KajikiaAudaxEntity entity) {
        if(entity.isAggressive() || entity.panicGoal != null && entity.panicGoal.isRunning()){
            return BetterVannilaFishes.prefix("textures/entity/kajikia_audax_warning.png");
        }

        return super.getTextureResource(entity);
    }
}
