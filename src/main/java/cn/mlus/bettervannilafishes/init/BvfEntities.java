package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.betta.*;
import cn.mlus.bettervannilafishes.entity.butterflyfish.*;
import cn.mlus.bettervannilafishes.entity.channa.ChannaArgus;
import cn.mlus.bettervannilafishes.entity.channa.ChannaMicropeltes;
import cn.mlus.bettervannilafishes.entity.cichlid.*;
import cn.mlus.bettervannilafishes.entity.clownfish.*;
import cn.mlus.bettervannilafishes.entity.cod.AtlanticCod;
import cn.mlus.bettervannilafishes.entity.cod.HaddockCod;
import cn.mlus.bettervannilafishes.entity.cod.PacificCod;
import cn.mlus.bettervannilafishes.entity.elopichthys.ElopichthysBambusa;
import cn.mlus.bettervannilafishes.entity.epinephelus.EpinephelusItajara;
import cn.mlus.bettervannilafishes.entity.epinephelus.EpinephelusLanceolatus;
import cn.mlus.bettervannilafishes.entity.epinephelus.EpinephelusMelanostigma;
import cn.mlus.bettervannilafishes.entity.featherstar.FeatherStarEntity;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.entity.husodauricus.HusoDauricus;
import cn.mlus.bettervannilafishes.entity.katsuwonus.KatsuwonusPelamisEntity;
import cn.mlus.bettervannilafishes.entity.megalops.MegalopsAtlanticusEntity;
import cn.mlus.bettervannilafishes.entity.nautilus.NautilusEntity;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionAcutidensEntity;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionBrevirostrisEntity;
import cn.mlus.bettervannilafishes.entity.pufferfish.ObscurePuffer;
import cn.mlus.bettervannilafishes.entity.pufferfish.PorcupineFish;
import cn.mlus.bettervannilafishes.entity.pufferfish.YellowFinPuffer;
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
    public static final DeferredHolder<EntityType<?>, EntityType<KatsuwonusPelamisEntity>> KATSUWONUS_PELAMIS = ENTITIES.register("katsuwonus_pelamis",
            () -> EntityType.Builder.of(KatsuwonusPelamisEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.2F, 0.6F)
                    .build(BetterVannilaFishes.prefix("katsuwonus_pelamis").toString()));
    public static final DeferredHolder<EntityType<?>, EntityType<NegaprionAcutidensEntity>> NEGAPRION_ACUTIDENS = ENTITIES.register("negaprion_acutidens",
            () -> EntityType.Builder.of(NegaprionAcutidensEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.25F, 0.8F)
                    .build(BetterVannilaFishes.prefix("negaprion_acutidens").toString()));
    public static final DeferredHolder<EntityType<?>, EntityType<NegaprionBrevirostrisEntity>> NEGAPRION_BREVIROSTRIS = ENTITIES.register("negaprion_brevirostris",
            () -> EntityType.Builder.of(NegaprionBrevirostrisEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.25F, 0.8F)
                    .build(BetterVannilaFishes.prefix("negaprion_brevirostris").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<EpinephelusLanceolatus>> EPINEPHELUS_LANCEOLATUS = ENTITIES.register("epinephelus_lanceolatus",
            () -> EntityType.Builder.of(EpinephelusLanceolatus::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.95F)
                    .build(BetterVannilaFishes.prefix("epinephelus_lanceolatus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<EpinephelusItajara>> EPINEPHELUS_ITAJARA = ENTITIES.register("epinephelus_itajara",
            () -> EntityType.Builder.of(EpinephelusItajara::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.95F)
                    .build(BetterVannilaFishes.prefix("epinephelus_itajara").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<EpinephelusMelanostigma>> EPINEPHELUS_MELANOSTIGMA = ENTITIES.register("epinephelus_melanostigma",
            () -> EntityType.Builder.of(EpinephelusMelanostigma::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.95F)
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
    public static final DeferredHolder<EntityType<?>,EntityType<ChannaMicropeltes>> CHANNA_MICROPELTES = ENTITIES.register("channa_micropeltes",
            () -> EntityType.Builder.of(ChannaMicropeltes::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("channa_micropeltes").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ChannaArgus>> CHANNA_ARGUS = ENTITIES.register("channa_argus",
            () -> EntityType.Builder.of(ChannaArgus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("channa_argus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<ElopichthysBambusa>> ELOPICHTHYS_BAMBUSA = ENTITIES.register("elopichthys_bambusa",
            () -> EntityType.Builder.of(ElopichthysBambusa::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("elopichthys_bambusa").toString()));
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
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionAkindynos>> AMPHIPRION_AKINDYNOS = ENTITIES.register("amphiprion_akindynos",
            () -> EntityType.Builder.of(AmphiprionAkindynos::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_akindynos").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionBicinctus>> AMPHIPRION_BICINCTUS = ENTITIES.register("amphiprion_bicinctus",
            () -> EntityType.Builder.of(AmphiprionBicinctus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_bicinctus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionChrysogaster>> AMPHIPRION_CHRYSOGASTER = ENTITIES.register("amphiprion_chrysogaster",
            () -> EntityType.Builder.of(AmphiprionChrysogaster::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_chrysogaster").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionChrysopterus>> AMPHIPRION_CHRYSOPTERUS = ENTITIES.register("amphiprion_chrysopterus",
            () -> EntityType.Builder.of(AmphiprionChrysopterus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_chrysopterus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionLatezonatus>> AMPHIPRION_LATEZONATUS = ENTITIES.register("amphiprion_latezonatus",
            () -> EntityType.Builder.of(AmphiprionLatezonatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_latezonatus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionMccullochi>> AMPHIPRION_MCCULLOCHI = ENTITIES.register("amphiprion_mccullochi",
            () -> EntityType.Builder.of(AmphiprionMccullochi::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_mccullochi").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionMelanopus>> AMPHIPRION_MELANOPUS = ENTITIES.register("amphiprion_melanopus",
            () -> EntityType.Builder.of(AmphiprionMelanopus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_melanopus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<AmphiprionTricinctus>> AMPHIPRION_TRICINCTUS = ENTITIES.register("amphiprion_tricinctus",
            () -> EntityType.Builder.of(AmphiprionTricinctus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_tricinctus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<BettaSplendens>> BETTA_SPLENDENS = ENTITIES.register("betta_splendens",
            () -> EntityType.Builder.of(BettaSplendens::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("betta_splendens").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<BettaImbellis>> BETTA_IMBELLIS = ENTITIES.register("betta_imbellis",
            () -> EntityType.Builder.of(BettaImbellis::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_imbellis").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<BettaSmaragdina>> BETTA_SMARAGDINA = ENTITIES.register("betta_smaragdina",
            () -> EntityType.Builder.of(BettaSmaragdina::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_smaragdina").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<BettaPicta>> BETTA_PICTA = ENTITIES.register("betta_picta",
            () -> EntityType.Builder.of(BettaPicta::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_picta").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<BettaSimplex>> BETTA_SIMPLEX = ENTITIES.register("betta_simplex",
            () -> EntityType.Builder.of(BettaSimplex::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_simplex").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<BettaBrownorum>> BETTA_BROWNORUM = ENTITIES.register("betta_brownorum",
            () -> EntityType.Builder.of(BettaBrownorum::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_brownorum").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<MegalopsAtlanticusEntity>> MEGALOPS_ATLANTICUS = ENTITIES.register("megalops_atlanticus",
            () -> EntityType.Builder.of(MegalopsAtlanticusEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.65F)
                    .build(BetterVannilaFishes.prefix("megalops_atlanticus").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<DosidicusGigasEntity>> DOSIDICUS_GIGAS = ENTITIES.register("dosidicus_gigas",
            () -> EntityType.Builder.of(DosidicusGigasEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.9F)
                    .build(BetterVannilaFishes.prefix("dosidicus_gigas").toString()));
    public static final DeferredHolder<EntityType<?>,EntityType<HusoDauricus>> HUSO_DAURICUS = ENTITIES.register("huso_dauricus",
            () -> EntityType.Builder.of(HusoDauricus::new, MobCategory.WATER_CREATURE)
                    .sized(1.8F, 1.4F)
                    .build(BetterVannilaFishes.prefix("huso_dauricus").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
