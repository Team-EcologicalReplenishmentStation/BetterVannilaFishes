package cn.mlus.bettervannilafishes.entity.squid.ai;

import cn.mlus.bettervannilafishes.entity.ai.BvfWaterAnimalMoveControl;
import cn.mlus.bettervannilafishes.entity.squid.DosidicusGigasEntity;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class SquidMoveControl extends BvfWaterAnimalMoveControl {
    private final DosidicusGigasEntity squid;

    public SquidMoveControl(DosidicusGigasEntity pMob) {
        super(pMob);
        this.squid = pMob;
    }

    @Override
    public void tick() {
        if (squid.isAggressive() && squid.isInWater() && this.operation == Operation.MOVE_TO) {
            // Attack mode: swim backwards towards target
            squid.setDeltaMovement(squid.getDeltaMovement().add(0.0, 0.005, 0.0));

            double dx = this.wantedX - squid.getX();
            double dy = this.wantedY - squid.getY();
            double dz = this.wantedZ - squid.getZ();
            double distSq = dx * dx + dy * dy + dz * dz;

            if (distSq < 2.500000277905201E-7) {
                squid.setZza(0.0F);
                return;
            }

            // Calculate angle towards target
            float towardTarget = (float) (Mth.atan2(dz, dx) * 57.2957763671875) - 90.0F;

            // Set yRot to face away from target (+180°), so the model's 'head' faces away from target
            float facingAway = towardTarget + 180.0F;
            squid.setYRot(this.rotlerp(squid.getYRot(), facingAway, 10));
            squid.yBodyRot = squid.getYRot();
            squid.yHeadRot = squid.getYRot();

            float speed = (float) (this.speedModifier * squid.getAttributeValue(Attributes.MOVEMENT_SPEED));

            // Pitch calculation
            double horizDist = Math.sqrt(dx * dx + dz * dz);
            if (Math.abs(dy) > 9.999999747378752E-6 || Math.abs(horizDist) > 9.999999747378752E-6) {
                float pitch = -((float) (Mth.atan2(dy, horizDist) * 57.2957763671875));
                pitch = Mth.clamp(Mth.wrapDegrees(pitch), -85.0F, 85.0F);
                squid.setXRot(this.rotlerp(squid.getXRot(), pitch, 5.0F));
            }

            // Actual movement: apply velocity towards target
            float cosYaw = Mth.cos(towardTarget * 0.017453292F);
            float sinYaw = Mth.sin(towardTarget * 0.017453292F);
            float cosPitch = Mth.cos(squid.getXRot() * 0.017453292F);
            float sinPitch = Mth.sin(squid.getXRot() * 0.017453292F);

            float moveSpeed = speed * 0.02F;
            squid.setDeltaMovement(squid.getDeltaMovement().add(
                    -sinYaw * cosPitch * moveSpeed,
                    -sinPitch * moveSpeed,
                    cosYaw * cosPitch * moveSpeed
            ));
        } else {
            super.tick();
        }
    }
}
