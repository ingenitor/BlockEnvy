/**
 * 
 */
package com.ingenitor.blockenvy.item.block;

import com.ingenitor.blockenvy.block.TBlockSlab;
import com.ingenitor.blockenvy.reference.Identity;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

/**
 * @author ingenitor
 *
 */
public class TItemSlab extends ItemSlab {

	/**
	 */
	public TItemSlab(Block p_block) {
		super(p_block, ((TBlockSlab)p_block).getSingleBlock(), ((TBlockSlab)p_block).getFullBlock(), false);

	}
	
	@Override
	public String getUnlocalizedName(ItemStack p_ItemStack) {
		return field_150939_a.getUnlocalizedName().replaceAll("tile.", "tile."+Identity.MOD_ID+":");
	}
}
