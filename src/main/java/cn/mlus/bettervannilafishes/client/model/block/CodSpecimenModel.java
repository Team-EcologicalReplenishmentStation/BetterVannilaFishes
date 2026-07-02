package cn.mlus.bettervannilafishes.client.model.block;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;

public class CodSpecimenModel extends SpecimenModel<FishSpecimenBlockEntity> {
    @Override
    public ResourceLocation getModelResource(FishSpecimenBlockEntity entity) {
        String path = "cod_specimen";
        int i = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if(i == 1){
            path += "_wall";
        } else if(i == 2){
            path += "_hanging";
        }
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"geo/block/" + path + ".geo.json");
    }

}
