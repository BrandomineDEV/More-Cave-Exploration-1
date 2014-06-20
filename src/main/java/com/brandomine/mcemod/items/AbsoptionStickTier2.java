package com.brandomine.mcemod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class AbsoptionStickTier2 extends Item{

	public AbsoptionStickTier2(int i) {
		this.setUnlocalizedName("Stick of Absorption Tier 2");
		this.setTextureName("mcemod:absoption");
		this.setCreativeTab(com.brandomine.mcemod.mceMod.mceTab);
		this.setMaxDamage(100);
	}
		
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.field_76444_x.getId(), 80, 0)));
		par1ItemStack.damageItem(1, par3EntityPlayer);
	    return par1ItemStack;
	}

}


