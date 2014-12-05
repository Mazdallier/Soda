package com.slymask3.soda.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.slymask3.soda.creativetab.SodaTab;
import com.slymask3.soda.reference.Names;
import com.slymask3.soda.reference.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTwelvePackDrPepper extends Block {
	private String soda = "drpepper";
	
	public BlockTwelvePackDrPepper() {
		super(Material.circuits);
        setCreativeTab(SodaTab.SODA_TAB);
        setBlockName("soda:" + Names.Blocks.TWELVEPACK + soda);
        setHardness(0.5F);
        setStepSound(Block.soundTypePiston);
        setBlockTextureName(Textures.TwelvePack.SIDE + soda);
	}

	public int quantityDropped(Random random) {
		return 1;
	}
	
	public static IIcon side;
    
	public void registerBlockIcons(IIconRegister ir) {
		side = ir.registerIcon(Textures.TwelvePack.SIDE + soda);
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return this.side;
    }

	/*@Override
	public boolean onBlockActivated(World world,int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
		//((TileEntityColor) world.getTileEntity(x, y, z)).color = 0x00FFFF00;
		//world.markBlockForUpdate(x, y, z);
		
		return true;
	}
	
	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
		//((TileEntityColor) world.getTileEntity(x, y, z)).color = 0x000000FF;
		//world.markBlockForUpdate(x, y, z);
	}*/
	
	//@SideOnly(Side.CLIENT)
//	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack is) {
//		int r = 0;
//		int g = 0;
//		int b = 0;
//		
//		//if(!world.isRemote) {
//			Random rand = new Random();
//			r = rand.nextInt(255);
//			g = rand.nextInt(255);
//			b = rand.nextInt(255);
//		//}
//			
//			int rgb = ((r & 0xFF) << 16) + ((g & 0xFF) << 8) + (b & 0xFF);
//		
//		if(!world.isRemote) {
//			((TileEntityColor) world.getTileEntity(x, y, z)).color = rgb;
//			world.markBlockForUpdate(x, y, z);
//			//world.notifyBlockChange(x, y, z, ModBlocks.color);
//			//world.updateEntities();
//		}
//	}
}