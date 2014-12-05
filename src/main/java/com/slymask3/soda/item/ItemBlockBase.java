package com.slymask3.soda.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.slymask3.soda.init.ModBlocks;

public class ItemBlockBase extends ItemBlock {
	public Block block;
	
	public ItemBlockBase(Block b) {
         super(b);
         block = b;
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
		if (block == ModBlocks.twelvepack_drpepper) {
			list.add("12 cans in a pack. Dr Pepper.");
		} else if (block == ModBlocks.twelvepack_pepsi) {
			list.add("12 cans in a pack. Pepsi.");
		} else {
			list.add("Error loading description.");
		}
	}
}