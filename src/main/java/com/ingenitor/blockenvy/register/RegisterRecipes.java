/**
 * 
 */
package com.ingenitor.blockenvy.register;

import com.ingenitor.blockenvy.reference.Identity;

import net.minecraft.block.Block;
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
	public static final String[] listBlocks = new String[] {"diorite", "andesite", "granite", "", "", "", "claystone"};
	public static final String[] listBlocksPolished = new String[] {"diorite", "andesite", "granite", "netherrack", "obsidian", "ice_packed", "claystone"};

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
				new ItemStack(RegisterBlocks.stone_andesite, 2), //output
				"dc",
				'd', new ItemStack(RegisterBlocks.stone_diorite),
				'c', "cobblestone"
			)
		);
		GameRegistry.addRecipe(
			new ShapedOreRecipe(
				new ItemStack(RegisterBlocks.stone_andesite, 2), //output
				"dg",
				'd', new ItemStack(RegisterBlocks.stone_diorite),
				'g', "gravel"
			)
		);
		GameRegistry.addRecipe(
			new ShapedOreRecipe(
				new ItemStack(RegisterBlocks.stone_granite, 2), //output
				"dr",
				'd', new ItemStack(RegisterBlocks.stone_diorite),
				'r', "dirt"
			)
		);
		
		GameRegistry.addRecipe(
			new ItemStack(RegisterBlocks.stone_claystone, 2), //output
			new Object[] {
				"he",
				"eh",
				'h', Blocks.hardened_clay,
				'e', Blocks.end_stone
			}
		);
		for(int i = 0; i < listBlocksPolished.length; i++) {

			Block input_block = null;
			
			if( listBlocks[i] != "") {
				input_block = GameRegistry.findBlock(Identity.MOD_ID, "stone_" + listBlocks[i]);
			}

			Block smooth_block = GameRegistry.findBlock(Identity.MOD_ID, "stone_" + listBlocksPolished[i] + "_smooth");
			Block    slab_half = GameRegistry.findBlock(Identity.MOD_ID, "stone_" + listBlocksPolished[i] + "_smooth_slab");
			Block        stair = GameRegistry.findBlock(Identity.MOD_ID, "stone_" + listBlocksPolished[i] + "_smooth_stairs");
			
			if(smooth_block != null) {
				GameRegistry.addRecipe(
					new ShapedOreRecipe(
						new ItemStack(smooth_block, 4), //output
						"dd",
						"dd",
						'd', new ItemStack(input_block)
					)
				);

				if(slab_half != null) {
					GameRegistry.addRecipe(
						new ShapedOreRecipe(
							new ItemStack(slab_half, 6), //output
							"ddd",
							'd', new ItemStack(smooth_block)
						)
					);
				}
				if(stair != null) {
					GameRegistry.addRecipe(
						new ShapedOreRecipe(
							new ItemStack(stair, 4), //output
							"d  ",
							"dd ",
							"ddd",
							'd', new ItemStack(smooth_block)
						)
					);
				}
			}
		}
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
