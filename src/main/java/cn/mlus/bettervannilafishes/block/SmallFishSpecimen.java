package cn.mlus.bettervannilafishes.block;

import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class SmallFishSpecimen extends FishSpecimen {
    public SmallFishSpecimen(Properties pProperties, Supplier<BlockEntityType<FishSpecimenBlockEntity>> blockEntityType) {
        super(pProperties, blockEntityType);
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction clickedFace = context.getClickedFace();
        BlockPos pos = context.getClickedPos();
        Level level = context.getLevel();

        int hangingState;
        Direction facing;

        if (clickedFace == Direction.UP) {
            hangingState = 0;
            facing = context.getHorizontalDirection();
        } else if (clickedFace.getAxis().isHorizontal()) {
            hangingState = 1;
            facing = clickedFace;
        } else {
            // Ceiling click is not allowed for small specimens; try to place as a stand instead.
            hangingState = 0;
            facing = context.getHorizontalDirection();
        }

        BlockState blockstate = this.defaultBlockState()
                .setValue(HANGING, hangingState)
                .setValue(FACING, facing);

        if (blockstate.canSurvive(level, pos)) {
            return blockstate;
        }

        if (hangingState != 0) {
            blockstate = this.defaultBlockState()
                    .setValue(HANGING, 0)
                    .setValue(FACING, context.getHorizontalDirection());
            if (blockstate.canSurvive(level, pos)) {
                return blockstate;
            }
        }

        if (hangingState != 1) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                blockstate = this.defaultBlockState()
                        .setValue(HANGING, 1)
                        .setValue(FACING, direction);
                if (blockstate.canSurvive(level, pos)) {
                    return blockstate;
                }
            }
        }

        return null;
    }
}
