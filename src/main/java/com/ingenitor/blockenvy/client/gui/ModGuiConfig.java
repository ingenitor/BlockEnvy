/**
 * 
 */
package com.ingenitor.blockenvy.client.gui;

import com.ingenitor.blockenvy.handler.ConfigurationHandler;
import com.ingenitor.blockenvy.reference.Identity;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * @author ingenitor
 *
 */
public class ModGuiConfig extends GuiConfig {
	
    public ModGuiConfig(GuiScreen guiScreen) {
    	
        super(guiScreen,
            new ConfigElement(ConfigurationHandler.configuration.getCategory("worldgen")).getChildElements(),
            Identity.MOD_ID,
            false,
            false,
            GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
