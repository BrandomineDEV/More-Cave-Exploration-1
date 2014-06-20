package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreCobalt extends Block{

	public OreCobalt() {
		super(Material.rock);
		this.setHarvestLevel("pickaxe",3);
	}

}
