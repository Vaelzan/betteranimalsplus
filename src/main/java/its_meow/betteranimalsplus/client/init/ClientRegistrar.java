package its_meow.betteranimalsplus.client.init;

import its_meow.betteranimalsplus.Ref;
import its_meow.betteranimalsplus.client.renderer.entity.RenderBadger;
import its_meow.betteranimalsplus.client.renderer.entity.RenderBadgerDirt;
import its_meow.betteranimalsplus.client.renderer.entity.RenderBear;
import its_meow.betteranimalsplus.client.renderer.entity.RenderBlackBear;
import its_meow.betteranimalsplus.client.renderer.entity.RenderBoar;
import its_meow.betteranimalsplus.client.renderer.entity.RenderCoyote;
import its_meow.betteranimalsplus.client.renderer.entity.RenderCrab;
import its_meow.betteranimalsplus.client.renderer.entity.RenderCustomWolf;
import its_meow.betteranimalsplus.client.renderer.entity.RenderDeer;
import its_meow.betteranimalsplus.client.renderer.entity.RenderFox;
import its_meow.betteranimalsplus.client.renderer.entity.RenderGoat;
import its_meow.betteranimalsplus.client.renderer.entity.RenderHirschgeist;
import its_meow.betteranimalsplus.client.renderer.entity.RenderHorseshoeCrab;
import its_meow.betteranimalsplus.client.renderer.entity.RenderJellyfish;
import its_meow.betteranimalsplus.client.renderer.entity.RenderLammergeier;
import its_meow.betteranimalsplus.client.renderer.entity.RenderLamprey;
import its_meow.betteranimalsplus.client.renderer.entity.RenderMoose;
import its_meow.betteranimalsplus.client.renderer.entity.RenderNautilus;
import its_meow.betteranimalsplus.client.renderer.entity.RenderPheasant;
import its_meow.betteranimalsplus.client.renderer.entity.RenderReindeer;
import its_meow.betteranimalsplus.client.renderer.entity.RenderShark;
import its_meow.betteranimalsplus.client.renderer.entity.RenderSongbird;
import its_meow.betteranimalsplus.client.renderer.entity.RenderSquirrel;
import its_meow.betteranimalsplus.client.renderer.entity.RenderTarantula;
import its_meow.betteranimalsplus.client.renderer.entity.RenderTarantulaHair;
import its_meow.betteranimalsplus.client.renderer.tileentity.RenderBlockHandOfFate;
import its_meow.betteranimalsplus.client.renderer.tileentity.RenderBlockTrillium;
import its_meow.betteranimalsplus.client.renderer.tileentity.RenderGenericHead;
import its_meow.betteranimalsplus.common.entity.EntityBadger;
import its_meow.betteranimalsplus.common.entity.EntityBear;
import its_meow.betteranimalsplus.common.entity.EntityBearNeutral;
import its_meow.betteranimalsplus.common.entity.EntityBoar;
import its_meow.betteranimalsplus.common.entity.EntityCoyote;
import its_meow.betteranimalsplus.common.entity.EntityCrab;
import its_meow.betteranimalsplus.common.entity.EntityDeer;
import its_meow.betteranimalsplus.common.entity.EntityFeralWolf;
import its_meow.betteranimalsplus.common.entity.EntityFox;
import its_meow.betteranimalsplus.common.entity.EntityGoat;
import its_meow.betteranimalsplus.common.entity.EntityHorseshoeCrab;
import its_meow.betteranimalsplus.common.entity.EntityJellyfish;
import its_meow.betteranimalsplus.common.entity.EntityLammergeier;
import its_meow.betteranimalsplus.common.entity.EntityLamprey;
import its_meow.betteranimalsplus.common.entity.EntityMoose;
import its_meow.betteranimalsplus.common.entity.EntityNautilus;
import its_meow.betteranimalsplus.common.entity.EntityPheasant;
import its_meow.betteranimalsplus.common.entity.EntityReindeer;
import its_meow.betteranimalsplus.common.entity.EntityShark;
import its_meow.betteranimalsplus.common.entity.EntitySongbird;
import its_meow.betteranimalsplus.common.entity.EntitySquirrel;
import its_meow.betteranimalsplus.common.entity.EntityTarantula;
import its_meow.betteranimalsplus.common.entity.miniboss.hirschgeist.EntityHirschgeist;
import its_meow.betteranimalsplus.common.entity.projectile.EntityBadgerDirt;
import its_meow.betteranimalsplus.common.entity.projectile.EntityTarantulaHair;
import its_meow.betteranimalsplus.common.item.ItemAdvancementIcon;
import its_meow.betteranimalsplus.common.item.ItemBlockHeadType;
import its_meow.betteranimalsplus.common.tileentity.TileEntityHandOfFate;
import its_meow.betteranimalsplus.common.tileentity.TileEntityHead;
import its_meow.betteranimalsplus.common.tileentity.TileEntityTrillium;
import its_meow.betteranimalsplus.init.ModBlocks;
import its_meow.betteranimalsplus.init.ModItems;
import its_meow.betteranimalsplus.util.HeadTypes;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Ref.MOD_ID, value = Side.CLIENT)
public class ClientRegistrar {

