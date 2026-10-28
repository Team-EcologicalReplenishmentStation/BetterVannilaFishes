package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.block.FishSpecimen;
import cn.mlus.bettervannilafishes.block.SmallFishSpecimen;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BvfBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterVannilaFishes.MODID);
    public static final RegistryObject<Block> GADUS_MORHUA_SPECIMEN = BLOCKS.register("gadus_morhua_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.GADUS_MORHUA_SPECIMEN));
    public static final RegistryObject<Block> GADUS_MACROCEPHALUS_SPECIMEN = BLOCKS.register("gadus_macrocephalus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.GADUS_MACROCEPHALUS_SPECIMEN));
    public static final RegistryObject<Block> MELANOGRAMMUS_AEGLEFINUS_SPECIMEN = BLOCKS.register("melanogrammus_aeglefinus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.MELANOGRAMMUS_AEGLEFINUS_SPECIMEN));
    public static final RegistryObject<Block> PACIFIC_SALMON_SPECIMEN = BLOCKS.register("pacific_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PACIFIC_SALMON_SPECIMEN));
    public static final RegistryObject<Block> MALE_SALMON_SPECIMEN = BLOCKS.register("male_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.MALE_SALMON_SPECIMEN));
    public static final RegistryObject<Block> FEMALE_SALMON_SPECIMEN = BLOCKS.register("female_salmon_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.FEMALE_SALMON_SPECIMEN));
    public static final RegistryObject<Block> KAJIKIA_AUDAX_SPECIMEN = BLOCKS.register("kajikia_audax_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.KAJIKIA_AUDAX_SPECIMEN));
    public static final RegistryObject<Block> NEMATISTIUS_PECTORALIS_SPECIMEN = BLOCKS.register("nematistius_pectoralis_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.NEMATISTIUS_PECTORALIS_SPECIMEN));
    public static final RegistryObject<Block> GALEOCERDO_CUVIER_SPECIMEN = BLOCKS.register("galeocerdo_cuvier_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.GALEOCERDO_CUVIER_SPECIMEN));
    public static final RegistryObject<Block> ALOPIAS_VULPINUS_SPECIMEN = BLOCKS.register("alopias_vulpinus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ALOPIAS_VULPINUS_SPECIMEN));
    public static final RegistryObject<Block> NEGAPRION_ACUTIDENS_SPECIMEN = BLOCKS.register("negaprion_acutidens_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.NEGAPRION_ACUTIDENS_SPECIMEN));
    public static final RegistryObject<Block> NEGAPRION_BREVIROSTRIS_SPECIMEN = BLOCKS.register("negaprion_brevirostris_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.NEGAPRION_BREVIROSTRIS_SPECIMEN));
    public static final RegistryObject<Block> EPINEPHELUS_LANCEOLATUS_SPECIMEN = BLOCKS.register("epinephelus_lanceolatus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.EPINEPHELUS_LANCEOLATUS_SPECIMEN));
    public static final RegistryObject<Block> EPINEPHELUS_ITAJARA_SPECIMEN = BLOCKS.register("epinephelus_itajara_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.EPINEPHELUS_ITAJARA_SPECIMEN));
    public static final RegistryObject<Block> EPINEPHELUS_TUKULA_SPECIMEN = BLOCKS.register("epinephelus_tukula_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.EPINEPHELUS_TUKULA_SPECIMEN));
    public static final RegistryObject<Block> CICHLA_ORINOCENSIS_SPECIMEN = BLOCKS.register("cichla_orinocensis_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CICHLA_ORINOCENSIS_SPECIMEN));
    public static final RegistryObject<Block> CICHLA_JARIINA_SPECIMEN = BLOCKS.register("cichla_jariina_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CICHLA_JARIINA_SPECIMEN));
    public static final RegistryObject<Block> CICHLA_KELBERI_SPECIMEN = BLOCKS.register("cichla_kelberi_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CICHLA_KELBERI_SPECIMEN));
    public static final RegistryObject<Block> CICHLA_PIQUITI_SPECIMEN = BLOCKS.register("cichla_piquiti_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CICHLA_PIQUITI_SPECIMEN));
    public static final RegistryObject<Block> CICHLA_PINIMA_SPECIMEN = BLOCKS.register("cichla_pinima_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CICHLA_PINIMA_SPECIMEN));
    public static final RegistryObject<Block> CICHLA_OCELLARIS_SPECIMEN = BLOCKS.register("cichla_ocellaris_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CICHLA_OCELLARIS_SPECIMEN));
    public static final RegistryObject<Block> CHANNA_MICROPELTES_SPECIMEN = BLOCKS.register("channa_micropeltes_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHANNA_MICROPELTES_SPECIMEN));
    public static final RegistryObject<Block> CHANNA_ARGUS_SPECIMEN = BLOCKS.register("channa_argus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHANNA_ARGUS_SPECIMEN));
    public static final RegistryObject<Block> ELOPICHTHYS_BAMBUSA_SPECIMEN = BLOCKS.register("elopichthys_bambusa_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ELOPICHTHYS_BAMBUSA_SPECIMEN));
    public static final RegistryObject<Block> HUSO_DAURICUS_SPECIMEN = BLOCKS.register("huso_dauricus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.HUSO_DAURICUS_SPECIMEN));
    public static final RegistryObject<Block> KATSUWONUS_PELAMIS_SPECIMEN = BLOCKS.register("katsuwonus_pelamis_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.KATSUWONUS_PELAMIS_SPECIMEN));
    public static final RegistryObject<Block> MEGALOPS_ATLANTICUS_SPECIMEN = BLOCKS.register("megalops_atlanticus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.MEGALOPS_ATLANTICUS_SPECIMEN));
    public static final RegistryObject<Block> MYLOPHARYNGODON_PICEUS_SPECIMEN = BLOCKS.register("mylopharyngodon_piceus_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.MYLOPHARYNGODON_PICEUS_SPECIMEN));
    public static final RegistryObject<Block> CTENOPHARYNGODON_IDELLA_SPECIMEN = BLOCKS.register("ctenopharyngodon_idella_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CTENOPHARYNGODON_IDELLA_SPECIMEN));
    public static final RegistryObject<Block> HYPOPHTHALMICHTHYS_MOLITRIX_SPECIMEN = BLOCKS.register("hypophthalmichthys_molitrix_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.HYPOPHTHALMICHTHYS_MOLITRIX_SPECIMEN));
    public static final RegistryObject<Block> HYPOPHTHALMICHTHYS_NOBILIS_SPECIMEN = BLOCKS.register("hypophthalmichthys_nobilis_specimen",
            () -> new FishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.HYPOPHTHALMICHTHYS_NOBILIS_SPECIMEN));
    public static final RegistryObject<Block> TAKIFUGU_OBSCURUS_SPECIMEN = BLOCKS.register("takifugu_obscurus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.TAKIFUGU_OBSCURUS_SPECIMEN));
    public static final RegistryObject<Block> PTEROIS_VOLITANS_SPECIMEN = BLOCKS.register("pterois_volitans_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PTEROIS_VOLITANS_SPECIMEN));
    public static final RegistryObject<Block> PTEROIS_LUNULATA_SPECIMEN = BLOCKS.register("pterois_lunulata_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PTEROIS_LUNULATA_SPECIMEN));
    public static final RegistryObject<Block> PTEROIS_RADIATA_SPECIMEN = BLOCKS.register("pterois_radiata_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PTEROIS_RADIATA_SPECIMEN));
    public static final RegistryObject<Block> TAKIFUGU_XANTHOPTERUS_SPECIMEN = BLOCKS.register("takifugu_xanthopterus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.TAKIFUGU_XANTHOPTERUS_SPECIMEN));
    public static final RegistryObject<Block> DIODON_HOLOCANTHUS_SPECIMEN = BLOCKS.register("diodon_holocanthus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.DIODON_HOLOCANTHUS_SPECIMEN));
    public static final RegistryObject<Block> BETTA_SPLENDENS_SPECIMEN = BLOCKS.register("betta_splendens_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_SPLENDENS_SPECIMEN));
    public static final RegistryObject<Block> BETTA_SIAMORIENTALIS_SPECIMEN = BLOCKS.register("betta_siamorientalis_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_SIAMORIENTALIS_SPECIMEN));
    public static final RegistryObject<Block> BETTA_SMARAGDINA_SPECIMEN = BLOCKS.register("betta_smaragdina_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_SMARAGDINA_SPECIMEN));
    public static final RegistryObject<Block> BETTA_PICTA_SPECIMEN = BLOCKS.register("betta_picta_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_PICTA_SPECIMEN));
    public static final RegistryObject<Block> BETTA_SIMPLEX_SPECIMEN = BLOCKS.register("betta_simplex_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_SIMPLEX_SPECIMEN));
    public static final RegistryObject<Block> BETTA_FUSCA_SPECIMEN = BLOCKS.register("betta_fusca_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.BETTA_FUSCA_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_ACHILLES_SPECIMEN = BLOCKS.register("acanthurus_achilles_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_ACHILLES_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_LEUCOSTERNON_SPECIMEN = BLOCKS.register("acanthurus_leucosternon_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_LEUCOSTERNON_SPECIMEN));
    public static final RegistryObject<Block> PARACANTHURUS_HEPATUS_SPECIMEN = BLOCKS.register("paracanthurus_hepatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.PARACANTHURUS_HEPATUS_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_TRIOSTEGUS_SPECIMEN = BLOCKS.register("acanthurus_triostegus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_TRIOSTEGUS_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_LEUCOPAREIUS_SPECIMEN = BLOCKS.register("acanthurus_leucopareius_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_LEUCOPAREIUS_SPECIMEN));
    public static final RegistryObject<Block> ACANTHURUS_LINEATUS_SPECIMEN = BLOCKS.register("acanthurus_lineatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.ACANTHURUS_LINEATUS_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_STRIATUS_SPECIMEN = BLOCKS.register("chaetodon_striatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_STRIATUS_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_UNIMACULATUS_SPECIMEN = BLOCKS.register("chaetodon_unimaculatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_UNIMACULATUS_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_AURIGA_SPECIMEN = BLOCKS.register("chaetodon_auriga_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_AURIGA_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_XANTHURUS_SPECIMEN = BLOCKS.register("chaetodon_xanthurus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_XANTHURUS_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_RETICULATUS_SPECIMEN = BLOCKS.register("chaetodon_reticulatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_RETICULATUS_SPECIMEN));
    public static final RegistryObject<Block> CHAETODON_SPECULUM_SPECIMEN = BLOCKS.register("chaetodon_speculum_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.CHAETODON_SPECULUM_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_OCELLARIS_SPECIMEN = BLOCKS.register("amphiprion_ocellaris_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_OCELLARIS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_BIACULEATUS_SPECIMEN = BLOCKS.register("amphiprion_biaculeatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_BIACULEATUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_POLYMNUS_SPECIMEN = BLOCKS.register("amphiprion_polymnus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_POLYMNUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_THIELLEI_SPECIMEN = BLOCKS.register("amphiprion_thiellei_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_THIELLEI_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_PERCULA_SPECIMEN = BLOCKS.register("amphiprion_percula_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_PERCULA_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_PERIDERAION_SPECIMEN = BLOCKS.register("amphiprion_perideraion_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_PERIDERAION_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_CLARKII_SPECIMEN = BLOCKS.register("amphiprion_clarkii_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_CLARKII_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_BICINCTUS_SPECIMEN = BLOCKS.register("amphiprion_bicinctus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_BICINCTUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_EPHIPPIUM_SPECIMEN = BLOCKS.register("amphiprion_ephippium_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_EPHIPPIUM_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_CHRYSOPTERUS_SPECIMEN = BLOCKS.register("amphiprion_chrysopterus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_CHRYSOPTERUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_FRENATUS_SPECIMEN = BLOCKS.register("amphiprion_frenatus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_FRENATUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_MCCULLOCHI_SPECIMEN = BLOCKS.register("amphiprion_mccullochi_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_MCCULLOCHI_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_MELANOPUS_SPECIMEN = BLOCKS.register("amphiprion_melanopus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_MELANOPUS_SPECIMEN));
    public static final RegistryObject<Block> AMPHIPRION_TRICINCTUS_SPECIMEN = BLOCKS.register("amphiprion_tricinctus_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.AMPHIPRION_TRICINCTUS_SPECIMEN));
    public static final RegistryObject<Block> DERMOCHELYS_CORIACEA_SPECIMEN = BLOCKS.register("dermochelys_coriacea_specimen",
            () -> new SmallFishSpecimen(Block.Properties.of().strength(1.5f).noOcclusion(), BvfBlockEntities.DERMOCHELYS_CORIACEA_SPECIMEN));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
