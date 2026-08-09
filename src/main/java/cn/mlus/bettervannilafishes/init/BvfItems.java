package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.item.EnchantedPuffer;
import cn.mlus.bettervannilafishes.item.RawFishItem;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.MobBucketItem;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BvfItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            BetterVannilaFishes.MODID);
    //Bucket
    public static final RegistryObject<Item> HADDOCK_COD_BUCKET = ITEMS.register("haddock_cod_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_HADDOCK_COD,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ATLANTIC_COD_BUCKET = ITEMS.register("atlantic_cod_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_ATLANTIC_COD,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> PACIFIC_COD_BUCKET = ITEMS.register("pacific_cod_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_PACIFIC_COD,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> MALE_SALMON_BUCKET = ITEMS.register("male_salmon_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_SALMON_MALE,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> FEMALE_SALMON_BUCKET = ITEMS.register("female_salmon_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_SALMON_FEMALE,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> PACIFIC_SALMON_BUCKET = ITEMS.register("pacific_salmon_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_SALMON_PACIFIC,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> YELLOW_FIN_PUFFER_BUCKET = ITEMS.register("yellow_fin_puffer_bucket",
            () -> new MobBucketItem(
                    BvfEntities.YELLOW_FIN_PUFFER,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> OBSCURE_PUFFER_BUCKET = ITEMS.register("obscure_puffer_bucket",
            () -> new MobBucketItem(
                    BvfEntities.OBSCURE_PUFFER,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> SOARING_LIONFISH_BUCKET = ITEMS.register("soaring_lionfish_bucket",
            () -> new MobBucketItem(BvfEntities.SOARING_LIONFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RINGED_LIONFISH_BUCKET = ITEMS.register("ringed_lionfish_bucket",
            () -> new MobBucketItem(BvfEntities.RINGED_LIONFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RADIANT_LIONFISH_BUCKET = ITEMS.register("radiant_lionfish_bucket",
            () -> new MobBucketItem(BvfEntities.RADIANT_LIONFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PORCUPINE_FISH_BUCKET = ITEMS.register("porcupine_fish_bucket",
            () -> new MobBucketItem(
                    BvfEntities.PORCUPINE_FISH,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> NAUTILUS_BUCKET = ITEMS.register("nautilus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.NAUTILUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> FEATHER_STAR_BUCKET = ITEMS.register("feather_star_bucket",
            () -> new MobBucketItem(
                    BvfEntities.FEATHER_STAR,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ZHIKONG_SCALLOP_BUCKET = ITEMS.register("zhikong_scallop_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ZHIKONG_SCALLOP,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> BAY_SCALLOP_BUCKET = ITEMS.register("bay_scallop_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BAY_SCALLOP,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> YESSO_SCALLOP_BUCKET = ITEMS.register("yesso_scallop_bucket",
            () -> new MobBucketItem(
                    BvfEntities.YESSO_SCALLOP,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> SPEARFISH_BUCKET = ITEMS.register("spearfish_bucket",
            () -> new MobBucketItem(
                    BvfEntities.SPEARFISH,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ROOSTERFISH_BUCKET = ITEMS.register("roosterfish_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ROOSTERFISH,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> GALEOCERDO_CUVIER_BUCKET = ITEMS.register("galeocerdo_cuvier_bucket",
            () -> new MobBucketItem(
                    BvfEntities.GALEOCERDO_CUVIER,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ALOPIAS_VULPINUS_BUCKET = ITEMS.register("alopias_vulpinus_bucket",
            () -> new MobBucketItem(BvfEntities.ALOPIAS_VULPINUS, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NEGAPRION_ACUTIDENS_BUCKET = ITEMS.register("negaprion_acutidens_bucket",
            () -> new MobBucketItem(
                    BvfEntities.NEGAPRION_ACUTIDENS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> NEGAPRION_BREVIROSTRIS_BUCKET = ITEMS.register("negaprion_brevirostris_bucket",
            () -> new MobBucketItem(
                    BvfEntities.NEGAPRION_BREVIROSTRIS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> EPINEPHELUS_LANCEOLATUS_BUCKET = ITEMS.register("epinephelus_lanceolatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.EPINEPHELUS_LANCEOLATUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> EPINEPHELUS_ITAJARA_BUCKET = ITEMS.register("epinephelus_itajara_bucket",
            () -> new MobBucketItem(
                    BvfEntities.EPINEPHELUS_ITAJARA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> EPINEPHELUS_MELANOSTIGMA_BUCKET = ITEMS.register("epinephelus_melanostigma_bucket",
            () -> new MobBucketItem(
                    BvfEntities.EPINEPHELUS_MELANOSTIGMA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> DOSIDICUS_GIGAS_BUCKET = ITEMS.register("dosidicus_gigas_bucket",
            () -> new MobBucketItem(
                    BvfEntities.DOSIDICUS_GIGAS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ACANTHURUS_ACHILLES_BUCKET = ITEMS.register("acanthurus_achilles_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ACANTHURUS_ACHILLES,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ACANTHURUS_LEUCOSTERNON_BUCKET = ITEMS.register("acanthurus_leucosternon_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ACANTHURUS_LEUCOSTERNON,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> PARACANTHURUS_HEPATUS_BUCKET = ITEMS.register("paracanthurus_hepatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.PARACANTHURUS_HEPATUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ACANTHURUS_TRIOSTEGUS_BUCKET = ITEMS.register("acanthurus_triostegus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ACANTHURUS_TRIOSTEGUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ACANTHURUS_NIGRICANS_BUCKET = ITEMS.register("acanthurus_nigricans_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ACANTHURUS_NIGRICANS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ACANTHURUS_LINEATUS_BUCKET = ITEMS.register("acanthurus_lineatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ACANTHURUS_LINEATUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CHAETODON_STRIATUS_BUCKET = ITEMS.register("chaetodon_striatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CHAETODON_STRIATUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CHAETODON_UNIMACULATUS_BUCKET = ITEMS.register("chaetodon_unimaculatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CHAETODON_UNIMACULATUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CHAETODON_AURIGA_BUCKET = ITEMS.register("chaetodon_auriga_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CHAETODON_AURIGA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CHAETODON_COLLARE_BUCKET = ITEMS.register("chaetodon_collare_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CHAETODON_COLLARE,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CHAETODON_RETICULATUS_BUCKET = ITEMS.register("chaetodon_reticulatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CHAETODON_RETICULATUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CHAETODON_SPECULUM_BUCKET = ITEMS.register("chaetodon_speculum_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CHAETODON_SPECULUM,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AUSTRALOHEROS_FACETUS_BUCKET = ITEMS.register("australoheros_facetus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AUSTRALOHEROS_FACETUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CICHLASOMA_BIMACULATUM_BUCKET = ITEMS.register("cichlasoma_bimaculatum_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CICHLASOMA_BIMACULATUM,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> KROBIA_GUIANENSIS_BUCKET = ITEMS.register("krobia_guianensis_bucket",
            () -> new MobBucketItem(
                    BvfEntities.KROBIA_GUIANENSIS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AEQUIDENS_TETRAMERUS_BUCKET = ITEMS.register("aequidens_tetramerus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AEQUIDENS_TETRAMERUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> GYMNOGEOPHAGUS_BALZANII_BUCKET = ITEMS.register("gymnogeophagus_balzanii_bucket",
            () -> new MobBucketItem(
                    BvfEntities.GYMNOGEOPHAGUS_BALZANII,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ASTRONOTUS_OCELLATUS_BUCKET = ITEMS.register("astronotus_ocellatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ASTRONOTUS_OCELLATUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CHANNA_MICROPELTES_BUCKET = ITEMS.register("channa_micropeltes_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CHANNA_MICROPELTES,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CHANNA_ARGUS_BUCKET = ITEMS.register("channa_argus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CHANNA_ARGUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> ELOPICHTHYS_BAMBUSA_BUCKET = ITEMS.register("elopichthys_bambusa_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ELOPICHTHYS_BAMBUSA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> HUSO_DAURICUS_BUCKET = ITEMS.register("huso_dauricus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.HUSO_DAURICUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> BLACK_CARP_BUCKET = ITEMS.register("black_carp_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BLACK_CARP,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> GRASS_CARP_BUCKET = ITEMS.register("grass_carp_bucket",
            () -> new MobBucketItem(
                    BvfEntities.GRASS_CARP,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> SILVER_CARP_BUCKET = ITEMS.register("silver_carp_bucket",
            () -> new MobBucketItem(
                    BvfEntities.SILVER_CARP,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> BIGHEAD_CARP_BUCKET = ITEMS.register("bighead_carp_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BIGHEAD_CARP,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> KATSUWONUS_PELAMIS_BUCKET = ITEMS.register("katsuwonus_pelamis_bucket",
            () -> new MobBucketItem(
                    BvfEntities.KATSUWONUS_PELAMIS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_OCELLARIS_BUCKET = ITEMS.register("amphiprion_ocellaris_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_OCELLARIS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> PREMNAS_BIACULEATUS_BUCKET = ITEMS.register("premnas_biaculeatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.PREMNAS_BIACULEATUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_POLYMNUS_BUCKET = ITEMS.register("amphiprion_polymnus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_POLYMNUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_PERIDERAION_BUCKET = ITEMS.register("amphiprion_perideraion_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_PERIDERAION,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_CLARKII_BUCKET = ITEMS.register("amphiprion_clarkii_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_CLARKII,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_PERCULA_BUCKET = ITEMS.register("amphiprion_percula_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_PERCULA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_AKINDYNOS_BUCKET = ITEMS.register("amphiprion_akindynos_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_AKINDYNOS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_BICINCTUS_BUCKET = ITEMS.register("amphiprion_bicinctus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_BICINCTUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOGASTER_BUCKET = ITEMS.register("amphiprion_chrysogaster_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_CHRYSOGASTER,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOPTERUS_BUCKET = ITEMS.register("amphiprion_chrysopterus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_CHRYSOPTERUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_LATEZONATUS_BUCKET = ITEMS.register("amphiprion_latezonatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_LATEZONATUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_MCCULLOCHI_BUCKET = ITEMS.register("amphiprion_mccullochi_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_MCCULLOCHI,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_MELANOPUS_BUCKET = ITEMS.register("amphiprion_melanopus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_MELANOPUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_TRICINCTUS_BUCKET = ITEMS.register("amphiprion_tricinctus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_TRICINCTUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> BETTA_SPLENDENS_BUCKET = ITEMS.register("betta_splendens_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BETTA_SPLENDENS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> BETTA_IMBELLIS_BUCKET = ITEMS.register("betta_imbellis_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BETTA_IMBELLIS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> BETTA_SMARAGDINA_BUCKET = ITEMS.register("betta_smaragdina_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BETTA_SMARAGDINA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> BETTA_PICTA_BUCKET = ITEMS.register("betta_picta_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BETTA_PICTA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> BETTA_SIMPLEX_BUCKET = ITEMS.register("betta_simplex_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BETTA_SIMPLEX,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> BETTA_BROWNORUM_BUCKET = ITEMS.register("betta_brownorum_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BETTA_BROWNORUM,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> MEGALOPS_ATLANTICUS_BUCKET = ITEMS.register("megalops_atlanticus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.MEGALOPS_ATLANTICUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    //Spawn Egg
    public static final RegistryObject<Item> HADDOCK_COD_SPAWN_EGG = ITEMS.register("haddock_cod_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BVC_HADDOCK_COD,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ATLANTIC_COD_SPAWN_EGG = ITEMS.register("atlantic_cod_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BVC_ATLANTIC_COD,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> PACIFIC_COD_SPAWN_EGG = ITEMS.register("pacific_cod_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BVC_PACIFIC_COD,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> MALE_SALMON_SPAWN_EGG = ITEMS.register("male_salmon_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BVC_SALMON_MALE,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> FEMALE_SALMON_SPAWN_EGG = ITEMS.register("female_salmon_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BVC_SALMON_FEMALE,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> PACIFIC_SALMON_SPAWN_EGG = ITEMS.register("pacific_salmon_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BVC_SALMON_PACIFIC,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> YELLOW_FIN_PUFFER_SPAWN_EGG = ITEMS.register("yellow_fin_puffer_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.YELLOW_FIN_PUFFER,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> OBSCURE_PUFFER_SPAWN_EGG = ITEMS.register("obscure_puffer_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.OBSCURE_PUFFER,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> SOARING_LIONFISH_SPAWN_EGG = ITEMS.register("soaring_lionfish_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.SOARING_LIONFISH,
                    0xFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> RINGED_LIONFISH_SPAWN_EGG = ITEMS.register("ringed_lionfish_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.RINGED_LIONFISH,
                    0xFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> RADIANT_LIONFISH_SPAWN_EGG = ITEMS.register("radiant_lionfish_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.RADIANT_LIONFISH,
                    0xFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> PORCUPINE_FISH_SPAWN_EGG = ITEMS.register("porcupine_fish_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.PORCUPINE_FISH,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> NAUTILUS_SPAWN_EGG = ITEMS.register("nautilus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.NAUTILUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> FEATHER_STAR_SPAWN_EGG = ITEMS.register("feather_star_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.FEATHER_STAR,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ZHIKONG_SCALLOP_SPAWN_EGG = ITEMS.register("zhikong_scallop_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ZHIKONG_SCALLOP,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> BAY_SCALLOP_SPAWN_EGG = ITEMS.register("bay_scallop_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BAY_SCALLOP,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> YESSO_SCALLOP_SPAWN_EGG = ITEMS.register("yesso_scallop_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.YESSO_SCALLOP,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> SPEARFISH_SPAWN_EGG = ITEMS.register("spearfish_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.SPEARFISH,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ROOSTERFISH_SPAWN_EGG = ITEMS.register("roosterfish_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ROOSTERFISH,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> GALEOCERDO_CUVIER_SPAWN_EGG = ITEMS.register("galeocerdo_cuvier_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.GALEOCERDO_CUVIER,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ALOPIAS_VULPINUS_SPAWN_EGG = ITEMS.register("alopias_vulpinus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ALOPIAS_VULPINUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> NEGAPRION_ACUTIDENS_SPAWN_EGG = ITEMS.register("negaprion_acutidens_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.NEGAPRION_ACUTIDENS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> NEGAPRION_BREVIROSTRIS_SPAWN_EGG = ITEMS.register("negaprion_brevirostris_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.NEGAPRION_BREVIROSTRIS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> EPINEPHELUS_LANCEOLATUS_SPAWN_EGG = ITEMS.register("epinephelus_lanceolatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.EPINEPHELUS_LANCEOLATUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> EPINEPHELUS_ITAJARA_SPAWN_EGG = ITEMS.register("epinephelus_itajara_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.EPINEPHELUS_ITAJARA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> EPINEPHELUS_MELANOSTIGMA_SPAWN_EGG = ITEMS.register("epinephelus_melanostigma_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.EPINEPHELUS_MELANOSTIGMA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> DOSIDICUS_GIGAS_SPAWN_EGG = ITEMS.register("dosidicus_gigas_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.DOSIDICUS_GIGAS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ACANTHURUS_ACHILLES_SPAWN_EGG = ITEMS.register("acanthurus_achilles_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ACANTHURUS_ACHILLES,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ACANTHURUS_LEUCOSTERNON_SPAWN_EGG = ITEMS.register("acanthurus_leucosternon_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ACANTHURUS_LEUCOSTERNON,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> PARACANTHURUS_HEPATUS_SPAWN_EGG = ITEMS.register("paracanthurus_hepatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.PARACANTHURUS_HEPATUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ACANTHURUS_TRIOSTEGUS_SPAWN_EGG = ITEMS.register("acanthurus_triostegus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ACANTHURUS_TRIOSTEGUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ACANTHURUS_NIGRICANS_SPAWN_EGG = ITEMS.register("acanthurus_nigricans_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ACANTHURUS_NIGRICANS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ACANTHURUS_LINEATUS_SPAWN_EGG = ITEMS.register("acanthurus_lineatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ACANTHURUS_LINEATUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CHAETODON_STRIATUS_SPAWN_EGG = ITEMS.register("chaetodon_striatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CHAETODON_STRIATUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CHAETODON_UNIMACULATUS_SPAWN_EGG = ITEMS.register("chaetodon_unimaculatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CHAETODON_UNIMACULATUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CHAETODON_AURIGA_SPAWN_EGG = ITEMS.register("chaetodon_auriga_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CHAETODON_AURIGA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CHAETODON_COLLARE_SPAWN_EGG = ITEMS.register("chaetodon_collare_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CHAETODON_COLLARE,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CHAETODON_RETICULATUS_SPAWN_EGG = ITEMS.register("chaetodon_reticulatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CHAETODON_RETICULATUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CHAETODON_SPECULUM_SPAWN_EGG = ITEMS.register("chaetodon_speculum_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CHAETODON_SPECULUM,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AUSTRALOHEROS_FACETUS_SPAWN_EGG = ITEMS.register("australoheros_facetus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AUSTRALOHEROS_FACETUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CICHLASOMA_BIMACULATUM_SPAWN_EGG = ITEMS.register("cichlasoma_bimaculatum_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CICHLASOMA_BIMACULATUM,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> KROBIA_GUIANENSIS_SPAWN_EGG = ITEMS.register("krobia_guianensis_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.KROBIA_GUIANENSIS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AEQUIDENS_TETRAMERUS_SPAWN_EGG = ITEMS.register("aequidens_tetramerus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AEQUIDENS_TETRAMERUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> GYMNOGEOPHAGUS_BALZANII_SPAWN_EGG = ITEMS.register("gymnogeophagus_balzanii_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.GYMNOGEOPHAGUS_BALZANII,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ASTRONOTUS_OCELLATUS_SPAWN_EGG = ITEMS.register("astronotus_ocellatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ASTRONOTUS_OCELLATUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CHANNA_MICROPELTES_SPAWN_EGG = ITEMS.register("channa_micropeltes_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CHANNA_MICROPELTES,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CHANNA_ARGUS_SPAWN_EGG = ITEMS.register("channa_argus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CHANNA_ARGUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> ELOPICHTHYS_BAMBUSA_SPAWN_EGG = ITEMS.register("elopichthys_bambusa_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ELOPICHTHYS_BAMBUSA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> HUSO_DAURICUS_SPAWN_EGG = ITEMS.register("huso_dauricus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.HUSO_DAURICUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_OCELLARIS_SPAWN_EGG = ITEMS.register("amphiprion_ocellaris_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_OCELLARIS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> PREMNAS_BIACULEATUS_SPAWN_EGG = ITEMS.register("premnas_biaculeatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.PREMNAS_BIACULEATUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_POLYMNUS_SPAWN_EGG = ITEMS.register("amphiprion_polymnus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_POLYMNUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_PERIDERAION_SPAWN_EGG = ITEMS.register("amphiprion_perideraion_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_PERIDERAION,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_CLARKII_SPAWN_EGG = ITEMS.register("amphiprion_clarkii_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_CLARKII,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_PERCULA_SPAWN_EGG = ITEMS.register("amphiprion_percula_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_PERCULA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_AKINDYNOS_SPAWN_EGG = ITEMS.register("amphiprion_akindynos_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_AKINDYNOS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_BICINCTUS_SPAWN_EGG = ITEMS.register("amphiprion_bicinctus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_BICINCTUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOGASTER_SPAWN_EGG = ITEMS.register("amphiprion_chrysogaster_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_CHRYSOGASTER,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOPTERUS_SPAWN_EGG = ITEMS.register("amphiprion_chrysopterus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_CHRYSOPTERUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_LATEZONATUS_SPAWN_EGG = ITEMS.register("amphiprion_latezonatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_LATEZONATUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_MCCULLOCHI_SPAWN_EGG = ITEMS.register("amphiprion_mccullochi_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_MCCULLOCHI,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_MELANOPUS_SPAWN_EGG = ITEMS.register("amphiprion_melanopus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_MELANOPUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_TRICINCTUS_SPAWN_EGG = ITEMS.register("amphiprion_tricinctus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_TRICINCTUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> BETTA_SPLENDENS_SPAWN_EGG = ITEMS.register("betta_splendens_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BETTA_SPLENDENS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> BETTA_IMBELLIS_SPAWN_EGG = ITEMS.register("betta_imbellis_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BETTA_IMBELLIS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> BETTA_SMARAGDINA_SPAWN_EGG = ITEMS.register("betta_smaragdina_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BETTA_SMARAGDINA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> BETTA_PICTA_SPAWN_EGG = ITEMS.register("betta_picta_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BETTA_PICTA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> BETTA_SIMPLEX_SPAWN_EGG = ITEMS.register("betta_simplex_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BETTA_SIMPLEX,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> BETTA_BROWNORUM_SPAWN_EGG = ITEMS.register("betta_brownorum_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BETTA_BROWNORUM,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> MEGALOPS_ATLANTICUS_SPAWN_EGG = ITEMS.register("megalops_atlanticus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.MEGALOPS_ATLANTICUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> KATSUWONUS_PELAMIS_SPAWN_EGG = ITEMS.register("katsuwonus_pelamis_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.KATSUWONUS_PELAMIS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> BLACK_CARP_SPAWN_EGG = ITEMS.register("black_carp_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BLACK_CARP,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> GRASS_CARP_SPAWN_EGG = ITEMS.register("grass_carp_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.GRASS_CARP,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> SILVER_CARP_SPAWN_EGG = ITEMS.register("silver_carp_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.SILVER_CARP,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> BIGHEAD_CARP_SPAWN_EGG = ITEMS.register("bighead_carp_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BIGHEAD_CARP,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    //Food
    public static final RegistryObject<Item> HADDOCK_COD = ITEMS.register("haddock_cod",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ATLANTIC_COD = ITEMS.register("atlantic_cod",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PACIFIC_COD = ITEMS.register("pacific_cod",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> MALE_SALMON = ITEMS.register("male_salmon",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> FEMALE_SALMON = ITEMS.register("female_salmon",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PACIFIC_SALMON = ITEMS.register("pacific_salmon",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> YELLOW_FIN_PUFFER = ITEMS.register("yellow_fin_puffer",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final RegistryObject<Item> OBSCURE_PUFFER = ITEMS.register("obscure_puffer",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final RegistryObject<Item> LIONFISH = ITEMS.register("lionfish",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PORCUPINE_FISH = ITEMS.register("porcupine_fish",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final RegistryObject<Item> SPEARFISH = ITEMS.register("spearfish",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> COOKED_SPEARFISH = ITEMS.register("cooked_spearfish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> ROOSTERFISH = ITEMS.register("roosterfish",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> COOKED_ROOSTERFISH = ITEMS.register("cooked_roosterfish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> GALEOCERDO_CUVIER = ITEMS.register("galeocerdo_cuvier",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1.0f)
                    .build())));
    public static final RegistryObject<Item> ALOPIAS_VULPINUS = ITEMS.register("alopias_vulpinus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1.0f).build())));
    public static final RegistryObject<Item> COOKED_ALOPIAS_VULPINUS = ITEMS.register("cooked_alopias_vulpinus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> NEGAPRION_ACUTIDENS = ITEMS.register("negaprion_acutidens",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1.0f)
                    .build())));
    public static final RegistryObject<Item> COOKED_NEGAPRION_ACUTIDENS = ITEMS.register("cooked_negaprion_acutidens",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> NEGAPRION_BREVIROSTRIS = ITEMS.register("negaprion_brevirostris",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1.0f)
                    .build())));
    public static final RegistryObject<Item> COOKED_NEGAPRION_BREVIROSTRIS = ITEMS.register("cooked_negaprion_brevirostris",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> EPINEPHELUS_LANCEOLATUS = ITEMS.register("epinephelus_lanceolatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f)
                    .build())));
    public static final RegistryObject<Item> EPINEPHELUS_ITAJARA = ITEMS.register("epinephelus_itajara",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f)
                    .build())));
    public static final RegistryObject<Item> EPINEPHELUS_MELANOSTIGMA = ITEMS.register("epinephelus_melanostigma",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f)
                    .build())));
    public static final RegistryObject<Item> COOKED_EPINEPHELUS = ITEMS.register("cooked_epinephelus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6f)
                    .build())));
    public static final RegistryObject<Item> SHARK_FIN = ITEMS.register("shark_fin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HUMBOLDT_SQUID = ITEMS.register("humboldt_squid",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> COOKED_HUMBOLDT_SQUID = ITEMS.register("cooked_humboldt_squid",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(0.7f).build())));

    public static final RegistryObject<Item> FEATHER_STAR_TENTACLE = ITEMS.register("feather_star_tentacle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCALLOP_MEAT = ITEMS.register("scallop_meat",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> ACANTHURUS_ACHILLES = ITEMS.register("acanthurus_achilles",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ACANTHURUS_LEUCOSTERNON = ITEMS.register("acanthurus_leucosternon",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PARACANTHURUS_HEPATUS = ITEMS.register("paracanthurus_hepatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ACANTHURUS_TRIOSTEGUS = ITEMS.register("acanthurus_triostegus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ACANTHURUS_NIGRICANS = ITEMS.register("acanthurus_nigricans",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ACANTHURUS_LINEATUS = ITEMS.register("acanthurus_lineatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_STRIATUS = ITEMS.register("chaetodon_striatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_UNIMACULATUS = ITEMS.register("chaetodon_unimaculatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_AURIGA = ITEMS.register("chaetodon_auriga",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_COLLARE = ITEMS.register("chaetodon_collare",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_RETICULATUS = ITEMS.register("chaetodon_reticulatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_SPECULUM = ITEMS.register("chaetodon_speculum",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AUSTRALOHEROS_FACETUS = ITEMS.register("australoheros_facetus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CICHLASOMA_BIMACULATUM = ITEMS.register("cichlasoma_bimaculatum",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> KROBIA_GUIANENSIS = ITEMS.register("krobia_guianensis",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AEQUIDENS_TETRAMERUS = ITEMS.register("aequidens_tetramerus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> GYMNOGEOPHAGUS_BALZANII = ITEMS.register("gymnogeophagus_balzanii",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ASTRONOTUS_OCELLATUS = ITEMS.register("astronotus_ocellatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHANNA_MICROPELTES = ITEMS.register("channa_micropeltes",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> CHANNA_ARGUS = ITEMS.register("channa_argus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> ELOPICHTHYS_BAMBUSA = ITEMS.register("elopichthys_bambusa",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> COOKED_CHANNA = ITEMS.register("cooked_channa",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> COOKED_ELOPICHTHYS_BAMBUSA = ITEMS.register("cooked_elopichthys_bambusa",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> HUSO_DAURICUS = ITEMS.register("huso_dauricus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.5f).build())));
    public static final RegistryObject<Item> COOKED_HUSO_DAURICUS = ITEMS.register("cooked_huso_dauricus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).build())));
    public static final RegistryObject<Item> AMPHIPRION_OCELLARIS = ITEMS.register("amphiprion_ocellaris",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PREMNAS_BIACULEATUS = ITEMS.register("premnas_biaculeatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_POLYMNUS = ITEMS.register("amphiprion_polymnus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_PERIDERAION = ITEMS.register("amphiprion_perideraion",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_CLARKII = ITEMS.register("amphiprion_clarkii",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_PERCULA = ITEMS.register("amphiprion_percula",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_AKINDYNOS = ITEMS.register("amphiprion_akindynos",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_BICINCTUS = ITEMS.register("amphiprion_bicinctus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOGASTER = ITEMS.register("amphiprion_chrysogaster",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOPTERUS = ITEMS.register("amphiprion_chrysopterus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_LATEZONATUS = ITEMS.register("amphiprion_latezonatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_MCCULLOCHI = ITEMS.register("amphiprion_mccullochi",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_MELANOPUS = ITEMS.register("amphiprion_melanopus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_TRICINCTUS = ITEMS.register("amphiprion_tricinctus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_SPLENDENS = ITEMS.register("betta_splendens",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_IMBELLIS = ITEMS.register("betta_imbellis",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_SMARAGDINA = ITEMS.register("betta_smaragdina",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_PICTA = ITEMS.register("betta_picta",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_SIMPLEX = ITEMS.register("betta_simplex",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_BROWNORUM = ITEMS.register("betta_brownorum",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> MEGALOPS_ATLANTICUS = ITEMS.register("megalops_atlanticus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f).build())));
    public static final RegistryObject<Item> KATSUWONUS_PELAMIS = ITEMS.register("katsuwonus_pelamis",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> COOKED_KATSUWONUS_PELAMIS = ITEMS.register("cooked_katsuwonus_pelamis",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> BLACK_CARP = ITEMS.register("black_carp",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> COOKED_BLACK_CARP = ITEMS.register("cooked_black_carp",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> GRASS_CARP = ITEMS.register("grass_carp",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> COOKED_GRASS_CARP = ITEMS.register("cooked_grass_carp",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> SILVER_CARP = ITEMS.register("silver_carp",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> COOKED_SILVER_CARP = ITEMS.register("cooked_silver_carp",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> BIGHEAD_CARP = ITEMS.register("bighead_carp",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> COOKED_BIGHEAD_CARP = ITEMS.register("cooked_bighead_carp",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    //Specimen
    public static final RegistryObject<Item> ATLANTIC_COD_SPECIMEN = ITEMS.register("atlantic_cod_specimen",
            () -> new BlockItem(BvfBlocks.ATLANTIC_COD_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PACIFIC_COD_SPECIMEN = ITEMS.register("pacific_cod_specimen",
            () -> new BlockItem(BvfBlocks.PACIFIC_COD_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HADDOCK_COD_SPECIMEN = ITEMS.register("haddock_cod_specimen",
            () -> new BlockItem(BvfBlocks.HADDOCK_COD_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PACIFIC_SALMON_SPECIMEN = ITEMS.register("pacific_salmon_specimen",
            () -> new BlockItem(BvfBlocks.PACIFIC_SALMON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALE_SALMON_SPECIMEN = ITEMS.register("male_salmon_specimen",
            () -> new BlockItem(BvfBlocks.MALE_SALMON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FEMALE_SALMON_SPECIMEN = ITEMS.register("female_salmon_specimen",
            () -> new BlockItem(BvfBlocks.FEMALE_SALMON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SPEARFISH_SPECIMEN = ITEMS.register("spearfish_specimen",
            () -> new BlockItem(BvfBlocks.SPEARFISH_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ROOSTERFISH_SPECIMEN = ITEMS.register("roosterfish_specimen",
            () -> new BlockItem(BvfBlocks.ROOSTERFISH_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GALEOCERDO_CUVIER_SPECIMEN = ITEMS.register("galeocerdo_cuvier_specimen",
            () -> new BlockItem(BvfBlocks.GALEOCERDO_CUVIER_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ALOPIAS_VULPINUS_SPECIMEN = ITEMS.register("alopias_vulpinus_specimen",
            () -> new BlockItem(BvfBlocks.ALOPIAS_VULPINUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NEGAPRION_ACUTIDENS_SPECIMEN = ITEMS.register("negaprion_acutidens_specimen",
            () -> new BlockItem(BvfBlocks.NEGAPRION_ACUTIDENS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NEGAPRION_BREVIROSTRIS_SPECIMEN = ITEMS.register("negaprion_brevirostris_specimen",
            () -> new BlockItem(BvfBlocks.NEGAPRION_BREVIROSTRIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EPINEPHELUS_LANCEOLATUS_SPECIMEN = ITEMS.register("epinephelus_lanceolatus_specimen",
            () -> new BlockItem(BvfBlocks.EPINEPHELUS_LANCEOLATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EPINEPHELUS_ITAJARA_SPECIMEN = ITEMS.register("epinephelus_itajara_specimen",
            () -> new BlockItem(BvfBlocks.EPINEPHELUS_ITAJARA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EPINEPHELUS_MELANOSTIGMA_SPECIMEN = ITEMS.register("epinephelus_melanostigma_specimen",
            () -> new BlockItem(BvfBlocks.EPINEPHELUS_MELANOSTIGMA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AUSTRALOHEROS_FACETUS_SPECIMEN = ITEMS.register("australoheros_facetus_specimen",
            () -> new BlockItem(BvfBlocks.AUSTRALOHEROS_FACETUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CICHLASOMA_BIMACULATUM_SPECIMEN = ITEMS.register("cichlasoma_bimaculatum_specimen",
            () -> new BlockItem(BvfBlocks.CICHLASOMA_BIMACULATUM_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> KROBIA_GUIANENSIS_SPECIMEN = ITEMS.register("krobia_guianensis_specimen",
            () -> new BlockItem(BvfBlocks.KROBIA_GUIANENSIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AEQUIDENS_TETRAMERUS_SPECIMEN = ITEMS.register("aequidens_tetramerus_specimen",
            () -> new BlockItem(BvfBlocks.AEQUIDENS_TETRAMERUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GYMNOGEOPHAGUS_BALZANII_SPECIMEN = ITEMS.register("gymnogeophagus_balzanii_specimen",
            () -> new BlockItem(BvfBlocks.GYMNOGEOPHAGUS_BALZANII_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ASTRONOTUS_OCELLATUS_SPECIMEN = ITEMS.register("astronotus_ocellatus_specimen",
            () -> new BlockItem(BvfBlocks.ASTRONOTUS_OCELLATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHANNA_MICROPELTES_SPECIMEN = ITEMS.register("channa_micropeltes_specimen",
            () -> new BlockItem(BvfBlocks.CHANNA_MICROPELTES_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHANNA_ARGUS_SPECIMEN = ITEMS.register("channa_argus_specimen",
            () -> new BlockItem(BvfBlocks.CHANNA_ARGUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ELOPICHTHYS_BAMBUSA_SPECIMEN = ITEMS.register("elopichthys_bambusa_specimen",
            () -> new BlockItem(BvfBlocks.ELOPICHTHYS_BAMBUSA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HUSO_DAURICUS_SPECIMEN = ITEMS.register("huso_dauricus_specimen",
            () -> new BlockItem(BvfBlocks.HUSO_DAURICUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLACK_CARP_SPECIMEN = ITEMS.register("black_carp_specimen",
            () -> new BlockItem(BvfBlocks.BLACK_CARP_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GRASS_CARP_SPECIMEN = ITEMS.register("grass_carp_specimen",
            () -> new BlockItem(BvfBlocks.GRASS_CARP_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SILVER_CARP_SPECIMEN = ITEMS.register("silver_carp_specimen",
            () -> new BlockItem(BvfBlocks.SILVER_CARP_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BIGHEAD_CARP_SPECIMEN = ITEMS.register("bighead_carp_specimen",
            () -> new BlockItem(BvfBlocks.BIGHEAD_CARP_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MEGALOPS_ATLANTICUS_SPECIMEN = ITEMS.register("megalops_atlanticus_specimen",
            () -> new BlockItem(BvfBlocks.MEGALOPS_ATLANTICUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> KATSUWONUS_PELAMIS_SPECIMEN = ITEMS.register("katsuwonus_pelamis_specimen",
            () -> new BlockItem(BvfBlocks.KATSUWONUS_PELAMIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> OBSCURE_PUFFER_SPECIMEN = ITEMS.register("obscure_puffer_specimen",
            () -> new BlockItem(BvfBlocks.OBSCURE_PUFFER_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SOARING_LIONFISH_SPECIMEN = ITEMS.register("soaring_lionfish_specimen",
            () -> new BlockItem(BvfBlocks.SOARING_LIONFISH_SPECIMEN.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RINGED_LIONFISH_SPECIMEN = ITEMS.register("ringed_lionfish_specimen",
            () -> new BlockItem(BvfBlocks.RINGED_LIONFISH_SPECIMEN.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RADIANT_LIONFISH_SPECIMEN = ITEMS.register("radiant_lionfish_specimen",
            () -> new BlockItem(BvfBlocks.RADIANT_LIONFISH_SPECIMEN.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> YELLOW_FIN_PUFFER_SPECIMEN = ITEMS.register("yellow_fin_puffer_specimen",
            () -> new BlockItem(BvfBlocks.YELLOW_FIN_PUFFER_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PORCUPINE_FISH_SPECIMEN = ITEMS.register("porcupine_fish_specimen",
            () -> new BlockItem(BvfBlocks.PORCUPINE_FISH_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_SPLENDENS_SPECIMEN = ITEMS.register("betta_splendens_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_SPLENDENS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_IMBELLIS_SPECIMEN = ITEMS.register("betta_imbellis_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_IMBELLIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_SMARAGDINA_SPECIMEN = ITEMS.register("betta_smaragdina_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_SMARAGDINA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_PICTA_SPECIMEN = ITEMS.register("betta_picta_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_PICTA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_SIMPLEX_SPECIMEN = ITEMS.register("betta_simplex_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_SIMPLEX_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_BROWNORUM_SPECIMEN = ITEMS.register("betta_brownorum_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_BROWNORUM_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_ACHILLES_SPECIMEN = ITEMS.register("acanthurus_achilles_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_ACHILLES_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_LEUCOSTERNON_SPECIMEN = ITEMS.register("acanthurus_leucosternon_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_LEUCOSTERNON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PARACANTHURUS_HEPATUS_SPECIMEN = ITEMS.register("paracanthurus_hepatus_specimen",
            () -> new BlockItem(BvfBlocks.PARACANTHURUS_HEPATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_TRIOSTEGUS_SPECIMEN = ITEMS.register("acanthurus_triostegus_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_TRIOSTEGUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_NIGRICANS_SPECIMEN = ITEMS.register("acanthurus_nigricans_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_NIGRICANS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_LINEATUS_SPECIMEN = ITEMS.register("acanthurus_lineatus_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_LINEATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_STRIATUS_SPECIMEN = ITEMS.register("chaetodon_striatus_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_STRIATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_UNIMACULATUS_SPECIMEN = ITEMS.register("chaetodon_unimaculatus_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_UNIMACULATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_AURIGA_SPECIMEN = ITEMS.register("chaetodon_auriga_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_AURIGA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_COLLARE_SPECIMEN = ITEMS.register("chaetodon_collare_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_COLLARE_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_RETICULATUS_SPECIMEN = ITEMS.register("chaetodon_reticulatus_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_RETICULATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_SPECULUM_SPECIMEN = ITEMS.register("chaetodon_speculum_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_SPECULUM_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_OCELLARIS_SPECIMEN = ITEMS.register("amphiprion_ocellaris_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_OCELLARIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PREMNAS_BIACULEATUS_SPECIMEN = ITEMS.register("premnas_biaculeatus_specimen",
            () -> new BlockItem(BvfBlocks.PREMNAS_BIACULEATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_POLYMNUS_SPECIMEN = ITEMS.register("amphiprion_polymnus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_POLYMNUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_PERIDERAION_SPECIMEN = ITEMS.register("amphiprion_perideraion_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_PERIDERAION_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_CLARKII_SPECIMEN = ITEMS.register("amphiprion_clarkii_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_CLARKII_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_PERCULA_SPECIMEN = ITEMS.register("amphiprion_percula_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_PERCULA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_AKINDYNOS_SPECIMEN = ITEMS.register("amphiprion_akindynos_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_AKINDYNOS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_BICINCTUS_SPECIMEN = ITEMS.register("amphiprion_bicinctus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_BICINCTUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOGASTER_SPECIMEN = ITEMS.register("amphiprion_chrysogaster_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_CHRYSOGASTER_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOPTERUS_SPECIMEN = ITEMS.register("amphiprion_chrysopterus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_CHRYSOPTERUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_LATEZONATUS_SPECIMEN = ITEMS.register("amphiprion_latezonatus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_LATEZONATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_MCCULLOCHI_SPECIMEN = ITEMS.register("amphiprion_mccullochi_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_MCCULLOCHI_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_MELANOPUS_SPECIMEN = ITEMS.register("amphiprion_melanopus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_MELANOPUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_TRICINCTUS_SPECIMEN = ITEMS.register("amphiprion_tricinctus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_TRICINCTUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    //Weapon
    public static final RegistryObject<Item> ENCHANTED_PUFFERFISH = ITEMS.register("enchanted_pufferfish",
            () -> new EnchantedPuffer(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
