package cn.mlus.bettervannilafishes.client.model.block;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.resources.ResourceLocation;

public class AlopiasVulpinusSpecimenModel extends SpecimenModel<FishSpecimenBlockEntity> {
    @Override public ResourceLocation getTextureResource(FishSpecimenBlockEntity entity) {
        String path = "alopias_vulpinus_specimen" + (entity.getVariant() == 1 ? "_dark" : "");
        int hanging = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if (hanging == 1) path += "_wall";
        else if (hanging == 2) path += "_hanging";
        return BetterVannilaFishes.prefix("textures/block/" + path + ".png");
    }
    @Override public ResourceLocation getModelResource(FishSpecimenBlockEntity entity) {
        int hanging = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if (hanging == 2 && entity.getBlockState().getValue(FishSpecimen.FACING).get2DDataValue() % 2 == 0)
            return BetterVannilaFishes.prefix("geo/block/alopias_vulpinus_specimen_hanging_ew.geo.json");
        return super.getModelResource(entity);
    }
}
