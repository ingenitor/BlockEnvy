/**
 * 
 */
package com.ingenitor.blockenvy.creativetab;

import com.ingenitor.blockenvy.reference.Identity;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * @author ingenitor
 *
 */
public class TCreativeTab {
	
	public static final CreativeTabs BE_TAB = new CreativeTabs(Identity.MOD_ID)
    {
        @Override
        public Item getTabIconItem() {
            return Items.brick;
        }
    };
}
