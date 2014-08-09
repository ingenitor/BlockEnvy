/**
 * 
 */
package com.ingenitor.blockenvy.block;

import java.util.List;
import java.util.Random;

import com.ingenitor.blockenvy.creativetab.TCreativeTab;
import com.ingenitor.blockenvy.item.block.TItemSlab;
import com.ingenitor.blockenvy.reference.Identity;
import com.ingenitor.blockenvy.register.RegisterBlocks;
import com.ingenitor.blockenvy.util.LogHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;


/**
 * @author ingenitor
 *
 */
public abstract class TBlockSlab extends BlockSlab {

	String name;

	public TBlockSlab(boolean full, Material mat, String name) {
		super(full, mat);
		this.name = name;
		setBlockName(this.name);
		if(!full) {
			setLightOpacity(0);
			setCreativeTab(TCreativeTab.BE_TAB);
		}
	}

	public abstract BlockSlab getFullBlock();

	public abstract BlockSlab getSingleBlock();

	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		return new ItemStack(getSingleBlock());
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return Item.getItemFromBlock(getSingleBlock());
	}

	@Override
	public ItemStack createStackedBlock(int p_1) {
		return new ItemStack(getSingleBlock());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_IconRegister) {
		// NO-OP
	}

	public void register() {
		GameRegistry.registerBlock(this, TItemSlab.class, name);
	}

	@Override
	public String func_150002_b(int i) {
		return name;
	}
}
