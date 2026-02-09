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
        this.add(BvfItems.PARACANTHURUS_HEPATUS_SPAWN_EGG.get(),"黄尾刺尾鱼生成蛋");
        this.add(BvfItems.ACANTHURUS_TRIOSTEGUS_SPAWN_EGG.get(),"横带刺尾鱼生成蛋");
        this.add(BvfItems.ACANTHURUS_NIGRICANS_SPAWN_EGG.get(),"白颊刺尾鱼生成蛋");
        this.add(BvfItems.ACANTHURUS_LINEATUS_SPAWN_EGG.get(),"彩带刺尾鱼生成蛋");
        this.add(BvfItems.HADDOCK_COD_BUCKET.get(), "黑线鳕鱼桶");
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
        this.add(BvfItems.ACANTHURUS_LINEATUS_BUCKET.get(),"彩带刺尾鱼桶");
        this.add(BvfItems.HADDOCK_COD.get(), "黑线鳕鱼");
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
        this.add(BvfItems.ACANTHURUS_LINEATUS.get(),"彩带刺尾鱼");
        this.add(BvfItems.ATLANTIC_COD_SPECIMEN.get(), "大西洋鳕鱼标本");
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
