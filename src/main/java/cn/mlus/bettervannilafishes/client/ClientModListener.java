package cn.mlus.bettervannilafishes.client;

import cn.mlus.bettervannilafishes.client.model.block.CichlidSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.block.CodSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.block.EpinephelusSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.block.HusoDauricusSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.block.MegalopsAtlanticusSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.block.NegaprionAcutidensSpecimenModel;
import cn.mlus.bettervannilafishes.client.model.block.NegaprionBrevirostrisSpecimenModel;
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
		event.registerEntityRenderer(BvfEntities.NEGAPRION_ACUTIDENS.get(), context -> new BvfRenderer<>(context, new NegaprionAcutidensModel()));
		event.registerEntityRenderer(BvfEntities.NEGAPRION_BREVIROSTRIS.get(), context -> new BvfRenderer<>(context, new NegaprionBrevirostrisModel()));
		event.registerEntityRenderer(BvfEntities.EPINEPHELUS_LANCEOLATUS.get(), context -> new BvfRenderer<>(context, new EpinephelusModel()));
		event.registerEntityRenderer(BvfEntities.EPINEPHELUS_ITAJARA.get(), context -> new BvfRenderer<>(context, new EpinephelusModel()));
		event.registerEntityRenderer(BvfEntities.EPINEPHELUS_MELANOSTIGMA.get(), context -> new BvfRenderer<>(context, new EpinephelusModel()));
		event.registerEntityRenderer(BvfEntities.ACANTHURUS_ACHILLES.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.PARACANTHURUS_HEPATUS.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.ACANTHURUS_NIGRICANS.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.ACANTHURUS_LINEATUS.get(), context -> new BvfRenderer<>(context, new SurgeonfishModel()));
		event.registerEntityRenderer(BvfEntities.CHAETODON_STRIATUS.get(), context -> new BvfRenderer<>(context, new ButterflyfishModel()));
		event.registerEntityRenderer(BvfEntities.CHAETODON_UNIMACULATUS.get(), context -> new BvfRenderer<>(context, new ButterflyfishModel()));
		event.registerEntityRenderer(BvfEntities.CHAETODON_AURIGA.get(), context -> new BvfRenderer<>(context, new ButterflyfishModel()));
		event.registerEntityRenderer(BvfEntities.CHAETODON_COLLARE.get(), context -> new BvfRenderer<>(context, new ButterflyfishModel()));
		event.registerEntityRenderer(BvfEntities.CHAETODON_RETICULATUS.get(), context -> new BvfRenderer<>(context, new ButterflyfishModel()));
		event.registerEntityRenderer(BvfEntities.CHAETODON_SPECULUM.get(), context -> new BvfRenderer<>(context, new ButterflyfishModel()));
		event.registerEntityRenderer(BvfEntities.AUSTRALOHEROS_FACETUS.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.CICHLASOMA_BIMACULATUM.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.KROBIA_GUIANENSIS.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.AEQUIDENS_TETRAMERUS.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.ASTRONOTUS_OCELLATUS.get(), context -> new BvfRenderer<>(context, new CichlidModel()));
		event.registerEntityRenderer(BvfEntities.CHANNA_MICROPELTES.get(), BvfRenderer::new);
		event.registerEntityRenderer(BvfEntities.CHANNA_ARGUS.get(), BvfRenderer::new);
		event.registerEntityRenderer(BvfEntities.ELOPICHTHYS_BAMBUSA.get(), BvfRenderer::new);
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_OCELLARIS.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.PREMNAS_BIACULEATUS.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_POLYMNUS.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_PERIDERAION.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_CLARKII.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_PERCULA.get(), context -> new BvfRenderer<>(context, new ClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_AKINDYNOS.get(), context -> new BvfRenderer<>(context, new NewClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_BICINCTUS.get(), context -> new BvfRenderer<>(context, new NewClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_CHRYSOGASTER.get(), context -> new BvfRenderer<>(context, new NewClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_CHRYSOPTERUS.get(), context -> new BvfRenderer<>(context, new NewClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_LATEZONATUS.get(), context -> new BvfRenderer<>(context, new NewClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_MCCULLOCHI.get(), context -> new BvfRenderer<>(context, new NewClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_MELANOPUS.get(), context -> new BvfRenderer<>(context, new NewClownfishModel()));
		event.registerEntityRenderer(BvfEntities.AMPHIPRION_TRICINCTUS.get(), context -> new BvfRenderer<>(context, new NewClownfishModel()));
		event.registerEntityRenderer(BvfEntities.BETTA_SPLENDENS.get(), context -> new BvfRenderer<>(context, new BettaModel()));
		event.registerEntityRenderer(BvfEntities.BETTA_IMBELLIS.get(), context -> new BvfRenderer<>(context, new BettaModel()));
		event.registerEntityRenderer(BvfEntities.BETTA_SMARAGDINA.get(), context -> new BvfRenderer<>(context, new BettaModel()));
		event.registerEntityRenderer(BvfEntities.BETTA_PICTA.get(), context -> new BvfRenderer<>(context, new BettaModel()));
		event.registerEntityRenderer(BvfEntities.BETTA_SIMPLEX.get(), context -> new BvfRenderer<>(context, new BettaModel()));
		event.registerEntityRenderer(BvfEntities.BETTA_BROWNORUM.get(), context -> new BvfRenderer<>(context, new BettaModel()));
		event.registerEntityRenderer(BvfEntities.MEGALOPS_ATLANTICUS.get(), context -> new BvfRenderer<>(context, new MegalopsAtlanticusModel()));
		event.registerEntityRenderer(BvfEntities.KATSUWONUS_PELAMIS.get(), BvfRenderer::new);
		event.registerEntityRenderer(BvfEntities.DOSIDICUS_GIGAS.get(), context -> new BvfRenderer<>(context, new DosidicusGigasModel()));
		event.registerEntityRenderer(BvfEntities.HUSO_DAURICUS.get(), context -> new BvfRenderer<>(context, new HusoDauricusModel()));

		event.registerBlockEntityRenderer(BvfBlockEntities.ATLANTIC_COD_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CodSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.PACIFIC_COD_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CodSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.HADDOCK_COD_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CodSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.PACIFIC_SALMON_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.MALE_SALMON_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.FEMALE_SALMON_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.SPEARFISH_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.GALEOCERDO_CUVIER_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new TigerSharkSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.NEGAPRION_ACUTIDENS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new NegaprionAcutidensSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.NEGAPRION_BREVIROSTRIS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new NegaprionBrevirostrisSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.EPINEPHELUS_LANCEOLATUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new EpinephelusSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.EPINEPHELUS_ITAJARA_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new EpinephelusSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.EPINEPHELUS_MELANOSTIGMA_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new EpinephelusSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.AUSTRALOHEROS_FACETUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.CICHLASOMA_BIMACULATUM_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.KROBIA_GUIANENSIS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.AEQUIDENS_TETRAMERUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.GYMNOGEOPHAGUS_BALZANII_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.ASTRONOTUS_OCELLATUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new CichlidSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.CHANNA_MICROPELTES_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.CHANNA_ARGUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.ELOPICHTHYS_BAMBUSA_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
		event.registerBlockEntityRenderer(BvfBlockEntities.HUSO_DAURICUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new HusoDauricusSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.MEGALOPS_ATLANTICUS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer(new MegalopsAtlanticusSpecimenModel()));
		event.registerBlockEntityRenderer(BvfBlockEntities.KATSUWONUS_PELAMIS_SPECIMEN.get(), (context) -> new BvfSpecimenRenderer());
	}

}