package cn.mlus.bettervannilafishes.event;

import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.cichlid.BvfCichlidEntity;
import cn.mlus.bettervannilafishes.entity.clownfish.BvfClownfishEntity;
import cn.mlus.bettervannilafishes.entity.featherstar.FeatherStarEntity;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.GaleocerdoCuvierEntity;
import cn.mlus.bettervannilafishes.entity.nautilus.NautilusEntity;
import cn.mlus.bettervannilafishes.entity.pufferfish.BvfPufferfishEntity;
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
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.WaterAnimal;
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
        event.put(BvfEntities.BVC_HADDOCK_COD.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_ATLANTIC_COD.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_PACIFIC_COD.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_SALMON_MALE.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_SALMON_FEMALE.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.BVC_SALMON_PACIFIC.get(), BvfAbstractFish.createAttributes().build());
        event.put(BvfEntities.YELLOW_FIN_PUFFER.get(), BvfPufferfishEntity.createAttributes().build());
        event.put(BvfEntities.OBSCURE_PUFFER.get(), BvfPufferfishEntity.createAttributes().build());
        event.put(BvfEntities.PORCUPINE_FISH.get(), BvfPufferfishEntity.createAttributes().build());
        event.put(BvfEntities.NAUTILUS.get(), NautilusEntity.createAttributes().build());
        event.put(BvfEntities.FEATHER_STAR.get(), FeatherStarEntity.createAttributes().build());
        event.put(BvfEntities.SPEARFISH.get(), SpearfishEntity.createAttributes().build());
        event.put(BvfEntities.GALEOCERDO_CUVIER.get(), GaleocerdoCuvierEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_ACHILLES.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.PARACANTHURUS_HEPATUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_NIGRICANS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.ACANTHURUS_LINEATUS.get(), BvfSurgeonfishEntity.createAttributes().build());
        event.put(BvfEntities.AUSTRALOHEROS_FACETUS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.CICHLASOMA_BIMACULATUM.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.KROBIA_GUIANENSIS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.AEQUIDENS_TETRAMERUS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.ASTRONOTUS_OCELLATUS.get(), BvfCichlidEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_OCELLARIS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.PREMNAS_BIACULEATUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_POLYMNUS.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_PERIDERAION.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_CLARKII.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.AMPHIPRION_PERCULA.get(), BvfClownfishEntity.createAttributes().build());
        event.put(BvfEntities.DOSIDICUS_GIGAS.get(), DosidicusGigasEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(BvfEntities.BVC_HADDOCK_COD.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCodSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_ATLANTIC_COD.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCodSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_PACIFIC_COD.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCodSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_SALMON_MALE.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_SALMON_FEMALE.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.BVC_SALMON_PACIFIC.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.YELLOW_FIN_PUFFER.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.OBSCURE_PUFFER.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.PORCUPINE_FISH.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.NAUTILUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.FEATHER_STAR.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.OCEAN_FLOOR, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.SPEARFISH.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.GALEOCERDO_CUVIER.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_ACHILLES.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.PARACANTHURUS_HEPATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_NIGRICANS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ACANTHURUS_LINEATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AUSTRALOHEROS_FACETUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.CICHLASOMA_BIMACULATUM.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.KROBIA_GUIANENSIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AEQUIDENS_TETRAMERUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.ASTRONOTUS_OCELLATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkCustomWaterSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_OCELLARIS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.PREMNAS_BIACULEATUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_POLYMNUS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_PERIDERAION.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_CLARKII.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.AMPHIPRION_PERCULA.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkPufferSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(BvfEntities.DOSIDICUS_GIGAS.get(), SpawnPlacementTypes.IN_WATER, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, EntityAttributeHandler::checkDeepOceanSpawnRules, RegisterSpawnPlacementsEvent.Operation.REPLACE);
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
