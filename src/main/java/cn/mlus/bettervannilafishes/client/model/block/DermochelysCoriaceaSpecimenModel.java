package cn.mlus.bettervannilafishes.client.model.block;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.resources.ResourceLocation;

public class DermochelysCoriaceaSpecimenModel extends SpecimenModel<FishSpecimenBlockEntity> {
    @Override
    public ResourceLocation getTextureResource(FishSpecimenBlockEntity entity) {
        String path = "dermochelys_coriacea_specimen" + (entity.getVariant() == 1 ? "_gray" : "");
        int hanging = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if (hanging == 1) path += "_wall";
        return BetterVannilaFishes.prefix("textures/block/" + path + ".png");
    }

    @Override
    public ResourceLocation getModelResource(FishSpecimenBlockEntity entity) {
        int hanging = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if (hanging == 1) {
            return BetterVannilaFishes.prefix("geo/block/dermochelys_coriacea_specimen_wall.geo.json");
        }
        return BetterVannilaFishes.prefix("geo/block/dermochelys_coriacea_specimen.geo.json");
    }
}
