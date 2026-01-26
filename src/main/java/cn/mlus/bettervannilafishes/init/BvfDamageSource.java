package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.level.Level;

import java.util.Locale;

public class BvfDamageSource {
    public static final ResourceKey<DamageType> DIE_OF_BLEED;

    public static DamageSource getDamageSource(Level level, ResourceKey<DamageType> type) {
        return new DamageSource(level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(type), null, null);
    }

    static {
        DIE_OF_BLEED = ResourceKey.create(Registries.DAMAGE_TYPE, BetterVannilaFishes.prefix("bleeding".toLowerCase(Locale.ROOT)));
    }
}
