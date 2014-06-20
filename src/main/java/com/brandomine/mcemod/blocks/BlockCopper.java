package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopper extends Block{

	public BlockCopper() {
		super(Material.iron);
		this.setHarvestLevel("pickaxe", 1);
	}

}
