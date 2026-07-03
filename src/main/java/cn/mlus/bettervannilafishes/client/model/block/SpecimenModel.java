package cn.mlus.bettervannilafishes.client.model.block;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.loading.math.MathParser;
import software.bernie.geckolib.model.GeoModel;

public class SpecimenModel<T extends FishSpecimenBlockEntity> extends GeoModel<T> {
    @Override
    public ResourceLocation getModelResource(FishSpecimenBlockEntity entity) {
        String path = BuiltInRegistries.BLOCK_ENTITY_TYPE.getKey(entity.getType()).getPath();
        int i = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if(i == 1){
            path += "_wall";
        } else if(i == 2){
            path += "_hanging";
        }
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"geo/block/" + path + ".geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FishSpecimenBlockEntity entity) {
        String path = BuiltInRegistries.BLOCK_ENTITY_TYPE.getKey(entity.getType()).getPath();
        int i = entity.getBlockState().getValue(FishSpecimen.HANGING);
        if(i == 1){
            path += "_wall";
        } else if(i == 2){
            path += "_hanging";
        }
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"textures/block/" + path +".png");
    }

    @Override
    public void applyMolangQueries(AnimationState<T> animationState, double animTime) {
        super.applyMolangQueries(animationState, animTime);
        MathParser.setVariable("v.size", () -> animationState.getAnimatable().getScale());
    }

    @Override
    public ResourceLocation getAnimationResource(FishSpecimenBlockEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(BetterVannilaFishes.MODID,"animations/block/specimen.animation.json");
    }
}
