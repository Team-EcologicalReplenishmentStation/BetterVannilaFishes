package cn.mlus.bettervannilafishes.entity.scallop;

import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;

public abstract class ScallopEntity extends WaterAnimal implements GeoEntity, BvfEntity<ScallopEntity>, Bucketable {
    private static final EntityDataAccessor<Boolean> FROM_BUCKET = SynchedEntityData.defineId(ScallopEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Integer> ACTION_STATE = SynchedEntityData.defineId(ScallopEntity.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Integer> ACTION_TICKS = SynchedEntityData.defineId(ScallopEntity.class, EntityDataSerializers.INT);

    private static final int STATE_IDLE = 0;
    private static final int STATE_SWIMMING = 1;
    private static final int STATE_CLOSED = 2;

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final GeneralAnimator<ScallopEntity> animator;
    private Vec3 fleeDirection = Vec3.ZERO;

    protected ScallopEntity(EntityType<? extends WaterAnimal> entityType, Level level) {
        super(entityType, level);
        this.animator = new GeneralAnimator<>(this);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 5.0)
                .add(Attributes.MOVEMENT_SPEED, 0.0)
                .add(NeoForgeMod.SWIM_SPEED, 0.7);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.@NotNull Builder builder) {
        super.defineSynchedData(builder);
        builder.define(FROM_BUCKET, false);
        builder.define(ACTION_STATE, STATE_IDLE);
        builder.define(ACTION_TICKS, 0);
    }

    public boolean fromBucket() {
        return this.entityData.get(FROM_BUCKET);
    }

    public void setFromBucket(boolean fromBucket) {
        this.entityData.set(FROM_BUCKET, fromBucket);
    }

    public int getActionState() {
        return this.entityData.get(ACTION_STATE);
    }

    public void setActionState(int state) {
        if (state != STATE_SWIMMING && state != STATE_CLOSED) {
            state = STATE_IDLE;
        }
        this.entityData.set(ACTION_STATE, state);
    }

    public int getActionTicks() {
        return this.entityData.get(ACTION_TICKS);
    }

    public void setActionTicks(int ticks) {
        this.entityData.set(ACTION_TICKS, Math.max(0, ticks));
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putBoolean("FromBucket", this.fromBucket());
    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.setFromBucket(compound.getBoolean("FromBucket"));
    }

    @Override
    public void saveToBucketTag(@NotNull ItemStack stack) {
        CustomData.update(DataComponents.BUCKET_ENTITY_DATA, stack, this::addAdditionalSaveData);
    }

    @Override
    public void loadFromBucketTag(@NotNull CompoundTag tag) {
        this.readAdditionalSaveData(tag);
    }

    @Override
    public @NotNull SoundEvent getPickupSound() {
        return SoundEvents.BUCKET_FILL_FISH;
    }

    @Override
    protected @NotNull SoundEvent getSwimSound() {
        return SoundEvents.FISH_SWIM;
    }

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource damageSource) {
        return SoundEvents.TURTLE_EGG_CRACK;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.TURTLE_EGG_BREAK;
    }

    @Override
    protected void registerGoals() {
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        AnimationController<ScallopEntity> main = new AnimationController<>(this, "main", 10, state -> {
            RawAnimation builder = RawAnimation.begin();
            if (!this.isInWater()) {
                builder.thenLoop("animation.close");
            } else {
                if (state.isMoving()) {
                    builder.thenLoop("animation.swim");
                } else if (this.isFallingInWater()) {
                    builder.thenLoop("animation.in_water");
                } else {
                    builder.thenLoop("animation.idle");
                }
            }
            return state.setAndContinue(builder);
        });

        controllers.add(main);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.level().isClientSide) {
            this.animator.tick();
            return;
        }

        if (!this.isInWater()) {
            this.setActionState(STATE_CLOSED);
            this.setActionTicks(Math.max(this.getActionTicks(), 40));
            this.setDeltaMovement(0.0, Math.min(this.getDeltaMovement().y, 0.0), 0.0);
            return;
        }

