package com.slymask3.soda.item;

import net.minecraft.item.Item;

public class ItemCan extends ItemBase {
	private Item material;
	
	public ItemCan() {
		super();
        maxStackSize = 64;
	}
	
//	@SideOnly(Side.CLIENT)
//	public boolean isFull3D() {
//		return true;
//	}
	
//	public void addInformation(ItemStack is, EntityPlayer player, List list, boolean par4) {
//		int max = (is.getMaxDamage()) + 1;
//		int dmg = (is.getMaxDamage() - is.getItemDamage()) + 1;
//		
//		list.add("Uses: " + dmg + "/" + max);
//	}
}
