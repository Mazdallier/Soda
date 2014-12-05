package com.slymask3.soda.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;

public class TileEntityColor extends TileEntity {
	
	public int color;// = 0x00000000;

	public TileEntityColor() {
		super();
//		int r = 0;
//		int g = 0;
//		int b = 0;
//		
//		Random rand = new Random();
//		r = rand.nextInt(255);
//		g = rand.nextInt(255);
//		b = rand.nextInt(255);
//		
//		color = ((r & 0xFF) << 16) + ((g & 0xFF) << 8) + (b & 0xFF);
		color = 0x00FFFFFF;
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		color = nbt.getInteger("Color");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		nbt.setInteger("Color", color);
	}

	@Override
	public Packet getDescriptionPacket() {
		NBTTagCompound tag = new NBTTagCompound();
		writeToNBT(tag);
		return new S35PacketUpdateTileEntity(xCoord, yCoord, zCoord, 0, tag);
	}

	@Override
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt) {
		readFromNBT(pkt.func_148857_g());
    }
}