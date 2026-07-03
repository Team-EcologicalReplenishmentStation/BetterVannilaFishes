package cn.mlus.bettervannilafishes.block.be;

import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.init.BvfBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

public class FishSpecimenBlockEntity extends BlockEntity implements GeoBlockEntity {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private float scale = 1f;
    private int variant = 0;
    public FishSpecimenBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(getBlockEntityType(pBlockState), pPos, pBlockState);
    }

    private static BlockEntityType<FishSpecimenBlockEntity> getBlockEntityType(BlockState pState) {
        if (pState.getBlock() instanceof FishSpecimen specimen) {
            return specimen.getBlockEntityType();
        }
        return BvfBlockEntities.GALEOCERDO_CUVIER_SPECIMEN.get();
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<FishSpecimenBlockEntity> main = new AnimationController<>(this, "main", 0, state -> {
            RawAnimation builder = RawAnimation.begin().thenLoop("size");
            return state.setAndContinue(builder);
        });
        controllerRegistrar.add(main);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float value) {
        this.scale = value;
        markUpdated();
    }

    public int getVariant() {
        return variant;
    }

    public void setVariant(int variant) {
        this.variant = variant;
        markUpdated();
    }

    private void markUpdated() {
        this.setChanged();
        this.getLevel().sendBlockUpdated(this.getBlockPos(), this.getBlockState(), this.getBlockState(), 3);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public @NotNull CompoundTag getUpdateTag(HolderLookup.@NotNull Provider provider) {
        return saveWithoutMetadata(provider);
    }

    @Override
    public void loadAdditional(@NotNull CompoundTag compoundTag, HolderLookup.@NotNull Provider provider) {
        super.loadAdditional(compoundTag, provider);
        if (compoundTag.contains("Scale")) {
            this.scale = compoundTag.getFloat("Scale");
        }

        if(compoundTag.contains("Variant")){
            this.variant = compoundTag.getInt("Variant");
        }
    }

    @Override
    protected void saveAdditional(@NotNull CompoundTag compoundTag, HolderLookup.@NotNull Provider provider) {
        super.saveAdditional(compoundTag, provider);
        compoundTag.putFloat("Scale", this.scale);
        compoundTag.putInt("Variant", this.variant);
    }

}
