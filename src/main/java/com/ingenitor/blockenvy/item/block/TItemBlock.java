/**
 * 
 */
package com.ingenitor.blockenvy.item.block;

import com.ingenitor.blockenvy.reference.Identity;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * @author ingenitor
 *
 */
public class TItemBlock extends ItemBlock {

	public TItemBlock(Block p_block) {
		super(p_block);
	}
	
	@Override
	public String getUnlocalizedNameInefficiently(ItemStack p_ItemStack) {
		return super.getUnlocalizedNameInefficiently(p_ItemStack).replaceAll("tile.", "tile."+Identity.MOD_ID+":");
	}
}
