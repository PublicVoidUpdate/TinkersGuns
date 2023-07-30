package com.ashe.tinkersguns.miscellaneous;

import com.ashe.tinkersguns.TinkersGuns;
import com.ashe.tinkersguns.block.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class GunTab extends CreativeTabs{

	public GunTab() {
		super(TinkersGuns.MODID);
	}
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.blockGunmetal);
	}

}
