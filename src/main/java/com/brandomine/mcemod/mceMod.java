package com.brandomine.mcemod;

import com.brandomine.mcemod.items.FeedingStick;
import com.brandomine.mcemod.items.FeedingStickTier2;
import com.brandomine.mcemod.items.FeedingStickTier3;
import com.brandomine.mcemod.items.FeedingStickTier4;
import com.brandomine.mcemod.items.FeedingStickTier5;
import com.brandomine.mcemod.items.AbsoptionStick;
import com.brandomine.mcemod.items.AbsoptionStickTier2;
import com.brandomine.mcemod.items.AbsoptionStickTier3;
import com.brandomine.mcemod.items.AbsoptionStickTier4;
import com.brandomine.mcemod.items.AbsoptionStickTier5;
import com.brandomine.mcemod.items.MagicStickTier1;
import com.brandomine.mcemod.items.MagicStickTier2;
import com.brandomine.mcemod.items.MagicStickTier3;
import com.brandomine.mcemod.items.MagicStickTier4;
import com.brandomine.mcemod.items.MagicStickTier5;
import com.brandomine.mcemod.items.PotionEssenceTier1;
import com.brandomine.mcemod.items.PotionEssenceTier2;
import com.brandomine.mcemod.items.PotionEssenceTier3;
import com.brandomine.mcemod.items.InvisibilityStick;
import com.brandomine.mcemod.items.IngotCopper;
import com.brandomine.mcemod.items.IngotCobalt;
import com.brandomine.mcemod.items.IngotLead;
import com.brandomine.mcemod.items.IngotPlatinum;
import com.brandomine.mcemod.items.IngotTin;
import com.brandomine.mcemod.items.NuggetCopper;
import com.brandomine.mcemod.items.NuggetCobalt;
import com.brandomine.mcemod.items.NuggetLead;
import com.brandomine.mcemod.items.NuggetPlatinum;
import com.brandomine.mcemod.items.NuggetTin;
import com.brandomine.mcemod.blocks.OreCopper;
import com.brandomine.mcemod.blocks.OreCobalt;
import com.brandomine.mcemod.blocks.OreLead;
import com.brandomine.mcemod.blocks.OrePlatinum;
import com.brandomine.mcemod.blocks.OreTin;
import com.brandomine.mcemod.blocks.BlockCopper;
import com.brandomine.mcemod.blocks.BlockCobalt;
import com.brandomine.mcemod.blocks.BlockLead;
import com.brandomine.mcemod.blocks.BlockPlatinum;
import com.brandomine.mcemod.blocks.BlockTin;
import com.brandomine.mcemod.world.OreCopperWG;
import com.brandomine.mcemod.lib.ProxyCommon;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = mceMod.MODID, version = mceMod.VERSION)
public class mceMod 
{
	public static final String MODID = "mcemod";
	public static final String VERSION = "0.4";
	
	public static CreativeTabs mceTab = new CreativeTabs("morecaveexplorationTab"){
		public Item getTabIconItem() {
			return IngotCobalt;
			
		}
		
	};
	
	@Instance(value = MODID)
	public static mceMod instance;
	
	@SidedProxy(clientSide = "com.brandomine.mcemod.lib.ProxyClient", serverSide = "com.brandomine.mcemod.lib.ProxyCommon")
	public static ProxyCommon proxy; 
	
