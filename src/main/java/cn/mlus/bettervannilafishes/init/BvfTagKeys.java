package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;

public class BvfTagKeys {
    public static final TagKey<Item> PUFFER = createItemTag("puffer");

    public static final TagKey<EntityType<?>> PREDATOR = createEntityTypeTag("predator");
    public static final TagKey<EntityType<?>> TOP_PREDATOR = createEntityTypeTag("top_predator");
    public static final TagKey<Biome> COD_OCEANS = createBiomeTag("cod_oceans");
    public static final TagKey<Biome> WARM_OCEANS = createBiomeTag("warm_oceans");
    public static final TagKey<Biome> DEEP_COLD_OR_FROZEN_OCEANS = createBiomeTag("deep_cold_or_frozen_oceans");

    public BvfTagKeys() {
    }

    private static TagKey<Item> createItemTag(String name) {
        return ItemTags.create(BetterVannilaFishes.prefix(name));
    }
    private static TagKey<EntityType<?>> createEntityTypeTag(String name) {
        return TagKey.create(Registries.ENTITY_TYPE, BetterVannilaFishes.prefix(name));
    }
    private static TagKey<Biome> createBiomeTag(String name) {
        return TagKey.create(Registries.BIOME, BetterVannilaFishes.prefix(name));
    }
}
