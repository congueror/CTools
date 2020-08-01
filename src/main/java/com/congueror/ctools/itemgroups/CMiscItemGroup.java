package com.congueror.ctools.itemgroups;

import com.congueror.ctools.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CMiscItemGroup extends ItemGroup
{
	public static final CMiscItemGroup instance = new CMiscItemGroup(ItemGroup.GROUPS.length, "cmisctab");
	private CMiscItemGroup(int index, String label) 
	{
		super(index, label);
	}
	
	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(ItemInit.NEVER_GONNA_GIVE_YOU_UP_MUSIC_DISC.get());
	}
}
