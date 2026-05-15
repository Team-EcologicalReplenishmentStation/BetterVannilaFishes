package cn.mlus.bettervannilafishes.client.animator;

import cn.mlus.bettervannilafishes.entity.BvfWaterAnimal;
import net.minecraft.util.Mth;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.GeoModel;

import java.util.List;

public class SharkAnimator <T extends BvfWaterAnimal> extends GeneralAnimator<T>{
    public SharkAnimator(T entity) {
        super(entity);
    }

    @Override
    public void animate(GeoModel<T> model, AnimationState<T> animationState) {
//        animateBody(model);
        animTail(model);
    }

    protected void animateBody(GeoModel<T> model){
        String boneName = "root";
        GeoBone bone = model.getBone(boneName).get();

        float angleLimit = 70;
        float pitchOfs = Mth.clamp(pitchTrail.get(partialTicks, 0, 1) * 10, -angleLimit, angleLimit);

        bone.setRotZ((float) (Math.toRadians(pitchOfs)));
    }

    protected void animTail(GeoModel<T> model){
        String[] tailBoneNames = {"neck_A","tail_1","tail_2","tail_3","tail_4","tail_5"};
        List<GeoBone> tailBones = getBonesByName(tailBoneNames, model);
        for(int i = 0; i < tailBones.size(); i++){
            GeoBone tail = tailBones.get(i);
            float reversedIndex = tailBones.size() - i;
            float logFactor = (float)(Math.log(reversedIndex + 1) / Math.log(tailBones.size() + 1));

            float angleLimit = 40 * logFactor;
            float pitchOfs = Mth.clamp(pitchTrail.get(partialTicks, 0, i + 5) * 0.09f, -angleLimit, angleLimit);
            float yawOfs = Mth.clamp(yawTrail.get(partialTicks, 0, i + 5) * 0.09f, -angleLimit, angleLimit);

            if (i < 3) {
                float extraRotationFactor = 5.5f - (i * 0.3f);
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
        }
    }
}
