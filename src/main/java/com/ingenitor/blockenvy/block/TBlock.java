/**
 * 
 */
package com.ingenitor.blockenvy.block;

import com.ingenitor.blockenvy.creativetab.TCreativeTab;
import com.ingenitor.blockenvy.reference.Identity;
import com.ingenitor.blockenvy.util.LogHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * @author ingenitor
 *
 */
public class TBlock extends Block {
	
    public TBlock(Material material, String name)
    {
        super(material);
        this.setBlockName(name);
        this.setBlockTextureName(Identity.MOD_ID+":"+name);
        this.setCreativeTab(TCreativeTab.BE_TAB);
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(soundTypePiston);		
    }

    public TBlock(String name)
    {
        this(Material.rock, name);
    }

    @Override
    public String getUnlocalizedName() {
    	String unlocName = super.getUnlocalizedName();
        return String.format("tile.%s%s", Identity.MOD_ID+":", getUnwrappedUnlocalizedName(unlocName));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
