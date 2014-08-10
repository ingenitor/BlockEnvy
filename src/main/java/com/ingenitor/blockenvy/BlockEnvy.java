/**
 * 
 */
package com.ingenitor.blockenvy;

import com.ingenitor.blockenvy.configuration.ModConfiguration;
import com.ingenitor.blockenvy.handler.ConfigurationHandler;
import com.ingenitor.blockenvy.proxy.IProxy;
import com.ingenitor.blockenvy.reference.Identity;
import com.ingenitor.blockenvy.register.RegisterBlocks;
import com.ingenitor.blockenvy.register.RegisterRecipes;
import com.ingenitor.blockenvy.worldgen.TWorldGeneration;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author ingenitor
 *
 */
@Mod(modid = Identity.MOD_ID, name = Identity.MOD_NAME, version = Identity.VERSION, guiFactory = Identity.GUI_FACTORY_CLASS)
public class BlockEnvy {
	
	@Mod.Instance(Identity.MOD_ID)
	public static BlockEnvy instance;
	
	@SidedProxy(clientSide = Identity.CLIENT_PROXY_CLASS, serverSide = Identity.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	public static ModConfiguration config;
	
	public static TWorldGeneration worldGen = new TWorldGeneration();
	
	public BlockEnvy() {
		config = new ModConfiguration();		
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		
		RegisterBlocks.register();
		
		if(config.dioriteGen || config.andesiteGen || config.graniteGen) {
			GameRegistry.registerWorldGenerator(worldGen, 0);
		}
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
		RegisterRecipes.register();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}	
}

