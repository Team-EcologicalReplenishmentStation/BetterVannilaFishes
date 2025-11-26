package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.effect.NautilusBlessingEffect;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class BvfMobEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(Registries.MOB_EFFECT, BetterVannilaFishes.MODID);

    public static final ResourceLocation NAUTILUS_BLESSING_MODIFIER = BetterVannilaFishes.prefix("effect.nautilus_blessing");
    public static final DeferredHolder<MobEffect,MobEffect> NAUTILUS_BLESSING = MOB_EFFECTS.register("nautilus_blessing", () -> new NautilusBlessingEffect(MobEffectCategory.BENEFICIAL, 0x808080)
            .addAttributeModifier(Attributes.ATTACK_SPEED, NAUTILUS_BLESSING_MODIFIER, 0.10000000149011612, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
