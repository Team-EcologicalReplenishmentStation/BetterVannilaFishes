package cn.mlus.bettervannilafishes.event;

import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.alopias.AlopiasVulpinusEntity;
import cn.mlus.bettervannilafishes.entity.betta.BvfBettaEntity;
import cn.mlus.bettervannilafishes.entity.butterflyfish.BvfButterflyfishEntity;
import cn.mlus.bettervannilafishes.entity.channa.ChannaArgus;
import cn.mlus.bettervannilafishes.entity.channa.ChannaMicropeltes;
import cn.mlus.bettervannilafishes.entity.cichlid.BvfCichlidEntity;
import cn.mlus.bettervannilafishes.entity.clownfish.BvfClownfishEntity;
import cn.mlus.bettervannilafishes.entity.elopichthys.ElopichthysBambusa;
import cn.mlus.bettervannilafishes.entity.epinephelus.BvfEpinephelusEntity;
import cn.mlus.bettervannilafishes.entity.featherstar.ComatulidaEntity;
import cn.mlus.bettervannilafishes.entity.galeocerdo.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.entity.husodauricus.HusoDauricus;
import cn.mlus.bettervannilafishes.entity.katsuwonus.KatsuwonusPelamisEntity;
import cn.mlus.bettervannilafishes.entity.lionfish.Lionfish;
import cn.mlus.bettervannilafishes.entity.megalops.MegalopsAtlanticusEntity;
import cn.mlus.bettervannilafishes.entity.nautilus.NautilusPompiliusEntity;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionAcutidensEntity;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionBrevirostrisEntity;
import cn.mlus.bettervannilafishes.entity.nautilus.NautilusPompiliusEntity;
import cn.mlus.bettervannilafishes.entity.lionfish.Lionfish;
import cn.mlus.bettervannilafishes.entity.dermochelyscoriacea.DermochelysCoriacea;
import cn.mlus.bettervannilafishes.entity.pufferfish.BvfPufferfishEntity;
import cn.mlus.bettervannilafishes.entity.nematistius.NematistiusPectoralisEntity;
import cn.mlus.bettervannilafishes.entity.scallop.ScallopEntity;
import cn.mlus.bettervannilafishes.entity.kajikiaaudax.KajikiaAudaxEntity;
import cn.mlus.bettervannilafishes.entity.squid.DosidicusGigasEntity;
import cn.mlus.bettervannilafishes.entity.surgeonfish.BvfSurgeonfishEntity;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;


