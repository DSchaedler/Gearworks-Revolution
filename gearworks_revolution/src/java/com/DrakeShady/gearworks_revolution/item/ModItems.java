package com.DrakeShady.gearworks_revolution.item;

import com.DrakeShady.gearworks_revolution.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {
	
	public static final CreativeTabs tabGearworksRevolution = new CreativeTabs("gearworks_revolution") {
		@Override public Item getTabIconItem() {
			return ModItems.woodGear;
		}
	};

	public static Item woodGear;
	
	public static final void init() {
		woodGear = new Item().setUnlocalizedName("woodGear").setCreativeTab(ModItems.tabGearworksRevolution).setTextureName(Main.MODID + ":woodGear");
		GameRegistry.registerItem(woodGear, "woodGear");
	}
}