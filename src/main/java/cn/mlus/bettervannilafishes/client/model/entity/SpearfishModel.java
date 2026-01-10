package cn.mlus.bettervannilafishes.client.model.entity;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.spearfish.SpearfishEntity;
import net.minecraft.resources.ResourceLocation;

public class SpearfishModel extends BvfModel<SpearfishEntity> {
    @Override
    public ResourceLocation getTextureResource(SpearfishEntity entity) {
        if(entity.isAggressive() || entity.panicGoal != null && entity.panicGoal.isRunning()){
            return BetterVannilaFishes.prefix("textures/entity/spearfish_warning.png");
        }

        return super.getTextureResource(entity);
    }
}
