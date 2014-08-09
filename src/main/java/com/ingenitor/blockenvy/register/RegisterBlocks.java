/**
 * 
 */
package com.ingenitor.blockenvy.register;

import net.minecraft.block.material.Material;

import com.ingenitor.blockenvy.reference.Identity;
import com.ingenitor.blockenvy.block.BlockAndesite;
import com.ingenitor.blockenvy.block.BlockAndesitePolished;
import com.ingenitor.blockenvy.block.BlockAndesitePolishedSlab;
import com.ingenitor.blockenvy.block.BlockAndesitePolishedStairs;
import com.ingenitor.blockenvy.block.BlockClaystone;
import com.ingenitor.blockenvy.block.BlockClaystonePolished;
import com.ingenitor.blockenvy.block.BlockClaystonePolishedSlab;
import com.ingenitor.blockenvy.block.BlockClaystonePolishedStairs;
import com.ingenitor.blockenvy.block.BlockDiorite;
import com.ingenitor.blockenvy.block.BlockDioritePolished;
import com.ingenitor.blockenvy.block.BlockDioritePolishedSlab;
import com.ingenitor.blockenvy.block.BlockDioritePolishedStairs;
import com.ingenitor.blockenvy.block.BlockGranite;
import com.ingenitor.blockenvy.block.BlockGranitePolished;
import com.ingenitor.blockenvy.block.BlockGranitePolishedSlab;
import com.ingenitor.blockenvy.block.BlockGranitePolishedStairs;
import com.ingenitor.blockenvy.block.BlockIcePackedPolishedSlab;
import com.ingenitor.blockenvy.block.BlockIcePackedPolishedStairs;
import com.ingenitor.blockenvy.block.BlockNetherrackPolishedSlab;
import com.ingenitor.blockenvy.block.BlockNetherrackPolishedStairs;
import com.ingenitor.blockenvy.block.BlockObsidianPolishedSlab;
import com.ingenitor.blockenvy.block.BlockObsidianPolishedStairs;
import com.ingenitor.blockenvy.block.BlockNetherrackPolished;
import com.ingenitor.blockenvy.block.BlockObsidianPolished;
import com.ingenitor.blockenvy.block.BlockIcePackedPolished;
import com.ingenitor.blockenvy.block.TBlock;
import com.ingenitor.blockenvy.block.TBlockPolishedStairs;
import com.ingenitor.blockenvy.block.TBlockSlab;
import com.ingenitor.blockenvy.block.TBlockPolishedSlab;

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
	public static final TBlock stone_claystone = new BlockClaystone();
	
	public static final TBlock stone_diorite_smooth = new BlockDioritePolished();
	public static final TBlock stone_andesite_smooth = new BlockAndesitePolished();
	public static final TBlock stone_granite_smooth = new BlockGranitePolished();
	public static final TBlock stone_netherrack_smooth = new BlockNetherrackPolished();
	public static final TBlock stone_obsidian_smooth = new BlockObsidianPolished();
	public static final TBlock stone_ice_packed_smooth = new BlockIcePackedPolished();
	public static final TBlock stone_claystone_smooth = new BlockClaystonePolished();

    public static final TBlockPolishedSlab stone_diorite_smooth_slab = new BlockDioritePolishedSlab(false);
    public static final TBlockPolishedSlab stone_diorite_smooth_double_slab = new BlockDioritePolishedSlab(true);  

    public static final TBlockPolishedSlab stone_andesite_smooth_slab = new BlockAndesitePolishedSlab(false);
    public static final TBlockPolishedSlab stone_andesite_smooth_double_slab = new BlockAndesitePolishedSlab(true);  

    public static final TBlockPolishedSlab stone_granite_smooth_slab = new BlockGranitePolishedSlab(false);
    public static final TBlockPolishedSlab stone_granite_smooth_double_slab = new BlockGranitePolishedSlab(true);  

    public static final TBlockPolishedSlab stone_netherrack_smooth_slab = new BlockNetherrackPolishedSlab(false);
    public static final TBlockPolishedSlab stone_netherrack_smooth_double_slab = new BlockNetherrackPolishedSlab(true);  

    public static final TBlockPolishedSlab stone_obsidian_smooth_slab = new BlockObsidianPolishedSlab(false);
    public static final TBlockPolishedSlab stone_obsidian_smooth_double_slab = new BlockObsidianPolishedSlab(true);  

    public static final TBlockPolishedSlab stone_ice_packed_smooth_slab = new BlockIcePackedPolishedSlab(false);
    public static final TBlockPolishedSlab stone_ice_packed_smooth_double_slab = new BlockIcePackedPolishedSlab(true);

    public static final TBlockPolishedSlab stone_claystone_smooth_slab = new BlockClaystonePolishedSlab(false);
    public static final TBlockPolishedSlab stone_claystone_smooth_double_slab = new BlockClaystonePolishedSlab(true);
    
    
    public static final TBlockPolishedStairs stone_diorite_smooth_stairs = new BlockDioritePolishedStairs();
    public static final TBlockPolishedStairs stone_andesite_smooth_stairs = new BlockAndesitePolishedStairs();
    public static final TBlockPolishedStairs stone_granite_smooth_stairs = new BlockGranitePolishedStairs();
    public static final TBlockPolishedStairs stone_netherrack_smooth_stairs = new BlockNetherrackPolishedStairs();
    public static final TBlockPolishedStairs stone_obsidian_smooth_stairs = new BlockObsidianPolishedStairs();
    public static final TBlockPolishedStairs stone_ice_packed_smooth_stairs = new BlockIcePackedPolishedStairs();
    public static final TBlockPolishedStairs stone_claystone_smooth_stairs = new BlockClaystonePolishedStairs();
    
	public static void register() {
		GameRegistry.registerBlock(stone_diorite, "stone_diorite");
		GameRegistry.registerBlock(stone_andesite, "stone_andesite");
		GameRegistry.registerBlock(stone_granite, "stone_granite");
		GameRegistry.registerBlock(stone_claystone, "stone_claystone");
		
		GameRegistry.registerBlock(stone_diorite_smooth, "stone_diorite_smooth");
		GameRegistry.registerBlock(stone_andesite_smooth, "stone_andesite_smooth");
		GameRegistry.registerBlock(stone_granite_smooth, "stone_granite_smooth");		
		GameRegistry.registerBlock(stone_netherrack_smooth, "stone_netherrack_smooth");
		GameRegistry.registerBlock(stone_obsidian_smooth, "stone_obsidian_smooth");
		GameRegistry.registerBlock(stone_ice_packed_smooth, "stone_ice_packed_smooth");
		GameRegistry.registerBlock(stone_claystone_smooth, "stone_claystone_smooth");

		stone_diorite_smooth_slab.register();
		stone_diorite_smooth_double_slab.register();		
		stone_andesite_smooth_slab.register();
		stone_andesite_smooth_double_slab.register();
		stone_granite_smooth_slab.register();
		stone_granite_smooth_double_slab.register();
		stone_netherrack_smooth_slab.register();
		stone_netherrack_smooth_double_slab.register();
		stone_obsidian_smooth_slab.register();
		stone_obsidian_smooth_double_slab.register();
		stone_ice_packed_smooth_slab.register();
		stone_ice_packed_smooth_double_slab.register();
		stone_claystone_smooth_slab.register();
		stone_claystone_smooth_double_slab.register();
		
		stone_diorite_smooth_stairs.register();
		stone_andesite_smooth_stairs.register();
		stone_granite_smooth_stairs.register();
		stone_netherrack_smooth_stairs.register();
		stone_obsidian_smooth_stairs.register();
		stone_ice_packed_smooth_stairs.register();
		stone_claystone_smooth_stairs.register();
	}
}
