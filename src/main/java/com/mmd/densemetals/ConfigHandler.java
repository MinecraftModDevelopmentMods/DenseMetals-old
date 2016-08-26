package com.mmd.densemetals;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler {

	public static Configuration config;

	private static final String comments = Main.MODNAME + " Config\n For Nether Metals \n"
			+ " For Nether Metals " + Main.VERSION;
	
	private static final String orespawnProbComment = "Spawn Probability\nSet to zero to disable ore spawning of this type";

	
	private static  int denseironoreSpawnProb = 0;
	private static  int densediamondoreSpawnProb = 0;
	private static  int denseredstoneoreSpawnProb = 0;
	private static  int densegoldoreSpawnProb = 0;
	private static  int denseemeraldoreSpawnProb = 0;
	private static  int densecoaloreSpawnProb = 0;
	private static  int denselapisoreSpawnProb = 0;


	public static void startConfig(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());
		config.load(); // only need to load config once during pre initializeSoundEvents
		updateConfigInfo();
	}

	public static void updateConfigInfo()
	{
		try {
			config.addCustomCategoryComment(Configuration.CATEGORY_GENERAL, comments);


			
			
			




			denseironoreSpawnProb = config.get(Configuration.CATEGORY_GENERAL, "denseIronOreSpawnProb", 14, orespawnProbComment).getInt();
			densediamondoreSpawnProb = config.get(Configuration.CATEGORY_GENERAL, "denseDiamondOreSpawnProb", 5, orespawnProbComment).getInt();
			denseredstoneoreSpawnProb = config.get(Configuration.CATEGORY_GENERAL, "denseRedstoneOreSpawnProb", 12, orespawnProbComment).getInt();
			denselapisoreSpawnProb = config.get(Configuration.CATEGORY_GENERAL, "denseLapisOreSpawnProb", 8, orespawnProbComment).getInt();
			denseemeraldoreSpawnProb = config.get(Configuration.CATEGORY_GENERAL, "denseEmeraldOreSpawnProb", 5, orespawnProbComment).getInt();
			densegoldoreSpawnProb = config.get(Configuration.CATEGORY_GENERAL, "denseGoldOreSpawnProb", 8, orespawnProbComment).getInt();
			densecoaloreSpawnProb = config.get(Configuration.CATEGORY_GENERAL, "denseCoalOreSpawnProb", 16, orespawnProbComment).getInt();

			

			config.get(Configuration.CATEGORY_GENERAL, "denseIronOreSpawnProb", 14, orespawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "denseDiamondOreSpawnProb", 5, orespawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "denseRedstoneOreSpawnProb", 12, orespawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "denseEmeraldOreSpawnProb", 5, orespawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "denseGoldOreSpawnProb", 8, orespawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "denseLapisOreSpawnProb", 8, orespawnProbComment).getInt();
			config.get(Configuration.CATEGORY_GENERAL, "denseCoalOreSpawnProb", 16, orespawnProbComment).getInt();

			
			
			
			
			
			
			

		} catch (Exception e) {
			Main.proxy.info("failed to load or read the config file");
		} finally {
			if (config.hasChanged()) {
				config.save();
			}
		}
	}




	public static int getdenseIronOreSpawnProb()
	{
		return denseironoreSpawnProb;
		
	}

	public static int getdenseDiamondOreSpawnProb()
	{
		return densediamondoreSpawnProb;
		
	}

	public static int getdenseGoldOreSpawnProb()
	{
		return densegoldoreSpawnProb;
		
	}

	public static int getdenseCoalOreSpawnProb()
	{
		return densecoaloreSpawnProb;
		
	}

	public static int getdenseEmeraldOreSpawnProb()
	{
		return denseemeraldoreSpawnProb;
		
	}

	public static int getdenseRedstoneOreSpawnProb()
	{
		return denseredstoneoreSpawnProb;
		
	}

	public static int getdenseLapisOreSpawnProb()
	{
		return denselapisoreSpawnProb;
		
	}

}
