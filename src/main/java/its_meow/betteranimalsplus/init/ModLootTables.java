package its_meow.betteranimalsplus.init;

import its_meow.betteranimalsplus.Ref;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class ModLootTables {

    public static final ResourceLocation deer = new ResourceLocation(Ref.MOD_ID, "deer");
    public static final ResourceLocation lammergeier = new ResourceLocation(Ref.MOD_ID, "lammergeier");
    public static final ResourceLocation hirschgeist = new ResourceLocation(Ref.MOD_ID, "hirschgeist");
    public static final ResourceLocation goat = new ResourceLocation(Ref.MOD_ID, "goat");
    public static final ResourceLocation pheasant = new ResourceLocation(Ref.MOD_ID, "pheasant");
    public static final ResourceLocation reindeer = new ResourceLocation(Ref.MOD_ID, "reindeer");
    public static final ResourceLocation songbird = new ResourceLocation(Ref.MOD_ID, "songbird");
    public static final ResourceLocation lamprey = new ResourceLocation(Ref.MOD_ID, "lamprey");
    public static final ResourceLocation NAUTILUS = new ResourceLocation(Ref.MOD_ID, "nautilus");
    public static final ResourceLocation CRAB = new ResourceLocation(Ref.MOD_ID, "crab");
    
    // Wolves
    public static final ResourceLocation WOLF_SNOWY = new ResourceLocation(Ref.MOD_ID, "wolf_snowy");
    public static final ResourceLocation WOLF_TIMBER = new ResourceLocation(Ref.MOD_ID, "wolf_timber");
    public static final ResourceLocation WOLF_BLACK = new ResourceLocation(Ref.MOD_ID, "wolf_black");
    
    // Bears
    public static final ResourceLocation BEAR_BROWN = new ResourceLocation(Ref.MOD_ID, "bear_brown");
    public static final ResourceLocation BEAR_BLACK = new ResourceLocation(Ref.MOD_ID, "bear_black");
    public static final ResourceLocation BEAR_KERMODE = new ResourceLocation(Ref.MOD_ID, "bear_kermode");
    
    public static final ResourceLocation SHARK = new ResourceLocation(Ref.MOD_ID, "shark");
    
    public static void register() {
        LootTableList.register(deer);
        LootTableList.register(lammergeier);
        LootTableList.register(hirschgeist);
        LootTableList.register(goat);
        LootTableList.register(pheasant);
        LootTableList.register(reindeer);
        LootTableList.register(songbird);
        LootTableList.register(lamprey);
        LootTableList.register(NAUTILUS);
        LootTableList.register(CRAB);
        LootTableList.register(WOLF_SNOWY);
        LootTableList.register(WOLF_TIMBER);
        LootTableList.register(WOLF_BLACK);
        LootTableList.register(BEAR_BROWN);
        LootTableList.register(BEAR_BLACK);
        LootTableList.register(BEAR_KERMODE);
        LootTableList.register(SHARK);
    }

}
