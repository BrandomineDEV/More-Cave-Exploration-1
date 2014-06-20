package com.brandomine.mcemod.world;

import java.util.Random;

import com.brandomine.mcemod.mceMod;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreCopperWG implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0 : 
			generateInOverworld(world, random, chunkX*16, chunkZ*16);
			break;
	}
		
}

	public void generateInOverworld(World world, Random random, int x, int z) {
		//copper
		for(int i = 0; i < 26; i++) {
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(64);
			int Zcoords = z + random.nextInt(16);
			
			(new WorldGenMinable(mceMod.oreCopper, 8)).generate(world, random, Xcoords, Ycoords, Zcoords);
		}
		//Lead
		for(int i = 0; i < 26; i++) {
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(64);
			int Zcoords = z + random.nextInt(16);
			
			(new WorldGenMinable(mceMod.oreLead, 8)).generate(world, random, Xcoords, Ycoords, Zcoords);
		}
		for(int i = 0; i < 3; i++) {
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(64);
			int Zcoords = z + random.nextInt(16);
			
			(new WorldGenMinable(mceMod.orePlatinum, 3)).generate(world, random, Xcoords, Ycoords, Zcoords);
		}
		for(int i = 0; i < 24; i++) {
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(64);
			int Zcoords = z + random.nextInt(16);
			
			(new WorldGenMinable(mceMod.oreTin, 8)).generate(world, random, Xcoords, Ycoords, Zcoords);
		}
		for(int i = 0; i < 1; i++) {
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(64);
			int Zcoords = z + random.nextInt(16);
			
			(new WorldGenMinable(mceMod.oreCobalt, 1)).generate(world, random, Xcoords, Ycoords, Zcoords);
		}
	}
}
