/**
 * 
 */
package com.ingenitor.blockenvy.block;

import com.ingenitor.blockenvy.creativetab.TCreativeTab;
import com.ingenitor.blockenvy.item.block.TItemBlock;
import com.ingenitor.blockenvy.reference.Identity;
import com.ingenitor.blockenvy.util.LogHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

/**
 * @author ingenitor
 *
 */
public class TBlockStairs extends BlockStairs {

	String name;
	
	public TBlockStairs(Block source, int meta, String name) {
		super(source, meta);
		this.name = name;
		setBlockName(this.name);
		setCreativeTab(TCreativeTab.BE_TAB);
		useNeighborBrightness = true;
	}

	public void register() {
		GameRegistry.registerBlock(this, TItemBlock.class, name);		
	}
}
