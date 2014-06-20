package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCobalt extends Block{

	public BlockCobalt() {
		super(Material.iron);
		this.setHarvestLevel("pickaxe", 1);
	}

}
