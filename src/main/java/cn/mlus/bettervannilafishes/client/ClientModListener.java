package cn.mlus.bettervannilafishes.client;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.client.model.block.TigerSharkSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.entity.*;
import cn.mlus.bettervannilafishes.client.render.entity.BvfRenderer;
import cn.mlus.bettervannilafishes.client.render.entity.BvfSpecimenRenderer;
import cn.mlus.bettervannilafishes.init.BvfBlockEntities;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BetterVannilaFishes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value =Dist.CLIENT)
public final class ClientModListener {
	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BvfEntities.BVC_HADDOCK_COD.get(), context -> new BvfRenderer<>(context, new CodModel()));
		event.registerEntityRenderer(BvfEntities.BVC_ATLANTIC_COD.get(), context -> new BvfRenderer<>(context, new CodModel()));
		event.registerEntityRenderer(BvfEntities.BVC_PACIFIC_COD.get(), context -> new BvfRenderer<>(context, new CodModel()));
		event.registerEntityRenderer(BvfEntities.BVC_SALMON_MALE.get(), context -> new BvfRenderer<>(context, new SalmonModel()));
		event.registerEntityRenderer(BvfEntities.BVC_SALMON_FEMALE.get(), context -> new BvfRenderer<>(context, new SalmonModel()));
		event.registerEntityRenderer(BvfEntities.BVC_SALMON_PACIFIC.get(), context -> new BvfRenderer<>(context, new SalmonModel()));
		event.registerEntityRenderer(BvfEntities.YELLOW_FIN_PUFFER.get(), context -> new BvfRenderer<>(context, new PufferfishModel()));
		event.registerEntityRenderer(BvfEntities.OBSCURE_PUFFER.get(), context -> new BvfRenderer<>(context, new PufferfishModel()));
		event.registerEntityRenderer(BvfEntities.PORCUPINE_FISH.get(), BvfRenderer::new);
		event.registerEntityRenderer(BvfEntities.NAUTILUS.get(), BvfRenderer::new);
        event.registerEntityRenderer(BvfEntities.FEATHER_STAR.get(), context -> new BvfRenderer<>(context, 0));
		event.registerEntityRenderer(BvfEntities.SPEARFISH.get(), context -> new BvfRenderer<>(context, new SpearfishModel()));
		event.registerEntityRenderer(BvfEntities.GALEOCERDO_CUVIER.get(), context -> new BvfRenderer<>(context, new GaleocerdoCuvierModel()));

		event.registerBlockEntityRenderer(BvfBlockEntities.ATLANTIC_COD_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.PACIFIC_COD_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.HADDOCK_COD_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.PACIFIC_SALMON_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.MALE_SALMON_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.FEMALE_SALMON_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.SPEARFISH_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.GALEOCERDO_CUVIER_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new TigerSharkSpecimenModel()));
	}

}