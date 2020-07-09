package com.congueror.ctools;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CtoolsItemGroup extends ItemGroup
{
	public static final CtoolsItemGroup instance = new CtoolsItemGroup(ItemGroup.GROUPS.length, "ctoolstab");
	private CtoolsItemGroup(int index, String label) 
	{
		super(index, label);
	}
	
	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(Blocks.BARRIER);
	}
}