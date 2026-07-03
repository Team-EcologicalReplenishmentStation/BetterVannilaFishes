package cn.mlus.bettervannilafishes.client.model.block;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.resources.ResourceLocation;

public class HusoDauricusSpecimenModel extends SpecimenModel<FishSpecimenBlockEntity> {
    @Override
    public ResourceLocation getModelResource(FishSpecimenBlockEntity entity) {
        int i = entity.getBlockState().getValue(FishSpecimen.HANGING);
        boolean direction = entity.getBlockState().getValue(FishSpecimen.FACING).get2DDataValue() % 2 == 0;
        if(i == 2 && direction){
            return BetterVannilaFishes.prefix("geo/block/huso_dauricus_specimen_hanging_direction.geo.json");
        }
        return super.getModelResource(entity);
    }

    @Override
    public ResourceLocation getTextureResource(FishSpecimenBlockEntity entity) {
        String path = "huso_dauricus_specimen";
        int i = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if(i == 1){
            path += "_wall";
        } else if(i == 2){
            path += "_hanging";
        }

        int variant = entity.getVariant();
        if(variant == 1){
            path += "_dark";
        } else if(variant == 2){
            path += "_deep";
        }

        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"textures/block/" + path + ".png");
    }
}
