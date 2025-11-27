package cn.mlus.bettervannilafishes.data;

import cn.mlus.bettervannilafishes.init.BvfBiomeModifierSerializers;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.ModifiableBiomeInfo;
import org.jetbrains.annotations.NotNull;

public record BvfBiomeSpawnCostModifier(HolderSet<Biome> biomes) implements BiomeModifier {
    @Override
    public void modify(final @NotNull Holder<Biome> biome, final @NotNull Phase phase, final ModifiableBiomeInfo.BiomeInfo.@NotNull Builder builder) {
        if (phase == Phase.ADD) {
            if(biome.is(BiomeTags.IS_OCEAN)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_HADDOCK_COD.get(),0.7,0.1);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_PACIFIC_COD.get(),0.7,0.1);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_ATLANTIC_COD.get(),0.7,0.1);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_SALMON_PACIFIC.get(),0.8,0.1);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.YELLOW_FIN_PUFFER.get(), 0.8,0.1);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.OBSCURE_PUFFER.get(), 0.8,0.1);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.PORCUPINE_FISH.get(), 0.8,0.1);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.NAUTILUS.get(),0.7,0.2);
            }
            if(biome.is(BiomeTags.IS_RIVER)){
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_SALMON_MALE.get(),0.7,0.1);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.BVC_SALMON_FEMALE.get(),0.7,0.1);
                builder.getMobSpawnSettings().addMobCharge(BvfEntities.OBSCURE_PUFFER.get(), 0.8,0.1);
            }
        }
    }

    @Override
    public @NotNull MapCodec<? extends BiomeModifier> codec() {
        return BvfBiomeModifierSerializers.ADD_MOB_SPAWN_COST.get();
    }

}
