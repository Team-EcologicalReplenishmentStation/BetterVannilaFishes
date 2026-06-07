package cn.mlus.bettervannilafishes.client.animator;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.animal.WaterAnimal;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

import java.util.List;

public class BvfFishAnimator<T extends WaterAnimal & GeoAnimatable> extends GeneralAnimator<T> {
    public BvfFishAnimator(T entity) {
        super(entity);
    }

    @Override
    public void animate(GeoModel<T> model, AnimationState<T> animationState) {
        animTail(model);
    }

    protected void animTail(GeoModel<T> model){
        if(!entity.isInWater()){
            return;
        }

        String[] tailBoneNames = {"head","tail_1","tail_2","tail_3"};
        List<GeoBone> tailBones = getBonesByName(tailBoneNames, model);
        for(int i = 0; i < tailBones.size(); i++){
            GeoBone tail = tailBones.get(i);
            float reversedIndex = tailBones.size() - i;
            float logFactor = (float)(Math.log(reversedIndex + 1) / Math.log(tailBones.size() + 1));

            float angleLimit = 160 * logFactor;
            float pitchOfs = Mth.clamp(pitchTrail.get(partialTicks, 0, i + 1) * 0.13f, -angleLimit, angleLimit);
            float yawOfs = Mth.clamp(yawTrail.get(partialTicks, 0, i + 1) * 0.13f, -angleLimit, angleLimit);

            if (i < 3) {
                float extraRotationFactor = 7.5f - (i * 0.3f);
                pitchOfs *= extraRotationFactor;
                yawOfs *= extraRotationFactor;
            }else {
                pitchOfs *= 3.5f;
                yawOfs *=  3.5f;
            }

            if (i == 0) {
                pitchOfs = -pitchOfs;
                yawOfs = -yawOfs;
                pitchOfs = Mth.clamp(pitchOfs, -5f, 5f);
                yawOfs = Mth.clamp(yawOfs, -5f, 5f);
            }

            tail.setRotX((float) (tail.getRotX() + Math.toRadians(pitchOfs)));
            tail.setRotY((float) (tail.getRotY() + Math.toRadians(yawOfs)));
        }
    }
}
