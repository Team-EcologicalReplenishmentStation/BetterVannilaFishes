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
    public void applyEffectTick(@NotNull LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity.canBreatheUnderwater()){
            pLivingEntity.heal(1);
        }
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        int k = 50 >> pAmplifier;
        if (k > 0) {
            return pDuration % k == 0;
        } else {
            return true;
        }
    }
}
