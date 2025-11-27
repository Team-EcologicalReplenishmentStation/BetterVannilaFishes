package cn.mlus.bettervannilafishes.data;

import cn.aurorian.ers.EcologicalReplenishmentStation;
import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class BvfRecipeProvider extends RecipeProvider {

    public BvfRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.COD,1)
                .requires(BvfItems.ATLANTIC_COD.get())
                .unlockedBy(getHasName(BvfItems.ATLANTIC_COD.get()), has(BvfItems.ATLANTIC_COD.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cod_from_atlantic_cod"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.COD,1)
                .requires(BvfItems.HADDOCK_COD.get())
                .unlockedBy(getHasName(BvfItems.HADDOCK_COD.get()), has(BvfItems.HADDOCK_COD.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cod_from_haddock_cod"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.COD,1)
                .requires(BvfItems.PACIFIC_COD.get())
                .unlockedBy(getHasName(BvfItems.PACIFIC_COD.get()), has(BvfItems.PACIFIC_COD.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cod_from_pacific_cod"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.SALMON,1)
                .requires(BvfItems.PACIFIC_SALMON.get())
                .unlockedBy(getHasName(BvfItems.PACIFIC_SALMON.get()), has(BvfItems.PACIFIC_SALMON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("salmon_from_pacific_salmon"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.SALMON,1)
                .requires(BvfItems.MALE_SALMON.get())
                .unlockedBy(getHasName(BvfItems.MALE_SALMON.get()), has(BvfItems.MALE_SALMON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("salmon_from_male_salmon"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.SALMON,1)
                .requires(BvfItems.FEMALE_SALMON.get())
                .unlockedBy(getHasName(BvfItems.FEMALE_SALMON.get()), has(BvfItems.FEMALE_SALMON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("salmon_from_female_salmon"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.PUFFERFISH,1)
                .requires(BvfItems.YELLOW_FIN_PUFFER.get())
                .unlockedBy(getHasName(BvfItems.YELLOW_FIN_PUFFER.get()), has(BvfItems.YELLOW_FIN_PUFFER.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pufferfish_from_yellow_fin_puffer"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.PUFFERFISH,1)
                .requires(BvfItems.OBSCURE_PUFFER.get())
                .unlockedBy(getHasName(BvfItems.OBSCURE_PUFFER.get()), has(BvfItems.OBSCURE_PUFFER.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pufferfish_from_obscure_puffer"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.PUFFERFISH,1)
                .requires(BvfItems.PORCUPINE_FISH.get())
                .unlockedBy(getHasName(BvfItems.PORCUPINE_FISH.get()), has(BvfItems.PORCUPINE_FISH.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pufferfish_from_porcupine_fish"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.ATLANTIC_COD_SPECIMEN.get(),1)
                .requires(BvfItems.ATLANTIC_COD.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.ATLANTIC_COD.get()), has(BvfItems.ATLANTIC_COD.get()))
                .save(pWriter, BetterVannilaFishes.prefix("atlantic_cod_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.HADDOCK_COD_SPECIMEN.get(),1)
                .requires(BvfItems.HADDOCK_COD.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.HADDOCK_COD.get()), has(BvfItems.HADDOCK_COD.get()))
                .save(pWriter, BetterVannilaFishes.prefix("haddock_cod_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.PACIFIC_COD_SPECIMEN.get(),1)
                .requires(BvfItems.PACIFIC_COD.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.PACIFIC_COD.get()), has(BvfItems.PACIFIC_COD.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pacific_cod_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.PACIFIC_SALMON_SPECIMEN.get(),1)
                .requires(BvfItems.PACIFIC_SALMON.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.PACIFIC_SALMON.get()), has(BvfItems.PACIFIC_SALMON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pacific_salmon_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.MALE_SALMON_SPECIMEN.get(),1)
                .requires(BvfItems.MALE_SALMON.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.PACIFIC_SALMON.get()), has(BvfItems.MALE_SALMON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("male_salmon_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.FEMALE_SALMON_SPECIMEN.get(),1)
                .requires(BvfItems.FEMALE_SALMON.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.PACIFIC_SALMON.get()), has(BvfItems.MALE_SALMON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("female_salmon_specimen"));
    }

    public ConditionalRecipe.Builder buildErsRecipe(ShapelessRecipeBuilder recipe, String path) {
        return ConditionalRecipe.builder().addCondition(new ModLoadedCondition(EcologicalReplenishmentStation.MODID))
                .addRecipe(consumer -> recipe.save(consumer, BetterVannilaFishes.prefix(path)));
    }

    private static void buildFoodProcessRecipes(Consumer<FinishedRecipe> recipeOutput, Item input, Item output, float xp) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 200)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, BetterVannilaFishes.prefix(getItemName(output) + "_smelting"));
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 100)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, BetterVannilaFishes.prefix(getItemName(output) + "_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 600)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, BetterVannilaFishes.prefix(getItemName(output) + "_campfire_cooking"));
    }
}
