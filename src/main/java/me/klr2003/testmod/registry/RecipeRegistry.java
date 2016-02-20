package me.klr2003.testmod.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeRegistry {
	public static void Recipes()
	{
		GameRegistry.addRecipe(new ItemStack(Blocks.dragon_egg),
				" A ",
				"ABA",
				"AAA",
				'A', Blocks.obsidian, 'B', Items.ender_eye);
	}
}
