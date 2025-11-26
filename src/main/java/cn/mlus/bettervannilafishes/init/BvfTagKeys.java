package cn.mlus.bettervannilafishes.init;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class BvfTagKeys {
    public static final TagKey<Item> PUFFER = create("puffer");

    public BvfTagKeys() {
    }

    private static TagKey<Item> create(String name) {
        return ItemTags.create(BetterVannilaFishes.prefix(name));
    }
}
