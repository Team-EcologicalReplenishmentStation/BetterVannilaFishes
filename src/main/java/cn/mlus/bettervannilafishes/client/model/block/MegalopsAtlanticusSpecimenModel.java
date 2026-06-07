package cn.mlus.bettervannilafishes.client.model.block;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;

public class MegalopsAtlanticusSpecimenModel extends SpecimenModel<FishSpecimenBlockEntity> {
    @Override
    public ResourceLocation getModelResource(BlockEntity entity) {
        int hanging = entity.getBlockState().getValue(FishSpecimen.HANGING);
        boolean direction = entity.getBlockState().getValue(FishSpecimen.FACING).get2DDataValue() % 2 == 0;
        if (hanging == 2 && direction) {
            return BetterVannilaFishes.prefix("geo/block/megalops_atlanticus_specimen_hanging_direction.geo.json");
        }
        return super.getModelResource(entity);
    }
}
