/**
 * 
 */
package com.ingenitor.blockenvy.configuration;

import com.ingenitor.blockenvy.handler.ConfigurationHandler;

import net.minecraftforge.common.config.Configuration;

/**
 * @author ingenitor
 *
 */
public class ModConfiguration {
		
	public boolean dioriteGen = false;
	public boolean andesiteGen = false;
	public boolean graniteGen = false;
	
	public void load() {
		ConfigurationHandler.configuration.load();		
	}
	
	public void populate() {	
		dioriteGen = ConfigurationHandler.configuration.getBoolean("dioriteGen", "worldgen", false, "Enable/Disable Diorite world generation");
		andesiteGen = ConfigurationHandler.configuration.getBoolean("andesiteGen", "worldgen", false, "Enable/Disable Andesite world generation");
		graniteGen = ConfigurationHandler.configuration.getBoolean("graniteGen", "worldgen", false, "Enable/Disable Granite world generation");
	}
	
	public void save() {
		if( ConfigurationHandler.configuration.hasChanged() ) {
			ConfigurationHandler.configuration.save();
		}		
	}
	
	public void populateSave() {
		populate();
		save();
	}
}
