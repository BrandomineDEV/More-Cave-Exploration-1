package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreLead extends Block{

	public OreLead() {
		super(Material.rock);
		this.setHarvestLevel("pickaxe",2);
	
	}

}
