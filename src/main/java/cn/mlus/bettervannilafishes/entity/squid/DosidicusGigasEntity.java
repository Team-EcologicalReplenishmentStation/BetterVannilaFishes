package cn.mlus.bettervannilafishes.entity.squid;

import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.client.animator.SquidAnimator;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.BvfWaterAnimal;
import cn.mlus.bettervannilafishes.entity.squid.ai.SquidMeleeAttackGoal;
import cn.mlus.bettervannilafishes.entity.squid.ai.SquidMoveControl;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.SmoothSwimmingLookControl;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.animal.Bucketable;
import net.minecraft.world.entity.animal.WaterAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;

public class DosidicusGigasEntity extends BvfWaterAnimal implements BvfEntity<DosidicusGigasEntity>, Bucketable {
    private final GeneralAnimator<DosidicusGigasEntity> animator;

    private static final EntityDataAccessor<Integer> DATA_COLOR_STATE = SynchedEntityData.defineId(DosidicusGigasEntity.class, EntityDataSerializers.INT);

    public static final String[] COLOR_NAMES = {"deep_dark", "red", "carnation", "pink", "white"};

    private static final int[] COLOR_CYCLE = {0, 1, 2, 3, 4, 3, 2, 1};

    private int colorCycleIndex = 0;

    private static final int COLOR_CHANGE_INTERVAL = 3;

    private int colorTickCounter = 0;

    private int restingColor = -1;

    public DosidicusGigasEntity(EntityType<? extends WaterAnimal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.moveControl = new SquidMoveControl(this);
        this.lookControl = new SmoothSwimmingLookControl(this, 10);
        animator = new SquidAnimator<>(this);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.@NotNull Builder builder) {
        super.defineSynchedData(builder);
        builder.define(DATA_COLOR_STATE, 0);
    }

    public int getColorState() {
        return this.entityData.get(DATA_COLOR_STATE);
    }

    public void setColorState(int color) {
        this.entityData.set(DATA_COLOR_STATE, color);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<DosidicusGigasEntity> main = new AnimationController<>(this, "main", 4, state -> {
            RawAnimation builder = RawAnimation.begin();
            if (isInWater()) {
                if(isVehicle()){
                    builder.thenLoop("animation.hold");
                }else {
                    if (isAggressive()) {
                        builder.thenLoop("animation.swim_back");
                    } else {
                        builder.thenLoop("animation.swim");
                    }
                }
            } else {
                builder.thenLoop("animation.flop");
            }
            return state.setAndContinue(builder);
        });

        AnimationController<DosidicusGigasEntity> extra = new AnimationController<>(this, "extra", 0, state -> PlayState.STOP)
                .triggerableAnim("attack", RawAnimation.begin().thenPlay("animation.attack"));

        controllerRegistrar.add(main, extra);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0)
                .add(Attributes.ATTACK_DAMAGE, 5)
                .add(Attributes.MOVEMENT_SPEED, 0.8)
                .add(Attributes.FOLLOW_RANGE, 32)
                .add(NeoForgeMod.SWIM_SPEED, 1.3);
    }

    @Override
    public void travel(@NotNull Vec3 pTravelVector) {
        if (this.isEffectiveAi() && this.isInWater()) {
            this.moveRelative(this.getSpeed(), pTravelVector);
            this.move(MoverType.SELF, this.getDeltaMovement());
            this.setDeltaMovement(this.getDeltaMovement().scale(0.9));
            if (this.getTarget() == null) {
                this.setDeltaMovement(this.getDeltaMovement().add(0.0, -0.005, 0.0));
            }
        } else {
            super.travel(pTravelVector);
        }
    }

    @Override
    public GeneralAnimator<DosidicusGigasEntity> getAnimator() {
        return animator;
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide()) {
            animator.tick();
        }

        if (!level().isClientSide()) {
            if (isAggressive()) {
                restingColor = -1;
                colorTickCounter++;
                if (colorTickCounter >= COLOR_CHANGE_INTERVAL) {
                    colorTickCounter = 0;
                    colorCycleIndex = (colorCycleIndex + 1) % COLOR_CYCLE.length;
                    setColorState(COLOR_CYCLE[colorCycleIndex]);
                }
            } else {
                if (restingColor == -1) {
                    restingColor = random.nextBoolean() ? 1 : 4;
                }
                int current = getColorState();
                if (current != restingColor) {
                    colorTickCounter++;
                    if (colorTickCounter >= COLOR_CHANGE_INTERVAL) {
                        colorTickCounter = 0;
                        if (current < restingColor) {
                            setColorState(current + 1);
                        } else {
                            setColorState(current - 1);
                        }
                    }
                } else {
                    colorCycleIndex = 0;
                    colorTickCounter = 0;
                }
            }

            if(tickCount % 20 == 0){
                if(getFirstPassenger() != null){
                    getFirstPassenger().hurt(damageSources().mobAttack(this),2);
                }
            }
        }
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new SquidMeleeAttackGoal(this, 2, false));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, AbstractFish.class, 400, true, false,
                Entity::isInWater));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this,Player.class,400,true,false,
                (LivingEntity entity) -> entity.isInWater() && !fromBucket()));
    }

    @Override
    protected void positionRider(@NotNull Entity pPassenger, @NotNull MoveFunction pCallback) {
        if (this.hasPassenger(pPassenger)) {
            Vec3 vec3 = (new Vec3(-1.2f, 0.0, 0.0)).yRot(-this.getYRot() * 0.017453292F - 1.5707964F);

            float offset = pPassenger instanceof Player ? -1f : 0;

            pCallback.accept(pPassenger,
                    this.getX()  + vec3.x,
                    this.getY() + 0.05f + offset,
                    this.getZ() + vec3.z);
        }
    }

    @Override
    public boolean hurt(@NotNull DamageSource pSource, float pAmount) {
        if (super.hurt(pSource, pAmount) && this.getLastHurtByMob() != null) {
            if (!this.level().isClientSide) {
                this.spawnInk();
            }
            return true;
        } else {
            return false;
        }
    }

    private Vec3 rotateVector(Vec3 pVector) {
        return pVector.yRot(-this.yBodyRotO * ((float) Math.PI / 180F));
    }

    private void spawnInk() {
        this.playSound(SoundEvents.SQUID_SQUIRT, this.getSoundVolume(), this.getVoicePitch());
        Vec3 vec3 = this.rotateVector(new Vec3(0.0D, -1.0D, 0.0D)).add(this.getX(), this.getY(), this.getZ());

        for (int i = 0; i < 30; ++i) {
            Vec3 vec31 = this.rotateVector(new Vec3((double) this.random.nextFloat() * 0.6D - 0.3D, -1.0D, (double) this.random.nextFloat() * 0.6D - 0.3D));
            Vec3 vec32 = vec31.scale(0.3D + (double) (this.random.nextFloat() * 2.0F));
            ((ServerLevel) this.level()).sendParticles(ParticleTypes.SQUID_INK, vec3.x, vec3.y + 1.5D, vec3.z, 0, vec32.x, vec32.y, vec32.z, 0.1D);
        }
    }

    @Override
    public boolean removeWhenFarAway(double pDistanceToClosestPlayer) {
        return false;
    }

    @Override
    public int getMaxSpawnClusterSize() {
        return 3;
    }

    @Override
    protected @NotNull InteractionResult mobInteract(@NotNull Player pPlayer, @NotNull InteractionHand pHand) {
        return Bucketable.bucketMobPickup(pPlayer, pHand, this).orElse(super.mobInteract(pPlayer, pHand));
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.DOSIDICUS_GIGAS_BUCKET.get());
    }
}
