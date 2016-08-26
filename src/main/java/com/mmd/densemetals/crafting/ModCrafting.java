package com.mmd.densemetals.crafting;

import com.mmd.densemetals.blocks.ModBlocks;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModCrafting {

	public static void initCrafting() {
		// Vanilla
		GameRegistry.addSmelting(ModBlocks.densecoalOre, new ItemStack(Blocks.coal_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.densediamondOre, new ItemStack(Blocks.diamond_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.denseemeraldOre, new ItemStack(Blocks.emerald_ore, 2), 1.0f); 
		GameRegistry.addSmelting(ModBlocks.densegoldOre, new ItemStack(Blocks.gold_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.denseironOre, new ItemStack(Blocks.iron_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.denselapisOre, new ItemStack(Blocks.lapis_ore, 2), 1.0f);
		GameRegistry.addSmelting(ModBlocks.denseredstoneOre, new ItemStack(Blocks.redstone_ore, 2), 1.0f);

		// Base Metals
		if(Loader.isModLoaded("basemetals")) {
//			GameRegistry.addSmelting(ModBlocks.denseantimonyOre, new ItemStack(BmBlocks.antimony_ore, 2), 1.0f);	// Not supported in BM 1.8.0
//			GameRegistry.addSmelting(ModBlocks.densebismuthOre, new ItemStack(BmBlocks.bismuth_ore, 2), 1.0f);		// Not supported in BM 1.8.0
			GameRegistry.addSmelting(ModBlocks.densecopperOre, new ItemStack(BmBlocks.copper_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.denseleadOre, new ItemStack(BmBlocks.lead_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densemercuryOre, new ItemStack(BmBlocks.mercury_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densenickelOre, new ItemStack(BmBlocks.nickel_ore, 2), 1.0f);
//			GameRegistry.addSmelting(ModBlocks.denseplatinumOre, new ItemStack(BmBlocks.platinum_ore, 2), 1.0f);	// Not supported in BM 1.8.0
			GameRegistry.addSmelting(ModBlocks.densesilverOre, new ItemStack(BmBlocks.silver_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densetinOre, new ItemStack(BmBlocks.tin_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densezincOre, new ItemStack(BmBlocks.zinc_ore, 2), 1.0f);
		}

		// TODO: Modern Metals
		if(Loader.isModLoaded("modernmetals")) {
			GameRegistry.addSmelting(ModBlocks.densealuminumOre, new ItemStack(MmBlocks.aluminum_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densecadmiumOre, new ItemStack(MmBlocks.cadmium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densechromiumOre, new ItemStack(MmBlocks.chromium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.denseiridiumOre, new ItemStack(MmBlocks.iridium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densemagnesiumOre, new ItemStack(MmBlocks.magnesium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densemanganeseOre, new ItemStack(MmBlocks.manganese_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.denseosmiumOre, new ItemStack(MmBlocks.osmium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.denseplutoniumOre, new ItemStack(MmBlocks.plutonium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.denserutileOre, new ItemStack(MmBlocks.rutile_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densetantalumOre, new ItemStack(MmBlocks.tantalum_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densetitaniumOre, new ItemStack(MmBlocks.titanium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densetungstenOre, new ItemStack(MmBlocks.tungsten_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.denseuraniumOre, new ItemStack(MmBlocks.uranium_ore, 2), 1.0f);
			GameRegistry.addSmelting(ModBlocks.densezirconiumOre, new ItemStack(MmBlocks.zirconium_ore, 2), 1.0f);
		}
	}
}
