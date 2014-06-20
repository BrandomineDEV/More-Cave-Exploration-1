package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreCopper extends Block{

	public OreCopper() {
		super(Material.rock);
		this.setHarvestLevel("pickaxe",2);
		
	}

}
