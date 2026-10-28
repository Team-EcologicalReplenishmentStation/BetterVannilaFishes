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
    public static final RegistryObject<Item> MELANOGRAMMUS_AEGLEFINUS_BUCKET = ITEMS.register("melanogrammus_aeglefinus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_MELANOGRAMMUS_AEGLEFINUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> GADUS_MORHUA_BUCKET = ITEMS.register("gadus_morhua_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_GADUS_MORHUA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> GADUS_MACROCEPHALUS_BUCKET = ITEMS.register("gadus_macrocephalus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BVC_GADUS_MACROCEPHALUS,
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
    public static final RegistryObject<Item> TAKIFUGU_XANTHOPTERUS_BUCKET = ITEMS.register("takifugu_xanthopterus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.TAKIFUGU_XANTHOPTERUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> TAKIFUGU_OBSCURUS_BUCKET = ITEMS.register("takifugu_obscurus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.TAKIFUGU_OBSCURUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> PTEROIS_VOLITANS_BUCKET = ITEMS.register("pterois_volitans_bucket",
            () -> new MobBucketItem(BvfEntities.PTEROIS_VOLITANS, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PTEROIS_LUNULATA_BUCKET = ITEMS.register("pterois_lunulata_bucket",
            () -> new MobBucketItem(BvfEntities.PTEROIS_LUNULATA, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PTEROIS_RADIATA_BUCKET = ITEMS.register("pterois_radiata_bucket",
            () -> new MobBucketItem(BvfEntities.PTEROIS_RADIATA, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DIODON_HOLOCANTHUS_BUCKET = ITEMS.register("diodon_holocanthus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.DIODON_HOLOCANTHUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> NAUTILUS_POMPILIUS_BUCKET = ITEMS.register("nautilus_pompilius_bucket",
            () -> new MobBucketItem(
                    BvfEntities.NAUTILUS_POMPILIUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> COMATULIDA_BUCKET = ITEMS.register("comatulida_bucket",
            () -> new MobBucketItem(
                    BvfEntities.COMATULIDA,
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
    public static final RegistryObject<Item> KAJIKIA_AUDAX_BUCKET = ITEMS.register("kajikia_audax_bucket",
            () -> new MobBucketItem(
                    BvfEntities.KAJIKIA_AUDAX,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> NEMATISTIUS_PECTORALIS_BUCKET = ITEMS.register("nematistius_pectoralis_bucket",
            () -> new MobBucketItem(
                    BvfEntities.NEMATISTIUS_PECTORALIS,
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
    public static final RegistryObject<Item> EPINEPHELUS_TUKULA_BUCKET = ITEMS.register("epinephelus_tukula_bucket",
            () -> new MobBucketItem(
                    BvfEntities.EPINEPHELUS_TUKULA,
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
    public static final RegistryObject<Item> ACANTHURUS_LEUCOPAREIUS_BUCKET = ITEMS.register("acanthurus_leucopareius_bucket",
            () -> new MobBucketItem(
                    BvfEntities.ACANTHURUS_LEUCOPAREIUS,
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
    public static final RegistryObject<Item> CHAETODON_XANTHURUS_BUCKET = ITEMS.register("chaetodon_xanthurus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CHAETODON_XANTHURUS,
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
    public static final RegistryObject<Item> CICHLA_ORINOCENSIS_BUCKET = ITEMS.register("cichla_orinocensis_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CICHLA_ORINOCENSIS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CICHLA_JARIINA_BUCKET = ITEMS.register("cichla_jariina_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CICHLA_JARIINA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CICHLA_KELBERI_BUCKET = ITEMS.register("cichla_kelberi_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CICHLA_KELBERI,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CICHLA_PIQUITI_BUCKET = ITEMS.register("cichla_piquiti_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CICHLA_PIQUITI,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CICHLA_PINIMA_BUCKET = ITEMS.register("cichla_pinima_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CICHLA_PINIMA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CICHLA_OCELLARIS_BUCKET = ITEMS.register("cichla_ocellaris_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CICHLA_OCELLARIS,
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
    public static final RegistryObject<Item> MYLOPHARYNGODON_PICEUS_BUCKET = ITEMS.register("mylopharyngodon_piceus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.MYLOPHARYNGODON_PICEUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> CTENOPHARYNGODON_IDELLA_BUCKET = ITEMS.register("ctenopharyngodon_idella_bucket",
            () -> new MobBucketItem(
                    BvfEntities.CTENOPHARYNGODON_IDELLA,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> HYPOPHTHALMICHTHYS_MOLITRIX_BUCKET = ITEMS.register("hypophthalmichthys_molitrix_bucket",
            () -> new MobBucketItem(
                    BvfEntities.HYPOPHTHALMICHTHYS_MOLITRIX,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> HYPOPHTHALMICHTHYS_NOBILIS_BUCKET = ITEMS.register("hypophthalmichthys_nobilis_bucket",
            () -> new MobBucketItem(
                    BvfEntities.HYPOPHTHALMICHTHYS_NOBILIS,
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
    public static final RegistryObject<Item> AMPHIPRION_BIACULEATUS_BUCKET = ITEMS.register("amphiprion_biaculeatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_BIACULEATUS,
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
    public static final RegistryObject<Item> AMPHIPRION_THIELLEI_BUCKET = ITEMS.register("amphiprion_thiellei_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_THIELLEI,
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
    public static final RegistryObject<Item> AMPHIPRION_BICINCTUS_BUCKET = ITEMS.register("amphiprion_bicinctus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_BICINCTUS,
                    () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH,
                    new Item.Properties().stacksTo(1)
            ));
    public static final RegistryObject<Item> AMPHIPRION_EPHIPPIUM_BUCKET = ITEMS.register("amphiprion_ephippium_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_EPHIPPIUM,
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
    public static final RegistryObject<Item> AMPHIPRION_FRENATUS_BUCKET = ITEMS.register("amphiprion_frenatus_bucket",
            () -> new MobBucketItem(
                    BvfEntities.AMPHIPRION_FRENATUS,
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
    public static final RegistryObject<Item> BETTA_SIAMORIENTALIS_BUCKET = ITEMS.register("betta_siamorientalis_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BETTA_SIAMORIENTALIS,
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
    public static final RegistryObject<Item> BETTA_FUSCA_BUCKET = ITEMS.register("betta_fusca_bucket",
            () -> new MobBucketItem(
                    BvfEntities.BETTA_FUSCA,
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
    //Spawn Egg backgroundColor should always be 0xFFFFFF and highlightColor should always be 0x000000.
    public static final RegistryObject<Item> MELANOGRAMMUS_AEGLEFINUS_SPAWN_EGG = ITEMS.register("melanogrammus_aeglefinus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BVC_MELANOGRAMMUS_AEGLEFINUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> GADUS_MORHUA_SPAWN_EGG = ITEMS.register("gadus_morhua_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BVC_GADUS_MORHUA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> GADUS_MACROCEPHALUS_SPAWN_EGG = ITEMS.register("gadus_macrocephalus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BVC_GADUS_MACROCEPHALUS,
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
    public static final RegistryObject<Item> TAKIFUGU_XANTHOPTERUS_SPAWN_EGG = ITEMS.register("takifugu_xanthopterus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.TAKIFUGU_XANTHOPTERUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> TAKIFUGU_OBSCURUS_SPAWN_EGG = ITEMS.register("takifugu_obscurus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.TAKIFUGU_OBSCURUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> PTEROIS_VOLITANS_SPAWN_EGG = ITEMS.register("pterois_volitans_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.PTEROIS_VOLITANS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> PTEROIS_LUNULATA_SPAWN_EGG = ITEMS.register("pterois_lunulata_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.PTEROIS_LUNULATA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> PTEROIS_RADIATA_SPAWN_EGG = ITEMS.register("pterois_radiata_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.PTEROIS_RADIATA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> DERMOCHELYS_CORIACEA_SPAWN_EGG = ITEMS.register("dermochelys_coriacea_spawn_egg",
            () -> new ForgeSpawnEggItem(BvfEntities.DERMOCHELYS_CORIACEA, 0x292D32, 0xA9A49B, new Item.Properties()));
    public static final RegistryObject<Item> DERMOCHELYS_CORIACEA_BUCKET = ITEMS.register("dermochelys_coriacea_bucket",
            () -> new MobBucketItem(BvfEntities.DERMOCHELYS_CORIACEA, () -> Fluids.WATER,
                    () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DERMOCHELYS_CORIACEA = ITEMS.register("dermochelys_coriacea",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder()
                    .nutrition(3).saturationMod(0.3F).build())));
    public static final RegistryObject<Item> DIODON_HOLOCANTHUS_SPAWN_EGG = ITEMS.register("diodon_holocanthus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.DIODON_HOLOCANTHUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> NAUTILUS_POMPILIUS_SPAWN_EGG = ITEMS.register("nautilus_pompilius_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.NAUTILUS_POMPILIUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> COMATULIDA_SPAWN_EGG = ITEMS.register("comatulida_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.COMATULIDA,
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
    public static final RegistryObject<Item> KAJIKIA_AUDAX_SPAWN_EGG = ITEMS.register("kajikia_audax_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.KAJIKIA_AUDAX,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> NEMATISTIUS_PECTORALIS_SPAWN_EGG = ITEMS.register("nematistius_pectoralis_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.NEMATISTIUS_PECTORALIS,
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
    public static final RegistryObject<Item> EPINEPHELUS_TUKULA_SPAWN_EGG = ITEMS.register("epinephelus_tukula_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.EPINEPHELUS_TUKULA,
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
    public static final RegistryObject<Item> ACANTHURUS_LEUCOPAREIUS_SPAWN_EGG = ITEMS.register("acanthurus_leucopareius_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.ACANTHURUS_LEUCOPAREIUS,
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
    public static final RegistryObject<Item> CHAETODON_XANTHURUS_SPAWN_EGG = ITEMS.register("chaetodon_xanthurus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CHAETODON_XANTHURUS,
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
    public static final RegistryObject<Item> CICHLA_ORINOCENSIS_SPAWN_EGG = ITEMS.register("cichla_orinocensis_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CICHLA_ORINOCENSIS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CICHLA_JARIINA_SPAWN_EGG = ITEMS.register("cichla_jariina_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CICHLA_JARIINA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CICHLA_KELBERI_SPAWN_EGG = ITEMS.register("cichla_kelberi_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CICHLA_KELBERI,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CICHLA_PIQUITI_SPAWN_EGG = ITEMS.register("cichla_piquiti_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CICHLA_PIQUITI,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CICHLA_PINIMA_SPAWN_EGG = ITEMS.register("cichla_pinima_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CICHLA_PINIMA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CICHLA_OCELLARIS_SPAWN_EGG = ITEMS.register("cichla_ocellaris_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CICHLA_OCELLARIS,
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
    public static final RegistryObject<Item> AMPHIPRION_BIACULEATUS_SPAWN_EGG = ITEMS.register("amphiprion_biaculeatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_BIACULEATUS,
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
    public static final RegistryObject<Item> AMPHIPRION_THIELLEI_SPAWN_EGG = ITEMS.register("amphiprion_thiellei_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_THIELLEI,
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
    public static final RegistryObject<Item> AMPHIPRION_BICINCTUS_SPAWN_EGG = ITEMS.register("amphiprion_bicinctus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_BICINCTUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> AMPHIPRION_EPHIPPIUM_SPAWN_EGG = ITEMS.register("amphiprion_ephippium_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_EPHIPPIUM,
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
    public static final RegistryObject<Item> AMPHIPRION_FRENATUS_SPAWN_EGG = ITEMS.register("amphiprion_frenatus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.AMPHIPRION_FRENATUS,
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
    public static final RegistryObject<Item> BETTA_SIAMORIENTALIS_SPAWN_EGG = ITEMS.register("betta_siamorientalis_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BETTA_SIAMORIENTALIS,
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
    public static final RegistryObject<Item> BETTA_FUSCA_SPAWN_EGG = ITEMS.register("betta_fusca_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.BETTA_FUSCA,
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
    public static final RegistryObject<Item> MYLOPHARYNGODON_PICEUS_SPAWN_EGG = ITEMS.register("mylopharyngodon_piceus_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.MYLOPHARYNGODON_PICEUS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> CTENOPHARYNGODON_IDELLA_SPAWN_EGG = ITEMS.register("ctenopharyngodon_idella_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.CTENOPHARYNGODON_IDELLA,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> HYPOPHTHALMICHTHYS_MOLITRIX_SPAWN_EGG = ITEMS.register("hypophthalmichthys_molitrix_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.HYPOPHTHALMICHTHYS_MOLITRIX,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    public static final RegistryObject<Item> HYPOPHTHALMICHTHYS_NOBILIS_SPAWN_EGG = ITEMS.register("hypophthalmichthys_nobilis_spawn_egg",
            () -> new ForgeSpawnEggItem(
                    BvfEntities.HYPOPHTHALMICHTHYS_NOBILIS,
                    0xFFFFFF,
                    0x000000,
                    new Item.Properties()
            ));
    //Food
    public static final RegistryObject<Item> MELANOGRAMMUS_AEGLEFINUS = ITEMS.register("melanogrammus_aeglefinus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> GADUS_MORHUA = ITEMS.register("gadus_morhua",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> GADUS_MACROCEPHALUS = ITEMS.register("gadus_macrocephalus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> MALE_SALMON = ITEMS.register("male_salmon",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> FEMALE_SALMON = ITEMS.register("female_salmon",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PACIFIC_SALMON = ITEMS.register("pacific_salmon",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> TAKIFUGU_XANTHOPTERUS = ITEMS.register("takifugu_xanthopterus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final RegistryObject<Item> TAKIFUGU_OBSCURUS = ITEMS.register("takifugu_obscurus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final RegistryObject<Item> PTEROIS_VOLITANS = ITEMS.register("pterois_volitans",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PTEROIS_LUNULATA = ITEMS.register("pterois_lunulata",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> PTEROIS_RADIATA = ITEMS.register("pterois_radiata",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> DIODON_HOLOCANTHUS = ITEMS.register("diodon_holocanthus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f)
                    .effect(() -> new MobEffectInstance(MobEffects.POISON, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200, 0), 1.0f)
                    .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 1200, 0), 1.0f).build())));
    public static final RegistryObject<Item> KAJIKIA_AUDAX = ITEMS.register("kajikia_audax",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> COOKED_KAJIKIA_AUDAX = ITEMS.register("cooked_kajikia_audax",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> NEMATISTIUS_PECTORALIS = ITEMS.register("nematistius_pectoralis",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> COOKED_NEMATISTIUS_PECTORALIS = ITEMS.register("cooked_nematistius_pectoralis",
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
    public static final RegistryObject<Item> EPINEPHELUS_TUKULA = ITEMS.register("epinephelus_tukula",
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

    public static final RegistryObject<Item> COMATULIDA_TENTACLE = ITEMS.register("comatulida_tentacle",
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
    public static final RegistryObject<Item> ACANTHURUS_LEUCOPAREIUS = ITEMS.register("acanthurus_leucopareius",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> ACANTHURUS_LINEATUS = ITEMS.register("acanthurus_lineatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_STRIATUS = ITEMS.register("chaetodon_striatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_UNIMACULATUS = ITEMS.register("chaetodon_unimaculatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_AURIGA = ITEMS.register("chaetodon_auriga",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_XANTHURUS = ITEMS.register("chaetodon_xanthurus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_RETICULATUS = ITEMS.register("chaetodon_reticulatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CHAETODON_SPECULUM = ITEMS.register("chaetodon_speculum",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CICHLA_ORINOCENSIS = ITEMS.register("cichla_orinocensis",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CICHLA_JARIINA = ITEMS.register("cichla_jariina",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CICHLA_KELBERI = ITEMS.register("cichla_kelberi",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CICHLA_PIQUITI = ITEMS.register("cichla_piquiti",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CICHLA_PINIMA = ITEMS.register("cichla_pinima",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> CICHLA_OCELLARIS = ITEMS.register("cichla_ocellaris",
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
    public static final RegistryObject<Item> AMPHIPRION_BIACULEATUS = ITEMS.register("amphiprion_biaculeatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_POLYMNUS = ITEMS.register("amphiprion_polymnus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_THIELLEI = ITEMS.register("amphiprion_thiellei",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_PERCULA = ITEMS.register("amphiprion_percula",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_PERIDERAION = ITEMS.register("amphiprion_perideraion",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_CLARKII = ITEMS.register("amphiprion_clarkii",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_BICINCTUS = ITEMS.register("amphiprion_bicinctus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_EPHIPPIUM = ITEMS.register("amphiprion_ephippium",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOPTERUS = ITEMS.register("amphiprion_chrysopterus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_FRENATUS = ITEMS.register("amphiprion_frenatus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_MCCULLOCHI = ITEMS.register("amphiprion_mccullochi",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_MELANOPUS = ITEMS.register("amphiprion_melanopus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> AMPHIPRION_TRICINCTUS = ITEMS.register("amphiprion_tricinctus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_SPLENDENS = ITEMS.register("betta_splendens",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_SIAMORIENTALIS = ITEMS.register("betta_siamorientalis",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_SMARAGDINA = ITEMS.register("betta_smaragdina",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_PICTA = ITEMS.register("betta_picta",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_SIMPLEX = ITEMS.register("betta_simplex",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> BETTA_FUSCA = ITEMS.register("betta_fusca",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1f).build())));
    public static final RegistryObject<Item> MEGALOPS_ATLANTICUS = ITEMS.register("megalops_atlanticus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4f).build())));
    public static final RegistryObject<Item> KATSUWONUS_PELAMIS = ITEMS.register("katsuwonus_pelamis",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> COOKED_KATSUWONUS_PELAMIS = ITEMS.register("cooked_katsuwonus_pelamis",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> MYLOPHARYNGODON_PICEUS = ITEMS.register("mylopharyngodon_piceus",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> COOKED_MYLOPHARYNGODON_PICEUS = ITEMS.register("cooked_mylopharyngodon_piceus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> CTENOPHARYNGODON_IDELLA = ITEMS.register("ctenopharyngodon_idella",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> COOKED_CTENOPHARYNGODON_IDELLA = ITEMS.register("cooked_ctenopharyngodon_idella",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> HYPOPHTHALMICHTHYS_MOLITRIX = ITEMS.register("hypophthalmichthys_molitrix",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> COOKED_HYPOPHTHALMICHTHYS_MOLITRIX = ITEMS.register("cooked_hypophthalmichthys_molitrix",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    public static final RegistryObject<Item> HYPOPHTHALMICHTHYS_NOBILIS = ITEMS.register("hypophthalmichthys_nobilis",
            () -> new RawFishItem(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> COOKED_HYPOPHTHALMICHTHYS_NOBILIS = ITEMS.register("cooked_hypophthalmichthys_nobilis",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).build())));
    //Specimen
    public static final RegistryObject<Item> GADUS_MORHUA_SPECIMEN = ITEMS.register("gadus_morhua_specimen",
            () -> new BlockItem(BvfBlocks.GADUS_MORHUA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GADUS_MACROCEPHALUS_SPECIMEN = ITEMS.register("gadus_macrocephalus_specimen",
            () -> new BlockItem(BvfBlocks.GADUS_MACROCEPHALUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MELANOGRAMMUS_AEGLEFINUS_SPECIMEN = ITEMS.register("melanogrammus_aeglefinus_specimen",
            () -> new BlockItem(BvfBlocks.MELANOGRAMMUS_AEGLEFINUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PACIFIC_SALMON_SPECIMEN = ITEMS.register("pacific_salmon_specimen",
            () -> new BlockItem(BvfBlocks.PACIFIC_SALMON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MALE_SALMON_SPECIMEN = ITEMS.register("male_salmon_specimen",
            () -> new BlockItem(BvfBlocks.MALE_SALMON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FEMALE_SALMON_SPECIMEN = ITEMS.register("female_salmon_specimen",
            () -> new BlockItem(BvfBlocks.FEMALE_SALMON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> KAJIKIA_AUDAX_SPECIMEN = ITEMS.register("kajikia_audax_specimen",
            () -> new BlockItem(BvfBlocks.KAJIKIA_AUDAX_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NEMATISTIUS_PECTORALIS_SPECIMEN = ITEMS.register("nematistius_pectoralis_specimen",
            () -> new BlockItem(BvfBlocks.NEMATISTIUS_PECTORALIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
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
    public static final RegistryObject<Item> EPINEPHELUS_TUKULA_SPECIMEN = ITEMS.register("epinephelus_tukula_specimen",
            () -> new BlockItem(BvfBlocks.EPINEPHELUS_TUKULA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CICHLA_ORINOCENSIS_SPECIMEN = ITEMS.register("cichla_orinocensis_specimen",
            () -> new BlockItem(BvfBlocks.CICHLA_ORINOCENSIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CICHLA_JARIINA_SPECIMEN = ITEMS.register("cichla_jariina_specimen",
            () -> new BlockItem(BvfBlocks.CICHLA_JARIINA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CICHLA_KELBERI_SPECIMEN = ITEMS.register("cichla_kelberi_specimen",
            () -> new BlockItem(BvfBlocks.CICHLA_KELBERI_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CICHLA_PIQUITI_SPECIMEN = ITEMS.register("cichla_piquiti_specimen",
            () -> new BlockItem(BvfBlocks.CICHLA_PIQUITI_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CICHLA_PINIMA_SPECIMEN = ITEMS.register("cichla_pinima_specimen",
            () -> new BlockItem(BvfBlocks.CICHLA_PINIMA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CICHLA_OCELLARIS_SPECIMEN = ITEMS.register("cichla_ocellaris_specimen",
            () -> new BlockItem(BvfBlocks.CICHLA_OCELLARIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHANNA_MICROPELTES_SPECIMEN = ITEMS.register("channa_micropeltes_specimen",
            () -> new BlockItem(BvfBlocks.CHANNA_MICROPELTES_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHANNA_ARGUS_SPECIMEN = ITEMS.register("channa_argus_specimen",
            () -> new BlockItem(BvfBlocks.CHANNA_ARGUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ELOPICHTHYS_BAMBUSA_SPECIMEN = ITEMS.register("elopichthys_bambusa_specimen",
            () -> new BlockItem(BvfBlocks.ELOPICHTHYS_BAMBUSA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HUSO_DAURICUS_SPECIMEN = ITEMS.register("huso_dauricus_specimen",
            () -> new BlockItem(BvfBlocks.HUSO_DAURICUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MYLOPHARYNGODON_PICEUS_SPECIMEN = ITEMS.register("mylopharyngodon_piceus_specimen",
            () -> new BlockItem(BvfBlocks.MYLOPHARYNGODON_PICEUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CTENOPHARYNGODON_IDELLA_SPECIMEN = ITEMS.register("ctenopharyngodon_idella_specimen",
            () -> new BlockItem(BvfBlocks.CTENOPHARYNGODON_IDELLA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HYPOPHTHALMICHTHYS_MOLITRIX_SPECIMEN = ITEMS.register("hypophthalmichthys_molitrix_specimen",
            () -> new BlockItem(BvfBlocks.HYPOPHTHALMICHTHYS_MOLITRIX_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HYPOPHTHALMICHTHYS_NOBILIS_SPECIMEN = ITEMS.register("hypophthalmichthys_nobilis_specimen",
            () -> new BlockItem(BvfBlocks.HYPOPHTHALMICHTHYS_NOBILIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MEGALOPS_ATLANTICUS_SPECIMEN = ITEMS.register("megalops_atlanticus_specimen",
            () -> new BlockItem(BvfBlocks.MEGALOPS_ATLANTICUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> KATSUWONUS_PELAMIS_SPECIMEN = ITEMS.register("katsuwonus_pelamis_specimen",
            () -> new BlockItem(BvfBlocks.KATSUWONUS_PELAMIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TAKIFUGU_OBSCURUS_SPECIMEN = ITEMS.register("takifugu_obscurus_specimen",
            () -> new BlockItem(BvfBlocks.TAKIFUGU_OBSCURUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PTEROIS_VOLITANS_SPECIMEN = ITEMS.register("pterois_volitans_specimen",
            () -> new BlockItem(BvfBlocks.PTEROIS_VOLITANS_SPECIMEN.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PTEROIS_LUNULATA_SPECIMEN = ITEMS.register("pterois_lunulata_specimen",
            () -> new BlockItem(BvfBlocks.PTEROIS_LUNULATA_SPECIMEN.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PTEROIS_RADIATA_SPECIMEN = ITEMS.register("pterois_radiata_specimen",
            () -> new BlockItem(BvfBlocks.PTEROIS_RADIATA_SPECIMEN.get(), new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TAKIFUGU_XANTHOPTERUS_SPECIMEN = ITEMS.register("takifugu_xanthopterus_specimen",
            () -> new BlockItem(BvfBlocks.TAKIFUGU_XANTHOPTERUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DIODON_HOLOCANTHUS_SPECIMEN = ITEMS.register("diodon_holocanthus_specimen",
            () -> new BlockItem(BvfBlocks.DIODON_HOLOCANTHUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_SPLENDENS_SPECIMEN = ITEMS.register("betta_splendens_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_SPLENDENS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_SIAMORIENTALIS_SPECIMEN = ITEMS.register("betta_siamorientalis_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_SIAMORIENTALIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_SMARAGDINA_SPECIMEN = ITEMS.register("betta_smaragdina_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_SMARAGDINA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_PICTA_SPECIMEN = ITEMS.register("betta_picta_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_PICTA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_SIMPLEX_SPECIMEN = ITEMS.register("betta_simplex_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_SIMPLEX_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BETTA_FUSCA_SPECIMEN = ITEMS.register("betta_fusca_specimen",
            () -> new BlockItem(BvfBlocks.BETTA_FUSCA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_ACHILLES_SPECIMEN = ITEMS.register("acanthurus_achilles_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_ACHILLES_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_LEUCOSTERNON_SPECIMEN = ITEMS.register("acanthurus_leucosternon_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_LEUCOSTERNON_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PARACANTHURUS_HEPATUS_SPECIMEN = ITEMS.register("paracanthurus_hepatus_specimen",
            () -> new BlockItem(BvfBlocks.PARACANTHURUS_HEPATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_TRIOSTEGUS_SPECIMEN = ITEMS.register("acanthurus_triostegus_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_TRIOSTEGUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_LEUCOPAREIUS_SPECIMEN = ITEMS.register("acanthurus_leucopareius_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_LEUCOPAREIUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ACANTHURUS_LINEATUS_SPECIMEN = ITEMS.register("acanthurus_lineatus_specimen",
            () -> new BlockItem(BvfBlocks.ACANTHURUS_LINEATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_STRIATUS_SPECIMEN = ITEMS.register("chaetodon_striatus_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_STRIATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_UNIMACULATUS_SPECIMEN = ITEMS.register("chaetodon_unimaculatus_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_UNIMACULATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_AURIGA_SPECIMEN = ITEMS.register("chaetodon_auriga_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_AURIGA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_XANTHURUS_SPECIMEN = ITEMS.register("chaetodon_xanthurus_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_XANTHURUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_RETICULATUS_SPECIMEN = ITEMS.register("chaetodon_reticulatus_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_RETICULATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CHAETODON_SPECULUM_SPECIMEN = ITEMS.register("chaetodon_speculum_specimen",
            () -> new BlockItem(BvfBlocks.CHAETODON_SPECULUM_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_OCELLARIS_SPECIMEN = ITEMS.register("amphiprion_ocellaris_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_OCELLARIS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_BIACULEATUS_SPECIMEN = ITEMS.register("amphiprion_biaculeatus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_BIACULEATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_POLYMNUS_SPECIMEN = ITEMS.register("amphiprion_polymnus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_POLYMNUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_THIELLEI_SPECIMEN = ITEMS.register("amphiprion_thiellei_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_THIELLEI_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_PERCULA_SPECIMEN = ITEMS.register("amphiprion_percula_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_PERCULA_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_PERIDERAION_SPECIMEN = ITEMS.register("amphiprion_perideraion_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_PERIDERAION_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_CLARKII_SPECIMEN = ITEMS.register("amphiprion_clarkii_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_CLARKII_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_BICINCTUS_SPECIMEN = ITEMS.register("amphiprion_bicinctus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_BICINCTUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_EPHIPPIUM_SPECIMEN = ITEMS.register("amphiprion_ephippium_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_EPHIPPIUM_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_CHRYSOPTERUS_SPECIMEN = ITEMS.register("amphiprion_chrysopterus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_CHRYSOPTERUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_FRENATUS_SPECIMEN = ITEMS.register("amphiprion_frenatus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_FRENATUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_MCCULLOCHI_SPECIMEN = ITEMS.register("amphiprion_mccullochi_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_MCCULLOCHI_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_MELANOPUS_SPECIMEN = ITEMS.register("amphiprion_melanopus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_MELANOPUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AMPHIPRION_TRICINCTUS_SPECIMEN = ITEMS.register("amphiprion_tricinctus_specimen",
            () -> new BlockItem(BvfBlocks.AMPHIPRION_TRICINCTUS_SPECIMEN.get(),new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DERMOCHELYS_CORIACEA_SPECIMEN = ITEMS.register("dermochelys_coriacea_specimen",
            () -> new BlockItem(BvfBlocks.DERMOCHELYS_CORIACEA_SPECIMEN.get(), new Item.Properties().stacksTo(1)));
    //Weapon
    public static final RegistryObject<Item> ENCHANTED_PUFFERFISH = ITEMS.register("enchanted_pufferfish",
            () -> new EnchantedPuffer(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
