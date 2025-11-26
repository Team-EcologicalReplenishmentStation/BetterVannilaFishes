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
    private static final Ingredient food = Ingredient.of(BvfItems.HADDOCK_COD.get(), BvfItems.PACIFIC_COD.get(), BvfItems.ATLANTIC_COD.get(),
            BvfItems.MALE_SALMON.get(), BvfItems.FEMALE_SALMON.get(), BvfItems.PACIFIC_SALMON.get());
    @Inject(method = "isFood",at = @At("TAIL"), cancellable = true)
    public void isFood(ItemStack pStack, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(cir.getReturnValue() || food.test(pStack));
    }
}