	//Items
		public static Item IngotCopper = new IngotCopper(1000);
		public static Item IngotCobalt = new IngotCobalt(1001);
		public static Item IngotLead = new IngotLead(1002);
		public static Item IngotPlatinum = new IngotPlatinum(1003);
		public static Item IngotTin = new IngotTin(1004);
		public static Item NuggetCopper = new NuggetCopper(1005);
		public static Item NuggetCobalt = new NuggetCobalt(1006);
		public static Item NuggetLead = new NuggetLead(1007);
		public static Item NuggetPlatinum = new NuggetPlatinum(1008);
		public static Item NuggetTin = new NuggetTin(1009);
	//Potion Sticks
		public static Item FeedingStick = new FeedingStick(1010);
		public static Item FeedingStickTier2 = new FeedingStickTier2(1011);
		public static Item FeedingStickTier3 = new FeedingStickTier3(1012);
		public static Item FeedingStickTier4 = new FeedingStickTier4(1013);
		public static Item FeedingStickTier5 = new FeedingStickTier5(1014);
		public static Item MagicStickTier1 = new MagicStickTier1(1015);
		public static Item MagicStickTier2 = new MagicStickTier2(1016);
		public static Item MagicStickTier3 = new MagicStickTier3(1017);
		public static Item MagicStickTier4 = new MagicStickTier4(1018);
		public static Item MagicStickTier5 = new MagicStickTier5(1019);
		public static Item AbsoptionStick = new AbsoptionStick(1020);
		public static Item AbsoptionStickTier2 = new AbsoptionStickTier2(1021);
		public static Item AbsoptionStickTier3 = new AbsoptionStickTier3(1022);
		public static Item AbsoptionStickTier4 = new AbsoptionStickTier4(1023);
		public static Item AbsoptionStickTier5 = new AbsoptionStickTier5(1024);
		public static Item PotionEssenceTier1 = new PotionEssenceTier1(1025);
		public static Item PotionEssenceTier2 = new PotionEssenceTier2(1026);
		public static Item PotionEssenceTier3 = new PotionEssenceTier3(1027);
		public static Item InvisibilityStick = new InvisibilityStick(1028);
	//Blocks
		public static Block oreCopper;
		public static Block oreCobalt;
		public static Block oreLead;
		public static Block orePlatinum;
		public static Block oreTin;
		public static Block blockCopper;
		public static Block blockCobalt;
		public static Block blockLead;
		public static Block blockPlatinum;
		public static Block blockTin;
		public static Block PotionCrop;
		
	
	//World Generation
		public static OreCopperWG worldgenCopper = new OreCopperWG();
		
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
	//Registry
		//Name/texture/Tab
		oreCopper = new OreCopper().setBlockName("oreCopper").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:copper_ore").setHardness(3);
		oreCobalt = new OreCobalt().setBlockName("oreCobalt").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:cobalt_ore").setHardness(100);
		oreLead = new OreLead().setBlockName("oreLead").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:lead_ore").setHardness(3);
		orePlatinum = new OrePlatinum().setBlockName("orePlatinum").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:platinum_ore").setHardness(50);
		oreTin = new OreTin().setBlockName("oreTin").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:tin_ore").setHardness(3);
		blockCopper = new BlockCopper().setBlockName("blockCopper").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:copper_block").setHardness(5);
		blockCobalt = new BlockCobalt().setBlockName("blockCobalt").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:cobalt_block").setHardness(5);
		blockLead = new BlockLead().setBlockName("blockLead").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:lead_block").setHardness(5);
		blockPlatinum = new BlockPlatinum().setBlockName("blockPlatinum").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:platinum_block").setHardness(5);
		blockTin = new BlockTin().setBlockName("blockTin").setCreativeTab(com.brandomine.mcemod.mceMod.mceTab).setBlockTextureName("mcemod:tin_block").setHardness(5);
		//GameReg
		GameRegistry.registerBlock(oreCopper, "oreCopper");
		GameRegistry.registerBlock(oreCobalt, "oreCobalt");
		GameRegistry.registerBlock(oreLead, "oreLead");
		GameRegistry.registerBlock(orePlatinum, "orePlatinum");
		GameRegistry.registerBlock(oreTin, "oreTin");
		GameRegistry.registerBlock(blockCopper, "blockCopper");
		GameRegistry.registerBlock(blockCobalt, "blockCobalt");
		GameRegistry.registerBlock(blockLead, "blockLead");
		GameRegistry.registerBlock(blockPlatinum, "blockPlatinum");
		GameRegistry.registerBlock(blockTin, "blockTin");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addSmelting(oreCopper, new ItemStack(IngotCopper), (float) 0.5);
		GameRegistry.addSmelting(oreCobalt, new ItemStack(IngotCobalt), (float) 1.0);
		GameRegistry.addSmelting(oreLead, new ItemStack(IngotLead), (float) 0.5);
		GameRegistry.addSmelting(orePlatinum, new ItemStack(IngotPlatinum), (float) 1.0);
		GameRegistry.addSmelting(oreTin, new ItemStack(IngotTin), (float) 0.5);
		//Block Recipes
				//Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(blockCopper, 1), IngotCopper, IngotCopper, IngotCopper, IngotCopper, IngotCopper, IngotCopper, IngotCopper, IngotCopper, IngotCopper);
		GameRegistry.addShapelessRecipe(new ItemStack(blockCobalt, 1), IngotCobalt, IngotCobalt, IngotCobalt, IngotCobalt, IngotCobalt, IngotCobalt, IngotCobalt, IngotCobalt, IngotCobalt);
		GameRegistry.addShapelessRecipe(new ItemStack(blockLead, 1), IngotLead, IngotLead, IngotLead, IngotLead, IngotLead, IngotLead, IngotLead, IngotLead, IngotLead);
		GameRegistry.addShapelessRecipe(new ItemStack(blockPlatinum, 1), IngotPlatinum, IngotPlatinum, IngotPlatinum, IngotPlatinum, IngotPlatinum, IngotPlatinum, IngotPlatinum, IngotPlatinum, IngotPlatinum);
		GameRegistry.addShapelessRecipe(new ItemStack(blockTin, 1), IngotTin, IngotTin, IngotTin, IngotTin, IngotTin, IngotTin, IngotTin, IngotTin, IngotTin);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotCopper, 9), blockCopper);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotCobalt, 9), blockCobalt);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotLead, 9), blockLead);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotPlatinum, 9), blockPlatinum);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotTin, 9), blockTin);
		//Stick Recipes
			//Magic
		GameRegistry.addRecipe(new ItemStack(MagicStickTier1), new Object[]{"C X", "XSX", "X C", 'C', IngotCopper, 'S', Items.stick, 'X', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(MagicStickTier2), new Object[]{"C X", "XSX", "X C", 'C', IngotLead, 'S', Items.stick, 'X', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(MagicStickTier3), new Object[]{"C X", "XSX", "X C", 'C', IngotTin, 'S', Items.stick, 'X', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(MagicStickTier4), new Object[]{"C X", "XSX", "X C", 'C', IngotCobalt, 'S', Items.stick, 'X', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(MagicStickTier5), new Object[]{"CXP", "XSX", "XPC", 'C', IngotCobalt, 'S', Items.stick, 'X', Items.diamond, 'P', IngotPlatinum});
			//Absoption
		GameRegistry.addRecipe(new ItemStack(AbsoptionStick), new Object[]{"A  ", " B ", "  C", 'A', Blocks.diamond_block, 'B', MagicStickTier1, 'C', Items.golden_apple});
			//Healing
			//Speed
			//Regeneration
			//Protection
			//Fire Resistance
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerRenderersInformation();
	}
	
	public mceMod(){
		//Items Registry
			//GameReg
				GameRegistry.registerItem(IngotCopper, "Copper Ingot");
				GameRegistry.registerItem(IngotCobalt, "Cobalt Ingot");
				GameRegistry.registerItem(IngotLead, "Lead Ingot");
				GameRegistry.registerItem(IngotPlatinum, "Platinum Ingot");
				GameRegistry.registerItem(IngotTin, "Tin Ingot");
				GameRegistry.registerItem(NuggetCopper, "Copper Nugget");
				GameRegistry.registerItem(NuggetCobalt, "Cobalt Nugget");
				GameRegistry.registerItem(NuggetLead, "Lead Nugget");
				GameRegistry.registerItem(NuggetPlatinum, "Platinum Nugget");
				GameRegistry.registerItem(NuggetTin, "Tin Nugget");
				GameRegistry.registerItem(FeedingStick, "Stick of Feeding Tier 1");
				GameRegistry.registerItem(FeedingStickTier2, "Stick of Feeding Tier 2");
				GameRegistry.registerItem(FeedingStickTier3, "Stick of Feeding Tier 3");
				GameRegistry.registerItem(FeedingStickTier4, "Stick of Feeding Tier 4");
				GameRegistry.registerItem(FeedingStickTier5, "Stick of Feeding Tier 5");
				GameRegistry.registerItem(AbsoptionStick, "Stick of Absorption Tier 1");
				GameRegistry.registerItem(AbsoptionStickTier2, "Stick of Absorption Tier 2");
				GameRegistry.registerItem(AbsoptionStickTier3, "Stick of Absorption Tier 3");
				GameRegistry.registerItem(AbsoptionStickTier4, "Stick of Absorption Tier 4");
				GameRegistry.registerItem(AbsoptionStickTier5, "Stick of Absorption Tier 5");
				GameRegistry.registerItem(MagicStickTier1, "Magic Stick Tier 1");
				GameRegistry.registerItem(MagicStickTier2, "Magic Stick Tier 2");
				GameRegistry.registerItem(MagicStickTier3, "Magic Stick Tier 3");
				GameRegistry.registerItem(MagicStickTier4, "Magic Stick Tier 4");
				GameRegistry.registerItem(MagicStickTier5, "Magic Stick Tier 5");
				GameRegistry.registerItem(PotionEssenceTier1, "Weak Potion Essence");
				GameRegistry.registerItem(PotionEssenceTier2, "Normal Potion Essence");
				GameRegistry.registerItem(PotionEssenceTier3, "Strong Potion Essence");
				GameRegistry.registerItem(InvisibilityStick, "Stick of Invisibility");
			//LangReg
				LanguageRegistry.addName(IngotCopper, "Copper Ingot");
				LanguageRegistry.addName(IngotCobalt, "Cobalt Ingot");
				LanguageRegistry.addName(IngotLead, "Lead Ingot");
				LanguageRegistry.addName(IngotPlatinum, "Platinum Ingot");
				LanguageRegistry.addName(IngotTin, "Tin Ingot");
				LanguageRegistry.addName(NuggetCopper, "Copper Nugget");
				LanguageRegistry.addName(NuggetCobalt, "Cobalt Nugget");
				LanguageRegistry.addName(NuggetLead, "Lead Nugget");
				LanguageRegistry.addName(NuggetPlatinum, "Platinum Nugget");
				LanguageRegistry.addName(NuggetTin, "Tin Nugget");
				LanguageRegistry.addName(FeedingStick, "Stick of Feeding Tier 1");
				LanguageRegistry.addName(FeedingStickTier2, "Stick of Feeding Tier 2");
				LanguageRegistry.addName(FeedingStickTier3, "Stick of Feeding Tier 3");
				LanguageRegistry.addName(FeedingStickTier4, "Stick of Feeding Tier 4");
				LanguageRegistry.addName(FeedingStickTier5, "Stick of Feeding Tier 5");
				LanguageRegistry.addName(AbsoptionStick, "Stick of Absorption Tier 1");
				LanguageRegistry.addName(AbsoptionStickTier2, "Stick of Absorption Tier 2");
				LanguageRegistry.addName(AbsoptionStickTier3, "Stick of Absorption Tier 3");
				LanguageRegistry.addName(AbsoptionStickTier4, "Stick of Absorption Tier 4");
				LanguageRegistry.addName(AbsoptionStickTier5, "Stick of Absorption Tier 5");
				LanguageRegistry.addName(MagicStickTier1, "Stick of Magic Tier 1");
				LanguageRegistry.addName(MagicStickTier2, "Stick of Magic Tier 2");
				LanguageRegistry.addName(MagicStickTier3, "Stick of Magic Tier 3");
				LanguageRegistry.addName(MagicStickTier4, "Stick of Magic Tier 4");
				LanguageRegistry.addName(MagicStickTier5, "Stick of Magic Tier 5");
				LanguageRegistry.addName(PotionEssenceTier1, "Weak Potion Essence");
				LanguageRegistry.addName(PotionEssenceTier2, "Normal Potion Essence");
				LanguageRegistry.addName(PotionEssenceTier3, "Strong Potion Essence");
				LanguageRegistry.addName(InvisibilityStick, "Stick of Invisibility");
		//Worldgen Registry
				GameRegistry.registerWorldGenerator(worldgenCopper, 0);
				
		//Recipe Registry
				//Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(Items.blaze_rod, 1), Items.blaze_powder, Items.blaze_powder);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotCopper, 1), NuggetCopper, NuggetCopper, NuggetCopper, NuggetCopper, NuggetCopper, NuggetCopper, NuggetCopper, NuggetCopper, NuggetCopper);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotCobalt, 1), NuggetCobalt, NuggetCobalt, NuggetCobalt, NuggetCobalt, NuggetCobalt, NuggetCobalt, NuggetCobalt, NuggetCobalt, NuggetCobalt);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotLead, 1), NuggetLead, NuggetLead, NuggetLead, NuggetLead, NuggetLead, NuggetLead, NuggetLead, NuggetLead, NuggetLead);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotPlatinum, 1), NuggetPlatinum, NuggetPlatinum, NuggetPlatinum, NuggetPlatinum, NuggetPlatinum, NuggetPlatinum, NuggetPlatinum, NuggetPlatinum, NuggetPlatinum);
		GameRegistry.addShapelessRecipe(new ItemStack(IngotTin, 1), NuggetTin, NuggetTin, NuggetTin, NuggetTin, NuggetTin, NuggetTin, NuggetTin, NuggetTin, NuggetTin);
		GameRegistry.addShapelessRecipe(new ItemStack(NuggetCopper, 9), IngotCopper);
		GameRegistry.addShapelessRecipe(new ItemStack(NuggetCobalt, 9), IngotCobalt);
		GameRegistry.addShapelessRecipe(new ItemStack(NuggetLead, 9), IngotLead);
		GameRegistry.addShapelessRecipe(new ItemStack(NuggetPlatinum, 9), IngotPlatinum);
		GameRegistry.addShapelessRecipe(new ItemStack(NuggetTin, 9), IngotTin);
		GameRegistry.addShapelessRecipe(new ItemStack(PotionEssenceTier2, 1), PotionEssenceTier1, PotionEssenceTier1, PotionEssenceTier1, PotionEssenceTier1, PotionEssenceTier1, PotionEssenceTier1, PotionEssenceTier1, PotionEssenceTier1, PotionEssenceTier1);
		GameRegistry.addShapelessRecipe(new ItemStack(PotionEssenceTier3, 1), PotionEssenceTier2, PotionEssenceTier2, PotionEssenceTier2, PotionEssenceTier2, PotionEssenceTier2, PotionEssenceTier2, PotionEssenceTier2, PotionEssenceTier2, PotionEssenceTier2);
		
	}
	
}
