package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.item.EnchantedPuffer;
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
    public static final RegistryObject<Item> SPEARFISH_BUCKET = ITEMS.register("spearfish_bucket",
            () -> new MobBucketItem(
                    BvfEntities.SPEARFISH,
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
    public static final RegistryObject<Item> SPEARFISH_SPAWN_EGG = ITEMS.register("spearfish_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.SPEARFISH,
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
    //Food
    public static final RegistryObject<Item> HADDOCK_COD = ITEMS.register("haddock_cod",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ATLANTIC_COD = ITEMS.register("atlantic_cod",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PACIFIC_COD = ITEMS.register("pacific_cod",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> MALE_SALMON = ITEMS.register("male_salmon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> FEMALE_SALMON = ITEMS.register("female_salmon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PACIFIC_SALMON = ITEMS.register("pacific_salmon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> YELLOW_FIN_PUFFER = ITEMS.register("yellow_fin_puffer",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final RegistryObject<Item> OBSCURE_PUFFER = ITEMS.register("obscure_puffer",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final RegistryObject<Item> PORCUPINE_FISH = ITEMS.register("porcupine_fish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final RegistryObject<Item> SPEARFISH = ITEMS.register("spearfish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> COOKED_SPEARFISH = ITEMS.register("cooked_spearfish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> GALEOCERDO_CUVIER = ITEMS.register("galeocerdo_cuvier",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 300, 0), 1.0f)
                    .build())));
    public static final RegistryObject<Item> SHARK_FIN = ITEMS.register("shark_fin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FEATHER_STAR_TENTACLE = ITEMS.register("feather_star_tentacle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ACANTHURUS_ACHILLES = ITEMS.register("acanthurus_achilles",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ACANTHURUS_LEUCOSTERNON = ITEMS.register("acanthurus_leucosternon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PARACANTHURUS_HEPATUS = ITEMS.register("paracanthurus_hepatus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ACANTHURUS_TRIOSTEGUS = ITEMS.register("acanthurus_triostegus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ACANTHURUS_NIGRICANS = ITEMS.register("acanthurus_nigricans",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ACANTHURUS_LINEATUS = ITEMS.register("acanthurus_lineatus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AUSTRALOHEROS_FACETUS = ITEMS.register("australoheros_facetus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CICHLASOMA_BIMACULATUM = ITEMS.register("cichlasoma_bimaculatum",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> KROBIA_GUIANENSIS = ITEMS.register("krobia_guianensis",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AEQUIDENS_TETRAMERUS = ITEMS.register("aequidens_tetramerus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> GYMNOGEOPHAGUS_BALZANII = ITEMS.register("gymnogeophagus_balzanii",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ASTRONOTUS_OCELLATUS = ITEMS.register("astronotus_ocellatus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_OCELLARIS = ITEMS.register("amphiprion_ocellaris",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PREMNAS_BIACULEATUS = ITEMS.register("premnas_biaculeatus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_POLYMNUS = ITEMS.register("amphiprion_polymnus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_PERIDERAION = ITEMS.register("amphiprion_perideraion",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_CLARKII = ITEMS.register("amphiprion_clarkii",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_PERCULA = ITEMS.register("amphiprion_percula",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
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
    public static final RegistryObject<Item> GALEOCERDO_CUVIER_SPECIMEN = ITEMS.register("galeocerdo_cuvier_specimen",
            () -> new BlockItem(BvfBlocks.GALEOCERDO_CUVIER_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    //Weapon
    public static final RegistryObject<Item> ENCHANTED_PUFFERFISH = ITEMS.register("enchanted_pufferfish",
            () -> new EnchantedPuffer(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
