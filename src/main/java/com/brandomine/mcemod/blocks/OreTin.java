package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class OreTin extends Block{

	public OreTin() {
		super(Material.rock);
		this.setHarvestLevel("pickaxe", 2);
	}

}