@EventBusSubscriber
public class EntityAttributeHandler {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(BvfEntities.BVC_MELANOGRAMMUS_AEGLEFINUS.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_GADUS_MORHUA.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_GADUS_MACROCEPHALUS.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_SALMON_MALE.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_SALMON_FEMALE.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_SALMON_PACIFIC.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.TAKIFUGU_XANTHOPTERUS.get(), BvfPufferfishEntity.createAttributes().build());
        event.put(BvfEntities.TAKIFUGU_OBSCURUS.get(), BvfPufferfishEntity.createAttributes().build());
        event.put(BvfEntities.PTEROIS_VOLITANS.get(), Lionfish.createAttributes().build());
        event.put(BvfEntities.PTEROIS_LUNULATA.get(), Lionfish.createAttributes().build());
        event.put(BvfEntities.PTEROIS_RADIATA.get(), Lionfish.createAttributes().build());
        event.put(BvfEntities.DERMOCHELYS_CORIACEA.get(), DermochelysCoriacea.createAttributes().build());
        event.put(BvfEntities.DIODON_HOLOCANTHUS.get(), BvfPufferfishEntity.createAttributes().build());
        event.put(BvfEntities.NAUTILUS_POMPILIUS.get(), NautilusPompiliusEntity.createAttributes().build());
        event.put(BvfEntities.COMATULIDA.get(), ComatulidaEntity.createAttributes().build());
        event.put(BvfEntities.ZHIKONG_SCALLOP.get(), ScallopEntity.createAttributes().build());
        event.put(BvfEntities.BAY_SCALLOP.get(), ScallopEntity.createAttributes().build());
        event.put(BvfEntities.YESSO_SCALLOP.get(), ScallopEntity.createAttributes().build());
        event.put(BvfEntities.KAJIKIA_AUDAX.get(), KajikiaAudaxEntity.createAttributes().build());
        event.put(BvfEntities.NEMATISTIUS_PECTORALIS.get(), NematistiusPectoralisEntity.createAttributes().build());
        event.put(BvfEntities.GALEOCERDO_CUVIER.get(), GaleocerdoCuvierEntity.createAttributes().build());
        event.put(BvfEntities.ALOPIAS_VULPINUS.get(), AlopiasVulpinusEntity.createAttributes().build());
        event.put(BvfEntities.NEGAPRION_ACUTIDENS.get(), NegaprionAcutidensEntity.createAttributes().build());
        event.put(BvfEntities.NEGAPRION_BREVIROSTRIS.get(), NegaprionBrevirostrisEntity.createAttributes().build());
        event.put(BvfEntities.EPINEPHELUS_LANCEOLATUS.get(), BvfEpinephelusEntity.createAttributes().build());
        event.put(BvfEntities.EPINEPHELUS_ITAJARA.get(), BvfEpinephelusEntity.createAttributes().build());
        event.put(BvfEntities.EPINEPHELUS_TUKULA.get(), BvfEpinephelusEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_ACHILLES.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.PARACANTHURUS_HEPATUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_LEUCOPAREIUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_LINEATUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_STRIATUS.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_UNIMACULATUS.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_AURIGA.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_XANTHURUS.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_RETICULATUS.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_SPECULUM.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CICHLA_ORINOCENSIS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.CICHLA_JARIINA.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.CICHLA_KELBERI.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.CICHLA_PIQUITI.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.CICHLA_PINIMA.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.CICHLA_OCELLARIS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.CHANNA_MICROPELTES.get(), ChannaMicropeltes.createAttributes().build());
        event.put(BvfEntities.CHANNA_ARGUS.get(), ChannaArgus.createAttributes().build());
        event.put(BvfEntities.ELOPICHTHYS_BAMBUSA.get(), ElopichthysBambusa.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_OCELLARIS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_BIACULEATUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_POLYMNUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_THIELLEI.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_PERCULA.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_PERIDERAION.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_CLARKII.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_BICINCTUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_EPHIPPIUM.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_CHRYSOPTERUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_FRENATUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_MCCULLOCHI.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_MELANOPUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_TRICINCTUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_SPLENDENS.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_SIAMORIENTALIS.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_SMARAGDINA.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_PICTA.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_SIMPLEX.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_FUSCA.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.MEGALOPS_ATLANTICUS.get(), MegalopsAtlanticusEntity.createAttributes().build());
        event.put(BvfEntities.KATSUWONUS_PELAMIS.get(), KatsuwonusPelamisEntity.createAttributes().build());
        event.put(BvfEntities.DOSIDICUS_GIGAS.get(), DosidicusGigasEntity.createAttributes().build());
        event.put(BvfEntities.HUSO_DAURICUS.get(), HusoDauricus.createAttributes().build());
        event.put(BvfEntities.MYLOPHARYNGODON_PICEUS.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.CTENOPHARYNGODON_IDELLA.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.HYPOPHTHALMICHTHYS_MOLITRIX.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.HYPOPHTHALMICHTHYS_NOBILIS.get(), BvfAbstractFish.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(BvfEntities.BVC_MELANOGRAMMUS_AEGLEFINUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCodSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_GADUS_MORHUA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCodSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_GADUS_MACROCEPHALUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCodSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_SALMON_MALE.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_SALMON_FEMALE.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_SALMON_PACIFIC.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.TAKIFUGU_XANTHOPTERUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.TAKIFUGU_OBSCURUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.PTEROIS_VOLITANS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.PTEROIS_LUNULATA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.PTEROIS_RADIATA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.DIODON_HOLOCANTHUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.NAUTILUS_POMPILIUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.COMATULIDA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.OCEAN_FLOOR, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ZHIKONG_SCALLOP.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.OCEAN_FLOOR, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BAY_SCALLOP.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.OCEAN_FLOOR, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.YESSO_SCALLOP.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.OCEAN_FLOOR, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.KAJIKIA_AUDAX.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.NEMATISTIUS_PECTORALIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkNematistiusPectoralisSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.GALEOCERDO_CUVIER.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ALOPIAS_VULPINUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.NEGAPRION_ACUTIDENS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.NEGAPRION_BREVIROSTRIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.EPINEPHELUS_LANCEOLATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.EPINEPHELUS_ITAJARA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.EPINEPHELUS_TUKULA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_ACHILLES.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.PARACANTHURUS_HEPATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_LEUCOPAREIUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_LINEATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_STRIATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_UNIMACULATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_AURIGA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_XANTHURUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_RETICULATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_SPECULUM.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CICHLA_ORINOCENSIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CICHLA_PIQUITI.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CICHLA_JARIINA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CICHLA_KELBERI.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CICHLA_PINIMA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CICHLA_OCELLARIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CHANNA_MICROPELTES.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkRareWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CHANNA_ARGUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkRareWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ELOPICHTHYS_BAMBUSA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_OCELLARIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_FRENATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_POLYMNUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_PERIDERAION.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_CLARKII.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_PERCULA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_EPHIPPIUM.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_BICINCTUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_BIACULEATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_CHRYSOPTERUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_THIELLEI.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_MCCULLOCHI.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_MELANOPUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_TRICINCTUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_SPLENDENS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_SIAMORIENTALIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_SMARAGDINA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_PICTA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_SIMPLEX.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_FUSCA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.MEGALOPS_ATLANTICUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.KATSUWONUS_PELAMIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.DOSIDICUS_GIGAS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkDeepOceanSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.HUSO_DAURICUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkRareWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.MYLOPHARYNGODON_PICEUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CTENOPHARYNGODON_IDELLA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.HYPOPHTHALMICHTHYS_MOLITRIX.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.HYPOPHTHALMICHTHYS_NOBILIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);

        event.register(BvfEntities.DERMOCHELYS_CORIACEA.get(), SpawnPlacementTypes.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                EntityAttributeHandler::checkDermochelysCoriaceaSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }

    public static boolean checkCodSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        if(level.getBiome(pos).is(Biomes.WARM_OCEAN) || level.getBiome(pos).is(Biomes.LUKEWARM_OCEAN) || level.getBiome(pos).is(Biomes.DEEP_LUKEWARM_OCEAN)){
            return false;
        }
            return WaterAnimal.checkSurfaceWaterAnimalSpawnRules(type, level, spawnType, pos, random);
    }

