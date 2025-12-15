package cn.mlus.bettervannilafishes.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class PurificationEffect extends MobEffect {
    public PurificationEffect(MobEffectCategory pCategory, int pColor) {
        super(pCategory, pColor);
    }

    @Override
    public boolean applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity.canBreatheUnderwater()){
            pLivingEntity.heal(1);
            return true;
        }
        return false;

    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int arg1, int arg2) {
        int i = 50 >> arg2;
        return i == 0 || arg1 % i == 0;
    }
}
