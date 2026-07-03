package cn.mlus.bettervannilafishes.client.render.entity;

import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import cn.mlus.bettervannilafishes.client.model.block.SpecimenModel;
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
