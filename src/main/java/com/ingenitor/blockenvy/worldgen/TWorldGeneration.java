/**
 * 
 */
package com.ingenitor.blockenvy.worldgen;

import java.util.Random;

import com.ingenitor.blockenvy.BlockEnvy;
import com.ingenitor.blockenvy.register.RegisterBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * @author ingenitor
 *
 */
public class TWorldGeneration implements IWorldGenerator {

	/* (non-Javadoc)
	 * @see cpw.mods.fml.common.IWorldGenerator#generate(java.util.Random, int, int, net.minecraft.world.World, net.minecraft.world.chunk.IChunkProvider, net.minecraft.world.chunk.IChunkProvider)
	 */
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
			case  0 :
				//Generate overworld
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case -1 :
				//Generate Nether
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;
			case  1 :
				//Generate The End
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
		
	}
	
	private void generateSurface(World world, Random random, int x, int z) {
		
		if( BlockEnvy.instance.config.dioriteGen ) {
			this.addOreSpawn( RegisterBlocks.stone_diorite, world, random, x, z, 16, 16, 10+random.nextInt(6), 15, 1, 111);
		}
		
		if( BlockEnvy.instance.config.andesiteGen ) {
			this.addOreSpawn(RegisterBlocks.stone_andesite, world, random, x, z, 16, 16, 10+random.nextInt(6), 15, 1, 111);
		}
		
		if( BlockEnvy.instance.config.graniteGen ) {
			this.addOreSpawn( RegisterBlocks.stone_granite, world, random, x, z, 16, 16, 10+random.nextInt(6), 15, 1, 111);
		}		
	}
	
	private void generateNether(World world, Random random, int i, int j) {
		// TODO 		
	}

	private void generateEnd(World world, Random random, int i, int j) {
		// TODO 
	}
	
	/**
	 * @method addOreSpawn
	 * 
	 * @param Block block
	 * @param World world
	 * @param Random random
	 * @param int blockXPos
	 * @param int blockZpos
	 * @param int maxX
	 * @param int maxZ
	 * @param int maxVeinSize
	 * @param int attemptsToSpawn
	 * @param int minY
	 * @param int maxY
	 */
	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int attemptsToSpawn, int minY, int maxY) {
		for(int i = 0; i < attemptsToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY =      minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}

}
