package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.be.FishSpecimenBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BvfBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BetterVannilaFishes.MODID);
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> GADUS_MORHUA_SPECIMEN = BLOCK_ENTITIES.register("gadus_morhua_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.GADUS_MORHUA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> GADUS_MACROCEPHALUS_SPECIMEN = BLOCK_ENTITIES.register("gadus_macrocephalus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.GADUS_MACROCEPHALUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> MELANOGRAMMUS_AEGLEFINUS_SPECIMEN = BLOCK_ENTITIES.register("melanogrammus_aeglefinus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.MELANOGRAMMUS_AEGLEFINUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PACIFIC_SALMON_SPECIMEN = BLOCK_ENTITIES.register("pacific_salmon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PACIFIC_SALMON_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> MALE_SALMON_SPECIMEN = BLOCK_ENTITIES.register("male_salmon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.MALE_SALMON_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> FEMALE_SALMON_SPECIMEN = BLOCK_ENTITIES.register("female_salmon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.FEMALE_SALMON_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> KAJIKIA_AUDAX_SPECIMEN = BLOCK_ENTITIES.register("kajikia_audax_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.KAJIKIA_AUDAX_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> NEMATISTIUS_PECTORALIS_SPECIMEN = BLOCK_ENTITIES.register("nematistius_pectoralis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.NEMATISTIUS_PECTORALIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> GALEOCERDO_CUVIER_SPECIMEN = BLOCK_ENTITIES.register("galeocerdo_cuvier_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.GALEOCERDO_CUVIER_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ALOPIAS_VULPINUS_SPECIMEN = BLOCK_ENTITIES.register("alopias_vulpinus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ALOPIAS_VULPINUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> NEGAPRION_ACUTIDENS_SPECIMEN = BLOCK_ENTITIES.register("negaprion_acutidens_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.NEGAPRION_ACUTIDENS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> NEGAPRION_BREVIROSTRIS_SPECIMEN = BLOCK_ENTITIES.register("negaprion_brevirostris_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.NEGAPRION_BREVIROSTRIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> EPINEPHELUS_LANCEOLATUS_SPECIMEN = BLOCK_ENTITIES.register("epinephelus_lanceolatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.EPINEPHELUS_LANCEOLATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> EPINEPHELUS_ITAJARA_SPECIMEN = BLOCK_ENTITIES.register("epinephelus_itajara_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.EPINEPHELUS_ITAJARA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> EPINEPHELUS_TUKULA_SPECIMEN = BLOCK_ENTITIES.register("epinephelus_tukula_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.EPINEPHELUS_TUKULA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CICHLA_ORINOCENSIS_SPECIMEN = BLOCK_ENTITIES.register("cichla_orinocensis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CICHLA_ORINOCENSIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CICHLA_JARIINA_SPECIMEN = BLOCK_ENTITIES.register("cichla_jariina_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CICHLA_JARIINA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CICHLA_KELBERI_SPECIMEN = BLOCK_ENTITIES.register("cichla_kelberi_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CICHLA_KELBERI_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CICHLA_PIQUITI_SPECIMEN = BLOCK_ENTITIES.register("cichla_piquiti_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CICHLA_PIQUITI_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CICHLA_PINIMA_SPECIMEN = BLOCK_ENTITIES.register("cichla_pinima_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CICHLA_PINIMA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CICHLA_OCELLARIS_SPECIMEN = BLOCK_ENTITIES.register("cichla_ocellaris_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CICHLA_OCELLARIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHANNA_MICROPELTES_SPECIMEN = BLOCK_ENTITIES.register("channa_micropeltes_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHANNA_MICROPELTES_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHANNA_ARGUS_SPECIMEN = BLOCK_ENTITIES.register("channa_argus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHANNA_ARGUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ELOPICHTHYS_BAMBUSA_SPECIMEN = BLOCK_ENTITIES.register("elopichthys_bambusa_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ELOPICHTHYS_BAMBUSA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> HUSO_DAURICUS_SPECIMEN = BLOCK_ENTITIES.register("huso_dauricus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.HUSO_DAURICUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> KATSUWONUS_PELAMIS_SPECIMEN = BLOCK_ENTITIES.register("katsuwonus_pelamis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.KATSUWONUS_PELAMIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> MEGALOPS_ATLANTICUS_SPECIMEN = BLOCK_ENTITIES.register("megalops_atlanticus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.MEGALOPS_ATLANTICUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> MYLOPHARYNGODON_PICEUS_SPECIMEN = BLOCK_ENTITIES.register("mylopharyngodon_piceus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.MYLOPHARYNGODON_PICEUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CTENOPHARYNGODON_IDELLA_SPECIMEN = BLOCK_ENTITIES.register("ctenopharyngodon_idella_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CTENOPHARYNGODON_IDELLA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> HYPOPHTHALMICHTHYS_MOLITRIX_SPECIMEN = BLOCK_ENTITIES.register("hypophthalmichthys_molitrix_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.HYPOPHTHALMICHTHYS_MOLITRIX_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> HYPOPHTHALMICHTHYS_NOBILIS_SPECIMEN = BLOCK_ENTITIES.register("hypophthalmichthys_nobilis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.HYPOPHTHALMICHTHYS_NOBILIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> TAKIFUGU_OBSCURUS_SPECIMEN = BLOCK_ENTITIES.register("takifugu_obscurus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.TAKIFUGU_OBSCURUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PTEROIS_VOLITANS_SPECIMEN = BLOCK_ENTITIES.register("pterois_volitans_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PTEROIS_VOLITANS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PTEROIS_LUNULATA_SPECIMEN = BLOCK_ENTITIES.register("pterois_lunulata_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PTEROIS_LUNULATA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PTEROIS_RADIATA_SPECIMEN = BLOCK_ENTITIES.register("pterois_radiata_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PTEROIS_RADIATA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> TAKIFUGU_XANTHOPTERUS_SPECIMEN = BLOCK_ENTITIES.register("takifugu_xanthopterus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.TAKIFUGU_XANTHOPTERUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> DIODON_HOLOCANTHUS_SPECIMEN = BLOCK_ENTITIES.register("diodon_holocanthus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.DIODON_HOLOCANTHUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_SPLENDENS_SPECIMEN = BLOCK_ENTITIES.register("betta_splendens_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_SPLENDENS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_SIAMORIENTALIS_SPECIMEN = BLOCK_ENTITIES.register("betta_siamorientalis_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_SIAMORIENTALIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_SMARAGDINA_SPECIMEN = BLOCK_ENTITIES.register("betta_smaragdina_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_SMARAGDINA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_PICTA_SPECIMEN = BLOCK_ENTITIES.register("betta_picta_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_PICTA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_SIMPLEX_SPECIMEN = BLOCK_ENTITIES.register("betta_simplex_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_SIMPLEX_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> BETTA_FUSCA_SPECIMEN = BLOCK_ENTITIES.register("betta_fusca_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.BETTA_FUSCA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_ACHILLES_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_achilles_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_ACHILLES_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_LEUCOSTERNON_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_leucosternon_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_LEUCOSTERNON_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> PARACANTHURUS_HEPATUS_SPECIMEN = BLOCK_ENTITIES.register("paracanthurus_hepatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.PARACANTHURUS_HEPATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_TRIOSTEGUS_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_triostegus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_TRIOSTEGUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_LEUCOPAREIUS_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_leucopareius_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_LEUCOPAREIUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> ACANTHURUS_LINEATUS_SPECIMEN = BLOCK_ENTITIES.register("acanthurus_lineatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.ACANTHURUS_LINEATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_STRIATUS_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_striatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_STRIATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_UNIMACULATUS_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_unimaculatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_UNIMACULATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_AURIGA_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_auriga_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_AURIGA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_XANTHURUS_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_xanthurus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_XANTHURUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_RETICULATUS_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_reticulatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_RETICULATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> CHAETODON_SPECULUM_SPECIMEN = BLOCK_ENTITIES.register("chaetodon_speculum_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.CHAETODON_SPECULUM_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_OCELLARIS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_ocellaris_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_OCELLARIS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_BIACULEATUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_biaculeatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_BIACULEATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_POLYMNUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_polymnus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_POLYMNUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_THIELLEI_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_thiellei_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_THIELLEI_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_PERCULA_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_percula_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_PERCULA_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_PERIDERAION_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_perideraion_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_PERIDERAION_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_CLARKII_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_clarkii_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_CLARKII_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_BICINCTUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_bicinctus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_BICINCTUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_EPHIPPIUM_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_ephippium_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_EPHIPPIUM_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_CHRYSOPTERUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_chrysopterus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_CHRYSOPTERUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_FRENATUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_frenatus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_FRENATUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_MCCULLOCHI_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_mccullochi_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_MCCULLOCHI_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_MELANOPUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_melanopus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_MELANOPUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> AMPHIPRION_TRICINCTUS_SPECIMEN = BLOCK_ENTITIES.register("amphiprion_tricinctus_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.AMPHIPRION_TRICINCTUS_SPECIMEN.get()).build(null));
    public static final RegistryObject<BlockEntityType<FishSpecimenBlockEntity>> DERMOCHELYS_CORIACEA_SPECIMEN = BLOCK_ENTITIES.register("dermochelys_coriacea_specimen",
            () -> BlockEntityType.Builder.of(FishSpecimenBlockEntity::new, BvfBlocks.DERMOCHELYS_CORIACEA_SPECIMEN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
