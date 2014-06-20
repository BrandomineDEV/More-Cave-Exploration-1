package com.brandomine.mcemod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FeedingStickTier3 extends Item{

	public FeedingStickTier3(int i) {
		this.setUnlocalizedName("Stick of Feeding Tier 3");
		this.setTextureName("mcemod:");
		this.setCreativeTab(com.brandomine.mcemod.mceMod.mceTab);
		this.setMaxDamage(200);
	}
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer){
		par3EntityPlayer.addPotionEffect((new PotionEffect(Potion.field_76443_y.getId(), 20, 0)));
		par1ItemStack.damageItem(1, par3EntityPlayer);
	    return par1ItemStack;
	}
}