    public static boolean checkPufferSpawnRules(
            EntityType<? extends Mob> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        if(!level.getBiome(pos).is(Biomes.WARM_OCEAN) && !level.getBiome(pos).is(Biomes.LUKEWARM_OCEAN) && !level.getBiome(pos).is(Biomes.DEEP_LUKEWARM_OCEAN) && !level.getBiome(pos).is(Biomes.RIVER)){
            return false;
        }
        return checkSurfaceWaterAnimalSpawnRules(level,pos);
    }

    public static boolean checkDermochelysCoriaceaSpawnRules(
            EntityType<? extends Animal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        if (level.getFluidState(pos).is(FluidTags.WATER)) {
            return checkSurfaceWaterAnimalSpawnRules(level, pos);
        }
        return Animal.checkAnimalSpawnRules(type, level, spawnType, pos, random);
    }

    public static boolean checkCustomWaterSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        if(rollSpawn(3, random, spawnType)) {
            return checkSurfaceWaterAnimalSpawnRules(level,pos);
        }else {
            return false;
        }
    }

    public static boolean checkNematistiusPectoralisSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        return level.getBiome(pos).is(Biomes.WARM_OCEAN)
                && rollSpawn(12, random, spawnType)
                && checkSurfaceWaterAnimalSpawnRules(level, pos);
    }

    public static boolean checkRareWaterSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        if(rollSpawn(9, random, spawnType)) {
            return checkSurfaceWaterAnimalSpawnRules(level,pos);
        } else {
            return false;
        }
    }

    public static boolean checkSurfaceWaterAnimalSpawnRules(LevelAccessor pLevel, BlockPos pPos) {
        int $$5 = pLevel.getSeaLevel();
        int $$6 = $$5 - 13;
        return pPos.getY() >= $$6 && pPos.getY() <= $$5 && pLevel.getFluidState(pPos.below()).is(FluidTags.WATER) && pLevel.getBlockState(pPos.above()).is(Blocks.WATER);
    }

    public static boolean rollSpawn(int rolls, RandomSource random, MobSpawnType reason) {
        if (reason == MobSpawnType.SPAWNER) {
            return true;
        } else {
            return rolls <= 0 || random.nextInt(rolls) == 0;
        }
    }

    public static boolean checkDeepOceanSpawnRules(
            EntityType<? extends Mob> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        if(!level.getBiome(pos).is(Biomes.DEEP_COLD_OCEAN) && !level.getBiome(pos).is(Biomes.DEEP_FROZEN_OCEAN)){
            return false;
        }
        return checkSurfaceWaterAnimalSpawnRules(level,pos);
    }
}
