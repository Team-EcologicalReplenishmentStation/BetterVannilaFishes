package cn.mlus.bettervannilafishes.data.language;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import cn.mlus.bettervannilafishes.init.BvfItems;
import cn.mlus.bettervannilafishes.init.BvfMobEffects;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class BvfChineseLanguangeProvider extends LanguageProvider {
    public BvfChineseLanguangeProvider(PackOutput output) {
        super(output, BetterVannilaFishes.MODID, "zh_cn");
    }
    @Override
    protected void addTranslations() {
        this.add(BvfEntities.BVC_HADDOCK_COD.get(),"黑线鳕鱼");
        this.add(BvfEntities.BVC_PACIFIC_COD.get(),"太平洋鳕鱼");
        this.add(BvfEntities.BVC_ATLANTIC_COD.get(),"大西洋鳕鱼");
        this.add(BvfEntities.BVC_SALMON_MALE.get(),"雄性鲑鱼");
        this.add(BvfEntities.BVC_SALMON_FEMALE.get(),"雌性鲑鱼");
        this.add(BvfEntities.BVC_SALMON_PACIFIC.get(),"太平洋鲑鱼");
        this.add(BvfEntities.YELLOW_FIN_PUFFER.get(),"黄鳍东方鲀");
        this.add(BvfEntities.OBSCURE_PUFFER.get(),"暗纹东方鲀");
        this.add(BvfEntities.PORCUPINE_FISH.get(),"六斑刺豚");
        this.add(BvfEntities.NAUTILUS.get(),"鹦鹉螺");
        this.add(BvfEntities.FEATHER_STAR.get(),"海羽星");
        this.add(BvfEntities.SPEARFISH.get(),"条纹枪鱼");
        this.add(BvfEntities.GALEOCERDO_CUVIER.get(),"居氏鼬鲨");
        // Surgeonfish (刺尾鱼)
        this.add(BvfEntities.ACANTHURUS_ACHILLES.get(),"心斑刺尾鱼");
        this.add(BvfEntities.ACANTHURUS_LEUCOSTERNON.get(),"白胸刺尾鱼");
        this.add(BvfEntities.PARACANTHURUS_HEPATUS.get(),"黄尾副刺尾鱼");
        this.add(BvfEntities.ACANTHURUS_TRIOSTEGUS.get(),"横带刺尾鱼");
        this.add(BvfEntities.ACANTHURUS_NIGRICANS.get(),"白颊刺尾鱼");
        this.add(BvfEntities.ACANTHURUS_LINEATUS.get(),"彩带刺尾鱼");
        // Cichlid (丽鱼)
        this.add(BvfEntities.AUSTRALOHEROS_FACETUS.get(),"阿根廷丽鱼");
        this.add(BvfEntities.CICHLASOMA_BIMACULATUM.get(),"多鳞丽鱼");
        this.add(BvfEntities.KROBIA_GUIANENSIS.get(),"凯氏丽鱼");
        this.add(BvfEntities.AEQUIDENS_TETRAMERUS.get(),"南美丽鱼");
        this.add(BvfEntities.GYMNOGEOPHAGUS_BALZANII.get(),"松丽鱼");
        this.add(BvfEntities.ASTRONOTUS_OCELLATUS.get(),"眼点丽鱼");
        // Clownfish (小丑鱼/双锯鱼)
        this.add(BvfEntities.AMPHIPRION_OCELLARIS.get(),"眼斑双锯鱼");
        this.add(BvfEntities.PREMNAS_BIACULEATUS.get(),"棘颊双锯鱼");
        this.add(BvfEntities.AMPHIPRION_POLYMNUS.get(),"鞍斑双锯鱼");
        this.add(BvfEntities.AMPHIPRION_PERIDERAION.get(),"希氏双锯鱼");
        this.add(BvfEntities.AMPHIPRION_CLARKII.get(),"海葵双锯鱼");
        this.add(BvfEntities.AMPHIPRION_PERCULA.get(),"颈环双锯鱼");
        //Item
        this.add(BvfItems.HADDOCK_COD_SPAWN_EGG.get(), "黑线鳕鱼生成蛋");
        this.add(BvfItems.ATLANTIC_COD_SPAWN_EGG.get(), "大西洋鳕鱼生成蛋");
        this.add(BvfItems.PACIFIC_COD_SPAWN_EGG.get(), "太平洋鳕鱼生成蛋");
        this.add(BvfItems.MALE_SALMON_SPAWN_EGG.get(),"雄性鲑鱼生成蛋");
        this.add(BvfItems.FEMALE_SALMON_SPAWN_EGG.get(),"雌性鲑鱼生成蛋");
        this.add(BvfItems.PACIFIC_SALMON_SPAWN_EGG.get(),"太平洋鲑鱼生成蛋");
        this.add(BvfItems.YELLOW_FIN_PUFFER_SPAWN_EGG.get(),"黄鳍东方鲀生成蛋");
        this.add(BvfItems.OBSCURE_PUFFER_SPAWN_EGG.get(),"暗纹东方鲀生成蛋");
        this.add(BvfItems.PORCUPINE_FISH_SPAWN_EGG.get(),"六斑刺豚生成蛋");
        this.add(BvfItems.NAUTILUS_SPAWN_EGG.get(),"鹦鹉螺生成蛋");
        this.add(BvfItems.FEATHER_STAR_SPAWN_EGG.get(),"海羽星生成蛋");
        this.add(BvfItems.SPEARFISH_SPAWN_EGG.get(),"条纹枪鱼生成蛋");
        this.add(BvfItems.GALEOCERDO_CUVIER_SPAWN_EGG.get(),"居氏鼬鲨生成蛋");
        // Surgeonfish Spawn Eggs
        this.add(BvfItems.ACANTHURUS_ACHILLES_SPAWN_EGG.get(),"心斑刺尾鱼生成蛋");
        this.add(BvfItems.ACANTHURUS_LEUCOSTERNON_SPAWN_EGG.get(),"白胸刺尾鱼生成蛋");
        this.add(BvfItems.PARACANTHURUS_HEPATUS_SPAWN_EGG.get(),"黄尾副刺尾鱼生成蛋");
        this.add(BvfItems.ACANTHURUS_TRIOSTEGUS_SPAWN_EGG.get(),"横带刺尾鱼生成蛋");
        this.add(BvfItems.ACANTHURUS_NIGRICANS_SPAWN_EGG.get(),"白颊刺尾鱼生成蛋");
        this.add(BvfItems.ACANTHURUS_LINEATUS_SPAWN_EGG.get(),"彩带刺尾鱼生成蛋");        // Cichlid Spawn Eggs
        this.add(BvfItems.AUSTRALOHEROS_FACETUS_SPAWN_EGG.get(),"阿根廷丽鱼生成蛋");
        this.add(BvfItems.CICHLASOMA_BIMACULATUM_SPAWN_EGG.get(),"多鳞丽鱼生成蛋");
        this.add(BvfItems.KROBIA_GUIANENSIS_SPAWN_EGG.get(),"凯氏丽鱼生成蛋");
        this.add(BvfItems.AEQUIDENS_TETRAMERUS_SPAWN_EGG.get(),"南美丽鱼生成蛋");
        this.add(BvfItems.GYMNOGEOPHAGUS_BALZANII_SPAWN_EGG.get(),"松丽鱼生成蛋");
        this.add(BvfItems.ASTRONOTUS_OCELLATUS_SPAWN_EGG.get(),"眼点丽鱼生成蛋");        // Clownfish Spawn Eggs
        this.add(BvfItems.AMPHIPRION_OCELLARIS_SPAWN_EGG.get(),"眼斑双锯鱼生成蛋");
        this.add(BvfItems.PREMNAS_BIACULEATUS_SPAWN_EGG.get(),"棘颊双锯鱼生成蛋");
        this.add(BvfItems.AMPHIPRION_POLYMNUS_SPAWN_EGG.get(),"鞍斑双锯鱼生成蛋");
        this.add(BvfItems.AMPHIPRION_PERIDERAION_SPAWN_EGG.get(),"希氏双锯鱼生成蛋");
        this.add(BvfItems.AMPHIPRION_CLARKII_SPAWN_EGG.get(),"海葵双锯鱼生成蛋");
        this.add(BvfItems.AMPHIPRION_PERCULA_SPAWN_EGG.get(),"颈环双锯鱼生成蛋");        this.add(BvfItems.HADDOCK_COD_BUCKET.get(), "黑线鳕鱼桶");
        this.add(BvfItems.ATLANTIC_COD_BUCKET.get(), "大西洋鳕鱼桶");
        this.add(BvfItems.PACIFIC_COD_BUCKET.get(), "太平洋鳕鱼桶");
        this.add(BvfItems.MALE_SALMON_BUCKET.get(),"雄性鲑鱼桶");
        this.add(BvfItems.FEMALE_SALMON_BUCKET.get(),"雌性鲑鱼桶");
        this.add(BvfItems.PACIFIC_SALMON_BUCKET.get(),"太平洋鲑鱼桶");
        this.add(BvfItems.YELLOW_FIN_PUFFER_BUCKET.get(),"黄鳍东方鲀桶");
        this.add(BvfItems.OBSCURE_PUFFER_BUCKET.get(),"暗纹东方鲀桶");
        this.add(BvfItems.PORCUPINE_FISH_BUCKET.get(),"六斑刺豚桶");
        this.add(BvfItems.NAUTILUS_BUCKET.get(),"鹦鹉螺桶");
        this.add(BvfItems.FEATHER_STAR_BUCKET.get(),"海羽星桶");
        this.add(BvfItems.SPEARFISH_BUCKET.get(),"四鳍旗鱼桶");
        this.add(BvfItems.GALEOCERDO_CUVIER_BUCKET.get(),"居氏鼬鲨桶");
        this.add(BvfItems.ACANTHURUS_ACHILLES_BUCKET.get(),"心斑刺尾鱼桶");
        this.add(BvfItems.ACANTHURUS_LEUCOSTERNON_BUCKET.get(),"白胸刺尾鱼桶");
        this.add(BvfItems.PARACANTHURUS_HEPATUS_BUCKET.get(),"黄尾副刺尾鱼桶");
        this.add(BvfItems.ACANTHURUS_TRIOSTEGUS_BUCKET.get(),"横带刺尾鱼桶");
        this.add(BvfItems.ACANTHURUS_NIGRICANS_BUCKET.get(),"白颊刺尾鱼桶");
        this.add(BvfItems.ACANTHURUS_LINEATUS_BUCKET.get(),"彩带刺尾鱼桶");        // Cichlid Buckets
        this.add(BvfItems.AUSTRALOHEROS_FACETUS_BUCKET.get(),"阿根廷丽鱼桶");
        this.add(BvfItems.CICHLASOMA_BIMACULATUM_BUCKET.get(),"多鳞丽鱼桶");
        this.add(BvfItems.KROBIA_GUIANENSIS_BUCKET.get(),"凯氏丽鱼桶");
        this.add(BvfItems.AEQUIDENS_TETRAMERUS_BUCKET.get(),"南美丽鱼桶");
        this.add(BvfItems.GYMNOGEOPHAGUS_BALZANII_BUCKET.get(),"松丽鱼桶");
        this.add(BvfItems.ASTRONOTUS_OCELLATUS_BUCKET.get(),"眼点丽鱼桶");        // Clownfish Buckets
        this.add(BvfItems.AMPHIPRION_OCELLARIS_BUCKET.get(),"眼斑双锯鱼桶");
        this.add(BvfItems.PREMNAS_BIACULEATUS_BUCKET.get(),"棘颊双锯鱼桶");
        this.add(BvfItems.AMPHIPRION_POLYMNUS_BUCKET.get(),"鞍斑双锯鱼桶");
        this.add(BvfItems.AMPHIPRION_PERIDERAION_BUCKET.get(),"希氏双锯鱼桶");
        this.add(BvfItems.AMPHIPRION_CLARKII_BUCKET.get(),"海葵双锯鱼桶");
        this.add(BvfItems.AMPHIPRION_PERCULA_BUCKET.get(),"颈环双锯鱼桶");        this.add(BvfItems.HADDOCK_COD.get(), "黑线鳕鱼");
        this.add(BvfItems.ATLANTIC_COD.get(), "大西洋鳕鱼");
        this.add(BvfItems.PACIFIC_COD.get(), "太平洋鳕鱼");
        this.add(BvfItems.MALE_SALMON.get(), "雄性鲑鱼");
        this.add(BvfItems.FEMALE_SALMON.get(), "雌性鲑鱼");
        this.add(BvfItems.PACIFIC_SALMON.get(), "太平洋鲑鱼");
        this.add(BvfItems.YELLOW_FIN_PUFFER.get(), "黄鳍东方鲀");
        this.add(BvfItems.OBSCURE_PUFFER.get(), "暗纹东方鲀");
        this.add(BvfItems.PORCUPINE_FISH.get(), "六斑刺豚");
        this.add(BvfItems.SPEARFISH.get(), "条纹枪鱼");
        this.add(BvfItems.COOKED_SPEARFISH.get(),"熟条纹枪鱼");
        this.add(BvfItems.GALEOCERDO_CUVIER.get(), "居氏鼬鲨");
        this.add(BvfItems.SHARK_FIN.get(), "鱼翅");
        this.add(BvfItems.FEATHER_STAR_TENTACLE.get(), "海羽星触手");
        // Surgeonfish Food
        this.add(BvfItems.ACANTHURUS_ACHILLES.get(),"心斑刺尾鱼");
        this.add(BvfItems.ACANTHURUS_LEUCOSTERNON.get(),"白胸刺尾鱼");
        this.add(BvfItems.PARACANTHURUS_HEPATUS.get(),"黄尾副刺尾鱼");
        this.add(BvfItems.ACANTHURUS_TRIOSTEGUS.get(),"横带刺尾鱼");
        this.add(BvfItems.ACANTHURUS_NIGRICANS.get(),"白颊刺尾鱼");
        this.add(BvfItems.ACANTHURUS_LINEATUS.get(),"彩带刺尾鱼");        // Cichlid Food
        this.add(BvfItems.AUSTRALOHEROS_FACETUS.get(),"阿根廷丽鱼");
        this.add(BvfItems.CICHLASOMA_BIMACULATUM.get(),"多鳞丽鱼");
        this.add(BvfItems.KROBIA_GUIANENSIS.get(),"凯氏丽鱼");
        this.add(BvfItems.AEQUIDENS_TETRAMERUS.get(),"南美丽鱼");
        this.add(BvfItems.GYMNOGEOPHAGUS_BALZANII.get(),"松丽鱼");
        this.add(BvfItems.ASTRONOTUS_OCELLATUS.get(),"眼点丽鱼");        // Clownfish Food
        this.add(BvfItems.AMPHIPRION_OCELLARIS.get(),"眼斑双锯鱼");
        this.add(BvfItems.PREMNAS_BIACULEATUS.get(),"棘颊双锯鱼");
        this.add(BvfItems.AMPHIPRION_POLYMNUS.get(),"鞍斑双锯鱼");
        this.add(BvfItems.AMPHIPRION_PERIDERAION.get(),"希氏双锯鱼");
        this.add(BvfItems.AMPHIPRION_CLARKII.get(),"海葵双锯鱼");
        this.add(BvfItems.AMPHIPRION_PERCULA.get(),"颈环双锯鱼");        this.add(BvfItems.ATLANTIC_COD_SPECIMEN.get(), "大西洋鳕鱼标本");
        this.add(BvfItems.PACIFIC_COD_SPECIMEN.get(), "太平洋鳕鱼标本");
        this.add(BvfItems.HADDOCK_COD_SPECIMEN.get(), "黑线鳕鱼标本");
        this.add(BvfItems.PACIFIC_SALMON_SPECIMEN.get(), "太平洋鲑鱼标本");
        this.add(BvfItems.MALE_SALMON_SPECIMEN.get(), "雄性鲑鱼标本");
        this.add(BvfItems.FEMALE_SALMON_SPECIMEN.get(), "雌性鲑鱼标本");
        this.add(BvfItems.SPEARFISH_SPECIMEN.get(), "条纹枪鱼标本");
        this.add(BvfItems.GALEOCERDO_CUVIER_SPECIMEN.get(), "居氏鼬鲨标本");
        this.add(BvfItems.ENCHANTED_PUFFERFISH.get(), "附魔河豚");

        this.add(BvfMobEffects.NAUTILUS_BLESSING.get(), "鹦鹉螺祝福");
        this.add(BvfMobEffects.PURIFICATION.get(), "净化");
        this.add(BvfMobEffects.BLEEDING.get(), "流血");

        this.add("bvc.command.hanging", "闲逛");
        this.add("bvc.command.follow", "跟随");

        this.add("advancements.bettervannilafishes.monster_go_away.title","妖魔鬼怪快离开");
        this.add("advancements.bettervannilafishes.monster_go_away.desc","制作一个附魔河豚来对抗怪物。");
    }
}
