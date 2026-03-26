package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.cichlid.*;
import cn.mlus.bettervannilafishes.entity.clownfish.*;
import cn.mlus.bettervannilafishes.entity.cod.AtlanticCod;
import cn.mlus.bettervannilafishes.entity.cod.HaddockCod;
import cn.mlus.bettervannilafishes.entity.cod.PacificCod;
import cn.mlus.bettervannilafishes.entity.featherstar.FeatherStarEntity;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.entity.epinephelus.EpinephelusItajara;
import cn.mlus.bettervannilafishes.entity.epinephelus.EpinephelusLanceolatus;
import cn.mlus.bettervannilafishes.entity.epinephelus.EpinephelusMelanostigma;
import cn.mlus.bettervannilafishes.entity.nautilus.NautilusEntity;
import cn.mlus.bettervannilafishes.entity.pufferfish.ObscurePuffer;
import cn.mlus.bettervannilafishes.entity.pufferfish.PorcupineFish;
import cn.mlus.bettervannilafishes.entity.pufferfish.YellowFinPuffer;
import cn.mlus.bettervannilafishes.entity.butterflyfish.*;
import cn.mlus.bettervannilafishes.entity.salmon.FemaleSalmon;
import cn.mlus.bettervannilafishes.entity.salmon.MaleSalmon;
import cn.mlus.bettervannilafishes.entity.salmon.PacificSalmon;
import cn.mlus.bettervannilafishes.entity.spearfish.SpearfishEntity;
import cn.mlus.bettervannilafishes.entity.squid.DosidicusGigasEntity;
import cn.mlus.bettervannilafishes.entity.surgeonfish.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BvfEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE,
            BetterVannilaFishes.MODID);

    public static final DeferredHolder<EntityType<?>,EntityType<HaddockCod>> BVC_HADDOCK_COD = ENTITIES.register("haddock_cod",
            () -> EntityType.Builder.of(HaddockCod::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix("haddock_cod").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AtlanticCod>> BVC_ATLANTIC_COD = ENTITIES.register("atlantic_cod",
            () -> EntityType.Builder.of(AtlanticCod::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix( "atlantic_cod").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<PacificCod>> BVC_PACIFIC_COD = ENTITIES.register("pacific_cod",
            () -> EntityType.Builder.of(PacificCod::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix("pacific_cod").toString()));

    public static final DeferredHolder<EntityType<?>,EntityType<MaleSalmon>> BVC_SALMON_MALE = ENTITIES.register("male_salmon",
            () -> EntityType.Builder.of(MaleSalmon::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix("male_salmon").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<FemaleSalmon>> BVC_SALMON_FEMALE = ENTITIES.register("female_salmon",
            () -> EntityType.Builder.of(FemaleSalmon::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix( "female_salmon").toString()));

    public static final DeferredHolder<EntityType<?>,EntityType<PacificSalmon>> BVC_SALMON_PACIFIC = ENTITIES.register("pacific_salmon",
            () -> EntityType.Builder.of(PacificSalmon::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix( "pacific_salmon").toString()));

    public static final DeferredHolder<EntityType<?>,EntityType<YellowFinPuffer>> YELLOW_FIN_PUFFER = ENTITIES.register("yellow_fin_puffer",
            () -> EntityType.Builder.of(YellowFinPuffer::new, MobCategory.WATER_AMBIENT)
                    .sized(1F,0.9F)
                    .build(BetterVannilaFishes.prefix("yellow_fin_puffer").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ObscurePuffer>> OBSCURE_PUFFER = ENTITIES.register("obscure_puffer",
            () -> EntityType.Builder.of(ObscurePuffer::new, MobCategory.WATER_AMBIENT)
                    .sized(1F,0.9F)
                    .build(BetterVannilaFishes.prefix("obscure_puffer").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<PorcupineFish>> PORCUPINE_FISH = ENTITIES.register("porcupine_fish",
            () -> EntityType.Builder.of(PorcupineFish::new, MobCategory.WATER_AMBIENT)
                    .sized(1F,0.9F)
                    .build(BetterVannilaFishes.prefix("porcupine_fish").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<NautilusEntity>> NAUTILUS = ENTITIES.register("nautilus",
            () -> EntityType.Builder.of(NautilusEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(0.55F,0.55F)
                    .build(BetterVannilaFishes.prefix("nautilus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<FeatherStarEntity>> FEATHER_STAR = ENTITIES.register("feather_star",
            () -> EntityType.Builder.of(FeatherStarEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.3F,0.8F)
                    .build(BetterVannilaFishes.prefix("feather_star").toString()));

    public static final DeferredHolder<EntityType<?>,EntityType<SpearfishEntity>> SPEARFISH = ENTITIES.register("spearfish",
            () -> EntityType.Builder.of(SpearfishEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F,0.5F)
                    .build(BetterVannilaFishes.prefix("spearfish").toString()));
    public static final DeferredHolder<EntityType<?>, EntityType<GaleocerdoCuvierEntity>> GALEOCERDO_CUVIER = ENTITIES.register("galeocerdo_cuvier",
            () -> EntityType.Builder.of(GaleocerdoCuvierEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(2.5F,1.6F)
                    .build(BetterVannilaFishes.prefix("galeocerdo_cuvier").toString()));
    public static final RegistryObject<EntityType<EpinephelusLanceolatus>> EPINEPHELUS_LANCEOLATUS = ENTITIES.register("epinephelus_lanceolatus",
            () -> EntityType.Builder.of(EpinephelusLanceolatus::new, MobCategory.WATER_AMBIENT)
                    .sized(2.5F, 1.6F)
                    .build(BetterVannilaFishes.prefix("epinephelus_lanceolatus").toString()));
    public static final RegistryObject<EntityType<EpinephelusItajara>> EPINEPHELUS_ITAJARA = ENTITIES.register("epinephelus_itajara",
            () -> EntityType.Builder.of(EpinephelusItajara::new, MobCategory.WATER_AMBIENT)
                    .sized(2.5F, 1.6F)
                    .build(BetterVannilaFishes.prefix("epinephelus_itajara").toString()));
    public static final RegistryObject<EntityType<EpinephelusMelanostigma>> EPINEPHELUS_MELANOSTIGMA = ENTITIES.register("epinephelus_melanostigma",
            () -> EntityType.Builder.of(EpinephelusMelanostigma::new, MobCategory.WATER_AMBIENT)
                    .sized(2.5F, 1.6F)
                    .build(BetterVannilaFishes.prefix("epinephelus_melanostigma").toString()));

    public static final DeferredHolder<EntityType<?>,EntityType<AcanthurusAchilles>> ACANTHURUS_ACHILLES = ENTITIES.register("acanthurus_achilles",
            () -> EntityType.Builder.of(AcanthurusAchilles::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_achilles").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AcanthurusLeucosternon>> ACANTHURUS_LEUCOSTERNON = ENTITIES.register("acanthurus_leucosternon",
            () -> EntityType.Builder.of(AcanthurusLeucosternon::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_leucosternon").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ParacanthurusHepatus>> PARACANTHURUS_HEPATUS = ENTITIES.register("paracanthurus_hepatus",
            () -> EntityType.Builder.of(ParacanthurusHepatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("paracanthurus_hepatus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AcanthurusTriostegus>> ACANTHURUS_TRIOSTEGUS = ENTITIES.register("acanthurus_triostegus",
            () -> EntityType.Builder.of(AcanthurusTriostegus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_triostegus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AcanthurusNigricans>> ACANTHURUS_NIGRICANS = ENTITIES.register("acanthurus_nigricans",
            () -> EntityType.Builder.of(AcanthurusNigricans::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_nigricans").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AcanthurusLineatus>> ACANTHURUS_LINEATUS = ENTITIES.register("acanthurus_lineatus",
            () -> EntityType.Builder.of(AcanthurusLineatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_lineatus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ChaetodonStriatus>> CHAETODON_STRIATUS = ENTITIES.register("chaetodon_striatus",
            () -> EntityType.Builder.of(ChaetodonStriatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_striatus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ChaetodonUnimaculatus>> CHAETODON_UNIMACULATUS = ENTITIES.register("chaetodon_unimaculatus",
            () -> EntityType.Builder.of(ChaetodonUnimaculatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_unimaculatus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ChaetodonAuriga>> CHAETODON_AURIGA = ENTITIES.register("chaetodon_auriga",
            () -> EntityType.Builder.of(ChaetodonAuriga::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_auriga").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ChaetodonCollare>> CHAETODON_COLLARE = ENTITIES.register("chaetodon_collare",
            () -> EntityType.Builder.of(ChaetodonCollare::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_collare").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ChaetodonReticulatus>> CHAETODON_RETICULATUS = ENTITIES.register("chaetodon_reticulatus",
            () -> EntityType.Builder.of(ChaetodonReticulatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_reticulatus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ChaetodonSpeculum>> CHAETODON_SPECULUM = ENTITIES.register("chaetodon_speculum",
            () -> EntityType.Builder.of(ChaetodonSpeculum::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_speculum").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AustraloherosFacetus>> AUSTRALOHEROS_FACETUS = ENTITIES.register("australoheros_facetus",
            () -> EntityType.Builder.of(AustraloherosFacetus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("australoheros_facetus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<CichlasomaBimaculatum>> CICHLASOMA_BIMACULATUM = ENTITIES.register("cichlasoma_bimaculatum",
            () -> EntityType.Builder.of(CichlasomaBimaculatum::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("cichlasoma_bimaculatum").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<KrobiaGuianensis>> KROBIA_GUIANENSIS = ENTITIES.register("krobia_guianensis",
            () -> EntityType.Builder.of(KrobiaGuianensis::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("krobia_guianensis").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AequidensTetramerus>> AEQUIDENS_TETRAMERUS = ENTITIES.register("aequidens_tetramerus",
            () -> EntityType.Builder.of(AequidensTetramerus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("aequidens_tetramerus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<GymnogeophaghusBalzanii>> GYMNOGEOPHAGUS_BALZANII = ENTITIES.register("gymnogeophagus_balzanii",
            () -> EntityType.Builder.of(GymnogeophaghusBalzanii::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("gymnogeophagus_balzanii").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AstronotusOcellatus>> ASTRONOTUS_OCELLATUS = ENTITIES.register("astronotus_ocellatus",
            () -> EntityType.Builder.of(AstronotusOcellatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("astronotus_ocellatus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionOcellaris>> AMPHIPRION_OCELLARIS = ENTITIES.register("amphiprion_ocellaris",
            () -> EntityType.Builder.of(AmphiprionOcellaris::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_ocellaris").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<PremnasBiaculeatus>> PREMNAS_BIACULEATUS = ENTITIES.register("premnas_biaculeatus",
            () -> EntityType.Builder.of(PremnasBiaculeatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("premnas_biaculeatus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionPolymnus>> AMPHIPRION_POLYMNUS = ENTITIES.register("amphiprion_polymnus",
            () -> EntityType.Builder.of(AmphiprionPolymnus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_polymnus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionPerideraion>> AMPHIPRION_PERIDERAION = ENTITIES.register("amphiprion_perideraion",
            () -> EntityType.Builder.of(AmphiprionPerideraion::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_perideraion").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionClarkii>> AMPHIPRION_CLARKII = ENTITIES.register("amphiprion_clarkii",
            () -> EntityType.Builder.of(AmphiprionClarkii::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_clarkii").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionPercula>> AMPHIPRION_PERCULA = ENTITIES.register("amphiprion_percula",
            () -> EntityType.Builder.of(AmphiprionPercula::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_percula").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<DosidicusGigasEntity>> DOSIDICUS_GIGAS = ENTITIES.register("dosidicus_gigas",
            () -> EntityType.Builder.of(DosidicusGigasEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.9F)
                    .build(BetterVannilaFishes.prefix("dosidicus_gigas").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
