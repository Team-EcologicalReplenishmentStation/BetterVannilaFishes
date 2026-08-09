package cn.mlus.bettervannilafishes.event;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.alopias.AlopiasVulpinusEntity;
import cn.mlus.bettervannilafishes.entity.betta.BvfBettaEntity;
import cn.mlus.bettervannilafishes.entity.butterflyfish.BvfButterflyfishEntity;
import cn.mlus.bettervannilafishes.entity.channa.ChannaArgus;
import cn.mlus.bettervannilafishes.entity.channa.ChannaMicropeltes;
import cn.mlus.bettervannilafishes.entity.chinesecarp.ChineseCarpEntity;
import cn.mlus.bettervannilafishes.entity.elopichthys.ElopichthysBambusa;
import cn.mlus.bettervannilafishes.entity.cichlid.BvfCichlidEntity;
import cn.mlus.bettervannilafishes.entity.clownfish.BvfClownfishEntity;
import cn.mlus.bettervannilafishes.entity.epinephelus.BvfEpinephelusEntity;
import cn.mlus.bettervannilafishes.entity.featherstar.FeatherStarEntity;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.entity.husodauricus.HusoDauricus;
import cn.mlus.bettervannilafishes.entity.katsuwonus.KatsuwonusPelamisEntity;
import cn.mlus.bettervannilafishes.entity.megalops.MegalopsAtlanticusEntity;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionAcutidensEntity;
import cn.mlus.bettervannilafishes.entity.negaprion.NegaprionBrevirostrisEntity;
import cn.mlus.bettervannilafishes.entity.nautilus.NautilusEntity;
import cn.mlus.bettervannilafishes.entity.lionfish.Lionfish;
import cn.mlus.bettervannilafishes.entity.pufferfish.BvfPufferfishEntity;
import cn.mlus.bettervannilafishes.entity.roosterfish.RoosterfishEntity;
import cn.mlus.bettervannilafishes.entity.scallop.ScallopEntity;
import cn.mlus.bettervannilafishes.entity.spearfish.SpearfishEntity;
import cn.mlus.bettervannilafishes.entity.squid.DosidicusGigasEntity;
import cn.mlus.bettervannilafishes.entity.surgeonfish.BvfSurgeonfishEntity;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BetterVannilaFishes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityAttributeHandler {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(BvfEntities.BVC_HADDOCK_COD.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_ATLANTIC_COD.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_PACIFIC_COD.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_SALMON_MALE.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_SALMON_FEMALE.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_SALMON_PACIFIC.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.YELLOW_FIN_PUFFER.get(), BvfPufferfishEntity.createAttributes().build());
        event.put(BvfEntities.OBSCURE_PUFFER.get(), BvfPufferfishEntity.createAttributes().build());
        event.put(BvfEntities.SOARING_LIONFISH.get(), Lionfish.createAttributes().build());
        event.put(BvfEntities.RINGED_LIONFISH.get(), Lionfish.createAttributes().build());
        event.put(BvfEntities.RADIANT_LIONFISH.get(), Lionfish.createAttributes().build());
        event.put(BvfEntities.PORCUPINE_FISH.get(), BvfPufferfishEntity.createAttributes().build());
        event.put(BvfEntities.NAUTILUS.get(), NautilusEntity.createAttributes().build());
        event.put(BvfEntities.FEATHER_STAR.get(), FeatherStarEntity.createAttributes().build());
        event.put(BvfEntities.ZHIKONG_SCALLOP.get(), ScallopEntity.createAttributes().build());
        event.put(BvfEntities.BAY_SCALLOP.get(), ScallopEntity.createAttributes().build());
        event.put(BvfEntities.YESSO_SCALLOP.get(), ScallopEntity.createAttributes().build());
        event.put(BvfEntities.SPEARFISH.get(), SpearfishEntity.createAttributes().build());
        event.put(BvfEntities.ROOSTERFISH.get(), RoosterfishEntity.createAttributes().build());
        event.put(BvfEntities.GALEOCERDO_CUVIER.get(), GaleocerdoCuvierEntity.createAttributes().build());
        event.put(BvfEntities.ALOPIAS_VULPINUS.get(), AlopiasVulpinusEntity.createAttributes().build());
        event.put(BvfEntities.NEGAPRION_ACUTIDENS.get(), NegaprionAcutidensEntity.createAttributes().build());
        event.put(BvfEntities.NEGAPRION_BREVIROSTRIS.get(), NegaprionBrevirostrisEntity.createAttributes().build());
        event.put(BvfEntities.EPINEPHELUS_LANCEOLATUS.get(), BvfEpinephelusEntity.createAttributes().build());
        event.put(BvfEntities.EPINEPHELUS_ITAJARA.get(), BvfEpinephelusEntity.createAttributes().build());
        event.put(BvfEntities.EPINEPHELUS_MELANOSTIGMA.get(), BvfEpinephelusEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_ACHILLES.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.PARACANTHURUS_HEPATUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_NIGRICANS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_LINEATUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_STRIATUS.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_UNIMACULATUS.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_AURIGA.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_COLLARE.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_RETICULATUS.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.CHAETODON_SPECULUM.get(), BvfButterflyfishEntity.createAttributes().build());
        event.put(BvfEntities.AUSTRALOHEROS_FACETUS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.CICHLASOMA_BIMACULATUM.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.KROBIA_GUIANENSIS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.AEQUIDENS_TETRAMERUS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.ASTRONOTUS_OCELLATUS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.CHANNA_MICROPELTES.get(), ChannaMicropeltes.createAttributes().build());
        event.put(BvfEntities.CHANNA_ARGUS.get(), ChannaArgus.createAttributes().build());
        event.put(BvfEntities.ELOPICHTHYS_BAMBUSA.get(), ElopichthysBambusa.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_OCELLARIS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.PREMNAS_BIACULEATUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_POLYMNUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_PERIDERAION.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_CLARKII.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_PERCULA.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_AKINDYNOS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_BICINCTUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_CHRYSOGASTER.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_CHRYSOPTERUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_LATEZONATUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_MCCULLOCHI.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_MELANOPUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_TRICINCTUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_SPLENDENS.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_IMBELLIS.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_SMARAGDINA.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_PICTA.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_SIMPLEX.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.BETTA_BROWNORUM.get(), BvfBettaEntity.createAttributes().build());
        event.put(BvfEntities.MEGALOPS_ATLANTICUS.get(), MegalopsAtlanticusEntity.createAttributes().build());
        event.put(BvfEntities.KATSUWONUS_PELAMIS.get(), KatsuwonusPelamisEntity.createAttributes().build());
        event.put(BvfEntities.DOSIDICUS_GIGAS.get(), DosidicusGigasEntity.createAttributes().build());
        event.put(BvfEntities.HUSO_DAURICUS.get(), HusoDauricus.createAttributes().build());
        event.put(BvfEntities.BLACK_CARP.get(), ChineseCarpEntity.createAttributes().build());
        event.put(BvfEntities.GRASS_CARP.get(), ChineseCarpEntity.createAttributes().build());
        event.put(BvfEntities.SILVER_CARP.get(), ChineseCarpEntity.createAttributes().build());
        event.put(BvfEntities.BIGHEAD_CARP.get(), ChineseCarpEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(SpawnPlacementRegisterEvent event) {
        event.register(BvfEntities.BVC_HADDOCK_COD.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCodSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_ATLANTIC_COD.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCodSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_PACIFIC_COD.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCodSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_SALMON_MALE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_SALMON_FEMALE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_SALMON_PACIFIC.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.YELLOW_FIN_PUFFER.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.OBSCURE_PUFFER.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.SOARING_LIONFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.RINGED_LIONFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.RADIANT_LIONFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.PORCUPINE_FISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.NAUTILUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.FEATHER_STAR.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ZHIKONG_SCALLOP.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BAY_SCALLOP.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.YESSO_SCALLOP.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.OCEAN_FLOOR, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.SPEARFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ROOSTERFISH.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkRoosterfishSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.GALEOCERDO_CUVIER.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ALOPIAS_VULPINUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.NEGAPRION_ACUTIDENS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.NEGAPRION_BREVIROSTRIS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.EPINEPHELUS_LANCEOLATUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkDeepWarmOceanSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.EPINEPHELUS_ITAJARA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkDeepWarmOceanSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.EPINEPHELUS_MELANOSTIGMA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkDeepWarmOceanSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_ACHILLES.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.PARACANTHURUS_HEPATUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_NIGRICANS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_LINEATUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_STRIATUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_UNIMACULATUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_AURIGA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_COLLARE.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_RETICULATUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.CHAETODON_SPECULUM.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AUSTRALOHEROS_FACETUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.CICHLASOMA_BIMACULATUM.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.KROBIA_GUIANENSIS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AEQUIDENS_TETRAMERUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ASTRONOTUS_OCELLATUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.CHANNA_MICROPELTES.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.CHANNA_ARGUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.ELOPICHTHYS_BAMBUSA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_OCELLARIS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.PREMNAS_BIACULEATUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_POLYMNUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_PERIDERAION.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_CLARKII.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_PERCULA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_AKINDYNOS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_BICINCTUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_CHRYSOGASTER.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_CHRYSOPTERUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_LATEZONATUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_MCCULLOCHI.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_MELANOPUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_TRICINCTUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_SPLENDENS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkBettaSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_IMBELLIS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkBettaSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_SMARAGDINA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkBettaSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_PICTA.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkBettaSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_SIMPLEX.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkBettaSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BETTA_BROWNORUM.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkBettaSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.MEGALOPS_ATLANTICUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkMegalopsAtlanticusSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.KATSUWONUS_PELAMIS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, WaterAnimal::checkSurfaceWaterAnimalSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.DOSIDICUS_GIGAS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkDeepOceanSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.HUSO_DAURICUS.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkRareWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BLACK_CARP.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.GRASS_CARP.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.SILVER_CARP.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(BvfEntities.BIGHEAD_CARP.get(), SpawnPlacements.Type.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
    }

    public static boolean checkCodSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        return WaterAnimal.checkSurfaceWaterAnimalSpawnRules(type, level, spawnType, pos, random);
    }

    public static boolean checkPufferSpawnRules(
            EntityType<? extends Mob> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        return checkSurfaceWaterAnimalSpawnRules(level,pos);
    }

    public static boolean checkDeepWarmOceanSpawnRules(
            EntityType<? extends Mob> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        return checkDeepWaterAnimalSpawnRules(level,pos);
    }

    public static boolean checkBettaSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        return rollSpawn(5, random, spawnType) && checkSurfaceWaterAnimalSpawnRules(level, pos);
    }

    public static boolean checkMegalopsAtlanticusSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        return rollSpawn(5, random, spawnType) && checkSurfaceWaterAnimalSpawnRules(level, pos);
    }

    public static boolean checkRoosterfishSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        return rollSpawn(6, random, spawnType) && checkSurfaceWaterAnimalSpawnRules(level, pos);
    }

    public static boolean checkDeepOceanSpawnRules(
            EntityType<? extends Mob> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        return checkSurfaceWaterAnimalSpawnRules(level,pos);
    }

    public static boolean checkCustomWaterSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        if(rollSpawn(9, random, spawnType)) {
            return checkSurfaceWaterAnimalSpawnRules(level,pos);
        }else {
            return false;
        }
    }

    public static boolean checkRareWaterSpawnRules(
            EntityType<? extends WaterAnimal> type,
            LevelAccessor level,
            MobSpawnType spawnType,
            BlockPos pos,
            RandomSource random) {
        if(rollSpawn(9, random, spawnType)) {
            return checkSurfaceWaterAnimalSpawnRules(level,pos);
        }else {
            return false;
        }
    }

    public static boolean checkSurfaceWaterAnimalSpawnRules(LevelAccessor pLevel, BlockPos pPos) {
        int $$5 = pLevel.getSeaLevel();
        int $$6 = $$5 - 13;
        return pPos.getY() >= $$6 && pPos.getY() <= $$5 && pLevel.getFluidState(pPos.below()).is(FluidTags.WATER) && pLevel.getBlockState(pPos.above()).is(Blocks.WATER);
    }

    public static boolean checkDeepWaterAnimalSpawnRules(LevelAccessor pLevel, BlockPos pPos) {
        int $$5 = pLevel.getSeaLevel() - 13;
        int $$6 = $$5 - 26;
        return pPos.getY() >= $$6 && pPos.getY() <= $$5 && pLevel.getFluidState(pPos.below()).is(FluidTags.WATER) && pLevel.getBlockState(pPos.above()).is(Blocks.WATER);
    }

    public static boolean rollSpawn(int rolls, RandomSource random, MobSpawnType reason) {
        if (reason == MobSpawnType.SPAWNER) {
            return true;
        } else {
            return rolls <= 0 || random.nextInt(rolls) == 0;
        }
    }
}
