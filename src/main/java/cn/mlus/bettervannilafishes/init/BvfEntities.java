package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.entity.cod.AtlanticCod;
import cn.mlus.bettervannilafishes.entity.cod.HaddockCod;
import cn.mlus.bettervannilafishes.entity.cod.PacificCod;
import cn.mlus.bettervannilafishes.entity.nautilus.NautilusEntity;
import cn.mlus.bettervannilafishes.entity.pufferfish.ObscurePuffer;
import cn.mlus.bettervannilafishes.entity.pufferfish.YellowFinPuffer;
import cn.mlus.bettervannilafishes.entity.salmon.FemaleSalmon;
import cn.mlus.bettervannilafishes.entity.salmon.MaleSalmon;
import cn.mlus.bettervannilafishes.entity.salmon.PacificSalmon;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

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
    public static final DeferredHolder<EntityType<?>,EntityType<NautilusEntity>> NAUTILUS = ENTITIES.register("nautilus",
            () -> EntityType.Builder.of(NautilusEntity::new, MobCategory.WATER_AMBIENT)
                    .sized(0.55F,0.55F)
                    .build(BetterVannilaFishes.prefix("nautilus").toString()));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}
