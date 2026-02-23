package cn.mlus.bettervannilafishes.client.animator;

import cn.mlus.bettervannilafishes.entity.BvfWaterAnimal;
import net.minecraft.util.Mth;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.GeoModel;

public class SquidAnimator<T extends BvfWaterAnimal> extends GeneralAnimator<T> {
    private final LerpedFloat aggressiveBlend = new LerpedFloat(0);
    private static final float BLEND_SPEED = 0.15f;

    public SquidAnimator(T entity) {
        super(entity);
    }

    @Override
    public void tick() {
        super.tick();
        float target = entity.isAggressive() ? 1.0f : 0.0f;
        float current = aggressiveBlend.get();
        aggressiveBlend.set(current + (target - current) * BLEND_SPEED);
    }

    @Override
    public float getModelPitch(float pt, float amp) {
        float pitchMovingMax = 90;
        float normalPitch = Mth.clamp(yTrail.get(pt, 5, 0) * amp, -pitchMovingMax, pitchMovingMax);
        float aggressivePitch = Mth.clamp(yTrail.get(pt, 0, 5) * amp, -pitchMovingMax, pitchMovingMax);
        float blend = aggressiveBlend.get(pt);
        return Mth.lerp(blend, normalPitch, aggressivePitch);
    }

    @Override
    public void animate(GeoModel<T> model, AnimationState<T> animationState) {
        animHead(model,animationState);
        animTail(model,animationState);
    }


    protected void animTail(GeoModel<T> model,AnimationState<T> animationState) {
        GeoBone tail = model.getBone("tail").orElse(null);
        if (tail == null) {
            return;
        }

        float angleLimit = 80f;
        float pitchOfs = Mth.clamp(pitchTrail.get(partialTicks, 0, 3), -angleLimit, angleLimit);
        float yawOfs = Mth.clamp(yawTrail.get(partialTicks, 0, 3), -angleLimit, angleLimit);

        pitchOfs *= -1.25f;
        yawOfs *= -1.25f;

        if(animationState.getAnimatable().isAggressive()){
            pitchOfs *= -1f;
            yawOfs *= -1f;
        }

        tail.setRotX((float) (tail.getRotX() + Math.toRadians(pitchOfs)));
        tail.setRotY((float) (tail.getRotY() + Math.toRadians(yawOfs)));
    }

    protected void animHead(GeoModel<T> model,AnimationState<T> animationState) {
        GeoBone head = model.getBone("head").orElse(null);
        if (head == null) {
            return;
        }

        float angleLimit = 80f;
        float pitchOfs = Mth.clamp(pitchTrail.get(partialTicks, 0, 3), -angleLimit, angleLimit);
        float yawOfs = Mth.clamp(yawTrail.get(partialTicks, 0, 3), -angleLimit, angleLimit);

        pitchOfs *= 1.25f;
        yawOfs *= 1.25f;

        if(animationState.getAnimatable().isAggressive()){
            pitchOfs *= -1f;
            yawOfs *= -1f;
        }

        head.setRotX((float) (head.getRotX() + Math.toRadians(pitchOfs)));
        head.setRotY((float) (head.getRotY() + Math.toRadians(yawOfs)));
    }
}
