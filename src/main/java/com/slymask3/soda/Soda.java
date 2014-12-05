package com.slymask3.soda;

import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;

import com.slymask3.soda.command.CommandSoda;
import com.slymask3.soda.handler.ConfigurationHandler;
import com.slymask3.soda.handler.ConnectionHandler;
import com.slymask3.soda.init.ModBlocks;
import com.slymask3.soda.init.ModItems;
import com.slymask3.soda.init.Recipes;
import com.slymask3.soda.proxy.IProxy;
import com.slymask3.soda.reference.Reference;
import com.slymask3.soda.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory=Reference.GUI_FACTORY_CLASS)
public class Soda {
	@Instance(Reference.MOD_ID)
	public static Soda instance = new Soda();
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		FMLCommonHandler.instance().bus().register(new ConnectionHandler());
		
		ModItems.init();
		ModBlocks.init();
		
		LogHelper.info("Pre Initialization Complete!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerInformation();
		
		Recipes.init();
		
		LogHelper.info("Initialization Complete!");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LogHelper.info("Post Initialization Complete!");
	}
	
	@Mod.EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
		ICommandManager command = server.getCommandManager();
		ServerCommandManager serverCommand = ((ServerCommandManager) command);
		
		serverCommand.registerCommand(new CommandSoda());
	}
}