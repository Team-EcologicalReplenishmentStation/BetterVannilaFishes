package cn.mlus.bettervannilafishes.entity.alopias;

import cn.mlus.bettervannilafishes.client.animator.AlopiasVulpinusAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.BvfWaterAnimal;
import cn.mlus.bettervannilafishes.entity.ai.BvfWaterAnimalMoveControl;
import cn.mlus.bettervannilafishes.entity.alopias.ai.AlopiasFoodGoal;
import cn.mlus.bettervannilafishes.entity.alopias.ai.AlopiasTailAttackGoal;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.navigation.SharkNavigation;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.Util;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animation.*;

import java.util.Arrays;
import java.util.function.IntFunction;

public class AlopiasVulpinusEntity extends BvfWaterAnimal implements BvfEntity<AlopiasVulpinusEntity>, Bucketable, VariantHolder<AlopiasVulpinusEntity.Variant> {
    private static final EntityDataAccessor<Integer> DATA_VARIANT = SynchedEntityData.defineId(AlopiasVulpinusEntity.class, EntityDataSerializers.INT);
    private final GeneralAnimator<AlopiasVulpinusEntity> animator;

    public AlopiasVulpinusEntity(EntityType<? extends WaterAnimal> type, Level level) {
        super(type, level);
        this.moveControl = new BvfWaterAnimalMoveControl(true, this);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
        this.animator = new AlopiasVulpinusAnimator(this);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.@NotNull Builder builder) {
        super.defineSynchedData(builder);
        builder.define(DATA_VARIANT, 0);
    }

    @Override
    protected @NotNull PathNavigation createNavigation(@NotNull Level level) {
        return new SharkNavigation(this, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new PanicGoal(this, 2.0));
        this.goalSelector.addGoal(1, new AlopiasTailAttackGoal(this, 2));
        this.goalSelector.addGoal(2, new AlopiasFoodGoal(this, 1.2, 20));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, AbstractFish.class, 200, true, false,
                fish -> fish.isInWater() && fish.getBbHeight() <= 1.6F));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        AnimationController<AlopiasVulpinusEntity> main = new AnimationController<>(this, "main", 4, state -> {
            if (!isInWater()) return state.setAndContinue(RawAnimation.begin().thenLoop("animation.flop"));
            return state.setAndContinue(RawAnimation.begin().thenLoop(isAggressive() ? "animation.quickly_swim" : "animation.swim"));
        });
        AnimationController<AlopiasVulpinusEntity> extra = new AnimationController<>(this, "extra", 2, state -> PlayState.STOP)
                .triggerableAnim("tail_attack", RawAnimation.begin().thenPlay("animation.attack_tail"))
                .triggerableAnim("eat", RawAnimation.begin().thenPlay("animation.attack"));
        controllers.add(main, extra);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 32).add(Attributes.ATTACK_DAMAGE, 8)
                .add(Attributes.MOVEMENT_SPEED, 1.2).add(Attributes.FOLLOW_RANGE, 32).add(NeoForgeMod.SWIM_SPEED, 1);
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide()) animator.tick();
    }

    @Override
    public GeneralAnimator<AlopiasVulpinusEntity> getAnimator() { return animator; }

    @Override
    public boolean removeWhenFarAway(double distance) { return false; }

    @Override
    public int getMaxSpawnClusterSize() { return 1; }

    @Override
    protected @NotNull InteractionResult mobInteract(@NotNull Player player, @NotNull InteractionHand hand) {
        return Bucketable.bucketMobPickup(player, hand, this).orElse(super.mobInteract(player, hand));
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() { return new ItemStack(BvfItems.ALOPIAS_VULPINUS_BUCKET.get()); }

    @Override
    public void saveToBucketTag(ItemStack stack) { CustomData.update(DataComponents.BUCKET_ENTITY_DATA, stack, this::addAdditionalSaveData); }

    @Override
    public void loadFromBucketTag(@NotNull CompoundTag tag) { readAdditionalSaveData(tag); }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        if (tag.contains("Variant", 99)) setVariant(Variant.byId(tag.getInt("Variant")));
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putInt("Variant", getVariant().getId());
    }

    @Nullable
    @Override
    public ItemEntity spawnAtLocation(@NotNull ItemStack stack) {
        if (stack.is(BvfItems.ALOPIAS_VULPINUS.get())) CustomData.update(DataComponents.CUSTOM_DATA, stack, data -> data.putInt("Variant", getVariant().id));
        return super.spawnAtLocation(stack);
    }

    @Override
    public void setVariant(@NotNull Variant variant) { entityData.set(DATA_VARIANT, variant.id); }

    @Override
    public @NotNull Variant getVariant() { return Variant.byId(entityData.get(DATA_VARIANT)); }

    @Nullable
    @Override
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor level, @NotNull DifficultyInstance difficulty, @NotNull MobSpawnType reason, @Nullable SpawnGroupData data) {
        if (reason != MobSpawnType.BUCKET) setVariant(Variant.random(level.getRandom()));
        return super.finalizeSpawn(level, difficulty, reason, data);
    }

    public enum Variant implements StringRepresentable {
        ORIGINAL(0, "original"), DARK(1, "dark");
        private static final IntFunction<Variant> BY_ID = ByIdMap.continuous(Variant::getId, values(), ByIdMap.OutOfBoundsStrategy.ZERO);
        private final int id;
        private final String name;
        Variant(int id, String name) { this.id = id; this.name = name; }
        public int getId() { return id; }
        @Override public @NotNull String getSerializedName() { return name; }
        public static Variant byId(int id) { return BY_ID.apply(id); }
        private static Variant random(RandomSource random) { return Util.getRandom(Arrays.stream(values()).toArray(Variant[]::new), random); }
    }
}
