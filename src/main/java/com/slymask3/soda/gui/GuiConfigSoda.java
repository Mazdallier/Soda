package com.slymask3.soda.gui;

import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;

import com.slymask3.soda.handler.ConfigurationHandler;

import cpw.mods.fml.client.config.GuiConfig;

public class GuiConfigSoda extends GuiConfig {  
    static List list = new ConfigElement(ConfigurationHandler.configuration.getCategory("options")).getChildElements();
    		///.add(new ConfigElement(ConfigurationHandler.configuration.getCategory("other")).getChildElements()
    				//.add(new ConfigElement(ConfigurationHandler.configuration.getCategory("wool colors")).getChildElements()));
    
	private static String titleDir = GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString());
    
	
	
	public GuiConfigSoda(GuiScreen parent) {
        super(parent, list, "soda", false, false, titleDir);
    }
	
	/*private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<IConfigElement>();
        list.add((IConfigElement) new ConfigElement(ConfigurationHandler.configuration.getCategory("options")).getChildElements());
        list.add((IConfigElement) new ConfigElement(ConfigurationHandler.configuration.getCategory("wool colors")).getChildElements());
        list.add((IConfigElement) new ConfigElement(ConfigurationHandler.configuration.getCategory("other")).getChildElements());
        list.add((IConfigElement) new ConfigElement(ConfigurationHandler.configuration.getCategory("cheats")).getChildElements());
        return list;
    }*/
}