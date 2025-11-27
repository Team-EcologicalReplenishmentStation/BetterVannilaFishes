package cn.mlus.bettervannilafishes.entity.pufferfish;

import cn.mlus.bettervannilafishes.init.BvfItems;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.AbstractFish;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class PorcupineFish extends BvfPufferfishEntity{
    public PorcupineFish(EntityType<? extends AbstractFish> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    public void playerTouch(@NotNull Player pPlayer) {
        int $$1 = this.getPuffState();
        if (pPlayer instanceof ServerPlayer && $$1 > 0 && pPlayer.hurt(this.damageSources().mobAttack(this), (float)(1 + $$1))) {
            if (!this.isSilent()) {
                ((ServerPlayer)pPlayer).connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.PUFFER_FISH_STING, 0.0F));
            }
        }
    }

    @Override
    public @NotNull ItemStack getBucketItemStack() {
        return new ItemStack(BvfItems.PORCUPINE_FISH_BUCKET.get());
    }
}
