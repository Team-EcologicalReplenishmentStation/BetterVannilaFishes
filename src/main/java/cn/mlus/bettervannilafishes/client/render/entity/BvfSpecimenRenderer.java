package cn.mlus.bettervannilafishes.client.render.entity;

import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import cn.mlus.bettervannilafishes.client.model.entity.SpecimenModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BvfSpecimenRenderer extends GeoBlockRenderer<FishSpecimenBlockEntity> {
    public BvfSpecimenRenderer() {
        super(new SpecimenModel<>());
    }

    @Override
    public void preRender(PoseStack poseStack, FishSpecimenBlockEntity animatable, BakedGeoModel model, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int colour) {
        super.preRender(poseStack, animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, colour);
        float scale = animatable.getScale();
        poseStack.scale(scale, scale, scale);
    }
}
