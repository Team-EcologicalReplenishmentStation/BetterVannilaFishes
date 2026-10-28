package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.betta.*;
import cn.mlus.bettervannilafishes.entity.alopias.AlopiasVulpinusEntity;
import cn.mlus.bettervannilafishes.entity.butterflyfish.*;
import cn.mlus.bettervannilafishes.entity.channa.ChannaArgus;
import cn.mlus.bettervannilafishes.entity.channa.ChannaMicropeltes;
import cn.mlus.bettervannilafishes.entity.chinesecarp.HypophthalmichthysNobilis;
import cn.mlus.bettervannilafishes.entity.chinesecarp.MylopharyngodonPiceus;
import cn.mlus.bettervannilafishes.entity.chinesecarp.CtenopharyngodonIdella;
import cn.mlus.bettervannilafishes.entity.chinesecarp.HypophthalmichthysMolitrix;
import cn.mlus.bettervannilafishes.entity.elopichthys.ElopichthysBambusa;
import cn.mlus.bettervannilafishes.entity.cichlid.*;
import cn.mlus.bettervannilafishes.entity.clownfish.*;
import cn.mlus.bettervannilafishes.entity.cod.GadusMorhua;
import cn.mlus.bettervannilafishes.entity.cod.MelanogrammusAeglefinus;
import cn.mlus.bettervannilafishes.entity.cod.GadusMacrocephalus;
import cn.mlus.bettervannilafishes.entity.epinephelus.EpinephelusItajara;
import cn.mlus.bettervannilafishes.entity.epinephelus.EpinephelusLanceolatus;
import cn.mlus.bettervannilafishes.entity.epinephelus.EpinephelusTukula;
import cn.mlus.bettervannilafishes.entity.featherstar.ComatulidaEntity;
import cn.mlus.bettervannilafishes.entity.galeocerdo.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.entity.husodauricus.HusoDauricus;
import cn.mlus.bettervannilafishes.entity.katsuwonus.KatsuwonusPelamisEntity;
import cn.mlus.bettervannilafishes.entity.megalops.MegalopsAtlanticusEntity;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionAcutidensEntity;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionBrevirostrisEntity;
import cn.mlus.bettervannilafishes.entity.nautilus.NautilusPompiliusEntity;
import cn.mlus.bettervannilafishes.entity.lionfish.PteroisRadiata;
import cn.mlus.bettervannilafishes.entity.lionfish.PteroisLunulata;
import cn.mlus.bettervannilafishes.entity.lionfish.PteroisVolitans;
import cn.mlus.bettervannilafishes.entity.dermochelyscoriacea.DermochelysCoriacea;
import cn.mlus.bettervannilafishes.entity.pufferfish.TakifuguObscurus;
import cn.mlus.bettervannilafishes.entity.pufferfish.DiodonHolocanthus;
import cn.mlus.bettervannilafishes.entity.pufferfish.TakifuguXanthopterus;
import cn.mlus.bettervannilafishes.entity.salmon.FemaleSalmon;
import cn.mlus.bettervannilafishes.entity.salmon.MaleSalmon;
import cn.mlus.bettervannilafishes.entity.salmon.PacificSalmon;
import cn.mlus.bettervannilafishes.entity.scallop.BayScallop;
import cn.mlus.bettervannilafishes.entity.scallop.YessoScallop;
import cn.mlus.bettervannilafishes.entity.scallop.ZhikongScallop;
import cn.mlus.bettervannilafishes.entity.nematistius.NematistiusPectoralisEntity;
import cn.mlus.bettervannilafishes.entity.kajikiaaudax.KajikiaAudaxEntity;
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

    public static final RegistryObject<EntityType<MelanogrammusAeglefinus>> BVC_MELANOGRAMMUS_AEGLEFINUS = ENTITIES.register("melanogrammus_aeglefinus",
            () -> EntityType.Builder.of(MelanogrammusAeglefinus::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix("melanogrammus_aeglefinus").toString()));
    public static final RegistryObject<EntityType<GadusMorhua>> BVC_GADUS_MORHUA = ENTITIES.register("gadus_morhua",
            () -> EntityType.Builder.of(GadusMorhua::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix( "gadus_morhua").toString()));
    public static final RegistryObject<EntityType<GadusMacrocephalus>> BVC_GADUS_MACROCEPHALUS = ENTITIES.register("gadus_macrocephalus",
            () -> EntityType.Builder.of(GadusMacrocephalus::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.9F)
                    .build(BetterVannilaFishes.prefix("gadus_macrocephalus").toString()));

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

    public static final RegistryObject<EntityType<TakifuguXanthopterus>> TAKIFUGU_XANTHOPTERUS = ENTITIES.register("takifugu_xanthopterus",
            () -> EntityType.Builder.of(TakifuguXanthopterus::new, MobCategory.WATER_AMBIENT)
                    .sized(1F,0.9F)
                    .build(BetterVannilaFishes.prefix("takifugu_xanthopterus").toString()));

    public static final RegistryObject<EntityType<TakifuguObscurus>> TAKIFUGU_OBSCURUS = ENTITIES.register("takifugu_obscurus",
            () -> EntityType.Builder.of(TakifuguObscurus::new, MobCategory.WATER_AMBIENT)
                    .sized(1F,0.9F)
                    .build(BetterVannilaFishes.prefix("takifugu_obscurus").toString()));

    public static final RegistryObject<EntityType<PteroisVolitans>> PTEROIS_VOLITANS = ENTITIES.register("pterois_volitans",
            () -> EntityType.Builder.of(PteroisVolitans::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.5F).build(BetterVannilaFishes.prefix("pterois_volitans").toString()));
    public static final RegistryObject<EntityType<PteroisLunulata>> PTEROIS_LUNULATA = ENTITIES.register("pterois_lunulata",
            () -> EntityType.Builder.of(PteroisLunulata::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.5F).build(BetterVannilaFishes.prefix("pterois_lunulata").toString()));
    public static final RegistryObject<EntityType<PteroisRadiata>> PTEROIS_RADIATA = ENTITIES.register("pterois_radiata",
            () -> EntityType.Builder.of(PteroisRadiata::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.5F).build(BetterVannilaFishes.prefix("pterois_radiata").toString()));
    public static final RegistryObject<EntityType<DermochelysCoriacea>> DERMOCHELYS_CORIACEA = ENTITIES.register("dermochelys_coriacea",
            () -> EntityType.Builder.of(DermochelysCoriacea::new, MobCategory.CREATURE)
                    .sized(1.8F, 0.65F).clientTrackingRange(10)
                    .build(BetterVannilaFishes.prefix("dermochelys_coriacea").toString()));

    public static final RegistryObject<EntityType<DiodonHolocanthus>> DIODON_HOLOCANTHUS = ENTITIES.register("diodon_holocanthus",
            () -> EntityType.Builder.of(DiodonHolocanthus::new, MobCategory.WATER_AMBIENT)
                    .sized(1F,0.9F)
                    .build(BetterVannilaFishes.prefix("diodon_holocanthus").toString()));

    public static final RegistryObject<EntityType<NautilusPompiliusEntity>> NAUTILUS_POMPILIUS = ENTITIES.register("nautilus_pompilius",
            () -> EntityType.Builder.of(NautilusPompiliusEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(0.55F,0.55F)
                    .build(BetterVannilaFishes.prefix("nautilus_pompilius").toString()));

    public static final RegistryObject<EntityType<ComatulidaEntity>> COMATULIDA = ENTITIES.register("comatulida",
            () -> EntityType.Builder.of(ComatulidaEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.3F,0.8F)
                    .build(BetterVannilaFishes.prefix("comatulida").toString()));
    public static final RegistryObject<EntityType<ZhikongScallop>> ZHIKONG_SCALLOP = ENTITIES.register("zhikong_scallop",
            () -> EntityType.Builder.of(ZhikongScallop::new, MobCategory.WATER_AMBIENT)
                    .sized(0.7F, 0.35F)
                    .build(BetterVannilaFishes.prefix("zhikong_scallop").toString()));
    public static final RegistryObject<EntityType<BayScallop>> BAY_SCALLOP = ENTITIES.register("bay_scallop",
            () -> EntityType.Builder.of(BayScallop::new, MobCategory.WATER_AMBIENT)
                    .sized(0.7F, 0.35F)
                    .build(BetterVannilaFishes.prefix("bay_scallop").toString()));
    public static final RegistryObject<EntityType<YessoScallop>> YESSO_SCALLOP = ENTITIES.register("yesso_scallop",
            () -> EntityType.Builder.of(YessoScallop::new, MobCategory.WATER_AMBIENT)
                    .sized(0.7F, 0.35F)
                    .build(BetterVannilaFishes.prefix("yesso_scallop").toString()));

    public static final RegistryObject<EntityType<KajikiaAudaxEntity>> KAJIKIA_AUDAX = ENTITIES.register("kajikia_audax",
            () -> EntityType.Builder.of(KajikiaAudaxEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F,0.5F)
                    .build(BetterVannilaFishes.prefix("kajikia_audax").toString()));
    public static final RegistryObject<EntityType<NematistiusPectoralisEntity>> NEMATISTIUS_PECTORALIS = ENTITIES.register("nematistius_pectoralis",
            () -> EntityType.Builder.of(NematistiusPectoralisEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(0.7F,0.5F)
                    .build(BetterVannilaFishes.prefix("nematistius_pectoralis").toString()));
    public static final RegistryObject<EntityType<GaleocerdoCuvierEntity>> GALEOCERDO_CUVIER = ENTITIES.register("galeocerdo_cuvier",
            () -> EntityType.Builder.of(GaleocerdoCuvierEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(2.5F,1.6F)
                    .build(BetterVannilaFishes.prefix("galeocerdo_cuvier").toString()));
    public static final RegistryObject<EntityType<AlopiasVulpinusEntity>> ALOPIAS_VULPINUS = ENTITIES.register("alopias_vulpinus",
            () -> EntityType.Builder.of(AlopiasVulpinusEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.8F, 0.8F)
                    .build(BetterVannilaFishes.prefix("alopias_vulpinus").toString()));
    public static final RegistryObject<EntityType<KatsuwonusPelamisEntity>> KATSUWONUS_PELAMIS = ENTITIES.register("katsuwonus_pelamis",
            () -> EntityType.Builder.of(KatsuwonusPelamisEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.2F, 0.6F)
                    .build(BetterVannilaFishes.prefix("katsuwonus_pelamis").toString()));
    public static final RegistryObject<EntityType<NegaprionAcutidensEntity>> NEGAPRION_ACUTIDENS = ENTITIES.register("negaprion_acutidens",
            () -> EntityType.Builder.of(NegaprionAcutidensEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.25F, 0.8F)
                    .build(BetterVannilaFishes.prefix("negaprion_acutidens").toString()));
    public static final RegistryObject<EntityType<NegaprionBrevirostrisEntity>> NEGAPRION_BREVIROSTRIS = ENTITIES.register("negaprion_brevirostris",
            () -> EntityType.Builder.of(NegaprionBrevirostrisEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.25F, 0.8F)
                    .build(BetterVannilaFishes.prefix("negaprion_brevirostris").toString()));
    public static final RegistryObject<EntityType<EpinephelusLanceolatus>> EPINEPHELUS_LANCEOLATUS = ENTITIES.register("epinephelus_lanceolatus",
            () -> EntityType.Builder.of(EpinephelusLanceolatus::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.95F)
                    .build(BetterVannilaFishes.prefix("epinephelus_lanceolatus").toString()));
    public static final RegistryObject<EntityType<EpinephelusItajara>> EPINEPHELUS_ITAJARA = ENTITIES.register("epinephelus_itajara",
            () -> EntityType.Builder.of(EpinephelusItajara::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.95F)
                    .build(BetterVannilaFishes.prefix("epinephelus_itajara").toString()));
    public static final RegistryObject<EntityType<EpinephelusTukula>> EPINEPHELUS_TUKULA = ENTITIES.register("epinephelus_tukula",
            () -> EntityType.Builder.of(EpinephelusTukula::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.95F)
                    .build(BetterVannilaFishes.prefix("epinephelus_tukula").toString()));

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
    public static final RegistryObject<EntityType<AcanthurusLeucopareius>> ACANTHURUS_LEUCOPAREIUS = ENTITIES.register("acanthurus_leucopareius",
            () -> EntityType.Builder.of(AcanthurusLeucopareius::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_leucopareius").toString()));
    public static final RegistryObject<EntityType<AcanthurusLineatus>> ACANTHURUS_LINEATUS = ENTITIES.register("acanthurus_lineatus",
            () -> EntityType.Builder.of(AcanthurusLineatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("acanthurus_lineatus").toString()));
    public static final RegistryObject<EntityType<ChaetodonStriatus>> CHAETODON_STRIATUS = ENTITIES.register("chaetodon_striatus",
            () -> EntityType.Builder.of(ChaetodonStriatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_striatus").toString()));
    public static final RegistryObject<EntityType<ChaetodonUnimaculatus>> CHAETODON_UNIMACULATUS = ENTITIES.register("chaetodon_unimaculatus",
            () -> EntityType.Builder.of(ChaetodonUnimaculatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_unimaculatus").toString()));
    public static final RegistryObject<EntityType<ChaetodonAuriga>> CHAETODON_AURIGA = ENTITIES.register("chaetodon_auriga",
            () -> EntityType.Builder.of(ChaetodonAuriga::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_auriga").toString()));
    public static final RegistryObject<EntityType<ChaetodonXanthurus>> CHAETODON_XANTHURUS = ENTITIES.register("chaetodon_xanthurus",
            () -> EntityType.Builder.of(ChaetodonXanthurus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_xanthurus").toString()));
    public static final RegistryObject<EntityType<ChaetodonReticulatus>> CHAETODON_RETICULATUS = ENTITIES.register("chaetodon_reticulatus",
            () -> EntityType.Builder.of(ChaetodonReticulatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_reticulatus").toString()));
    public static final RegistryObject<EntityType<ChaetodonSpeculum>> CHAETODON_SPECULUM = ENTITIES.register("chaetodon_speculum",
            () -> EntityType.Builder.of(ChaetodonSpeculum::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("chaetodon_speculum").toString()));
    public static final RegistryObject<EntityType<CichlaOrinocensis>> CICHLA_ORINOCENSIS = ENTITIES.register("cichla_orinocensis",
            () -> EntityType.Builder.of(CichlaOrinocensis::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("cichla_orinocensis").toString()));
    public static final RegistryObject<EntityType<CichlaJariina>> CICHLA_JARIINA = ENTITIES.register("cichla_jariina",
            () -> EntityType.Builder.of(CichlaJariina::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("cichla_jariina").toString()));
    public static final RegistryObject<EntityType<CichlaKelberi>> CICHLA_KELBERI = ENTITIES.register("cichla_kelberi",
            () -> EntityType.Builder.of(CichlaKelberi::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("cichla_kelberi").toString()));
    public static final RegistryObject<EntityType<CichlaPiquiti>> CICHLA_PIQUITI = ENTITIES.register("cichla_piquiti",
            () -> EntityType.Builder.of(CichlaPiquiti::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("cichla_piquiti").toString()));
    public static final RegistryObject<EntityType<CichlaPinima>> CICHLA_PINIMA = ENTITIES.register("cichla_pinima",
            () -> EntityType.Builder.of(CichlaPinima::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("cichla_pinima").toString()));
    public static final RegistryObject<EntityType<CichlaOcellaris>> CICHLA_OCELLARIS = ENTITIES.register("cichla_ocellaris",
            () -> EntityType.Builder.of(CichlaOcellaris::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("cichla_ocellaris").toString()));
    public static final RegistryObject<EntityType<ChannaMicropeltes>> CHANNA_MICROPELTES = ENTITIES.register("channa_micropeltes",
            () -> EntityType.Builder.of(ChannaMicropeltes::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("channa_micropeltes").toString()));
    public static final RegistryObject<EntityType<ChannaArgus>> CHANNA_ARGUS = ENTITIES.register("channa_argus",
            () -> EntityType.Builder.of(ChannaArgus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("channa_argus").toString()));
    public static final RegistryObject<EntityType<ElopichthysBambusa>> ELOPICHTHYS_BAMBUSA = ENTITIES.register("elopichthys_bambusa",
            () -> EntityType.Builder.of(ElopichthysBambusa::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("elopichthys_bambusa").toString()));
    public static final RegistryObject<EntityType<AmphiprionOcellaris>> AMPHIPRION_OCELLARIS = ENTITIES.register("amphiprion_ocellaris",
            () -> EntityType.Builder.of(AmphiprionOcellaris::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_ocellaris").toString()));
    public static final RegistryObject<EntityType<AmphiprionBiaculeatus>> AMPHIPRION_BIACULEATUS = ENTITIES.register("amphiprion_biaculeatus",
            () -> EntityType.Builder.of(AmphiprionBiaculeatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_biaculeatus").toString()));
    public static final RegistryObject<EntityType<AmphiprionPolymnus>> AMPHIPRION_POLYMNUS = ENTITIES.register("amphiprion_polymnus",
            () -> EntityType.Builder.of(AmphiprionPolymnus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_polymnus").toString()));
    public static final RegistryObject<EntityType<AmphiprionThiellei>> AMPHIPRION_THIELLEI = ENTITIES.register("amphiprion_thiellei",
            () -> EntityType.Builder.of(AmphiprionThiellei::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_thiellei").toString()));
    public static final RegistryObject<EntityType<AmphiprionPercula>> AMPHIPRION_PERCULA = ENTITIES.register("amphiprion_percula",
            () -> EntityType.Builder.of(AmphiprionPercula::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_percula").toString()));
    public static final RegistryObject<EntityType<AmphiprionPerideraion>> AMPHIPRION_PERIDERAION = ENTITIES.register("amphiprion_perideraion",
            () -> EntityType.Builder.of(AmphiprionPerideraion::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_perideraion").toString()));
    public static final RegistryObject<EntityType<AmphiprionClarkii>> AMPHIPRION_CLARKII = ENTITIES.register("amphiprion_clarkii",
            () -> EntityType.Builder.of(AmphiprionClarkii::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_clarkii").toString()));
    public static final RegistryObject<EntityType<AmphiprionBicinctus>> AMPHIPRION_BICINCTUS = ENTITIES.register("amphiprion_bicinctus",
            () -> EntityType.Builder.of(AmphiprionBicinctus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_bicinctus").toString()));
    public static final RegistryObject<EntityType<AmphiprionEphippium>> AMPHIPRION_EPHIPPIUM = ENTITIES.register("amphiprion_ephippium",
            () -> EntityType.Builder.of(AmphiprionEphippium::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_ephippium").toString()));
    public static final RegistryObject<EntityType<AmphiprionChrysopterus>> AMPHIPRION_CHRYSOPTERUS = ENTITIES.register("amphiprion_chrysopterus",
            () -> EntityType.Builder.of(AmphiprionChrysopterus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_chrysopterus").toString()));
    public static final RegistryObject<EntityType<AmphiprionFrenatus>> AMPHIPRION_FRENATUS = ENTITIES.register("amphiprion_frenatus",
            () -> EntityType.Builder.of(AmphiprionFrenatus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_frenatus").toString()));
    public static final RegistryObject<EntityType<AmphiprionMccullochi>> AMPHIPRION_MCCULLOCHI = ENTITIES.register("amphiprion_mccullochi",
            () -> EntityType.Builder.of(AmphiprionMccullochi::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_mccullochi").toString()));
    public static final RegistryObject<EntityType<AmphiprionMelanopus>> AMPHIPRION_MELANOPUS = ENTITIES.register("amphiprion_melanopus",
            () -> EntityType.Builder.of(AmphiprionMelanopus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_melanopus").toString()));
    public static final RegistryObject<EntityType<AmphiprionTricinctus>> AMPHIPRION_TRICINCTUS = ENTITIES.register("amphiprion_tricinctus",
            () -> EntityType.Builder.of(AmphiprionTricinctus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("amphiprion_tricinctus").toString()));
    public static final RegistryObject<EntityType<BettaSplendens>> BETTA_SPLENDENS = ENTITIES.register("betta_splendens",
            () -> EntityType.Builder.of(BettaSplendens::new, MobCategory.WATER_AMBIENT)
                    .sized(0.6F, 0.4F)
                    .build(BetterVannilaFishes.prefix("betta_splendens").toString()));
    public static final RegistryObject<EntityType<BettaSiamorientalis>> BETTA_SIAMORIENTALIS = ENTITIES.register("betta_siamorientalis",
            () -> EntityType.Builder.of(BettaSiamorientalis::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_siamorientalis").toString()));
    public static final RegistryObject<EntityType<BettaSmaragdina>> BETTA_SMARAGDINA = ENTITIES.register("betta_smaragdina",
            () -> EntityType.Builder.of(BettaSmaragdina::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_smaragdina").toString()));
    public static final RegistryObject<EntityType<BettaPicta>> BETTA_PICTA = ENTITIES.register("betta_picta",
            () -> EntityType.Builder.of(BettaPicta::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_picta").toString()));
    public static final RegistryObject<EntityType<BettaSimplex>> BETTA_SIMPLEX = ENTITIES.register("betta_simplex",
            () -> EntityType.Builder.of(BettaSimplex::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_simplex").toString()));
    public static final RegistryObject<EntityType<BettaFusca>> BETTA_FUSCA = ENTITIES.register("betta_fusca",
            () -> EntityType.Builder.of(BettaFusca::new, MobCategory.WATER_AMBIENT)
                    .sized(0.4F, 0.3F)
                    .build(BetterVannilaFishes.prefix("betta_fusca").toString()));
    public static final RegistryObject<EntityType<MegalopsAtlanticusEntity>> MEGALOPS_ATLANTICUS = ENTITIES.register("megalops_atlanticus",
            () -> EntityType.Builder.of(MegalopsAtlanticusEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1F, 0.65F)
                    .build(BetterVannilaFishes.prefix("megalops_atlanticus").toString()));
    public static final RegistryObject<EntityType<DosidicusGigasEntity>> DOSIDICUS_GIGAS = ENTITIES.register("dosidicus_gigas",
            () -> EntityType.Builder.of(DosidicusGigasEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(1.5F, 0.9F)
                    .build(BetterVannilaFishes.prefix("dosidicus_gigas").toString()));
    public static final RegistryObject<EntityType<HusoDauricus>> HUSO_DAURICUS = ENTITIES.register("huso_dauricus",
            () -> EntityType.Builder.of(HusoDauricus::new, MobCategory.WATER_CREATURE)
                    .sized(1.8F, 1.4F)
                    .build(BetterVannilaFishes.prefix("huso_dauricus").toString()));

    public static final RegistryObject<EntityType<MylopharyngodonPiceus>> MYLOPHARYNGODON_PICEUS = ENTITIES.register("mylopharyngodon_piceus",
            () -> EntityType.Builder.of(MylopharyngodonPiceus::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("mylopharyngodon_piceus").toString()));
    public static final RegistryObject<EntityType<CtenopharyngodonIdella>> CTENOPHARYNGODON_IDELLA = ENTITIES.register("ctenopharyngodon_idella",
            () -> EntityType.Builder.of(CtenopharyngodonIdella::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("ctenopharyngodon_idella").toString()));
    public static final RegistryObject<EntityType<HypophthalmichthysMolitrix>> HYPOPHTHALMICHTHYS_MOLITRIX = ENTITIES.register("hypophthalmichthys_molitrix",
            () -> EntityType.Builder.of(HypophthalmichthysMolitrix::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("hypophthalmichthys_molitrix").toString()));
    public static final RegistryObject<EntityType<HypophthalmichthysNobilis>> HYPOPHTHALMICHTHYS_NOBILIS = ENTITIES.register("hypophthalmichthys_nobilis",
            () -> EntityType.Builder.of(HypophthalmichthysNobilis::new, MobCategory.WATER_AMBIENT)
                    .sized(0.8F, 0.55F)
                    .build(BetterVannilaFishes.prefix("hypophthalmichthys_nobilis").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
