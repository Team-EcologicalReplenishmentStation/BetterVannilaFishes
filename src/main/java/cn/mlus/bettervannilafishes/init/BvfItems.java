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
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class BvfItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(
            BetterVannilaFishes.MODID);
    //Bucket
    public static final DeferredHolder<Item,Item> HADDOCK_COD_BUCKET = ITEMS.register("haddock_cod_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_HADDOCK_COD.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final DeferredHolder<Item,Item> ATLANTIC_COD_BUCKET = ITEMS.register("atlantic_cod_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_ATLANTIC_COD.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final DeferredHolder<Item,Item> PACIFIC_COD_BUCKET = ITEMS.register("pacific_cod_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_PACIFIC_COD.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final DeferredHolder<Item,Item> MALE_SALMON_BUCKET = ITEMS.register("male_salmon_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_SALMON_MALE.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final DeferredHolder<Item,Item> FEMALE_SALMON_BUCKET = ITEMS.register("female_salmon_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_SALMON_FEMALE.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final DeferredHolder<Item,Item> PACIFIC_SALMON_BUCKET = ITEMS.register("pacific_salmon_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_SALMON_PACIFIC.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final DeferredHolder<Item,Item> YELLOW_FIN_PUFFER_BUCKET = ITEMS.register("yellow_fin_puffer_bucket",
            () -> new MobBucketItem(
                    BvfEntities.YELLOW_FIN_PUFFER.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final DeferredHolder<Item,Item> OBSCURE_PUFFER_BUCKET = ITEMS.register("obscure_puffer_bucket",
            () -> new MobBucketItem(
                    BvfEntities.OBSCURE_PUFFER.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final DeferredHolder<Item,Item> PORCUPINE_FISH_BUCKET = ITEMS.register("porcupine_fish_bucket",
            () -> new MobBucketItem(
                    BvfEntities.PORCUPINE_FISH.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final DeferredHolder<Item,Item> NAUTILUS_BUCKET = ITEMS.register("nautilus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.NAUTILUS.get(),
                    Fluids.WATER,
                    SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    //Spawn Egg
    public static final DeferredHolder<Item,Item> HADDOCK_COD_SPAWN_EGG = ITEMS.register("haddock_cod_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.BVC_HADDOCK_COD,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final DeferredHolder<Item,Item> ATLANTIC_COD_SPAWN_EGG = ITEMS.register("atlantic_cod_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.BVC_ATLANTIC_COD,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final DeferredHolder<Item,Item> PACIFIC_COD_SPAWN_EGG = ITEMS.register("pacific_cod_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.BVC_PACIFIC_COD,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final DeferredHolder<Item,Item> MALE_SALMON_SPAWN_EGG = ITEMS.register("male_salmon_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.BVC_SALMON_MALE,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final DeferredHolder<Item,Item> FEMALE_SALMON_SPAWN_EGG = ITEMS.register("female_salmon_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.BVC_SALMON_FEMALE,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final DeferredHolder<Item,Item> PACIFIC_SALMON_SPAWN_EGG = ITEMS.register("pacific_salmon_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.BVC_SALMON_PACIFIC,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final DeferredHolder<Item,Item> YELLOW_FIN_PUFFER_SPAWN_EGG = ITEMS.register("yellow_fin_puffer_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.YELLOW_FIN_PUFFER,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final DeferredHolder<Item,Item> OBSCURE_PUFFER_SPAWN_EGG = ITEMS.register("obscure_puffer_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.OBSCURE_PUFFER,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final DeferredHolder<Item,Item> PORCUPINE_FISH_SPAWN_EGG = ITEMS.register("porcupine_fish_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.PORCUPINE_FISH,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final DeferredHolder<Item,Item> NAUTILUS_SPAWN_EGG = ITEMS.register("nautilus_spawn_egg",
            () -> new DeferredSpawnEggItem(
                    BvfEntities.NAUTILUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    //Food
    public static final DeferredHolder<Item,Item> HADDOCK_COD = ITEMS.register("haddock_cod",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build())));
    public static final DeferredHolder<Item,Item> ATLANTIC_COD = ITEMS.register("atlantic_cod",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build())));
    public static final DeferredHolder<Item,Item> PACIFIC_COD = ITEMS.register("pacific_cod",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build())));
    public static final DeferredHolder<Item,Item> MALE_SALMON = ITEMS.register("male_salmon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build())));
    public static final DeferredHolder<Item,Item> FEMALE_SALMON = ITEMS.register("female_salmon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build())));
    public static final DeferredHolder<Item,Item> PACIFIC_SALMON = ITEMS.register("pacific_salmon",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build())));
    public static final DeferredHolder<Item,Item> YELLOW_FIN_PUFFER = ITEMS.register("yellow_fin_puffer",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final DeferredHolder<Item,Item> OBSCURE_PUFFER = ITEMS.register("obscure_puffer",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final DeferredHolder<Item,Item> PORCUPINE_FISH = ITEMS.register("porcupine_fish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    //Specimen
    public static final DeferredHolder<Item,Item> ATLANTIC_COD_SPECIMEN = ITEMS.register("atlantic_cod_specimen",
            () -> new BlockItem(BvfBlocks.ATLANTIC_COD_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final DeferredHolder<Item,Item> PACIFIC_COD_SPECIMEN = ITEMS.register("pacific_cod_specimen",
            () -> new BlockItem(BvfBlocks.PACIFIC_COD_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final DeferredHolder<Item,Item> HADDOCK_COD_SPECIMEN = ITEMS.register("haddock_cod_specimen",
            () -> new BlockItem(BvfBlocks.HADDOCK_COD_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final DeferredHolder<Item,Item> PACIFIC_SALMON_SPECIMEN = ITEMS.register("pacific_salmon_specimen",
            () -> new BlockItem(BvfBlocks.PACIFIC_SALMON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final DeferredHolder<Item,Item> MALE_SALMON_SPECIMEN = ITEMS.register("male_salmon_specimen",
            () -> new BlockItem(BvfBlocks.MALE_SALMON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final DeferredHolder<Item,Item> FEMALE_SALMON_SPECIMEN = ITEMS.register("female_salmon_specimen",
            () -> new BlockItem(BvfBlocks.FEMALE_SALMON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    //Weapon
    public static final DeferredHolder<Item,Item> ENCHANTED_PUFFERFISH = ITEMS.register("enchanted_pufferfish",
            () -> new EnchantedPuffer(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
