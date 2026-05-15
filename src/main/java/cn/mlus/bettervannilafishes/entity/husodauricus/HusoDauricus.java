package cn.mlus.bettervannilafishes.entity.husodauricus;

import cn.mlus.bettervannilafishes.client.animator.BvfFishAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.BvfWaterAnimal;
import cn.mlus.bettervannilafishes.entity.ai.BvfWaterAnimalMoveControl;
import cn.mlus.bettervannilafishes.entity.ai.goal.MoveTowardsFoodGoal;
import cn.mlus.bettervannilafishes.entity.ai.navigation.LargeFishNavigation;
import cn.mlus.bettervannilafishes.entity.husodauricus.ai.HusoDauricusMeleeAttackGoal;
import cn.mlus.bettervannilafishes.init.BvfItems;
import cn.mlus.bettervannilafishes.init.BvfTagKeys;
import net.minecraft.Util;
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
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.core.component.DataComponents;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;

import java.util.Arrays;
import java.util.function.IntFunction;

public class HusoDauricus extends BvfWaterAnimal implements BvfEntity<HusoDauricus>, Bucketable, VariantHolder<HusoDauricus.Variant> {

    private static final EntityDataAccessor<Integer> DATA_VARIANT = SynchedEntityData.defineId(HusoDauricus.class, EntityDataSerializers.INT);

    private final GeneralAnimator<HusoDauricus> animator;

    public HusoDauricus(EntityType<? extends WaterAnimal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new BvfWaterAnimalMoveControl(true, this);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
        animator = new BvfFishAnimator<>(this);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.@NotNull Builder builder) {
        super.defineSynchedData(builder);
        builder.define(DATA_VARIANT, 0);
    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        if (pCompound.contains("Variant", 99)) {
            this.setVariant(Variant.byId(pCompound.getInt("Variant")));
        }
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putInt("Variant", this.getVariant().getId());
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide()) {
            animator.tick();
        }
    }

    @Override
    protected @NotNull PathNavigation createNavigation(@NotNull Level pLevel) {
        return new LargeFishNavigation(this, pLevel);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<HusoDauricus> main = new AnimationController<>(this, "main", 8, state -> {
            RawAnimation builder = RawAnimation.begin();
            if (isInWater()) {
                if (isAggressive()) {
                    builder.thenLoop("animation.quickly_swim");
                } else {
                    builder.thenLoop("animation.swim");
                }
            } else {
                builder.thenLoop("animation.flop");
            }
            return state.setAndContinue(builder);
        });

        AnimationController<HusoDauricus> extra = new AnimationController<>(this, "extra", 2, state -> PlayState.STOP)
                .triggerableAnim("attack", RawAnimation.begin().thenPlay("animation.attack"));

        controllerRegistrar.add(main, extra);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 80.0)
                .add(Attributes.ARMOR, 6.0)
                .add(Attributes.ATTACK_DAMAGE, 3.0)
                .add(Attributes.FOLLOW_RANGE, 48.0)
                .add(Attributes.MOVEMENT_SPEED, 0.8)
                .add(NeoForgeMod.SWIM_SPEED, 1.5);
    }

    @Override
    public GeneralAnimator<HusoDauricus> getAnimator() {
        return animator;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new PanicGoal(this,1));
        this.goalSelector.addGoal(2, new HusoDauricusMeleeAttackGoal(this, 2, false));

        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, AbstractFish.class, 80, true, false,
                target -> target.getType() != this.getType()
                        && !target.getType().is(BvfTagKeys.PREDATOR)
                        && !target.getType().is(BvfTagKeys.TOP_PREDATOR)));
    }

    @Override
    public boolean removeWhenFarAway(double pDistanceToClosestPlayer) {
        return false;
    }

    @Override
    public int getMaxSpawnClusterSize() {
        return 1;
    }

    @Override
    protected @NotNull InteractionResult mobInteract(@NotNull Player pPlayer, @NotNull InteractionHand pHand) {
        return Bucketable.bucketMobPickup(pPlayer, pHand, this).orElse(super.mobInteract(pPlayer, pHand));
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.HUSO_DAURICUS_BUCKET.get());
    }

    @Nullable
    @Override
    public ItemEntity spawnAtLocation(@NotNull ItemStack pStack) {
        if (pStack.is(BvfItems.HUSO_DAURICUS.get())) {
            CustomData.update(DataComponents.CUSTOM_DATA, pStack,
                    data -> data.putInt("Variant", getVariant().id));
        }
        return super.spawnAtLocation(pStack);
    }

    @Override
    public void setVariant(@NotNull Variant variant) {
        this.entityData.set(DATA_VARIANT, variant.id);
    }

    @Override
    public @NotNull Variant getVariant() {
        return Variant.byId(this.entityData.get(DATA_VARIANT));
    }

    @Override
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData) {
        if (pReason != MobSpawnType.BUCKET) {
            this.setVariant(Variant.getSpawnVariant(this.random));
        }
        return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData);
    }

    public enum Variant implements StringRepresentable {
        ORIGINAL(0, "original"),
        DARK(1, "dark"),
        DEEP(2, "deep");

        private static final IntFunction<Variant> BY_ID = ByIdMap.continuous(Variant::getId, values(), ByIdMap.OutOfBoundsStrategy.ZERO);
        private final int id;
        private final String name;

        Variant(int pId, String pName) {
            this.id = pId;
            this.name = pName;
        }

        public int getId() {
            return this.id;
        }

        @Override
        public @NotNull String getSerializedName() {
            return this.name;
        }

        public static Variant byId(int pId) {
            return BY_ID.apply(pId);
        }

        private static Variant getSpawnVariant(RandomSource pRandom) {
            Variant[] variants = Arrays.stream(values()).toArray(Variant[]::new);
            return Util.getRandom(variants, pRandom);
        }
    }
}
