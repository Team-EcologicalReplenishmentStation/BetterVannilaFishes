package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class BvfRecipeProvider extends RecipeProvider {

    public BvfRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput pWriter) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.COD,1)
                .requires(BvfItems.GADUS_MORHUA.get())
                .unlockedBy(getHasName(BvfItems.GADUS_MORHUA.get()), has(BvfItems.GADUS_MORHUA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cod_from_gadus_morhua"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.COD,1)
                .requires(BvfItems.MELANOGRAMMUS_AEGLEFINUS.get())
                .unlockedBy(getHasName(BvfItems.MELANOGRAMMUS_AEGLEFINUS.get()), has(BvfItems.MELANOGRAMMUS_AEGLEFINUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cod_from_melanogrammus_aeglefinus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.COD,1)
                .requires(BvfItems.GADUS_MACROCEPHALUS.get())
                .unlockedBy(getHasName(BvfItems.GADUS_MACROCEPHALUS.get()), has(BvfItems.GADUS_MACROCEPHALUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cod_from_gadus_macrocephalus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.SALMON,1)
                .requires(BvfItems.PACIFIC_SALMON.get())
                .unlockedBy(getHasName(BvfItems.PACIFIC_SALMON.get()), has(BvfItems.PACIFIC_SALMON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("salmon_from_pacific_salmon"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH, 1)
                .requires(BvfItems.PTEROIS_VOLITANS.get())
                .unlockedBy(getHasName(BvfItems.PTEROIS_VOLITANS.get()), has(BvfItems.PTEROIS_VOLITANS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_pterois_volitans"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH, 1)
                .requires(BvfItems.PTEROIS_LUNULATA.get())
                .unlockedBy(getHasName(BvfItems.PTEROIS_LUNULATA.get()), has(BvfItems.PTEROIS_LUNULATA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_pterois_lunulata"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH, 1)
                .requires(BvfItems.PTEROIS_RADIATA.get())
                .unlockedBy(getHasName(BvfItems.PTEROIS_RADIATA.get()), has(BvfItems.PTEROIS_RADIATA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_pterois_radiata"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.SALMON,1)
                .requires(BvfItems.MALE_SALMON.get())
                .unlockedBy(getHasName(BvfItems.MALE_SALMON.get()), has(BvfItems.MALE_SALMON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("salmon_from_male_salmon"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.SALMON,1)
                .requires(BvfItems.FEMALE_SALMON.get())
                .unlockedBy(getHasName(BvfItems.FEMALE_SALMON.get()), has(BvfItems.FEMALE_SALMON.get()))
                .save(pWriter, BetterVannilaFishes.prefix("salmon_from_female_salmon"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.PUFFERFISH,1)
                .requires(BvfItems.TAKIFUGU_XANTHOPTERUS.get())
                .unlockedBy(getHasName(BvfItems.TAKIFUGU_XANTHOPTERUS.get()), has(BvfItems.TAKIFUGU_XANTHOPTERUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pufferfish_from_takifugu_xanthopterus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.PUFFERFISH,1)
                .requires(BvfItems.TAKIFUGU_OBSCURUS.get())
                .unlockedBy(getHasName(BvfItems.TAKIFUGU_OBSCURUS.get()), has(BvfItems.TAKIFUGU_OBSCURUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pufferfish_from_takifugu_obscurus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.PUFFERFISH,1)
                .requires(BvfItems.DIODON_HOLOCANTHUS.get())
                .unlockedBy(getHasName(BvfItems.DIODON_HOLOCANTHUS.get()), has(BvfItems.DIODON_HOLOCANTHUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pufferfish_from_diodon_holocanthus"));

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
                .requires(BvfItems.ACANTHURUS_LEUCOPAREIUS.get())
                .unlockedBy(getHasName(BvfItems.ACANTHURUS_LEUCOPAREIUS.get()), has(BvfItems.ACANTHURUS_LEUCOPAREIUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_acanthurus_leucopareius"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.ACANTHURUS_TRIOSTEGUS.get())
                .unlockedBy(getHasName(BvfItems.ACANTHURUS_TRIOSTEGUS.get()), has(BvfItems.ACANTHURUS_TRIOSTEGUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_acanthurus_triostegus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CICHLA_ORINOCENSIS.get())
                .unlockedBy(getHasName(BvfItems.CICHLA_ORINOCENSIS.get()), has(BvfItems.CICHLA_ORINOCENSIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_cichla_orinocensis"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CICHLA_JARIINA.get())
                .unlockedBy(getHasName(BvfItems.CICHLA_JARIINA.get()), has(BvfItems.CICHLA_JARIINA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_cichla_jariina"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CICHLA_KELBERI.get())
                .unlockedBy(getHasName(BvfItems.CICHLA_KELBERI.get()), has(BvfItems.CICHLA_KELBERI.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_cichla_kelberi"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CICHLA_PIQUITI.get())
                .unlockedBy(getHasName(BvfItems.CICHLA_PIQUITI.get()), has(BvfItems.CICHLA_PIQUITI.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_cichla_piquiti"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CICHLA_PINIMA.get())
                .unlockedBy(getHasName(BvfItems.CICHLA_PINIMA.get()), has(BvfItems.CICHLA_PINIMA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_cichla_pinima"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CICHLA_OCELLARIS.get())
                .unlockedBy(getHasName(BvfItems.CICHLA_OCELLARIS.get()), has(BvfItems.CICHLA_OCELLARIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_cichla_ocellaris"));
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
                .requires(BvfItems.AMPHIPRION_BIACULEATUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_BIACULEATUS.get()), has(BvfItems.AMPHIPRION_BIACULEATUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_biaculeatus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_POLYMNUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_POLYMNUS.get()), has(BvfItems.AMPHIPRION_POLYMNUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_polymnus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_THIELLEI.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_THIELLEI.get()), has(BvfItems.AMPHIPRION_THIELLEI.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_thiellei"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_PERCULA.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_PERCULA.get()), has(BvfItems.AMPHIPRION_PERCULA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_percula"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_PERIDERAION.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_PERIDERAION.get()), has(BvfItems.AMPHIPRION_PERIDERAION.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_perideraion"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_CLARKII.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_CLARKII.get()), has(BvfItems.AMPHIPRION_CLARKII.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_clarkii"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_BICINCTUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_BICINCTUS.get()), has(BvfItems.AMPHIPRION_BICINCTUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_bicinctus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_EPHIPPIUM.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_EPHIPPIUM.get()), has(BvfItems.AMPHIPRION_EPHIPPIUM.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_ephippium"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_CHRYSOPTERUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_CHRYSOPTERUS.get()), has(BvfItems.AMPHIPRION_CHRYSOPTERUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_chrysopterus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.AMPHIPRION_FRENATUS.get())
                .unlockedBy(getHasName(BvfItems.AMPHIPRION_FRENATUS.get()), has(BvfItems.AMPHIPRION_FRENATUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_amphiprion_frenatus"));
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
                .requires(BvfItems.BETTA_SIAMORIENTALIS.get())
                .unlockedBy(getHasName(BvfItems.BETTA_SIAMORIENTALIS.get()), has(BvfItems.BETTA_SIAMORIENTALIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_betta_siamorientalis"));
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
                .requires(BvfItems.BETTA_FUSCA.get())
                .unlockedBy(getHasName(BvfItems.BETTA_FUSCA.get()), has(BvfItems.BETTA_FUSCA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_betta_fusca"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.MYLOPHARYNGODON_PICEUS.get())
                .unlockedBy(getHasName(BvfItems.MYLOPHARYNGODON_PICEUS.get()), has(BvfItems.MYLOPHARYNGODON_PICEUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_mylopharyngodon_piceus"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.CTENOPHARYNGODON_IDELLA.get())
                .unlockedBy(getHasName(BvfItems.CTENOPHARYNGODON_IDELLA.get()), has(BvfItems.CTENOPHARYNGODON_IDELLA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_ctenopharyngodon_idella"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.HYPOPHTHALMICHTHYS_MOLITRIX.get())
                .unlockedBy(getHasName(BvfItems.HYPOPHTHALMICHTHYS_MOLITRIX.get()), has(BvfItems.HYPOPHTHALMICHTHYS_MOLITRIX.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_hypophthalmichthys_molitrix"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, Items.TROPICAL_FISH,1)
                .requires(BvfItems.HYPOPHTHALMICHTHYS_NOBILIS.get())
                .unlockedBy(getHasName(BvfItems.HYPOPHTHALMICHTHYS_NOBILIS.get()), has(BvfItems.HYPOPHTHALMICHTHYS_NOBILIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("tropical_fish_from_hypophthalmichthys_nobilis"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.GADUS_MORHUA_SPECIMEN.get(),1)
                .requires(BvfItems.GADUS_MORHUA.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.GADUS_MORHUA.get()), has(BvfItems.GADUS_MORHUA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("gadus_morhua_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.MELANOGRAMMUS_AEGLEFINUS_SPECIMEN.get(),1)
                .requires(BvfItems.MELANOGRAMMUS_AEGLEFINUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.MELANOGRAMMUS_AEGLEFINUS.get()), has(BvfItems.MELANOGRAMMUS_AEGLEFINUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("melanogrammus_aeglefinus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.GADUS_MACROCEPHALUS_SPECIMEN.get(),1)
                .requires(BvfItems.GADUS_MACROCEPHALUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.GADUS_MACROCEPHALUS.get()), has(BvfItems.GADUS_MACROCEPHALUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("gadus_macrocephalus_specimen"));
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.KAJIKIA_AUDAX_SPECIMEN.get(),1)
                .requires(BvfItems.KAJIKIA_AUDAX.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.KAJIKIA_AUDAX.get()), has(BvfItems.KAJIKIA_AUDAX.get()))
                .save(pWriter, BetterVannilaFishes.prefix("kajikia_audax_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.NEMATISTIUS_PECTORALIS_SPECIMEN.get(),1)
                .requires(BvfItems.NEMATISTIUS_PECTORALIS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.NEMATISTIUS_PECTORALIS.get()), has(BvfItems.NEMATISTIUS_PECTORALIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("nematistius_pectoralis_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.GALEOCERDO_CUVIER_SPECIMEN.get(),1)
                .requires(BvfItems.GALEOCERDO_CUVIER.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.GALEOCERDO_CUVIER.get()), has(BvfItems.GALEOCERDO_CUVIER.get()))
                .save(pWriter, BetterVannilaFishes.prefix("galeocerdo_cuvier_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.ALOPIAS_VULPINUS_SPECIMEN.get(), 1)
                .requires(BvfItems.ALOPIAS_VULPINUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.ALOPIAS_VULPINUS.get()), has(BvfItems.ALOPIAS_VULPINUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("alopias_vulpinus_specimen"));
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.EPINEPHELUS_TUKULA_SPECIMEN.get(),1)
                .requires(BvfItems.EPINEPHELUS_TUKULA.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.EPINEPHELUS_TUKULA.get()), has(BvfItems.EPINEPHELUS_TUKULA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("epinephelus_tukula_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CICHLA_ORINOCENSIS_SPECIMEN.get(),1)
                .requires(BvfItems.CICHLA_ORINOCENSIS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CICHLA_ORINOCENSIS.get()), has(BvfItems.CICHLA_ORINOCENSIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cichla_orinocensis_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CICHLA_JARIINA_SPECIMEN.get(),1)
                .requires(BvfItems.CICHLA_JARIINA.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CICHLA_JARIINA.get()), has(BvfItems.CICHLA_JARIINA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cichla_jariina_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CICHLA_KELBERI_SPECIMEN.get(),1)
                .requires(BvfItems.CICHLA_KELBERI.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CICHLA_KELBERI.get()), has(BvfItems.CICHLA_KELBERI.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cichla_kelberi_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CICHLA_PIQUITI_SPECIMEN.get(),1)
                .requires(BvfItems.CICHLA_PIQUITI.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CICHLA_PIQUITI.get()), has(BvfItems.CICHLA_PIQUITI.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cichla_piquiti_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CICHLA_PINIMA_SPECIMEN.get(),1)
                .requires(BvfItems.CICHLA_PINIMA.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CICHLA_PINIMA.get()), has(BvfItems.CICHLA_PINIMA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cichla_pinima_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CICHLA_OCELLARIS_SPECIMEN.get(),1)
                .requires(BvfItems.CICHLA_OCELLARIS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CICHLA_OCELLARIS.get()), has(BvfItems.CICHLA_OCELLARIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("cichla_ocellaris_specimen"));
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
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.MEGALOPS_ATLANTICUS_SPECIMEN.get(),1)
                .requires(BvfItems.MEGALOPS_ATLANTICUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.MEGALOPS_ATLANTICUS.get()), has(BvfItems.MEGALOPS_ATLANTICUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("megalops_atlanticus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.TAKIFUGU_OBSCURUS_SPECIMEN.get(),1)
                .requires(BvfItems.TAKIFUGU_OBSCURUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.TAKIFUGU_OBSCURUS.get()), has(BvfItems.TAKIFUGU_OBSCURUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("takifugu_obscurus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.PTEROIS_VOLITANS_SPECIMEN.get(), 1)
                .requires(BvfItems.PTEROIS_VOLITANS_BUCKET.get()).requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.PTEROIS_VOLITANS_BUCKET.get()), has(BvfItems.PTEROIS_VOLITANS_BUCKET.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pterois_volitans_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.PTEROIS_LUNULATA_SPECIMEN.get(), 1)
                .requires(BvfItems.PTEROIS_LUNULATA_BUCKET.get()).requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.PTEROIS_LUNULATA_BUCKET.get()), has(BvfItems.PTEROIS_LUNULATA_BUCKET.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pterois_lunulata_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.PTEROIS_RADIATA_SPECIMEN.get(), 1)
                .requires(BvfItems.PTEROIS_RADIATA_BUCKET.get()).requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.PTEROIS_RADIATA_BUCKET.get()), has(BvfItems.PTEROIS_RADIATA_BUCKET.get()))
                .save(pWriter, BetterVannilaFishes.prefix("pterois_radiata_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.TAKIFUGU_XANTHOPTERUS_SPECIMEN.get(),1)
                .requires(BvfItems.TAKIFUGU_XANTHOPTERUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.TAKIFUGU_XANTHOPTERUS.get()), has(BvfItems.TAKIFUGU_XANTHOPTERUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("takifugu_xanthopterus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.DIODON_HOLOCANTHUS_SPECIMEN.get(),1)
                .requires(BvfItems.DIODON_HOLOCANTHUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.DIODON_HOLOCANTHUS.get()), has(BvfItems.DIODON_HOLOCANTHUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("diodon_holocanthus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.KATSUWONUS_PELAMIS_SPECIMEN.get(),1)
                .requires(BvfItems.KATSUWONUS_PELAMIS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.KATSUWONUS_PELAMIS.get()), has(BvfItems.KATSUWONUS_PELAMIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("katsuwonus_pelamis_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.MYLOPHARYNGODON_PICEUS_SPECIMEN.get(),1)
                .requires(BvfItems.MYLOPHARYNGODON_PICEUS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.MYLOPHARYNGODON_PICEUS.get()), has(BvfItems.MYLOPHARYNGODON_PICEUS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("mylopharyngodon_piceus_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.CTENOPHARYNGODON_IDELLA_SPECIMEN.get(),1)
                .requires(BvfItems.CTENOPHARYNGODON_IDELLA.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.CTENOPHARYNGODON_IDELLA.get()), has(BvfItems.CTENOPHARYNGODON_IDELLA.get()))
                .save(pWriter, BetterVannilaFishes.prefix("ctenopharyngodon_idella_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.HYPOPHTHALMICHTHYS_MOLITRIX_SPECIMEN.get(),1)
                .requires(BvfItems.HYPOPHTHALMICHTHYS_MOLITRIX.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.HYPOPHTHALMICHTHYS_MOLITRIX.get()), has(BvfItems.HYPOPHTHALMICHTHYS_MOLITRIX.get()))
                .save(pWriter, BetterVannilaFishes.prefix("hypophthalmichthys_molitrix_specimen"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, BvfItems.HYPOPHTHALMICHTHYS_NOBILIS_SPECIMEN.get(),1)
                .requires(BvfItems.HYPOPHTHALMICHTHYS_NOBILIS.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(BvfItems.HYPOPHTHALMICHTHYS_NOBILIS.get()), has(BvfItems.HYPOPHTHALMICHTHYS_NOBILIS.get()))
                .save(pWriter, BetterVannilaFishes.prefix("hypophthalmichthys_nobilis_specimen"));

        addSpecimenRecipe(pWriter, BvfItems.DERMOCHELYS_CORIACEA, BvfItems.DERMOCHELYS_CORIACEA_SPECIMEN, "dermochelys_coriacea_specimen");

        addSpecimenRecipe(pWriter, BvfItems.BETTA_SPLENDENS, BvfItems.BETTA_SPLENDENS_SPECIMEN, "betta_splendens_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_SIAMORIENTALIS, BvfItems.BETTA_SIAMORIENTALIS_SPECIMEN, "betta_siamorientalis_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_SMARAGDINA, BvfItems.BETTA_SMARAGDINA_SPECIMEN, "betta_smaragdina_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_PICTA, BvfItems.BETTA_PICTA_SPECIMEN, "betta_picta_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_SIMPLEX, BvfItems.BETTA_SIMPLEX_SPECIMEN, "betta_simplex_specimen");
        addSpecimenRecipe(pWriter, BvfItems.BETTA_FUSCA, BvfItems.BETTA_FUSCA_SPECIMEN, "betta_fusca_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_ACHILLES, BvfItems.ACANTHURUS_ACHILLES_SPECIMEN, "acanthurus_achilles_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_LEUCOSTERNON, BvfItems.ACANTHURUS_LEUCOSTERNON_SPECIMEN, "acanthurus_leucosternon_specimen");
        addSpecimenRecipe(pWriter, BvfItems.PARACANTHURUS_HEPATUS, BvfItems.PARACANTHURUS_HEPATUS_SPECIMEN, "paracanthurus_hepatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_TRIOSTEGUS, BvfItems.ACANTHURUS_TRIOSTEGUS_SPECIMEN, "acanthurus_triostegus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_LEUCOPAREIUS, BvfItems.ACANTHURUS_LEUCOPAREIUS_SPECIMEN, "acanthurus_leucopareius_specimen");
        addSpecimenRecipe(pWriter, BvfItems.ACANTHURUS_LINEATUS, BvfItems.ACANTHURUS_LINEATUS_SPECIMEN, "acanthurus_lineatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_STRIATUS, BvfItems.CHAETODON_STRIATUS_SPECIMEN, "chaetodon_striatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_UNIMACULATUS, BvfItems.CHAETODON_UNIMACULATUS_SPECIMEN, "chaetodon_unimaculatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_AURIGA, BvfItems.CHAETODON_AURIGA_SPECIMEN, "chaetodon_auriga_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_XANTHURUS, BvfItems.CHAETODON_XANTHURUS_SPECIMEN, "chaetodon_xanthurus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_RETICULATUS, BvfItems.CHAETODON_RETICULATUS_SPECIMEN, "chaetodon_reticulatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.CHAETODON_SPECULUM, BvfItems.CHAETODON_SPECULUM_SPECIMEN, "chaetodon_speculum_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_OCELLARIS, BvfItems.AMPHIPRION_OCELLARIS_SPECIMEN, "amphiprion_ocellaris_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_BIACULEATUS, BvfItems.AMPHIPRION_BIACULEATUS_SPECIMEN, "amphiprion_biaculeatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_POLYMNUS, BvfItems.AMPHIPRION_POLYMNUS_SPECIMEN, "amphiprion_polymnus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_THIELLEI, BvfItems.AMPHIPRION_THIELLEI_SPECIMEN, "amphiprion_thiellei_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_PERCULA, BvfItems.AMPHIPRION_PERCULA_SPECIMEN, "amphiprion_percula_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_PERIDERAION, BvfItems.AMPHIPRION_PERIDERAION_SPECIMEN, "amphiprion_perideraion_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_CLARKII, BvfItems.AMPHIPRION_CLARKII_SPECIMEN, "amphiprion_clarkii_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_BICINCTUS, BvfItems.AMPHIPRION_BICINCTUS_SPECIMEN, "amphiprion_bicinctus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_EPHIPPIUM, BvfItems.AMPHIPRION_EPHIPPIUM_SPECIMEN, "amphiprion_ephippium_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_CHRYSOPTERUS, BvfItems.AMPHIPRION_CHRYSOPTERUS_SPECIMEN, "amphiprion_chrysopterus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_FRENATUS, BvfItems.AMPHIPRION_FRENATUS_SPECIMEN, "amphiprion_frenatus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_MCCULLOCHI, BvfItems.AMPHIPRION_MCCULLOCHI_SPECIMEN, "amphiprion_mccullochi_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_MELANOPUS, BvfItems.AMPHIPRION_MELANOPUS_SPECIMEN, "amphiprion_melanopus_specimen");
        addSpecimenRecipe(pWriter, BvfItems.AMPHIPRION_TRICINCTUS, BvfItems.AMPHIPRION_TRICINCTUS_SPECIMEN, "amphiprion_tricinctus_specimen");

        buildFoodProcessRecipes(pWriter, BvfItems.KAJIKIA_AUDAX.get(), BvfItems.COOKED_KAJIKIA_AUDAX.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.NEMATISTIUS_PECTORALIS.get(), BvfItems.COOKED_NEMATISTIUS_PECTORALIS.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.ALOPIAS_VULPINUS.get(), BvfItems.COOKED_ALOPIAS_VULPINUS.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.HUMBOLDT_SQUID.get(), BvfItems.COOKED_HUMBOLDT_SQUID.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.EPINEPHELUS_TUKULA.get(),BvfItems.COOKED_EPINEPHELUS.get(),0.35f);
        buildFoodProcessRecipesWithSource(pWriter, BvfItems.CHANNA_MICROPELTES.get(), BvfItems.COOKED_CHANNA.get(), 0.35f);
        buildFoodProcessRecipesWithSource(pWriter, BvfItems.CHANNA_ARGUS.get(), BvfItems.COOKED_CHANNA.get(), 0.35f);
        buildFoodProcessRecipesWithSource(pWriter, BvfItems.ELOPICHTHYS_BAMBUSA.get(), BvfItems.COOKED_ELOPICHTHYS_BAMBUSA.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.HUSO_DAURICUS.get(), BvfItems.COOKED_HUSO_DAURICUS.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.MYLOPHARYNGODON_PICEUS.get(), BvfItems.COOKED_MYLOPHARYNGODON_PICEUS.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.CTENOPHARYNGODON_IDELLA.get(), BvfItems.COOKED_CTENOPHARYNGODON_IDELLA.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.HYPOPHTHALMICHTHYS_MOLITRIX.get(), BvfItems.COOKED_HYPOPHTHALMICHTHYS_MOLITRIX.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.HYPOPHTHALMICHTHYS_NOBILIS.get(), BvfItems.COOKED_HYPOPHTHALMICHTHYS_NOBILIS.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.NEGAPRION_ACUTIDENS.get(), BvfItems.COOKED_NEGAPRION_ACUTIDENS.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.NEGAPRION_BREVIROSTRIS.get(), BvfItems.COOKED_NEGAPRION_BREVIROSTRIS.get(), 0.35f);
        buildFoodProcessRecipes(pWriter, BvfItems.KATSUWONUS_PELAMIS.get(), BvfItems.COOKED_KATSUWONUS_PELAMIS.get(), 0.35f);
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

    private static void addSpecimenRecipe(RecipeOutput pWriter, DeferredHolder<Item, Item> rawFish, DeferredHolder<Item, Item> specimen, String recipeName) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, specimen.get(), 1)
                .requires(rawFish.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(rawFish.get()), has(rawFish.get()))
                .save(pWriter, BetterVannilaFishes.prefix(recipeName));
    }
}
