package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.cichlid.*;
import cn.mlus.bettervannilafishes.entity.clownfish.*;
import cn.mlus.bettervannilafishes.entity.cod.AtlanticCod;
import cn.mlus.bettervannilafishes.entity.cod.HaddockCod;
import cn.mlus.bettervannilafishes.entity.cod.PacificCod;
import cn.mlus.bettervannilafishes.entity.featherstar.FeatherStarEntity;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.entity.nautilus.NautilusEntity;
import cn.mlus.bettervannilafishes.entity.pufferfish.ObscurePuffer;
import cn.mlus.bettervannilafishes.entity.pufferfish.PorcupineFish;
import cn.mlus.bettervannilafishes.entity.pufferfish.YellowFinPuffer;
import cn.mlus.bettervannilafishes.entity.salmon.FemaleSalmon;
import cn.mlus.bettervannilafishes.entity.salmon.MaleSalmon;
import cn.mlus.bettervannilafishes.entity.salmon.PacificSalmon;
import cn.mlus.bettervannilafishes.entity.spearfish.SpearfishEntity;
import cn.mlus.bettervannilafishes.entity.squid.DosidicusGigasEntity;
import cn.mlus.bettervannilafishes.entity.surgeonfish.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BvfEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,
            BetterVannilaFishes.MODID);

    public static final RegistryObject<EntityType<HaddockCod>> BVC_HADDOCK_COD = ENTITIES.register("haddock_cod",
            () -> EntityType.Builder.of(HaddockCod::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix("haddock_cod").toString()));
    public static final RegistryObject<EntityType<AtlanticCod>> BVC_ATLANTIC_COD = ENTITIES.register("atlantic_cod",
            () -> EntityType.Builder.of(AtlanticCod::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix( "atlantic_cod").toString()));
    public static final RegistryObject<EntityType<PacificCod>> BVC_PACIFIC_COD = ENTITIES.register("pacific_cod",
            () -> EntityType.Builder.of(PacificCod::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix("pacific_cod").toString()));

    public static final RegistryObject<EntityType<MaleSalmon>> BVC_SALMON_MALE = ENTITIES.register("male_salmon",
            () -> EntityType.Builder.of(MaleSalmon::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix("male_salmon").toString()));
    public static final RegistryObject<EntityType<FemaleSalmon>> BVC_SALMON_FEMALE = ENTITIES.register("female_salmon",
            () -> EntityType.Builder.of(FemaleSalmon::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix( "female_salmon").toString()));

    public static final RegistryObject<EntityType<PacificSalmon>> BVC_SALMON_PACIFIC = ENTITIES.register("pacific_salmon",
            () -> EntityType.Builder.of(PacificSalmon::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix( "pacific_salmon").toString()));

    public static final RegistryObject<EntityType<YellowFinPuffer>> YELLOW_FIN_PUFFER = ENTITIES.register("yellow_fin_puffer",
            () -> EntityType.Builder.of(YellowFinPuffer::new, MobCategory.WATER_AMBIENT)
                    .sized(1F,0.9F)
                    .build(BetterVannilaFishes.prefix("yellow_fin_puffer").toString()));

    public static final RegistryObject<EntityType<ObscurePuffer>> OBSCURE_PUFFER = ENTITIES.register("obscure_puffer",
            () -> EntityType.Builder.of(ObscurePuffer::new, MobCategory.WATER_AMBIENT)
                    .sized(1F,0.9F)
                    .build(BetterVannilaFishes.prefix("obscure_puffer").toString()));

    public static final RegistryObject<EntityType<PorcupineFish>> PORCUPINE_FISH = ENTITIES.register("porcupine_fish",
            () -> EntityType.Builder.of(PorcupineFish::new, MobCategory.WATER_AMBIENT)
                    .sized(1F,0.9F)
                    .build(BetterVannilaFishes.prefix("porcupine_fish").toString()));

    public static final RegistryObject<EntityType<NautilusEntity>> NAUTILUS = ENTITIES.register("nautilus",
            () -> EntityType.Builder.of(NautilusEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(0.55F,0.55F)
                    .build(BetterVannilaFishes.prefix("nautilus").toString()));

    public static final RegistryObject<EntityType<FeatherStarEntity>> FEATHER_STAR = ENTITIES.register("feather_star",
            () -> EntityType.Builder.of(FeatherStarEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.3F,0.8F)
                    .build(BetterVannilaFishes.prefix("feather_star").toString()));

    public static final RegistryObject<EntityType<SpearfishEntity>> SPEARFISH = ENTITIES.register("spearfish",
            () -> EntityType.Builder.of(SpearfishEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F,0.5F)
                    .build(BetterVannilaFishes.prefix("spearfish").toString()));
    public static final RegistryObject<EntityType<GaleocerdoCuvierEntity>> GALEOCERDO_CUVIER = ENTITIES.register("galeocerdo_cuvier",
            () -> EntityType.Builder.of(GaleocerdoCuvierEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(2.5F,1.6F)
                    .build(BetterVannilaFishes.prefix("galeocerdo_cuvier").toString()));

    public static final RegistryObject<EntityType<AcanthurusAchilles>> ACANTHURUS_ACHILLES = ENTITIES.register("acanthurus_achilles",
            () -> EntityType.Builder.of(AcanthurusAchilles::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_achilles").toString()));
    public static final RegistryObject<EntityType<AcanthurusLeucosternon>> ACANTHURUS_LEUCOSTERNON = ENTITIES.register("acanthurus_leucosternon",
            () -> EntityType.Builder.of(AcanthurusLeucosternon::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_leucosternon").toString()));
    public static final RegistryObject<EntityType<ParacanthurusHepatus>> PARACANTHURUS_HEPATUS = ENTITIES.register("paracanthurus_hepatus",
            () -> EntityType.Builder.of(ParacanthurusHepatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("paracanthurus_hepatus").toString()));
    public static final RegistryObject<EntityType<AcanthurusTriostegus>> ACANTHURUS_TRIOSTEGUS = ENTITIES.register("acanthurus_triostegus",
            () -> EntityType.Builder.of(AcanthurusTriostegus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_triostegus").toString()));
    public static final RegistryObject<EntityType<AcanthurusNigricans>> ACANTHURUS_NIGRICANS = ENTITIES.register("acanthurus_nigricans",
            () -> EntityType.Builder.of(AcanthurusNigricans::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_nigricans").toString()));
    public static final RegistryObject<EntityType<AcanthurusLineatus>> ACANTHURUS_LINEATUS = ENTITIES.register("acanthurus_lineatus",
            () -> EntityType.Builder.of(AcanthurusLineatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_lineatus").toString()));
    public static final RegistryObject<EntityType<AustraloherosFacetus>> AUSTRALOHEROS_FACETUS = ENTITIES.register("australoheros_facetus",
            () -> EntityType.Builder.of(AustraloherosFacetus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("australoheros_facetus").toString()));
    public static final RegistryObject<EntityType<CichlasomaBimaculatum>> CICHLASOMA_BIMACULATUM = ENTITIES.register("cichlasoma_bimaculatum",
            () -> EntityType.Builder.of(CichlasomaBimaculatum::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("cichlasoma_bimaculatum").toString()));
    public static final RegistryObject<EntityType<KrobiaGuianensis>> KROBIA_GUIANENSIS = ENTITIES.register("krobia_guianensis",
            () -> EntityType.Builder.of(KrobiaGuianensis::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("krobia_guianensis").toString()));
    public static final RegistryObject<EntityType<AequidensTetramerus>> AEQUIDENS_TETRAMERUS = ENTITIES.register("aequidens_tetramerus",
            () -> EntityType.Builder.of(AequidensTetramerus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("aequidens_tetramerus").toString()));
    public static final RegistryObject<EntityType<GymnogeophaghusBalzanii>> GYMNOGEOPHAGUS_BALZANII = ENTITIES.register("gymnogeophagus_balzanii",
            () -> EntityType.Builder.of(GymnogeophaghusBalzanii::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("gymnogeophagus_balzanii").toString()));
    public static final RegistryObject<EntityType<AstronotusOcellatus>> ASTRONOTUS_OCELLATUS = ENTITIES.register("astronotus_ocellatus",
            () -> EntityType.Builder.of(AstronotusOcellatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("astronotus_ocellatus").toString()));
    public static final RegistryObject<EntityType<AmphiprionOcellaris>> AMPHIPRION_OCELLARIS = ENTITIES.register("amphiprion_ocellaris",
            () -> EntityType.Builder.of(AmphiprionOcellaris::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_ocellaris").toString()));
    public static final RegistryObject<EntityType<PremnasBiaculeatus>> PREMNAS_BIACULEATUS = ENTITIES.register("premnas_biaculeatus",
            () -> EntityType.Builder.of(PremnasBiaculeatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("premnas_biaculeatus").toString()));
    public static final RegistryObject<EntityType<AmphiprionPolymnus>> AMPHIPRION_POLYMNUS = ENTITIES.register("amphiprion_polymnus",
            () -> EntityType.Builder.of(AmphiprionPolymnus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_polymnus").toString()));
    public static final RegistryObject<EntityType<AmphiprionPerideraion>> AMPHIPRION_PERIDERAION = ENTITIES.register("amphiprion_perideraion",
            () -> EntityType.Builder.of(AmphiprionPerideraion::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_perideraion").toString()));
    public static final RegistryObject<EntityType<AmphiprionClarkii>> AMPHIPRION_CLARKII = ENTITIES.register("amphiprion_clarkii",
            () -> EntityType.Builder.of(AmphiprionClarkii::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_clarkii").toString()));
    public static final RegistryObject<EntityType<AmphiprionPercula>> AMPHIPRION_PERCULA = ENTITIES.register("amphiprion_percula",
            () -> EntityType.Builder.of(AmphiprionPercula::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_percula").toString()));
    public static final RegistryObject<EntityType<DosidicusGigasEntity>> DOSIDICUS_GIGAS = ENTITIES.register("dosidicus_gigas",
            () -> EntityType.Builder.of(DosidicusGigasEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.9F)
                    .build(BetterVannilaFishes.prefix("dosidicus_gigas").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
