package cn.mlus.bettervannilafishes.client.model.block;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class NegaprionBrevirostrisSpecimenModel extends SpecimenModel<FishSpecimenBlockEntity> {
    @Override
    public ResourceLocation getTextureResource(FishSpecimenBlockEntity entity) {
        String path = BuiltInRegistries.BLOCK_ENTITY_TYPE.getKey(entity.getType()).getPath();

        int v = entity.getVariant();
        if (v == 1) {
            path = path + "_dark";
        }

        int i = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if (i == 1) {
            path += "_wall";
        } else if (i == 2) {
            path += "_hanging";
        }

        return BetterVannilaFishes.prefix("textures/block/" + path + ".png");
    }
}
