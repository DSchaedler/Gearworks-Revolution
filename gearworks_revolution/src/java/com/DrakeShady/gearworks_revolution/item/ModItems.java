package com.DrakeShady.gearworks_revolution.item;

import com.DrakeShady.gearworks_revolution.Main;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public final class ModItems {
	
	public static final CreativeTabs tabGearworksRevolution = new CreativeTabs("gearworks_revolution") {
		@Override public Item getTabIconItem() {
			return ModItems.woodGear;
		}
	};


	public static Item woodGearBlank;
	public static Item woodGearForm;
	public static Item woodGear;
	
	public static final void init() {
		
		woodGearBlank = new Item().setUnlocalizedName("woodGearBlank").setCreativeTab(ModItems.tabGearworksRevolution).setTextureName(Main.MODID + ":woodGearBlank");
		GameRegistry.registerItem(woodGearBlank, "woodGearBlank");
		GameRegistry.addRecipe(new ItemStack(ModItems.woodGearBlank, 5), " # ", "###", " # ", '#', Blocks.planks);
		
		woodGearForm = new Item().setUnlocalizedName("woodGearForm").setCreativeTab(ModItems.tabGearworksRevolution).setTextureName(Main.MODID + ":woodGearForm");
		GameRegistry.registerItem(woodGearForm, "woodGearForm");
		
		woodGear = new Item().setUnlocalizedName("woodGear").setCreativeTab(ModItems.tabGearworksRevolution).setTextureName(Main.MODID + ":woodGear");
		GameRegistry.registerItem(woodGear, "woodGear");
				
	}
}