package com.mmd.densemetals.world;

import java.util.Random;

import com.mmd.densemetals.ConfigHandler;
import com.mmd.densemetals.blocks.ModBlocks;


import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {

	private WorldGenerator gen_dense_coal_ore;			// Generates Coal Ore (used in Nether)
	private WorldGenerator gen_dense_diamond_ore;		// Generates Diamond Ore (used in Nether)
	private WorldGenerator gen_dense_emerald_ore;		// Generates Emerald Ore (used in Nether)
	private WorldGenerator gen_dense_gold_ore;			// Generates Gold Ore (used in Nether)
	private WorldGenerator gen_dense_iron_ore;			// Generates Iron Ore (used in Nether)
	private WorldGenerator gen_dense_lapis_ore;		// Generates Lapis Ore (used in Nether)
	private WorldGenerator gen_dense_redstone_ore;		// Generates Redstone Ore (used in Nether)



	public WorldGen() {

		//@Vanilla Ores
		this.gen_dense_coal_ore = new WorldGenMinable(ModBlocks.densecoalOre.getDefaultState(), ConfigHandler.getdenseCoalOreSpawnProb(), BlockHelper.forBlock(Blocks.stone));
		this.gen_dense_diamond_ore = new WorldGenMinable(ModBlocks.densediamondOre.getDefaultState(), ConfigHandler.getdenseDiamondOreSpawnProb(), BlockHelper.forBlock(Blocks.stone));
		this.gen_dense_emerald_ore = new WorldGenMinable(ModBlocks.denseemeraldOre.getDefaultState(), ConfigHandler.getdenseEmeraldOreSpawnProb(), BlockHelper.forBlock(Blocks.stone));
		this.gen_dense_gold_ore = new WorldGenMinable(ModBlocks.densegoldOre.getDefaultState(), ConfigHandler.getdenseGoldOreSpawnProb(), BlockHelper.forBlock(Blocks.stone));
		this.gen_dense_iron_ore = new WorldGenMinable(ModBlocks.denseironOre.getDefaultState(), ConfigHandler.getdenseIronOreSpawnProb(), BlockHelper.forBlock(Blocks.stone));
		this.gen_dense_lapis_ore = new WorldGenMinable(ModBlocks.denselapisOre.getDefaultState(), ConfigHandler.getdenseLapisOreSpawnProb(), BlockHelper.forBlock(Blocks.stone));
		this.gen_dense_redstone_ore = new WorldGenMinable(ModBlocks.denseredstoneOre.getDefaultState(), ConfigHandler.getdenseRedstoneOreSpawnProb(), BlockHelper.forBlock(Blocks.stone));
	    

	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: // Overworld
			this.runGenerator(this.gen_dense_coal_ore, world, random, chunkX, chunkZ, 5, 0, 200);
			this.runGenerator(this.gen_dense_diamond_ore, world, random, chunkX, chunkZ, 5, 0, 200);
			this.runGenerator(this.gen_dense_emerald_ore, world, random, chunkX, chunkZ, 5, 0, 200);
			this.runGenerator(this.gen_dense_gold_ore, world, random, chunkX, chunkZ, 5, 0, 200);
			this.runGenerator(this.gen_dense_iron_ore, world, random, chunkX, chunkZ, 5, 0, 200);
			this.runGenerator(this.gen_dense_lapis_ore, world, random, chunkX, chunkZ, 5, 0, 200);
			this.runGenerator(this.gen_dense_redstone_ore, world, random, chunkX, chunkZ, 5, 0, 200);

			break;
		case -1: // Nether

			break;
		case 1: // End
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
}
