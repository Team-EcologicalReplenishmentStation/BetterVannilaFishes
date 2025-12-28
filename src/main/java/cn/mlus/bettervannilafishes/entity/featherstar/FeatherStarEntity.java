package cn.mlus.bettervannilafishes.entity.featherstar;

import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.init.BvfItems;
import cn.mlus.bettervannilafishes.init.BvfMobEffects;
import cn.mlus.bettervannilafishes.util.BvfUtils;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;

public class FeatherStarEntity extends WaterAnimal implements GeoEntity, BvfEntity<FeatherStarEntity>, Bucketable {
    public FeatherStarEntity(EntityType<? extends WaterAnimal> p_30341_, Level p_30342_) {
        super(p_30341_, p_30342_);
        animator = new GeneralAnimator<>(this);
    }

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final GeneralAnimator<FeatherStarEntity> animator;

    private static final EntityDataAccessor<Boolean> FROM_BUCKET = SynchedEntityData.defineId(FeatherStarEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_JUMPING = SynchedEntityData.defineId(FeatherStarEntity.class, EntityDataSerializers.BOOLEAN);

    @Override
    public GeneralAnimator<FeatherStarEntity> getAnimator() {
        return animator;
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 8.0);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.@NotNull Builder builder) {
        super.defineSynchedData(builder);
        builder.define(FROM_BUCKET, false);
        builder.define(IS_JUMPING, false);
    }

    public boolean fromBucket() {
        return this.entityData.get(FROM_BUCKET);
    }

    public void setFromBucket(boolean pFromBucket) {
        this.entityData.set(FROM_BUCKET, pFromBucket);
    }
    public boolean isJumpingSync() {
        return this.entityData.get(IS_JUMPING);
    }
    public void setJumpingSync(boolean jumping) {
        this.entityData.set(IS_JUMPING, jumping);
    }

    @Override
    public void saveToBucketTag(@NotNull ItemStack pStack) {
        CustomData.update(DataComponents.BUCKET_ENTITY_DATA,pStack,this::addAdditionalSaveData);
    }
    @Override
    public void loadFromBucketTag(@NotNull CompoundTag pTag) {
        this.readAdditionalSaveData(pTag);
    }

    public void addAdditionalSaveData(@NotNull CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        pCompound.putBoolean("FromBucket", this.fromBucket());
    }

    public void readAdditionalSaveData(@NotNull CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        this.setFromBucket(pCompound.getBoolean("FromBucket"));
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.FEATHER_STAR_BUCKET);
    }

    @Override
    public @NotNull SoundEvent getPickupSound() {
        return SoundEvents.BUCKET_FILL_FISH;
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        AnimationController<FeatherStarEntity> main = new AnimationController<>(this, "main", 10, state -> {
            RawAnimation builder = RawAnimation.begin();
            if(isInWater()){
                if(BvfUtils.isMoving(this)){
                    if (!isJumpingSync()) {
                        builder.thenLoop("animation.fall");
                    } else {
                        builder.thenLoop("animation.swim");
                    }
                }else {
                    builder.thenLoop("animation.attach");
                }
            }else {
                builder.thenLoop("animation.aground");
            }

            return state.setAndContinue(builder);
        });

        controllers.add(main);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this){
            @Override
            public void stop() {
                wantToJump = false;
                setJumpingSync(false);
            }

            @Override
            public void start() {
                setJumpingSync(true);
            }

            @Override
            public boolean canUse() {
                return super.canUse() && wantToJump && FeatherStarEntity.this.getFluidHeight(FluidTags.WATER) >= 0.8F;
            }
        });
    }

    @Override
    public void jumpInFluid(@NotNull FluidType type) {
        this.setDeltaMovement(0.0F, 0.04, 0.0F);
    }

    private boolean wantToJump;

    @Override
    public void tick() {
        super.tick();
        if(level().isClientSide){
            animator.tick();
        }else {
            if(tickCount % 100 == 0){
                List<Entity> entities = level().getEntities(this, this.getBoundingBox().inflate(8.0),
                        entity -> entity instanceof LivingEntity livingEntity && livingEntity.canBreatheUnderwater());
                entities.forEach(entity -> {
                    if (entity instanceof LivingEntity livingEntity) {
                        livingEntity.addEffect(new MobEffectInstance(BvfMobEffects.PURIFICATION,200,0,false,false,true));
                    }
                });

                if(!wantToJump && onGround()){
                    wantToJump = this.random.nextInt(3) == 0;
                }
            }

            setNoGravity(wantToJump);
        }
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }


    @Override
    public @NotNull InteractionResult mobInteract(@NotNull Player player, @NotNull InteractionHand pHand) {
        if (player.getMainHandItem().getItem() == Items.WATER_BUCKET) {
            return Bucketable.bucketMobPickup(player, pHand, this).orElse(InteractionResult.PASS);
        }

        return super.mobInteract(player, pHand);
    }
}
