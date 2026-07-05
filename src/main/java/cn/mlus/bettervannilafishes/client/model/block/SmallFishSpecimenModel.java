package cn.mlus.bettervannilafishes.client.model.block;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.resources.ResourceLocation;

public class SmallFishSpecimenModel extends SpecimenModel<FishSpecimenBlockEntity> {
    private final String basePath;

    public SmallFishSpecimenModel(String basePath) {
        this.basePath = basePath;
    }

    @Override
    public ResourceLocation getModelResource(FishSpecimenBlockEntity entity) {
        String path = basePath;
        int i = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if (i == 1) {
            path += "_wall";
        } else if (i == 2) {
            path += "_hanging";
        }
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID, "geo/block/" + path + ".geo.json");
    }
}
