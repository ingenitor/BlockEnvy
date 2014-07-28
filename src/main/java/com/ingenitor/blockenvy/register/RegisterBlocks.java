/**
 * 
 */
package com.ingenitor.blockenvy.register;

import net.minecraft.block.material.Material;

import com.ingenitor.blockenvy.reference.Identity;
import com.ingenitor.blockenvy.block.BlockAndesite;
import com.ingenitor.blockenvy.block.BlockAndesitePolished;
import com.ingenitor.blockenvy.block.BlockDiorite;
import com.ingenitor.blockenvy.block.BlockDioritePolished;
import com.ingenitor.blockenvy.block.BlockGranite;
import com.ingenitor.blockenvy.block.BlockGranitePolished;
import com.ingenitor.blockenvy.block.TBlock;

//import com.ingenitor.blockenvy.block.TBlockSlab;
//import com.ingenitor.blockenvy.block.BlockDioritePolishedSlab;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author ingenitor
 *
 */

@GameRegistry.ObjectHolder(Identity.MOD_ID)
public class RegisterBlocks {
	public static final TBlock stone_diorite = new BlockDiorite();
	public static final TBlock stone_andesite = new BlockAndesite();
	public static final TBlock stone_granite = new BlockGranite();
	
	public static final TBlock stone_diorite_smooth = new BlockDioritePolished();
	public static final TBlock stone_andesite_smooth = new BlockAndesitePolished();
	public static final TBlock stone_granite_smooth = new BlockGranitePolished();
	
	//public static final TBlockSlab stone_diorite_smooth_slab = new BlockDioritePolishedSlab(false, Material.rock);
	//public static final TBlockSlab double_stone_diorite_smooth_slab = new BlockDioritePolishedSlab(true, Material.rock);
	
	public static void register() {
		GameRegistry.registerBlock(stone_diorite, "stone_diorite");
		GameRegistry.registerBlock(stone_andesite, "stone_andesite");
		GameRegistry.registerBlock(stone_granite, "stone_granite");
		
		GameRegistry.registerBlock(stone_diorite_smooth, "stone_diorite_smooth");
		GameRegistry.registerBlock(stone_andesite_smooth, "stone_andesite_smooth");
		GameRegistry.registerBlock(stone_granite_smooth, "stone_granite_smooth");
		
		//GameRegistry.registerBlock(stone_diorite_smooth_slab, "stone_diorite_smooth_slab");
		//GameRegistry.registerBlock(double_stone_diorite_smooth_slab, "double_stone_diorite_smooth_slab");
	}
}
