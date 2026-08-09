package cn.mlus.bettervannilafishes.client.animator;

import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.roosterfish.RoosterfishEntity;
import net.minecraft.util.Mth;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.GeoModel;

import java.util.List;

public class SpearFishAnimator<T extends BvfAbstractFish> extends GeneralAnimator<T> {
    public SpearFishAnimator(T entity) {
        super(entity);
    }

    @Override
    public void animate(GeoModel<T> model, AnimationState<T> animationState) {
        animTail(model);
    }

    protected void animTail(GeoModel<T> model){
        String[] tailBoneNames = {"head","tail_1","tail_2","tail_3"};
        List<GeoBone> tailBones = getBonesByName(tailBoneNames, model);
        for(int i = 0; i < tailBones.size(); i++){
            GeoBone tail = tailBones.get(i);
            float reversedIndex = tailBones.size() - i;
            float logFactor = (float)(Math.log(reversedIndex + 1) / Math.log(tailBones.size() + 1));

            float angleLimit = 160 * logFactor;
            float pitchOfs = Mth.clamp(pitchTrail.get(partialTicks, 0, i + 5) * 0.1f, -angleLimit, angleLimit);
            float yawOfs = Mth.clamp(yawTrail.get(partialTicks, 0, i + 5) * 0.1f, -angleLimit, angleLimit);

            if (i < 3) {
                float extraRotationFactor = 6.5f - (i * 0.3f);
                pitchOfs *= extraRotationFactor;
                yawOfs *= extraRotationFactor;
            }else {
                pitchOfs *= 3f;
                yawOfs *=  3f;
            }

            if (i == 0) {
                pitchOfs = -pitchOfs;
                yawOfs = -yawOfs;
                pitchOfs = Mth.clamp(pitchOfs, -10f, 10f);
                yawOfs = Mth.clamp(yawOfs, -10f, 10f);
            }

            tail.setRotX((float) (tail.getRotX() + Math.toRadians(pitchOfs)));
            tail.setRotY((float) (tail.getRotY() + Math.toRadians(yawOfs)));

            if (i == 1 && entity instanceof RoosterfishEntity) {
                float dorsalPitchOfs = pitchOfs;
                float dorsalYawOfs = yawOfs;
                model.getBone("dorsal_fin2").ifPresent(dorsal -> {
                    dorsal.setRotX((float) (dorsal.getRotX() + Math.toRadians(dorsalPitchOfs)));
                    dorsal.setRotY((float) (dorsal.getRotY() + Math.toRadians(dorsalYawOfs)));
                });
            }
        }
    }
}
