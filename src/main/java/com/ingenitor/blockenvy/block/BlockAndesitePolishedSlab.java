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
public class BlockAndesitePolishedSlab extends TBlockPolishedSlab {

	/**
	 * @param full
	 */
	public BlockAndesitePolishedSlab(boolean full) {
		super(full, RegisterBlocks.stone_andesite_smooth, 1);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypePiston);
	}

	/* (non-Javadoc)
	 * @see com.ingenitor.blockenvy.block.TBlockSlab#getFullBlock()
	 */
	@Override
	public BlockSlab getFullBlock() {
		return RegisterBlocks.stone_andesite_smooth_double_slab;
	}

	/* (non-Javadoc)
	 * @see com.ingenitor.blockenvy.block.TBlockSlab#getSingleBlock()
	 */
	@Override
	public BlockSlab getSingleBlock() {
		return RegisterBlocks.stone_andesite_smooth_slab;
	}

}