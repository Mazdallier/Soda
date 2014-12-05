package com.slymask3.soda.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.slymask3.soda.init.ModItems;

public class SodaTab {
	
	public static final CreativeTabs SODA_TAB = new CreativeTabs("soda") {
		@Override
		public Item getTabIconItem() {
			return ModItems.can_drpepper;
		}
	};
}