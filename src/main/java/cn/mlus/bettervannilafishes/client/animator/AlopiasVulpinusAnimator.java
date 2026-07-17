package cn.mlus.bettervannilafishes.client.animator;

import cn.mlus.bettervannilafishes.entity.alopias.AlopiasVulpinusEntity;
import net.minecraft.util.Mth;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

import java.util.List;

public class AlopiasVulpinusAnimator extends GeneralAnimator<AlopiasVulpinusEntity> {
    private static final String[] TAIL_BONES = {
            "neck_A", "tail_1", "tail_2", "tail_3", "tail_4", "tail_5",
            "tail_6", "tail_7", "tail_8", "tail_9", "tail_10"
    };

    public AlopiasVulpinusAnimator(AlopiasVulpinusEntity entity) {
        super(entity);
    }

    @Override
    public void animate(GeoModel<AlopiasVulpinusEntity> model, AnimationState<AlopiasVulpinusEntity> animationState) {
        List<GeoBone> tailBones = getBonesByName(TAIL_BONES, model);
        for (int i = 0; i < tailBones.size(); i++) {
            int trailOffset = Math.min(i + 4, 15);
            float progress = i / (float) (tailBones.size() - 1);
            float multiplier = Mth.lerp(progress, 3.8F, 1.8F);
            float angleLimit = Mth.lerp(progress, 12.0F, 24.0F);

            float pitch = pitchTrail.get(partialTicks, 0, trailOffset) * 0.09F * multiplier;
            float yaw = yawTrail.get(partialTicks, 0, trailOffset) * 0.09F * multiplier;

            if (i == 0) {
                pitch = -pitch;
                yaw = -yaw;
            }

            GeoBone bone = tailBones.get(i);
            bone.setRotX(bone.getRotX() + (float) Math.toRadians(Mth.clamp(pitch, -angleLimit, angleLimit)));
            bone.setRotY(bone.getRotY() + (float) Math.toRadians(Mth.clamp(yaw, -angleLimit, angleLimit)));
        }
    }
}