        int ticks = this.getActionTicks();
        if (ticks <= 0 && (this.getActionState() == STATE_SWIMMING || this.getActionState() == STATE_CLOSED)) {
            this.clearTimedAction();
        }

        if (ticks > 0) {
            int remainingTicks = ticks - 1;
            this.setActionTicks(remainingTicks);
            if (this.getActionState() == STATE_SWIMMING) {
                if (this.fleeDirection.lengthSqr() <= 0.001) {
                    this.clearTimedAction();
                    this.sinkInWater(0.2);
                } else {
                    this.setDeltaMovement(this.fleeDirection.x * 0.12, 0.08, this.fleeDirection.z * 0.12);
                }
            } else {
                this.fleeDirection = Vec3.ZERO;
                this.sinkInWater(0.2);
            }
            if (remainingTicks <= 0) {
                this.clearTimedAction();
                this.sinkInWater(0.2);
            }
        } else {
            this.fleeDirection = Vec3.ZERO;
            this.sinkInWater(0.65);
            this.tryStartReaction();
        }
    }

    private void clearTimedAction() {
        this.fleeDirection = Vec3.ZERO;
        this.setActionTicks(0);
    }

    private void sinkInWater(double horizontalDrag) {
        if (this.onGround()) {
            this.setActionState(STATE_IDLE);
            this.setDeltaMovement(Vec3.ZERO);
            return;
        }

        this.setActionState(STATE_IDLE);
        Vec3 movement = this.getDeltaMovement();
        double yMovement = Math.min(movement.y * 0.65 - 0.025, -0.025);
        this.setDeltaMovement(movement.x * horizontalDrag, yMovement, movement.z * horizontalDrag);
    }

    private boolean isFallingInWater() {
        return !this.onGround() && this.getDeltaMovement().y < -0.05;
    }

    @Override
    public void travel(@NotNull Vec3 travelVector) {
        if (this.isEffectiveAi() && this.isInWater()) {
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.9));
        } else {
            super.travel(travelVector);
        }
    }

    private void tryStartReaction() {
        if (this.tickCount % 10 != 0 || this.random.nextInt(3) != 0) {
            return;
        }

        List<LivingEntity> entities = this.level().getEntitiesOfClass(LivingEntity.class, this.getBoundingBox().inflate(2.5), this::isScaryEntity);
        if (entities.isEmpty()) {
            return;
        }

        Entity scaryEntity = entities.get(0);
        Vec3 away = this.position().subtract(scaryEntity.position());
        if (away.horizontalDistanceSqr() < 0.001) {
            away = Vec3.directionFromRotation(0.0F, this.random.nextFloat() * 360.0F);
        }
        this.fleeDirection = new Vec3(away.x, 0.0, away.z).normalize();
        this.setYRot((float) (Math.toDegrees(Math.atan2(this.fleeDirection.z, this.fleeDirection.x)) - 90.0F));
        this.yBodyRot = this.getYRot();

        if (this.random.nextBoolean()) {
            this.setActionState(STATE_SWIMMING);
            this.setActionTicks(this.random.nextIntBetweenInclusive(18, 32));
        } else {
            this.setActionState(STATE_CLOSED);
            this.setActionTicks(this.random.nextIntBetweenInclusive(60, 120));
        }
    }

    private boolean isScaryEntity(LivingEntity entity) {
        if (entity == this || !entity.isAlive()) {
            return false;
        }
        if (entity instanceof ScallopEntity) {
            return false;
        }
        if (entity instanceof Player player) {
            return !player.isCreative() && !player.isSpectator();
        }
        return entity instanceof AbstractFish;
    }

    @Override
    public @NotNull InteractionResult mobInteract(@NotNull Player player, @NotNull InteractionHand hand) {
        if (player.getMainHandItem().getItem() == Items.WATER_BUCKET) {
            return Bucketable.bucketMobPickup(player, hand, this).orElse(InteractionResult.PASS);
        }

        return super.mobInteract(player, hand);
    }

    @Override
    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return !this.fromBucket() && !this.hasCustomName();
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public GeneralAnimator<ScallopEntity> getAnimator() {
        return this.animator;
    }

    @Override
    public float getScale() {
        return 1.0F;
    }
}
