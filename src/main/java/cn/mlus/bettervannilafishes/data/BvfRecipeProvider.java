package cn.mlus.bettervannilafishes.data;

import cn.aurorian.ers.EcologicalReplenishmentStation;
import cn.aurorian.ers.init.ErsItems;
import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.ConditionalRecipe;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.registries.RegistryObject;
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
                .requires(BvfItems.ELOPICHTHYS_BAMBUSA.get())
                .unlockedBy(getHasName(BvfItems.ELOPICHTHYS_BAMBUSA.get()), has(BvfItems.ELOPICHTHYS_BAMBUSA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_elopichthys_bambusa"));
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_AKINDYNOS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_AKINDYNOS.get()), has(BvfItems.AMPHIPRION_AKINDYNOS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_akindynos"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_BICINCTUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_BICINCTUS.get()), has(BvfItems.AMPHIPRION_BICINCTUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_bicinctus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_CHRYSOGASTER.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_CHRYSOGASTER.get()), has(BvfItems.AMPHIPRION_CHRYSOGASTER.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_chrysogaster"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_CHRYSOPTERUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_CHRYSOPTERUS.get()), has(BvfItems.AMPHIPRION_CHRYSOPTERUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_chrysopterus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_LATEZONATUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_LATEZONATUS.get()), has(BvfItems.AMPHIPRION_LATEZONATUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_latezonatus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_MCCULLOCHI.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_MCCULLOCHI.get()), has(BvfItems.AMPHIPRION_MCCULLOCHI.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_mccullochi"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_MELANOPUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_MELANOPUS.get()), has(BvfItems.AMPHIPRION_MELANOPUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_melanopus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_TRICINCTUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_TRICINCTUS.get()), has(BvfItems.AMPHIPRION_TRICINCTUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_tricinctus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.BETTA_SPLENDENS.get())
                .unlockedBy(getHasName(BvfItems.BETTA_SPLENDENS.get()), has(BvfItems.BETTA_SPLENDENS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_betta_splendens"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.BETTA_IMBELLIS.get())
                .unlockedBy(getHasName(BvfItems.BETTA_IMBELLIS.get()), has(BvfItems.BETTA_IMBELLIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_betta_imbellis"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.BETTA_SMARAGDINA.get())
                .unlockedBy(getHasName(BvfItems.BETTA_SMARAGDINA.get()), has(BvfItems.BETTA_SMARAGDINA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_betta_smaragdina"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.BETTA_PICTA.get())
                .unlockedBy(getHasName(BvfItems.BETTA_PICTA.get()), has(BvfItems.BETTA_PICTA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_betta_picta"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.BETTA_SIMPLEX.get())
                .unlockedBy(getHasName(BvfItems.BETTA_SIMPLEX.get()), has(BvfItems.BETTA_SIMPLEX.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_betta_simplex"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.BETTA_BROWNORUM.get())
                .unlockedBy(getHasName(BvfItems.BETTA_BROWNORUM.get()), has(BvfItems.BETTA_BROWNORUM.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_betta_brownorum"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.BLACK_CARP.get())
                .unlockedBy(getHasName(BvfItems.BLACK_CARP.get()), has(BvfItems.BLACK_CARP.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_black_carp"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.GRASS_CARP.get())
                .unlockedBy(getHasName(BvfItems.GRASS_CARP.get()), has(BvfItems.GRASS_CARP.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_grass_carp"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.SILVER_CARP.get())
                .unlockedBy(getHasName(BvfItems.SILVER_CARP.get()), has(BvfItems.SILVER_CARP.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_silver_carp"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.BIGHEAD_CARP.get())
                .unlockedBy(getHasName(BvfItems.BIGHEAD_CARP.get()), has(BvfItems.BIGHEAD_CARP.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_bighead_carp"));

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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.NEGAPRION_ACUTIDENS_SPECIMEN.get(),1)
                .requires(BvfItems.NEGAPRION_ACUTIDENS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.NEGAPRION_ACUTIDENS.get()), has(BvfItems.NEGAPRION_ACUTIDENS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("negaprion_acutidens_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.NEGAPRION_BREVIROSTRIS_SPECIMEN.get(),1)
                .requires(BvfItems.NEGAPRION_BREVIROSTRIS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.NEGAPRION_BREVIROSTRIS.get()), has(BvfItems.NEGAPRION_BREVIROSTRIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("negaprion_brevirostris_specimen"));
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.ELOPICHTHYS_BAMBUSA_SPECIMEN.get(),1)
                .requires(BvfItems.ELOPICHTHYS_BAMBUSA.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.ELOPICHTHYS_BAMBUSA.get()), has(BvfItems.ELOPICHTHYS_BAMBUSA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("elopichthys_bambusa_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.HUSO_DAURICUS_SPECIMEN.get(),1)
                .requires(BvfItems.HUSO_DAURICUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.HUSO_DAURICUS.get()), has(BvfItems.HUSO_DAURICUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("huso_dauricus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.MEGALOPS_ATLANTICUS_SPECIMEN.get(),1)
                .requires(BvfItems.MEGALOPS_ATLANTICUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.MEGALOPS_ATLANTICUS.get()), has(BvfItems.MEGALOPS_ATLANTICUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("megalops_atlanticus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.BLACK_CARP_SPECIMEN.get(),1)
                .requires(BvfItems.BLACK_CARP.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.BLACK_CARP.get()), has(BvfItems.BLACK_CARP.get()))
                .save(pWriter, BetterVannilaFishes.prefix("black_carp_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.GRASS_CARP_SPECIMEN.get(),1)
                .requires(BvfItems.GRASS_CARP.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.GRASS_CARP.get()), has(BvfItems.GRASS_CARP.get()))
                .save(pWriter, BetterVannilaFishes.prefix("grass_carp_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.SILVER_CARP_SPECIMEN.get(),1)
                .requires(BvfItems.SILVER_CARP.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.SILVER_CARP.get()), has(BvfItems.SILVER_CARP.get()))
                .save(pWriter, BetterVannilaFishes.prefix("silver_carp_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.BIGHEAD_CARP_SPECIMEN.get(),1)
                .requires(BvfItems.BIGHEAD_CARP.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.BIGHEAD_CARP.get()), has(BvfItems.BIGHEAD_CARP.get()))
                .save(pWriter, BetterVannilaFishes.prefix("bighead_carp_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.OBSCURE_PUFFER_SPECIMEN.get(),1)
                .requires(BvfItems.OBSCURE_PUFFER.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.OBSCURE_PUFFER.get()), has(BvfItems.OBSCURE_PUFFER.get()))
                .save(pWriter, BetterVannilaFishes.prefix("obscure_puffer_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.YELLOW_FIN_PUFFER_SPECIMEN.get(),1)
                .requires(BvfItems.YELLOW_FIN_PUFFER.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.YELLOW_FIN_PUFFER.get()), has(BvfItems.YELLOW_FIN_PUFFER.get()))
                .save(pWriter, BetterVannilaFishes.prefix("yellow_fin_puffer_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.PORCUPINE_FISH_SPECIMEN.get(),1)
                .requires(BvfItems.PORCUPINE_FISH.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.PORCUPINE_FISH.get()), has(BvfItems.PORCUPINE_FISH.get()))
                .save(pWriter, BetterVannilaFishes.prefix("porcupine_fish_specimen"));

        buildFoodProcessRecipes(pWriter, BvfItems.SPEARFISH.get(), BvfItems.COOKED_SPEARFISH.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.HUMBOLDT_SQUID.get(), BvfItems.COOKED_HUMBOLDT_SQUID.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.EPINEPHELUS_MELANOSTIGMA.get(),BvfItems.COOKED_EPINEPHELUS.get(),0.35f);
        buildFoodProcessRecipesWithSource(pWriter, BvfItems.CHANNA_MICROPELTES.get(), BvfItems.COOKED_CHANNA.get(), 0.35f);
        buildFoodProcessRecipesWithSource(pWriter, BvfItems.CHANNA_ARGUS.get(), BvfItems.COOKED_CHANNA.get(), 0.35f);
        buildFoodProcessRecipesWithSource(pWriter, BvfItems.ELOPICHTHYS_BAMBUSA.get(), BvfItems.COOKED_ELOPICHTHYS_BAMBUSA.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.HUSO_DAURICUS.get(), BvfItems.COOKED_HUSO_DAURICUS.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.BLACK_CARP.get(), BvfItems.COOKED_BLACK_CARP.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.GRASS_CARP.get(), BvfItems.COOKED_GRASS_CARP.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.SILVER_CARP.get(), BvfItems.COOKED_SILVER_CARP.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.BIGHEAD_CARP.get(), BvfItems.COOKED_BIGHEAD_CARP.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.NEGAPRION_ACUTIDENS.get(), BvfItems.COOKED_NEGAPRION_ACUTIDENS.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.NEGAPRION_BREVIROSTRIS.get(), BvfItems.COOKED_NEGAPRION_BREVIROSTRIS.get(), 0.35f);

        buildErsRecipe(ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ErsItems.FISH_FILLET.get(), 7)
                .requires(BvfItems.SPEARFISH.get())
                .unlockedBy(getHasName(BvfItems.SPEARFISH.get()),has(BvfItems.SPEARFISH.get())),"fish_fillet_from_spearfish")
                .build(pWriter,BetterVannilaFishes.prefix("fish_fillet_from_spearfish"));
        buildErsRecipe(ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ErsItems.FISH_FILLET.get(), 10)
                .requires(BvfItems.GALEOCERDO_CUVIER.get())
                .unlockedBy(getHasName(BvfItems.SPEARFISH.get()),has(BvfItems.GALEOCERDO_CUVIER.get())),"fish_fillet_from_tiger_shark")
                .build(pWriter,BetterVannilaFishes.prefix("fish_fillet_from_tiger_shark"));
        buildErsRecipe(ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ErsItems.FISH_FILLET.get(), 10)
                .requires(BvfItems.EPINEPHELUS_LANCEOLATUS.get())
                .unlockedBy(getHasName(BvfItems.EPINEPHELUS_LANCEOLATUS.get()), has(BvfItems.EPINEPHELUS_LANCEOLATUS.get())),"fish_fillet_from_epinephelus_lanceolatus")
                .build(pWriter,BetterVannilaFishes.prefix("fish_fillet_from_epinephelus_lanceolatus"));
        buildErsRecipe(ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ErsItems.FISH_FILLET.get(), 10)
                .requires(BvfItems.EPINEPHELUS_ITAJARA.get())
                .unlockedBy(getHasName(BvfItems.EPINEPHELUS_ITAJARA.get()), has(BvfItems.EPINEPHELUS_ITAJARA.get())),"fish_fillet_from_epinephelus_itajara")
                .build(pWriter,BetterVannilaFishes.prefix("fish_fillet_from_epinephelus_itajara"));
        buildErsRecipe(ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ErsItems.FISH_FILLET.get(), 10)
                .requires(BvfItems.EPINEPHELUS_MELANOSTIGMA.get())
                .unlockedBy(getHasName(BvfItems.EPINEPHELUS_MELANOSTIGMA.get()), has(BvfItems.EPINEPHELUS_MELANOSTIGMA.get())),"fish_fillet_from_epinephelus_melanostigma")
                .build(pWriter,BetterVannilaFishes.prefix("fish_fillet_from_epinephelus_melanostigma"));
        buildErsRecipe(ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ErsItems.FISH_FILLET.get(), 10)
                .requires(BvfItems.NEGAPRION_ACUTIDENS.get())
                .unlockedBy(getHasName(BvfItems.NEGAPRION_ACUTIDENS.get()), has(BvfItems.NEGAPRION_ACUTIDENS.get())),"fish_fillet_from_negaprion_acutidens")
                .build(pWriter,BetterVannilaFishes.prefix("fish_fillet_from_negaprion_acutidens"));
        buildErsRecipe(ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ErsItems.FISH_FILLET.get(), 10)
                .requires(BvfItems.NEGAPRION_BREVIROSTRIS.get())
                .unlockedBy(getHasName(BvfItems.NEGAPRION_BREVIROSTRIS.get()), has(BvfItems.NEGAPRION_BREVIROSTRIS.get())),"fish_fillet_from_negaprion_brevirostris")
                .build(pWriter,BetterVannilaFishes.prefix("fish_fillet_from_negaprion_brevirostris"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.KATSUWONUS_PELAMIS_SPECIMEN.get(),1)
                .requires(BvfItems.KATSUWONUS_PELAMIS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.KATSUWONUS_PELAMIS.get()), has(BvfItems.KATSUWONUS_PELAMIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("katsuwonus_pelamis_specimen"));

        addSpecimenRecipe(pWriter, BvfItems.BETTA_SPLENDENS, BvfItems.BETTA_SPLENDENS_SPECIMEN, "betta_splendens_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_IMBELLIS, BvfItems.BETTA_IMBELLIS_SPECIMEN, "betta_imbellis_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_SMARAGDINA, BvfItems.BETTA_SMARAGDINA_SPECIMEN, "betta_smaragdina_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_PICTA, BvfItems.BETTA_PICTA_SPECIMEN, "betta_picta_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_SIMPLEX, BvfItems.BETTA_SIMPLEX_SPECIMEN, "betta_simplex_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_BROWNORUM, BvfItems.BETTA_BROWNORUM_SPECIMEN, "betta_brownorum_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_ACHILLES, BvfItems.ACANTHURUS_ACHILLES_SPECIMEN, "acanthurus_achilles_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_LEUCOSTERNON, BvfItems.ACANTHURUS_LEUCOSTERNON_SPECIMEN, "acanthurus_leucosternon_specimen");
        addSpecimenRecipe(pWriter, BvfItems.PARACANTHURUS_HEPATUS, BvfItems.PARACANTHURUS_HEPATUS_SPECIMEN, "paracanthurus_hepatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_TRIOSTEGUS, BvfItems.ACANTHURUS_TRIOSTEGUS_SPECIMEN, "acanthurus_triostegus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_NIGRICANS, BvfItems.ACANTHURUS_NIGRICANS_SPECIMEN, "acanthurus_nigricans_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_LINEATUS, BvfItems.ACANTHURUS_LINEATUS_SPECIMEN, "acanthurus_lineatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_STRIATUS, BvfItems.CHAETODON_STRIATUS_SPECIMEN, "chaetodon_striatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_UNIMACULATUS, BvfItems.CHAETODON_UNIMACULATUS_SPECIMEN, "chaetodon_unimaculatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_AURIGA, BvfItems.CHAETODON_AURIGA_SPECIMEN, "chaetodon_auriga_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_COLLARE, BvfItems.CHAETODON_COLLARE_SPECIMEN, "chaetodon_collare_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_RETICULATUS, BvfItems.CHAETODON_RETICULATUS_SPECIMEN, "chaetodon_reticulatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_SPECULUM, BvfItems.CHAETODON_SPECULUM_SPECIMEN, "chaetodon_speculum_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_OCELLARIS, BvfItems.AMPHIPRION_OCELLARIS_SPECIMEN, "amphiprion_ocellaris_specimen");
        addSpecimenRecipe(pWriter, BvfItems.PREMNAS_BIACULEATUS, BvfItems.PREMNAS_BIACULEATUS_SPECIMEN, "premnas_biaculeatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_POLYMNUS, BvfItems.AMPHIPRION_POLYMNUS_SPECIMEN, "amphiprion_polymnus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_PERIDERAION, BvfItems.AMPHIPRION_PERIDERAION_SPECIMEN, "amphiprion_perideraion_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_CLARKII, BvfItems.AMPHIPRION_CLARKII_SPECIMEN, "amphiprion_clarkii_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_PERCULA, BvfItems.AMPHIPRION_PERCULA_SPECIMEN, "amphiprion_percula_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_AKINDYNOS, BvfItems.AMPHIPRION_AKINDYNOS_SPECIMEN, "amphiprion_akindynos_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_BICINCTUS, BvfItems.AMPHIPRION_BICINCTUS_SPECIMEN, "amphiprion_bicinctus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_CHRYSOGASTER, BvfItems.AMPHIPRION_CHRYSOGASTER_SPECIMEN, "amphiprion_chrysogaster_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_CHRYSOPTERUS, BvfItems.AMPHIPRION_CHRYSOPTERUS_SPECIMEN, "amphiprion_chrysopterus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_LATEZONATUS, BvfItems.AMPHIPRION_LATEZONATUS_SPECIMEN, "amphiprion_latezonatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_MCCULLOCHI, BvfItems.AMPHIPRION_MCCULLOCHI_SPECIMEN, "amphiprion_mccullochi_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_MELANOPUS, BvfItems.AMPHIPRION_MELANOPUS_SPECIMEN, "amphiprion_melanopus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_TRICINCTUS, BvfItems.AMPHIPRION_TRICINCTUS_SPECIMEN, "amphiprion_tricinctus_specimen");

        buildFoodProcessRecipes(pWriter, BvfItems.KATSUWONUS_PELAMIS.get(), BvfItems.COOKED_KATSUWONUS_PELAMIS.get(), 0.35f);

        buildErsRecipe(ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ErsItems.FISH_FILLET.get(), 5)
                .requires(BvfItems.KATSUWONUS_PELAMIS.get())
                .unlockedBy(getHasName(BvfItems.KATSUWONUS_PELAMIS.get()), has(BvfItems.KATSUWONUS_PELAMIS.get())),"fish_fillet_from_katsuwonus_pelamis")
                .build(pWriter,BetterVannilaFishes.prefix("fish_fillet_from_katsuwonus_pelamis"));
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

    private static void buildFoodProcessRecipesWithSource(Consumer<FinishedRecipe> recipeOutput, Item input, Item output, float xp) {
        String outputName = getItemName(output);
        String inputName = getItemName(input);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 200)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, BetterVannilaFishes.prefix(outputName + "_from_" + inputName + "_smelting"));
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 100)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, BetterVannilaFishes.prefix(outputName + "_from_" + inputName + "_smoking"));
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(input), RecipeCategory.FOOD, output, xp, 600)
                .unlockedBy(getHasName(input), has(input)).save(recipeOutput, BetterVannilaFishes.prefix(outputName + "_from_" + inputName + "_campfire_cooking"));
    }

    private static void addSpecimenRecipe(Consumer<FinishedRecipe> pWriter, RegistryObject<Item> rawFish, RegistryObject<Item> specimen, String recipeName) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, specimen.get(), 1)
                .requires(rawFish.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(rawFish.get()), has(rawFish.get()))
                .save(pWriter, BetterVannilaFishes.prefix(recipeName));
    }
}
