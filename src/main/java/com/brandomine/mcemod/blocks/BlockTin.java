package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTin extends Block{

	public BlockTin() {
		super(Material.iron);
		this.setHarvestLevel("pickaxe", 1);
	}

}
