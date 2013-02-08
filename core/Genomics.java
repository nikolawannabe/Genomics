package Genomics.core;

//This Import list will grow longer with each additional tutorial.
//It's not pruned between full class postings, unlike other tutorial code.
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraftforge.common.Configuration;

@Mod(modid="Genomics", name="Genomics", version="0.0.0",dependencies = "required-after:IC2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Genomics {
		private final static Item resistantSeeds = new GenericItem(31234).setIconIndex(0);
		

		private final static Item shinySeeds = new GenericItem(31235).setIconIndex(5);
		
		public final static Block plantedDirt = new GenericBlock(500, 1, 1, Material.ground)
        .setHardness(0.5F).setStepSound(Block.soundGravelFootstep)
        .setBlockName("shinydirt").setCreativeTab(CreativeTabs.tabBlock);
		
		
		
		public final static Block shinyBlossom = new GenericBlock(501, 2, 1, Material.ground)
        .setHardness(0.5F).setStepSound(Block.soundGrassFootstep)
        .setBlockName("shinyBlossom").setCreativeTab(CreativeTabs.tabMisc).setLightValue(100F);
		
		public final static Block littleShinyBlossoms = new GenericBlock(502, 3, 6, Material.ground)
        .setHardness(0.5F).setStepSound(Block.soundGrassFootstep)
        .setBlockName("shinyBlossom").setCreativeTab(CreativeTabs.tabMisc).setLightValue(100F);
		
		// The instance of your mod that Forge uses.
        @Instance("Generic")
        public static Genomics instance;
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="tutorial.generic.client.ClientProxy", serverSide="tutorial.generic.CommonProxy")
        public static CommonProxy proxy;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
        		// from https://gist.github.com/3346257
        		//int whitelumar = 1256;
                proxy.registerRenderers();

                GameRegistry.registerBlock(plantedDirt, "plantedDirt");
        		LanguageRegistry.addName(plantedDirt, "Planted Dirt");
        		
        		GameRegistry.registerBlock(shinyBlossom, "shinyBlossom");
        		LanguageRegistry.addName(shinyBlossom, "Shiny Blossom");
        		
        		GameRegistry.registerBlock(littleShinyBlossoms, "littleShinyBlossoms");
        		LanguageRegistry.addName(littleShinyBlossoms, "Little Shiny Blossoms");
                
        		LanguageRegistry.addName(resistantSeeds, "Resistant Seeds");
        		ItemStack lumar = new ItemStack(Item.appleRed);
        		
                GameRegistry.addShapelessRecipe(new ItemStack(resistantSeeds), new ItemStack(Item.seeds), new ItemStack(Item.coal));

                GameRegistry.addShapelessRecipe(new ItemStack(shinySeeds), new ItemStack(Item.seeds), lumar);
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}