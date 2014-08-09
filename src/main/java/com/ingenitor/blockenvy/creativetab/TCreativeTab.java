/**
 * 
 */
package com.ingenitor.blockenvy.creativetab;

import com.ingenitor.blockenvy.reference.Identity;
import com.ingenitor.blockenvy.register.RegisterBlocks;

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
            return Item.getItemFromBlock(RegisterBlocks.stone_diorite);
        }
    };
}
