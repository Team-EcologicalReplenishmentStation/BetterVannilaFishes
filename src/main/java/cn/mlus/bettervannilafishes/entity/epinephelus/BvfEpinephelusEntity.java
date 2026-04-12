package cn.mlus.bettervannilafishes.entity.epinephelus;

import cn.mlus.bettervannilafishes.client.animator.EpinehelusAnimator;
import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.BvfWaterAnimal;
import cn.mlus.bettervannilafishes.entity.ai.BvfWaterAnimalMoveControl;
import cn.mlus.bettervannilafishes.entity.ai.goal.MoveTowardsFoodGoal;
import cn.mlus.bettervannilafishes.entity.epinephelus.ai.EpinephelusMeleeAttackGoal;
import cn.mlus.bettervannilafishes.entity.galeocerdocuvier.navigation.SharkNavigation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.common.ForgeMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Math;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;

public abstract class BvfEpinephelusEntity extends BvfWaterAnimal implements BvfEntity<BvfEpinephelusEntity>, Bucketable {
    public BvfEpinephelusEntity(EntityType<? extends WaterAnimal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new BvfWaterAnimalMoveControl(false,this);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
        animator = new EpinehelusAnimator<>(this);
    }

    private final GeneralAnimator<BvfEpinephelusEntity> animator;

    protected static final EntityDataAccessor<Float> SCALE = SynchedEntityData.defineId(BvfEpinephelusEntity.class, EntityDataSerializers.FLOAT);

    protected abstract Item getBucketItem();

    @Override
    protected @NotNull PathNavigation createNavigation(@NotNull Level pLevel) {
        return new SharkNavigation(this, pLevel);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        entityData.define(SCALE, 1.0f);
    }

    public float getScale(){
        return entityData.get(SCALE);
    }

    public void setScale(float scale){
        entityData.set(SCALE, Math.clamp(scale, 0.8f, 1.2f));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<BvfEpinephelusEntity> main = new AnimationController<>(this, "main", 4, state -> {
            RawAnimation builder = RawAnimation.begin();
            if (isInWater()) {
                if(state.isMoving()){
                    if (isAggressive()) {
                        builder.thenLoop("animation.quickly_swim");
                    } else {
                        builder.thenLoop("animation.swim");
                    }
                }else {
                    builder.thenLoop("animation.idle");
                }
            } else {
                builder.thenLoop("animation.flop");
            }

            return state.setAndContinue(builder);
        });

        AnimationController<BvfEpinephelusEntity> extra = new AnimationController<>(this, "extra", 4, state -> PlayState.STOP)
                .triggerableAnim("attack", RawAnimation.begin().thenPlay("animation.attack"));

        controllerRegistrar.add(main, extra);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 40.0)
                .add(Attributes.ATTACK_DAMAGE, 8)
                .add(Attributes.MOVEMENT_SPEED, 0.8)
                .add(Attributes.FOLLOW_RANGE, 64)
                .add(ForgeMod.SWIM_SPEED.get(), 0.8);
    }

    @Override
    public GeneralAnimator<BvfEpinephelusEntity> getAnimator() {
        return animator;
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide()) {
            animator.tick();
        }
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new EpinephelusMeleeAttackGoal(this, 2, false));
        this.goalSelector.addGoal(1, new MoveTowardsFoodGoal(this, 1.2f, 20f));

        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, AbstractFish.class, 500, true, false, Entity::isInWater));
    }

    @Override
    public boolean removeWhenFarAway(double pDistanceToClosestPlayer) {
        return false;
    }

    @Override
    public int getMaxSpawnClusterSize() {
        return 1;
    }

    private boolean killedByTrident = false;

    @Override
    public void die(DamageSource pDamageSource) {
        this.killedByTrident = pDamageSource.is(DamageTypes.TRIDENT);
        super.die(pDamageSource);
    }

    @Nullable
    @Override
    public ItemEntity spawnAtLocation(@NotNull ItemStack pStack) {
        if (pStack.is(ItemTags.FISHES) && this.killedByTrident) {
            pStack.getOrCreateTag().putFloat("Scale", getScale());
        }
        return super.spawnAtLocation(pStack);
    }

    protected @NotNull InteractionResult mobInteract(@NotNull Player pPlayer, @NotNull InteractionHand pHand) {
        return Bucketable.bucketMobPickup(pPlayer, pHand, this).orElse(super.mobInteract(pPlayer, pHand));
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(getBucketItem());
    }

    public abstract float getMinScale();

    public abstract float getMaxScale();

    @Override
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @org.jetbrains.annotations.Nullable SpawnGroupData pSpawnData, @org.jetbrains.annotations.Nullable CompoundTag pDataTag) {
        if (pReason == MobSpawnType.BUCKET) {
            return pSpawnData;
        } else {
            this.setScale(Mth.randomBetween(this.random, getMinScale(), getMaxScale()));
            return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData, pDataTag);
        }
    }

    @Override
    public void saveToBucketTag(@NotNull ItemStack pStack) {
        super.saveToBucketTag(pStack);
    }

    @Override
    public void loadFromBucketTag(@NotNull CompoundTag pTag) {
        super.loadFromBucketTag(pTag);
    }
}

