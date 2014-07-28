/**
 * 
 */
package com.ingenitor.blockenvy.register;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author ingenitor
 *
 */
public class RegisterRecipes {

	/**
	 * 
	 */
	public static void register() {
		
		
		GameRegistry.addRecipe(
			new ShapedOreRecipe(
				new ItemStack(RegisterBlocks.stone_diorite, 2), //output
				"cs",
				"sc",
				'c', "cobblestone",
				's', "stone"
			)
		);

		GameRegistry.addRecipe(
				new ShapedOreRecipe(
					new ItemStack(Blocks.stone_slab, 6), //output
					"ddd",
					'd', new ItemStack(RegisterBlocks.stone_diorite)
				)
			);
		
		/*
		GameRegistry.addRecipe(
			new ShapelessOreRecipe(
				new ItemStack(RegisterBlocks.stone_diorite), //output
				"cobblestone", "cobblestone", // inputs
				"stone", "stone"  // inputs
			)
		);
		*/
	}

}
