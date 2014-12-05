package com.slymask3.soda.init;

import net.minecraft.block.Block;

import com.slymask3.soda.block.BlockTwelvePackDrPepper;
import com.slymask3.soda.block.BlockTwelvePackPepsi;
import com.slymask3.soda.item.ItemBlockBase;
import com.slymask3.soda.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block twelvepack_drpepper = new BlockTwelvePackDrPepper();
	public static Block twelvepack_pepsi = new BlockTwelvePackPepsi();
	
	public static void init() {
		GameRegistry.registerBlock(twelvepack_drpepper, ItemBlockBase.class, Names.Blocks.TWELVEPACK+"drpepper");
		GameRegistry.registerBlock(twelvepack_pepsi, ItemBlockBase.class, Names.Blocks.TWELVEPACK+"pepsi");
	}
}