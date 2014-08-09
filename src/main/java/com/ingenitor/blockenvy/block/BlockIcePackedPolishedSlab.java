/**
 * 
 */
package com.ingenitor.blockenvy.block;

import com.ingenitor.blockenvy.register.RegisterBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;

/**
 * @author ingenitor
 *
 */
public class BlockIcePackedPolishedSlab extends TBlockPolishedSlab {

	/**
	 */
	public BlockIcePackedPolishedSlab(boolean full) {
		super(full, RegisterBlocks.stone_ice_packed_smooth, 1);
	}

	/* (non-Javadoc)
	 * @see com.ingenitor.blockenvy.block.TBlockSlab#getFullBlock()
	 */
	@Override
	public BlockSlab getFullBlock() {
		return RegisterBlocks.stone_ice_packed_smooth_double_slab;
	}

	/* (non-Javadoc)
	 * @see com.ingenitor.blockenvy.block.TBlockSlab#getSingleBlock()
	 */
	@Override
	public BlockSlab getSingleBlock() {
		return RegisterBlocks.stone_ice_packed_smooth_slab;
	}

}
