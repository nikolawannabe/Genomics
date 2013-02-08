package Genomics.core;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GenericItem extends Item {

	public GenericItem(int id) {
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		
	}
	
	public String getTextureFile () {
        return CommonProxy.ITEMS_PNG;
	}

}
