/**
 * 
 */
package com.ingenitor.blockenvy.handler;

import java.io.File;

import com.ingenitor.blockenvy.BlockEnvy;
import com.ingenitor.blockenvy.reference.Identity;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

/**
 * @author ingenitor
 *
 */
public class ConfigurationHandler {
	
	public static Configuration configuration = null;
 
	public static void init(File configFile) {

		if( configuration == null ) {
			configuration = new Configuration(configFile);
			
			BlockEnvy.instance.config.load();
			BlockEnvy.instance.config.populateSave();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		
		if( event.modID.equalsIgnoreCase(Identity.MOD_ID) ) {

			BlockEnvy.instance.config.save();
		}
	}
}
