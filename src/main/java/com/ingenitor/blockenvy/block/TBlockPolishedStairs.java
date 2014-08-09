/**
 * 
 */
package com.ingenitor.blockenvy.block;

import com.ingenitor.blockenvy.reference.Identity;
import com.ingenitor.blockenvy.util.LogHelper;

import net.minecraft.block.Block;

/**
 * @author ingenitor
 *
 */
public class TBlockPolishedStairs extends TBlockStairs {

	/**
	 */
	public TBlockPolishedStairs(Block source, int meta) {
		super(source, meta, source.getUnlocalizedName().replaceAll("tile.", "").replaceAll(Identity.MOD_ID+":", "") + "_stairs");
	}

}
