package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OrePlatinum extends Block{

	public OrePlatinum() {
		super(Material.rock);
		this.setHarvestLevel("pickaxe", 3);
	}

}
