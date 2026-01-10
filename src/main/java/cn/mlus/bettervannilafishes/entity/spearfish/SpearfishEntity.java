package cn.mlus.bettervannilafishes.entity.spearfish;

import cn.mlus.bettervannilafishes.client.animator.GeneralAnimator;
import cn.mlus.bettervannilafishes.client.animator.SpearFishAnimator;
import cn.mlus.bettervannilafishes.entity.BvfAbstractFish;
import cn.mlus.bettervannilafishes.entity.BvfEntity;
import cn.mlus.bettervannilafishes.entity.GeneralBodyControl;
import cn.mlus.bettervannilafishes.entity.ai.goal.MoveTowardsFoodGoal;
import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.behavior.BehaviorUtils;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomSwimmingGoal;
import net.minecraft.world.entity.ai.goal.TryFindWaterGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.ai.util.DefaultRandomPos;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.common.NeoForgeMod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;

public class SpearfishEntity extends BvfAbstractFish implements BvfEntity<SpearfishEntity> {
    public SpearfishEntity(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        animator = new SpearFishAnimator<>(this);
    }

    private final GeneralAnimator<SpearfishEntity> animator;

    @Override
    public GeneralAnimator<SpearfishEntity> getAnimator() {
        return animator;
    }

    @Override
    public void tick() {
        super.tick();
        if(level().isClientSide)
            animator.tick();
    }

    public PanicGoal panicGoal;

    @Override
    protected void registerGoals() {
        panicGoal = new PanicGoal(this, 1.25D){
            @Override
            public boolean canUse() {
                return super.canUse() && getHealth() > 5f;
            }

            @Override
            public void start() {
                super.start();
                this.mob.setSprinting(true);
            }

            @Override
            public void stop() {
                super.stop();
                this.mob.setSprinting(false);
            }

            @Override
            protected boolean findRandomPosition() {
                Vec3 vec3 = DefaultRandomPos.getPos(this.mob, 25, 4);
                if (vec3 == null) {
                    return false;
                } else {
                    this.posX = vec3.x;
                    this.posY = vec3.y;
                    this.posZ = vec3.z;
                    return true;
                }
            }
        };

        this.goalSelector.addGoal(0, panicGoal);
        this.randomSwimmingGoal = new RandomSwimmingGoal(this,1,40){
            @Nullable
            @Override
            protected Vec3 getPosition() {
                Vec3 pos = BehaviorUtils.getRandomSwimmablePos(this.mob, 35, 3);
                if (pos != null && pos.y < 55) pos.add(0, 55 - pos.y, 0);
                return pos;
            }
        };

        this.goalSelector.addGoal(2, this.randomSwimmingGoal);
        this.goalSelector.addGoal(3, new TryFindWaterGoal(this));
        this.goalSelector.addGoal(0, new MeleeAttackGoal(this, 1.2, false){
            @Override
            public boolean canUse() {
                return super.canUse() && (this.mob.getTarget() instanceof AbstractFish || getHealth() < 5F);
            }

            @Override
            public void start() {
                super.start();
                this.mob.setSprinting(true);
            }

            @Override
            public void stop() {
                super.stop();
                this.mob.setSprinting(false);
            }
        });
        this.goalSelector.addGoal(5, new MoveTowardsFoodGoal(this,1.2f,2f));

        this.targetSelector.addGoal(0, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, AbstractFish.class, 200, true, false, (p) -> !(p instanceof SpearfishEntity)));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        AnimationController<SpearfishEntity> main = new AnimationController<>(this, "main", 0, state -> {
            RawAnimation builder = RawAnimation.begin();
            if(isInWater()){
                if (isSprinting()) {
                    builder.thenLoop("animation.quickly_swim");
                } else {
                    builder.thenLoop("animation.swim");
                }
            }else {
                builder.thenLoop("animation.flop");
            }

            return state.setAndContinue(builder);
        });

        AnimationController<SpearfishEntity> extra = new AnimationController<>(this, "extra", 0, state -> PlayState.STOP)
                .triggerableAnim("eat", RawAnimation.begin().thenPlay("animation.eat"));

        controllerRegistrar.add(main,extra);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.0)
                .add(Attributes.MOVEMENT_SPEED,1)
                .add(NeoForgeMod.SWIM_SPEED,1.5)
                .add(Attributes.ATTACK_DAMAGE, 1)
                .add(Attributes.FOLLOW_RANGE,64);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if(isAggressive()){
            stompEffect(1f, 1.5f, 20f);
        }

        if(tickCount % 20 == 0){
            if(!isAggressive()){
                this.setAggressive(!level().getNearbyPlayers(TargetingConditions.DEFAULT, this, this.getBoundingBox().inflate(4)).isEmpty());
            }
        }

    }

    protected void stompEffect(float hurtSize, float forwards, float damage) {
        Vec3 center = this.position().add(
                new Vec3(0, 0, forwards)
                        .yRot(-this.yBodyRot * ((float) org.joml.Math.PI / 180F))
        );

        AABB aabb = new AABB(center.subtract(hurtSize, 1, hurtSize),
                center.add(hurtSize, 1, hurtSize));

        for (LivingEntity living : level().getEntitiesOfClass(LivingEntity.class, aabb,
                EntitySelector.NO_CREATIVE_OR_SPECTATOR)) {

            if (!living.is(this) &&
                    living.getVehicle() != this &&
                    !this.isAlliedTo(living) &&
                    living.getType() != this.getType() &&
                    living.distanceToSqr(center) <= hurtSize * hurtSize) {

                living.hurt(this.damageSources().mobAttack(this), damage);
            }
        }
    }

    private static final ResourceLocation SPEED_MODIFIER_SPRINTING_UUID = ResourceLocation.withDefaultNamespace("sprinting");;
    private static final AttributeModifier SPEED_MODIFIER_SPRINTING = new AttributeModifier(SPEED_MODIFIER_SPRINTING_UUID, 0.7F, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);

    @Override
    public void setSprinting(boolean sprinting) {
        super.setSprinting(sprinting);
        AttributeInstance attributeinstance = this.getAttribute(Attributes.MOVEMENT_SPEED);
        attributeinstance.removeModifier(SPEED_MODIFIER_SPRINTING.id());
        if (sprinting) {
            attributeinstance.addTransientModifier(SPEED_MODIFIER_SPRINTING);
        }

    }

    @Override
    protected @NotNull BodyRotationControl createBodyControl() {
        return new GeneralBodyControl(this,8);
    }

    @Nullable
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor pLevel, @NotNull DifficultyInstance pDifficulty, @NotNull MobSpawnType pReason, @Nullable SpawnGroupData pSpawnData) {
        if (pReason == MobSpawnType.BUCKET) {
            return pSpawnData;
        } else {
            this.setScale(Mth.randomBetween(this.random, 0.8f, 1f));
            return super.finalizeSpawn(pLevel, pDifficulty, pReason, pSpawnData);
        }
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.COD_DEATH;
    }

    protected SoundEvent getHurtSound(@NotNull DamageSource pDamageSource) {
        return SoundEvents.COD_HURT;
    }

    protected @NotNull SoundEvent getFlopSound() {
        return SoundEvents.COD_FLOP;
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.SPEARFISH_BUCKET);
    }
}
