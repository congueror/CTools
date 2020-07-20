package com.congueror.ctools.init;

import com.congueror.ctools.ConguerorTools;
import com.congueror.ctools.CtoolsItemGroup;
import com.congueror.ctools.enums.ModItemTier;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ConguerorTools.MOD_ID);
	//AttackDamage = Tier + int + 1		AttackSpeed = float + 4
	
	//Tin Tools
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", ()-> new SwordItem(ModItemTier.TIN, 3, -2.0f, new Item.Properties().group(CtoolsItemGroup.instance)));
    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", ()-> new PickaxeItem(ModItemTier.TIN, 1, -2.4f, new Item.Properties().group(CtoolsItemGroup.instance)));
    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", ()-> new AxeItem(ModItemTier.TIN, 6.0f, -2.8f, new Item.Properties().group(CtoolsItemGroup.instance)));
    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", ()-> new ShovelItem(ModItemTier.TIN, 1.5f, -2.6f, new Item.Properties().group(CtoolsItemGroup.instance)));
    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", ()-> new HoeItem(ModItemTier.TIN, 0, -2.6f, new Item.Properties().group(CtoolsItemGroup.instance)));
    //Tin Armor
    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", ()-> new ArmorItem(ModItemTier.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(CtoolsItemGroup.instance)));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", ()-> new ArmorItem(ModItemTier.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(CtoolsItemGroup.instance)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", ()-> new ArmorItem(ModItemTier.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(CtoolsItemGroup.instance)));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", ()-> new ArmorItem(ModItemTier.TIN, EquipmentSlotType.FEET, new Item.Properties().group(CtoolsItemGroup.instance)));
}

