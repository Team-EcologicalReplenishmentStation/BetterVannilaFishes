package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class BvfRecipeProvider extends RecipeProvider {

    public BvfRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput pWriter) {
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.ACANTHURUS_ACHILLES.get())
                .unlockedBy(getHasName(BvfItems.ACANTHURUS_ACHILLES.get()), has(BvfItems.ACANTHURUS_ACHILLES.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_acanthurus_achilles"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.PARACANTHURUS_HEPATUS.get())
                .unlockedBy(getHasName(BvfItems.PARACANTHURUS_HEPATUS.get()), has(BvfItems.PARACANTHURUS_HEPATUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_paracanthurus_hepatus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.ACANTHURUS_LEUCOSTERNON.get())
                .unlockedBy(getHasName(BvfItems.ACANTHURUS_LEUCOSTERNON.get()), has(BvfItems.ACANTHURUS_LEUCOSTERNON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_acanthurus_leucosternon"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.ACANTHURUS_LINEATUS.get())
                .unlockedBy(getHasName(BvfItems.ACANTHURUS_LINEATUS.get()), has(BvfItems.ACANTHURUS_LINEATUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_acanthurus_lineatus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.ACANTHURUS_NIGRICANS.get())
                .unlockedBy(getHasName(BvfItems.ACANTHURUS_NIGRICANS.get()), has(BvfItems.ACANTHURUS_NIGRICANS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_acanthurus_nigricans"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.ACANTHURUS_TRIOSTEGUS.get())
                .unlockedBy(getHasName(BvfItems.ACANTHURUS_TRIOSTEGUS.get()), has(BvfItems.ACANTHURUS_TRIOSTEGUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_acanthurus_triostegus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AUSTRALOHEROS_FACETUS.get())
                .unlockedBy(getHasName(BvfItems.AUSTRALOHEROS_FACETUS.get()), has(BvfItems.AUSTRALOHEROS_FACETUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_australoheros_facetus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CICHLASOMA_BIMACULATUM.get())
                .unlockedBy(getHasName(BvfItems.CICHLASOMA_BIMACULATUM.get()), has(BvfItems.CICHLASOMA_BIMACULATUM.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_cichlasoma_bimaculatum"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.KROBIA_GUIANENSIS.get())
                .unlockedBy(getHasName(BvfItems.KROBIA_GUIANENSIS.get()), has(BvfItems.KROBIA_GUIANENSIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_krobia_guianensis"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AEQUIDENS_TETRAMERUS.get())
                .unlockedBy(getHasName(BvfItems.AEQUIDENS_TETRAMERUS.get()), has(BvfItems.AEQUIDENS_TETRAMERUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_aequidens_tetramerus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.GYMNOGEOPHAGUS_BALZANII.get())
                .unlockedBy(getHasName(BvfItems.GYMNOGEOPHAGUS_BALZANII.get()), has(BvfItems.GYMNOGEOPHAGUS_BALZANII.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_gymnogeophagus_balzanii"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.ASTRONOTUS_OCELLATUS.get())
                .unlockedBy(getHasName(BvfItems.ASTRONOTUS_OCELLATUS.get()), has(BvfItems.ASTRONOTUS_OCELLATUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_astronotus_ocellatus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CHANNA_MICROPELTES.get())
                .unlockedBy(getHasName(BvfItems.CHANNA_MICROPELTES.get()), has(BvfItems.CHANNA_MICROPELTES.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_channa_micropeltes"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CHANNA_ARGUS.get())
                .unlockedBy(getHasName(BvfItems.CHANNA_ARGUS.get()), has(BvfItems.CHANNA_ARGUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_channa_argus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_OCELLARIS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_OCELLARIS.get()), has(BvfItems.AMPHIPRION_OCELLARIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_ocellaris"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.PREMNAS_BIACULEATUS.get())
                .unlockedBy(getHasName(BvfItems.PREMNAS_BIACULEATUS.get()), has(BvfItems.PREMNAS_BIACULEATUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_premnas_biaculeatus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_POLYMNUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_POLYMNUS.get()), has(BvfItems.AMPHIPRION_POLYMNUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_polymnus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_PERIDERAION.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_PERIDERAION.get()), has(BvfItems.AMPHIPRION_PERIDERAION.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_perideraion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_CLARKII.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_CLARKII.get()), has(BvfItems.AMPHIPRION_CLARKII.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_clarkii"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_PERCULA.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_PERCULA.get()), has(BvfItems.AMPHIPRION_PERCULA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_percula"));

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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.SPEARFISH_SPECIMEN.get(),1)
                .requires(BvfItems.SPEARFISH.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.SPEARFISH.get()), has(BvfItems.SPEARFISH.get()))
                .save(pWriter, BetterVannilaFishes.prefix("spearfish_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.GALEOCERDO_CUVIER_SPECIMEN.get(),1)
                .requires(BvfItems.GALEOCERDO_CUVIER.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.GALEOCERDO_CUVIER.get()), has(BvfItems.GALEOCERDO_CUVIER.get()))
                .save(pWriter, BetterVannilaFishes.prefix("galeocerdo_cuvier_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.EPINEPHELUS_LANCEOLATUS_SPECIMEN.get(),1)
                .requires(BvfItems.EPINEPHELUS_LANCEOLATUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.EPINEPHELUS_LANCEOLATUS.get()), has(BvfItems.EPINEPHELUS_LANCEOLATUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("epinephelus_lanceolatus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.EPINEPHELUS_ITAJARA_SPECIMEN.get(),1)
                .requires(BvfItems.EPINEPHELUS_ITAJARA.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.EPINEPHELUS_ITAJARA.get()), has(BvfItems.EPINEPHELUS_ITAJARA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("epinephelus_itajara_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.EPINEPHELUS_MELANOSTIGMA_SPECIMEN.get(),1)
                .requires(BvfItems.EPINEPHELUS_MELANOSTIGMA.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.EPINEPHELUS_MELANOSTIGMA.get()), has(BvfItems.EPINEPHELUS_MELANOSTIGMA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("epinephelus_melanostigma_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.AUSTRALOHEROS_FACETUS_SPECIMEN.get(),1)
                .requires(BvfItems.AUSTRALOHEROS_FACETUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.AUSTRALOHEROS_FACETUS.get()), has(BvfItems.AUSTRALOHEROS_FACETUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("australoheros_facetus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CICHLASOMA_BIMACULATUM_SPECIMEN.get(),1)
                .requires(BvfItems.CICHLASOMA_BIMACULATUM.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CICHLASOMA_BIMACULATUM.get()), has(BvfItems.CICHLASOMA_BIMACULATUM.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cichlasoma_bimaculatum_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.KROBIA_GUIANENSIS_SPECIMEN.get(),1)
                .requires(BvfItems.KROBIA_GUIANENSIS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.KROBIA_GUIANENSIS.get()), has(BvfItems.KROBIA_GUIANENSIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("krobia_guianensis_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.AEQUIDENS_TETRAMERUS_SPECIMEN.get(),1)
                .requires(BvfItems.AEQUIDENS_TETRAMERUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.AEQUIDENS_TETRAMERUS.get()), has(BvfItems.AEQUIDENS_TETRAMERUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("aequidens_tetramerus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.GYMNOGEOPHAGUS_BALZANII_SPECIMEN.get(),1)
                .requires(BvfItems.GYMNOGEOPHAGUS_BALZANII.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.GYMNOGEOPHAGUS_BALZANII.get()), has(BvfItems.GYMNOGEOPHAGUS_BALZANII.get()))
                .save(pWriter, BetterVannilaFishes.prefix("gymnogeophagus_balzanii_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.ASTRONOTUS_OCELLATUS_SPECIMEN.get(),1)
                .requires(BvfItems.ASTRONOTUS_OCELLATUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.ASTRONOTUS_OCELLATUS.get()), has(BvfItems.ASTRONOTUS_OCELLATUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("astronotus_ocellatus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CHANNA_MICROPELTES_SPECIMEN.get(),1)
                .requires(BvfItems.CHANNA_MICROPELTES.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CHANNA_MICROPELTES.get()), has(BvfItems.CHANNA_MICROPELTES.get()))
                .save(pWriter, BetterVannilaFishes.prefix("channa_micropeltes_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CHANNA_ARGUS_SPECIMEN.get(),1)
                .requires(BvfItems.CHANNA_ARGUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CHANNA_ARGUS.get()), has(BvfItems.CHANNA_ARGUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("channa_argus_specimen"));

        buildFoodProcessRecipes(pWriter, BvfItems.SPEARFISH.get(), BvfItems.COOKED_SPEARFISH.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.HUMBOLDT_SQUID.get(), BvfItems.COOKED_HUMBOLDT_SQUID.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.EPINEPHELUS_MELANOSTIGMA.get(),BvfItems.COOKED_EPINEPHELUS.get(),0.35f);
        buildFoodProcessRecipesWithSource(pWriter, BvfItems.CHANNA_MICROPELTES.get(), BvfItems.COOKED_CHANNA.get(), 0.35f);
        buildFoodProcessRecipesWithSource(pWriter, BvfItems.CHANNA_ARGUS.get(), BvfItems.COOKED_CHANNA.get(), 0.35f);
    }

    private static void buildFoodProcessRecipes(RecipeOutput recipeOutput, Item input, Item output, float xp) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 200)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, BetterVannilaFishes.prefix(getItemName(output) + "_smelting"));
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 100)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, BetterVannilaFishes.prefix(getItemName(output) + "_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 600)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, BetterVannilaFishes.prefix(getItemName(output) + "_campfire_cooking"));
    }

    private static void buildFoodProcessRecipesWithSource(RecipeOutput recipeOutput, Item input, Item output, float xp) {
        String outputName = getItemName(output);
        String inputName = getItemName(input);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 200)
                .unlockedBy(getHasName(input), has(input))
                .save(recipeOutput, BetterVannilaFishes.prefix(outputName + "_from_" + inputName + "_smelting"));
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 100)
                .unlockedBy(getHasName(input), has(input))
                .save(recipeOutput, BetterVannilaFishes.prefix(outputName + "_from_" + inputName + "_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 600)
                .unlockedBy(getHasName(input), has(input))
                .save(recipeOutput, BetterVannilaFishes.prefix(outputName + "_from_" + inputName + "_campfire_cooking"));
    }
}
