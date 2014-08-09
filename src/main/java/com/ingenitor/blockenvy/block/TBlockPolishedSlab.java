/**
 * 
 */
package com.ingenitor.blockenvy.block;

import java.util.List;
import java.util.Random;

import com.ingenitor.blockenvy.creativetab.TCreativeTab;
import com.ingenitor.blockenvy.reference.Identity;
import com.ingenitor.blockenvy.register.RegisterBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

/**
 * @author ingenitor
 *
 */
public abstract class TBlockPolishedSlab extends TBlockSlab {
	
	Block source;
	int meta;
	
	public TBlockPolishedSlab(boolean full, Block source, int meta) {
		super(full, source.getMaterial(), source.getUnlocalizedName().replaceAll("tile.", "").replaceAll(Identity.MOD_ID+":", "") + (full ? "_double_slab" : "_slab"));
		setStepSound(source.stepSound);
		this.source = source;
		this.meta = meta;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_side, int p_meta) {
		return source.getIcon(p_side, meta);
	}
	
}
