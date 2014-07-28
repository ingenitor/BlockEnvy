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
		
	public boolean testValue = false;
	
	public void load() {
		ConfigurationHandler.configuration.load();		
	}
	
	public void populate() {	
		
		testValue = ConfigurationHandler.configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
		
		//TODO: populate all config parms here
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
