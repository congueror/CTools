package com.congueror.ctools.init;

import com.congueror.ctools.ConguerorTools;
import com.congueror.ctools.CtoolsItemGroup;
import com.congueror.ctools.enums.ModItemTier;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ConguerorTools.MOD_ID);
	
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", ()-> new SwordItem(ModItemTier.TIN, 1, 0.7f, new Item.Properties().group(CtoolsItemGroup.instance)));
}