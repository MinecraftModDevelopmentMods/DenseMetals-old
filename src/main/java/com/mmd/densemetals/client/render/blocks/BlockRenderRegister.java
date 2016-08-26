package com.mmd.densemetals.client.render.blocks;

import com.mmd.densemetals.Main;
import com.mmd.densemetals.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {

	public static void registerBlockRenderer() {

		// Vanilla
		reg(ModBlocks.densecoalOre);
		reg(ModBlocks.densediamondOre);
		reg(ModBlocks.denseemeraldOre);
		reg(ModBlocks.densegoldOre);
		reg(ModBlocks.denseironOre);
		reg(ModBlocks.denselapisOre);
		reg(ModBlocks.denseredstoneOre);

		// Base Metals
		reg(ModBlocks.denseantimonyOre);
		reg(ModBlocks.densebismuthOre);
		reg(ModBlocks.densecopperOre);
		reg(ModBlocks.denseleadOre);
		reg(ModBlocks.densemercuryOre);
		reg(ModBlocks.densenickelOre);
		reg(ModBlocks.denseplatinumOre);
		reg(ModBlocks.densesilverOre);
		reg(ModBlocks.densetinOre);
		reg(ModBlocks.densezincOre);

		// Modern Metals
		reg(ModBlocks.densealuminumOre);
		reg(ModBlocks.densecadmiumOre);
		reg(ModBlocks.densechromiumOre);
		reg(ModBlocks.denseiridiumOre);
		reg(ModBlocks.densemagnesiumOre);
		reg(ModBlocks.densemanganeseOre);
		reg(ModBlocks.denseosmiumOre);
		reg(ModBlocks.denseplutoniumOre);
		reg(ModBlocks.denserutileOre);
		reg(ModBlocks.densetantalumOre);
		reg(ModBlocks.densetitaniumOre);
		reg(ModBlocks.densetungstenOre);
		reg(ModBlocks.denseuraniumOre);
		reg(ModBlocks.densezirconiumOre);
	}

	public static String modid = Main.MODID;

	public static void reg(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
