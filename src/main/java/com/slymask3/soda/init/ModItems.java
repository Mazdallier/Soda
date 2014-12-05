package com.slymask3.soda.init;

import net.minecraft.item.Item;

import com.slymask3.soda.item.ItemCan;
import com.slymask3.soda.reference.Names;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item can_drpepper = new ItemCan().setUnlocalizedName("can_drpepper");
	public static Item can_pepsi = new ItemCan().setUnlocalizedName("can_pepsi");
	
	public static void init() {
		GameRegistry.registerItem(can_drpepper, Names.Items.CAN+"drpepper");
		GameRegistry.registerItem(can_pepsi, Names.Items.CAN+"pepsi");
	}
}
