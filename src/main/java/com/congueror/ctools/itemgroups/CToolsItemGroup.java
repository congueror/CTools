package com.congueror.ctools.itemgroups;

import com.congueror.ctools.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CToolsItemGroup extends ItemGroup
{
	public static final CToolsItemGroup instance = new CToolsItemGroup(ItemGroup.GROUPS.length, "ctoolstab");
	private CToolsItemGroup(int index, String label) 
	{
		super(index, label);
	}
	
	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemInit.COPPER_SWORD.get());
	}
}