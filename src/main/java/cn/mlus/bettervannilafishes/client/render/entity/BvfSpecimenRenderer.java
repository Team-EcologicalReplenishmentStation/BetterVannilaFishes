package cn.mlus.bettervannilafishes.client.render.entity;

import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import cn.mlus.bettervannilafishes.client.model.block.SpecimenModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class BvfSpecimenRenderer extends GeoBlockRenderer<FishSpecimenBlockEntity> {
    public BvfSpecimenRenderer() {
        super(new SpecimenModel<>());
    }

    public BvfSpecimenRenderer(GeoModel<FishSpecimenBlockEntity> model) {
        super(model);
    }
}