    @SubscribeEvent
    public static void registerRenders(final ModelRegistryEvent event) {
        // Blocks

        initModel(ModBlocks.trillium, 0);
        initModel(ModBlocks.handoffate, 0);

        // Generics
        for(HeadTypes type : HeadTypes.values()) {
        	for(ItemBlockHeadType item : type.getItems()) {
        		 initModel(item, 0);
        	}
        }

        // Items

        initModel(ModItems.venisonRaw, 0);
        initModel(ModItems.venisonCooked, 0);
        initModel(ModItems.itemHirschgeistSkullWearable, 0);
        initModel(ModItems.antler, 0);
        initModel(ModItems.goatMilk, 0);
        initModel(ModItems.goatCheese, 0);
        initModel(ModItems.pheasantRaw, 0);
        initModel(ModItems.pheasantCooked, 0);
        initModel(ModItems.WOLF_CAPE_CLASSIC, 0);
        initModel(ModItems.WOLF_CAPE_TIMBER, 0);
        initModel(ModItems.WOLF_CAPE_BLACK, 0);
        initModel(ModItems.CRAB_MEAT_COOKED, 0);
        initModel(ModItems.CRAB_MEAT_RAW, 0);
        initModel(ModItems.RECORD_CRAB_RAVE, 0);
        initModel(ModItems.WOLF_PELT_SNOWY, 0);
        initModel(ModItems.WOLF_PELT_TIMBER, 0);
        initModel(ModItems.WOLF_PELT_BLACK, 0);
        initModel(ModItems.BEAR_SKIN_BLACK, 0);
        initModel(ModItems.BEAR_SKIN_BROWN, 0);
        initModel(ModItems.BEAR_SKIN_KERMODE, 0);
        initModel(ModItems.BEAR_CAPE_BLACK, 0);
        initModel(ModItems.BEAR_CAPE_BROWN, 0);
        initModel(ModItems.BEAR_CAPE_KERMODE, 0);
        
        for(ItemAdvancementIcon icon : ModItems.ADVANCEMENT_ICONS.values()) {
            initModel(icon, 0);
        }
        
        // Tile Entities
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrillium.class, new RenderBlockTrillium());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHandOfFate.class, new RenderBlockHandOfFate());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHead.class, new RenderGenericHead());
        
        // Entities
        
        RenderingRegistry.registerEntityRenderingHandler(EntityBear.class, RenderBear::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBearNeutral.class, RenderBlackBear::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityDeer.class, RenderDeer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityLammergeier.class, RenderLammergeier::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityFeralWolf.class, RenderCustomWolf::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCoyote.class, RenderCoyote::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityFox.class, RenderFox::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTarantulaHair.class, RenderTarantulaHair::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityTarantula.class, RenderTarantula::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHirschgeist.class, RenderHirschgeist::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityGoat.class, RenderGoat::new);    
        RenderingRegistry.registerEntityRenderingHandler(EntityJellyfish.class, RenderJellyfish::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityPheasant.class, RenderPheasant::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityReindeer.class, RenderReindeer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBoar.class, RenderBoar::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySquirrel.class, RenderSquirrel::new);
        RenderingRegistry.registerEntityRenderingHandler(EntitySongbird.class, RenderSongbird::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBadger.class, RenderBadger::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityBadgerDirt.class, RenderBadgerDirt::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityLamprey.class, RenderLamprey::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityNautilus.class, RenderNautilus::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, RenderCrab::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityHorseshoeCrab.class, RenderHorseshoeCrab::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, RenderShark::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityMoose.class, RenderMoose::new);
    }

    public static void initModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    public static void initModel(Block block, int meta) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }

    public static void initModelOBJ(Block block, int meta) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(block.getRegistryName() + ".obj", "inventory"));
    }

}
