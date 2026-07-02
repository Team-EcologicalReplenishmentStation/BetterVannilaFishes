package cn.mlus.bettervannilafishes.client.model.block;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;

public class TigerSharkSpecimenModel extends SpecimenModel<FishSpecimenBlockEntity> {
    @Override
    public ResourceLocation getTextureResource(FishSpecimenBlockEntity entity) {
        String path = BuiltInRegistries.BLOCK_ENTITY_TYPE.getKey(entity.getType()).getPath();

        int v = entity.getVariant();
        switch (v){
            case 1 -> path = path + "_white";
            case 2 -> path = path + "_contrast";
        }

        int i = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if(i == 1){
            path += "_wall";
        } else if(i == 2){
            path += "_hanging";
        }

        return BetterVannilaFishes.prefix("textures/block/" + path +".png");
    }

    @Override
    public ResourceLocation getModelResource(FishSpecimenBlockEntity entity) {
        int i = entity.getBlockState().getValue(FishSpecimen.HANGING);
        boolean direction = entity.getBlockState().getValue(FishSpecimen.FACING).get2DDataValue() % 2 == 0;
        if(i == 2 && direction){
            return BetterVannilaFishes.prefix("geo/block/galeocerdo_cuvier_specimen_hanging_direction.geo.json");
        }
        return super.getModelResource(entity);
    }
}
