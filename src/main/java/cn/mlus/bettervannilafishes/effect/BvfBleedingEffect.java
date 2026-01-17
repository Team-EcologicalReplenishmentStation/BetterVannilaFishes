package cn.mlus.bettervannilafishes.effect;

import cn.mlus.bettervannilafishes.init.BvfDamageSource;
import cn.mlus.bettervannilafishes.init.BvfMobEffects;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class BvfBleedingEffect extends MobEffect {
    private static final Map<LivingEntity, Vec3> previousPositions = new HashMap<>();
    private static final Map<LivingEntity,Boolean> still = new HashMap<>();
    public BvfBleedingEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public boolean applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity.getType().is(EntityTypeTags.UNDEAD)){
            pLivingEntity.removeEffect(BvfMobEffects.BLEEDING);
            return false;
        }

        Vec3 currentPosition = new Vec3(pLivingEntity.position().x(), pLivingEntity.position().y(), pLivingEntity.position().z());
        Vec3 previousPosition = previousPositions.get(pLivingEntity);

        if(still.get(pLivingEntity) != null && still.get(pLivingEntity)){
            still.put(pLivingEntity, false);
            MobEffectInstance instance = pLivingEntity.getEffect(BvfMobEffects.BLEEDING);
            int amp = instance.getAmplifier();
            pLivingEntity.removeEffect(BvfMobEffects.BLEEDING);
            if(amp != 0){
                pLivingEntity.addEffect(new MobEffectInstance(BvfMobEffects.BLEEDING, instance.getDuration(), amp - 1, false, false, true));
            }
        }

        float modifier = 1f;
        if (!previousPositions.isEmpty() && previousPosition != null && previousPosition.equals(currentPosition)) {
            modifier = 0.5f;
            still.put(pLivingEntity, true);
        }else{
            if(pLivingEntity.isSprinting())
                modifier = 2f;
            still.put(pLivingEntity, false);
        }

        pLivingEntity.hurt(BvfDamageSource.getDamageSource(pLivingEntity.level(),BvfDamageSource.DIE_OF_BLEED_KEY), pLivingEntity.getMaxHealth() * 0.01f * (pAmplifier + 1) * modifier);

        previousPositions.clear();
        previousPositions.put(pLivingEntity, currentPosition);
        return true;
    }

    @Override
    public void removeAttributeModifiers(@NotNull AttributeMap attributeMap) {
        super.removeAttributeModifiers(attributeMap);
        previousPositions.clear();
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int pDuration, int pAmplifier) {
        return pDuration > 0 && pDuration % 120 == 0;
    }

    public static void giveBleedingEffect(LivingEntity target, int maxAmp) {
        giveBleedingEffect(target, 1, maxAmp);
    }

    public static void giveBleedingEffect(LivingEntity target, int step , int maxAmp){
        if(target.level().isClientSide)
            return;

        if(target.isDeadOrDying() || target.getType().is(EntityTypeTags.UNDEAD)) {
            return;
        }

        MobEffectInstance instance = target.getEffect(BvfMobEffects.BLEEDING);
        if(instance == null){
            target.addEffect(new MobEffectInstance(BvfMobEffects.BLEEDING, 1200, 0, false, false, true));
        }else {
            int currentAmp = instance.getAmplifier();
            if (currentAmp + step < maxAmp) {
                instance.update(new MobEffectInstance(BvfMobEffects.BLEEDING, 1200, currentAmp + step, false, false, true));
                previousPositions.clear();
            }else {
                instance.update(new MobEffectInstance(BvfMobEffects.BLEEDING, 1200, maxAmp, false, false, true));
                previousPositions.clear();
            }
        }
    }

    public static void removeBleedingEffect(LivingEntity target) {
        if(target == null || target.isDeadOrDying()) {
            return;
        }

        MobEffectInstance instance = target.getEffect(BvfMobEffects.BLEEDING);

        if(instance == null)
            return;

        int currentAmp = instance.getAmplifier();
        target.removeEffect(BvfMobEffects.BLEEDING);

        int duration = instance.getDuration();
        if(currentAmp > 0) {
            target.addEffect(new MobEffectInstance(BvfMobEffects.BLEEDING, duration, currentAmp - 1, false, false, true));
        }

    }
}
