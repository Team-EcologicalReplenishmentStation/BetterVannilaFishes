package cn.mlus.bettervannilafishes.mixin;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Cat.class)
public class MixinCat {
    private static final Ingredient food = Ingredient.of(BvfItems.HADDOCK_COD.value(), BvfItems.PACIFIC_COD.value(), BvfItems.ATLANTIC_COD.value(),
            BvfItems.MALE_SALMON.value(), BvfItems.FEMALE_SALMON.value(), BvfItems.PACIFIC_SALMON.value());
    @Inject(method = "isFood",at = @At("TAIL"), cancellable = true)
    public void isFood(ItemStack pStack, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(cir.getReturnValue() || food.test(pStack));
    }
}
