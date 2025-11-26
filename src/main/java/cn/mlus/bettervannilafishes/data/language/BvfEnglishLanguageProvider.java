package cn.mlus.bettervannilafishes.data.language;

import cn.mlus.bettervannilafishes.BetterVannilaFishes;
import cn.mlus.bettervannilafishes.init.BvfEntities;
import cn.mlus.bettervannilafishes.init.BvfItems;
import cn.mlus.bettervannilafishes.init.BvfMobEffects;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;


public class BvfEnglishLanguageProvider extends LanguageProvider {

    public BvfEnglishLanguageProvider(PackOutput output) {
        super(output, BetterVannilaFishes.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(BvfEntities.BVC_HADDOCK_COD.get(),"Haddock Cod");
        this.add(BvfEntities.BVC_ATLANTIC_COD.get(),"Atlantic Cod");
        this.add(BvfEntities.BVC_PACIFIC_COD.get(),"Pacific Cod");
        this.add(BvfEntities.BVC_SALMON_MALE.get(),"Male Salmon");
        this.add(BvfEntities.BVC_SALMON_FEMALE.get(),"Female Salmon");
        this.add(BvfEntities.BVC_SALMON_PACIFIC.get(),"Pacific Salmon");
        this.add(BvfEntities.YELLOW_FIN_PUFFER.get(),"Yellow Fin Puffer");
        this.add(BvfEntities.OBSCURE_PUFFER.get(),"Obscure Puffer");
        this.add(BvfEntities.NAUTILUS.get(),"Nautilus");
        //Item
        this.add(BvfItems.HADDOCK_COD_SPAWN_EGG.get(), "Haddock Cod Spawn Egg");
        this.add(BvfItems.ATLANTIC_COD_SPAWN_EGG.get(), "Atlantic Cod Spawn Egg");
        this.add(BvfItems.PACIFIC_COD_SPAWN_EGG.get(), "Pacific Cod Spawn Egg");
        this.add(BvfItems.MALE_SALMON_SPAWN_EGG.get(),"Male Salmon Spawn Egg");
        this.add(BvfItems.FEMALE_SALMON_SPAWN_EGG.get(),"Female Salmon Spawn Egg");
        this.add(BvfItems.PACIFIC_SALMON_SPAWN_EGG.get(),"Atlantic Salmon Spawn Egg");
        this.add(BvfItems.YELLOW_FIN_PUFFER_SPAWN_EGG.get(),"Yellow Fin Puffer Spawn Egg");
        this.add(BvfItems.OBSCURE_PUFFER_SPAWN_EGG.get(),"Obscure Puffer Spawn Egg");
        this.add(BvfItems.NAUTILUS_SPAWN_EGG.get(),"Nautilus Spawn Egg");
        this.add(BvfItems.HADDOCK_COD_BUCKET.get(), "Haddock Cod Bucket");
        this.add(BvfItems.ATLANTIC_COD_BUCKET.get(), "Atlantic Cod Bucket");
        this.add(BvfItems.PACIFIC_COD_BUCKET.get(), "Pacific Cod Bucket");
        this.add(BvfItems.MALE_SALMON_BUCKET.get(),"Male Salmon Bucket");
        this.add(BvfItems.FEMALE_SALMON_BUCKET.get(),"Female Salmon Bucket");
        this.add(BvfItems.PACIFIC_SALMON_BUCKET.get(),"Pacific Salmon Bucket");
        this.add(BvfItems.YELLOW_FIN_PUFFER_BUCKET.get(),"Yellow Fin Puffer Bucket");
        this.add(BvfItems.OBSCURE_PUFFER_BUCKET.get(),"Obscure Puffer Bucket");
        this.add(BvfItems.NAUTILUS_BUCKET.get(),"Nautilus Bucket");
        this.add(BvfItems.HADDOCK_COD.get(), "Haddock Cod");
        this.add(BvfItems.ATLANTIC_COD.get(), "Atlantic Cod");
        this.add(BvfItems.PACIFIC_COD.get(), "Pacific Cod");
        this.add(BvfItems.MALE_SALMON.get(), "Male Salmon");
        this.add(BvfItems.FEMALE_SALMON.get(), "Female Salmon");
        this.add(BvfItems.PACIFIC_SALMON.get(), "Pacific Salmon");
        this.add(BvfItems.YELLOW_FIN_PUFFER.get(),"Yellow Fin Puffer");
        this.add(BvfItems.OBSCURE_PUFFER.get(),"Obscure Puffer");
        this.add(BvfItems.ATLANTIC_COD_SPECIMEN.get(), "Atlantic Cod Specimen");
        this.add(BvfItems.PACIFIC_COD_SPECIMEN.get(), "Pacific Cod Specimen");
        this.add(BvfItems.HADDOCK_COD_SPECIMEN.get(), "Haddock Cod Specimen");
        this.add(BvfItems.PACIFIC_SALMON_SPECIMEN.get(), "Pacific Salmon Specimen");
        this.add(BvfItems.MALE_SALMON_SPECIMEN.get(),"Male Salmon Specimen");
        this.add(BvfItems.FEMALE_SALMON_SPECIMEN.get(),"Female Salmon Specimen");
        this.add(BvfItems.ENCHANTED_PUFFERFISH.get(), "Enchanted Pufferfish");

        this.add(BvfMobEffects.NAUTILUS_BLESSING.get(), "Nautilus Blessing");

        this.add("bvc.command.hanging", "Hanging Out now");
        this.add("bvc.command.follow", "Following now");

        this.add("advancements.bettervannilafishes.monster_go_away.title","Monsters and demons, Go Away");
        this.add("advancements.bettervannilafishes.monster_go_away.desc","Craft an Enchanted Pufferfish to fight against monsters.");
    }
    
}
