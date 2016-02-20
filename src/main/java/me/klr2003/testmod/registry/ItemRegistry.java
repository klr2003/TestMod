package me.klr2003.testmod.registry;

import me.klr2003.testmod.ModInfo;
import me.klr2003.testmod.TestModMain;
import me.klr2003.testmod.creativetabs.TestItemsTab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRegistry {
	public static Item test_item;
	
	public static void init()
	{
		test_item = new Item().setUnlocalizedName("test_item").setCreativeTab(TestModMain.tabTestItems);
	}
	public static void register()
	{
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
	}
	public static void registerRenders()
	{
		registerRender(test_item);
	}
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(ModInfo.ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
