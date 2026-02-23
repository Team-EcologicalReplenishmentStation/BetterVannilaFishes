package cn.mlus.bettervannilafishes.client;

import cn.mlus.bettervannilafishes.client.model.block.CichlidSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.block.CodSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.block.TigerSharkSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.entity.*;
import cn.mlus.bettervannilafishes.client.render.entity.BvfRenderer;
import cn.mlus.bettervannilafishes.client.render.entity.BvfSpecimenRenderer;
import cn.mlus.bettervannilafishes.init.BvfBlockEntities;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;


@EventBusSubscriber(Dist.CLIENT)
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

		event.registerEntityRenderer(BvfEntities.ACANTHURUS_ACHILLES.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.PARACANTHURUS_HEPATUS.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.ACANTHURUS_NIGRICANS.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.ACANTHURUS_LINEATUS.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.AUSTRALOHEROS_FACETUS.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.CICHLASOMA_BIMACULATUM.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.KROBIA_GUIANENSIS.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.AEQUIDENS_TETRAMERUS.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.ASTRONOTUS_OCELLATUS.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_OCELLARIS.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.PREMNAS_BIACULEATUS.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_POLYMNUS.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_PERIDERAION.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_CLARKII.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_PERCULA.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.DOSIDICUS_GIGAS.get(), context -> new BvfRenderer<>(context, new DosidicusGigasModel()));

		event.registerBlockEntityRenderer(BvfBlockEntities.ATLANTIC_COD_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CodSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.PACIFIC_COD_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CodSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.HADDOCK_COD_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CodSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.PACIFIC_SALMON_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.MALE_SALMON_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.FEMALE_SALMON_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.SPEARFISH_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.GALEOCERDO_CUVIER_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new TigerSharkSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.AUSTRALOHEROS_FACETUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.CICHLASOMA_BIMACULATUM_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.KROBIA_GUIANENSIS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.AEQUIDENS_TETRAMERUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.GYMNOGEOPHAGUS_BALZANII_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.ASTRONOTUS_OCELLATUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
	}

}