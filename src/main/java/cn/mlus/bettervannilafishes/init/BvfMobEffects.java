package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.effect.BvfBleedingEffect;
import cn.mlus.bettervannilafishes.effect.NautilusPompiliusBlessingEffect;
import cn.mlus.bettervannilafishes.effect.PurificationEffect;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BvfMobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, BetterVannilaFishes.MODID);

    public static final ResourceLocation NAUTILUS_POMPILIUS_BLESSING_MODIFIER = BetterVannilaFishes.prefix("effect.nautilus_pompilius_blessing");
    public static final DeferredHolder<MobEffect,MobEffect> NAUTILUS_POMPILIUS_BLESSING = MOB_EFFECTS.register("nautilus_pompilius_blessing", () -> new NautilusPompiliusBlessingEffect(MobEffectCategory.BENEFICIAL, 0x808080)
            .addAttributeModifier(Attributes.ATTACK_SPEED, NAUTILUS_POMPILIUS_BLESSING_MODIFIER, 0.10000000149011612, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    public static final DeferredHolder<MobEffect,MobEffect> PURIFICATION = MOB_EFFECTS.register("purification", () -> new PurificationEffect(MobEffectCategory.BENEFICIAL, 0x0000FF));
    public static final DeferredHolder<MobEffect,MobEffect> BLEEDING = MOB_EFFECTS.register("bleeding", () -> new BvfBleedingEffect(MobEffectCategory.HARMFUL, 0xFF0000));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
