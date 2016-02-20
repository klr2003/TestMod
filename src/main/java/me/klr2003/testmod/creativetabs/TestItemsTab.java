package me.klr2003.testmod.creativetabs;

import me.klr2003.testmod.registry.ItemRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TestItemsTab extends CreativeTabs{

	public TestItemsTab(String label) 
	{
		super(label);
	}

	@Override
	public Item getTabIconItem() 
	{
		return ItemRegistry.test_item;
	}

	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "testblocktab.png";
	}
	
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	
}
