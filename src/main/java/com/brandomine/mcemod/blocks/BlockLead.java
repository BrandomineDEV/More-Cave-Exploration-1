package com.brandomine.mcemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockLead extends Block{

	public BlockLead() {
		super(Material.iron);
		this.setHarvestLevel("pickaxe", 1);
	}

}
