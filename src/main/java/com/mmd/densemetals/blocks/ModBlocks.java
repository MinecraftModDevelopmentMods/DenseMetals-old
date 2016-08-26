package com.mmd.densemetals.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {

	public static Block densecoalOre;
	public static Block densediamondOre;
	public static Block denseemeraldOre;
	public static Block densegoldOre;
	public static Block denseironOre;
	public static Block denselapisOre;
	public static Block denseredstoneOre;

	public static Block denseantimonyOre;
	public static Block densebismuthOre;
	public static Block densecopperOre;
	public static Block denseleadOre;
	public static Block densemercuryOre;
	public static Block densenickelOre;
	public static Block denseplatinumOre;
	public static Block densesilverOre;
	public static Block densetinOre;
	public static Block densezincOre;

	public static Block densealuminumOre;
	public static Block densecadmiumOre;
	public static Block densechromiumOre;
	public static Block denseiridiumOre;
	public static Block densemagnesiumOre;
	public static Block densemanganeseOre;
	public static Block denseosmiumOre;
	public static Block denseplutoniumOre;
	public static Block denserutileOre;
	public static Block densetantalumOre;
	public static Block densetitaniumOre;
	public static Block densetungstenOre;
	public static Block denseuraniumOre;
	public static Block densezirconiumOre;

	public static void createBlocks() {

		// Vanilla
		GameRegistry.registerBlock(densecoalOre = new ModBlockOre("dense_coal_ore", Material.rock, ModBlocks.densecoalOre, 1, 1), "dense_coal_ore");
		GameRegistry.registerBlock(densediamondOre = new ModBlockOre3("dense_diamond_ore", Material.rock, ModBlocks.densediamondOre, 1, 1), "dense_diamond_ore");
		GameRegistry.registerBlock(denseemeraldOre = new ModBlockOre("dense_emerald_ore", Material.rock, ModBlocks.denseemeraldOre, 1, 1), "dense_emerald_ore");
		GameRegistry.registerBlock(densegoldOre = new ModBlockOre2("dense_gold_ore", Material.rock, ModBlocks.densegoldOre, 1, 1), "dense_gold_ore");
		GameRegistry.registerBlock(denseironOre = new ModBlockOre("dense_iron_ore", Material.rock, ModBlocks.denseironOre, 1, 1), "dense_iron_ore");
		GameRegistry.registerBlock(denselapisOre = new ModBlockOre("dense_lapis_ore", Material.rock, ModBlocks.denselapisOre, 1, 1), "dense_lapis_ore");
		GameRegistry.registerBlock(denseredstoneOre = new ModBlockOre("dense_redstone_ore", Material.rock, ModBlocks.denseredstoneOre, 1, 1), "dense_redstone_ore");

		// Base Metals
		GameRegistry.registerBlock(denseantimonyOre = new ModBlockOre("dense_antimony_ore", Material.rock, ModBlocks.denseantimonyOre, 1, 1), "dense_antimony_ore");
		GameRegistry.registerBlock(densebismuthOre = new ModBlockOre("dense_bismuth_ore", Material.rock, ModBlocks.densebismuthOre, 1, 1), "dense_bismuth_ore");
		GameRegistry.registerBlock(densecopperOre = new ModBlockOre("dense_copper_ore", Material.rock, ModBlocks.densecopperOre, 1, 1), "dense_copper_ore");
		GameRegistry.registerBlock(denseleadOre = new ModBlockOre("dense_lead_ore", Material.rock, ModBlocks.denseleadOre, 1, 1), "dense_lead_ore");
		GameRegistry.registerBlock(densemercuryOre = new ModBlockOre("dense_mercury_ore", Material.rock, ModBlocks.densemercuryOre, 1, 1), "dense_mercury_ore");
		GameRegistry.registerBlock(densenickelOre = new ModBlockOre("dense_nickel_ore", Material.rock, ModBlocks.densenickelOre, 1, 1), "dense_nickel_ore");
		GameRegistry.registerBlock(denseplatinumOre = new ModBlockOre("dense_platinum_ore", Material.rock, ModBlocks.denseplatinumOre, 1, 1), "dense_platinum_ore");
		GameRegistry.registerBlock(densesilverOre = new ModBlockOre2("dense_silver_ore", Material.rock, ModBlocks.densesilverOre, 1, 1), "dense_silver_ore");
		GameRegistry.registerBlock(densetinOre = new ModBlockOre("dense_tin_ore", Material.rock, ModBlocks.densetinOre, 1, 1), "dense_tin_ore");
		GameRegistry.registerBlock(densezincOre = new ModBlockOre("dense_zinc_ore", Material.rock, ModBlocks.densezincOre, 1, 1), "dense_zinc_ore");

		// Modern Metals
		GameRegistry.registerBlock(densealuminumOre = new ModBlockOre("dense_aluminum_ore", Material.rock, ModBlocks.densealuminumOre, 1, 1), "dense_aluminum_ore");
		GameRegistry.registerBlock(densecadmiumOre = new ModBlockOre("dense_cadmium_ore", Material.rock, ModBlocks.densecadmiumOre, 1, 1), "dense_cadmium_ore");
		GameRegistry.registerBlock(densechromiumOre = new ModBlockOre("dense_chromium_ore", Material.rock, ModBlocks.densechromiumOre, 1, 1), "dense_chromium_ore");
		GameRegistry.registerBlock(denseiridiumOre = new ModBlockOre("dense_iridium_ore", Material.rock, ModBlocks.denseiridiumOre, 1, 1), "dense_iridium_ore");
		GameRegistry.registerBlock(densemagnesiumOre = new ModBlockOre("dense_magnesium_ore", Material.rock, ModBlocks.densemagnesiumOre, 1, 1), "dense_magnesium_ore");
		GameRegistry.registerBlock(densemanganeseOre = new ModBlockOre("dense_manganese_ore", Material.rock, ModBlocks.densemanganeseOre, 1, 1), "dense_manganese_ore");
		GameRegistry.registerBlock(denseosmiumOre = new ModBlockOre("dense_osmium_ore", Material.rock, ModBlocks.denseosmiumOre, 1, 1), "dense_osmium_ore");
		GameRegistry.registerBlock(denseplutoniumOre = new ModBlockOre("dense_plutonium_ore", Material.rock, ModBlocks.denseplutoniumOre, 1, 1), "dense_plutonium_ore");
		GameRegistry.registerBlock(denserutileOre = new ModBlockOre("dense_rutile_ore", Material.rock, ModBlocks.denserutileOre, 1, 1), "dense_rutile_ore");
		GameRegistry.registerBlock(densetantalumOre = new ModBlockOre("dense_tantalum_ore", Material.rock, ModBlocks.densetantalumOre, 1, 1), "dense_tantalum_ore");
		GameRegistry.registerBlock(densetitaniumOre = new ModBlockOre("dense_titanium_ore", Material.rock, ModBlocks.densetitaniumOre, 1, 1), "dense_titanium_ore");
		GameRegistry.registerBlock(densetungstenOre = new ModBlockOre("dense_tungsten_ore", Material.rock, ModBlocks.densetungstenOre, 1, 1), "dense_tungsten_ore");
		GameRegistry.registerBlock(denseuraniumOre = new ModBlockOre("dense_uranium_ore", Material.rock, ModBlocks.denseuraniumOre, 1, 1), "dense_uranium_ore");
		GameRegistry.registerBlock(densezirconiumOre = new ModBlockOre("dense_zirconium_ore", Material.rock, ModBlocks.densezirconiumOre, 1, 1), "dense_zirconium_ore");
	}
}
