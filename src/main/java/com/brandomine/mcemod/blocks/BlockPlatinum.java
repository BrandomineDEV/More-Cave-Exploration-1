package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPlatinum extends Block{

	public BlockPlatinum() {
		super(Material.iron);
		this.setHarvestLevel("pickaxe", 1);
	}

}
