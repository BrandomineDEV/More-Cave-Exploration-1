package com.brandomine.mcemod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AbsoptionStickTier5 extends Item{

	public AbsoptionStickTier5(int i) {
		this.setUnlocalizedName("Stick of Absorption Tier 5");
		this.setTextureName("mcemod:absoption");
		this.setCreativeTab(com.brandomine.mcemod.mceMod.mceTab);
	}
		
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.field_76444_x.getId(), 14000, 0)));
	    return par1ItemStack;
	}
}
