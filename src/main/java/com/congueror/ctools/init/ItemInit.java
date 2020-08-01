package com.congueror.ctools.init;

import com.congueror.ctools.ConguerorTools;
import com.congueror.ctools.config.CToolsConfig;
import com.congueror.ctools.enums.ModArmorMaterial;
import com.congueror.ctools.enums.ModItemTier;
import com.congueror.ctools.itemgroups.CMiscItemGroup;
import com.congueror.ctools.itemgroups.CToolsItemGroup;
import com.congueror.ctools.items.CustomMusicDisc;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit 
{	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ConguerorTools.MOD_ID);
	//AttackDamage = Tier + init + 1		AttackSpeed = float + 4
	
	//Tin Tools
    public static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword", ()-> 
    new SwordItem(ModItemTier.TIN, CToolsConfig.tinsword_damage.get(), -2, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe", ()-> 
    new PickaxeItem(ModItemTier.TIN, 1, -2.4f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe", ()-> 
    new AxeItem(ModItemTier.TIN, 6.0f, -2.8f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel", ()-> 
    new ShovelItem(ModItemTier.TIN, 1.5f, -2.6f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe", ()-> 
    new HoeItem(ModItemTier.TIN, -1, -2.6f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    //Tin Armor
    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet", ()-> 
    new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.HEAD, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate", ()-> 
    new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.CHEST, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings", ()-> 
    new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.LEGS, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots", ()-> 
    new ArmorItem(ModArmorMaterial.TIN, EquipmentSlotType.FEET, new Item.Properties().group(CToolsItemGroup.instance)));
    
    
	//Copper Tools
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", ()-> 
    new SwordItem(ModItemTier.COPPER, 3, -2.2f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", ()-> 
    new PickaxeItem(ModItemTier.COPPER, 1, -2.6f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", ()-> 
    new AxeItem(ModItemTier.COPPER, 6.0f, -3.0f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", ()-> 
    new ShovelItem(ModItemTier.COPPER, 1.5f, -2.8f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", ()-> 
    new HoeItem(ModItemTier.COPPER, -1, -2.8f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    //Copper Armor
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", ()-> 
    new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", ()-> 
    new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.CHEST, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", ()-> 
    new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.LEGS, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", ()-> 
    new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlotType.FEET, new Item.Properties().group(CToolsItemGroup.instance)));
    
    
	//Steel Tools
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", ()-> 
    new SwordItem(ModItemTier.STEEL, 3, -2.6f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", ()-> 
    new PickaxeItem(ModItemTier.STEEL, 1, -2.8f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", ()-> 
    new AxeItem(ModItemTier.STEEL, 5.0f, -3.2f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", ()-> 
    new ShovelItem(ModItemTier.STEEL, 1.5f, -3.0f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", ()-> 
    new HoeItem(ModItemTier.STEEL, -3, -3.0f, new Item.Properties().group(CToolsItemGroup.instance)));
    
    //Steel Armor
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", ()-> 
    new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", ()->
    new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", ()-> 
    new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(CToolsItemGroup.instance)));
    
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", ()-> 
    new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(CToolsItemGroup.instance)));
    
    //Music Discs
    public static final RegistryObject<Item> NEVER_GONNA_GIVE_YOU_UP_MUSIC_DISC = ITEMS.register("never_gonna_give_you_up_music_disc", () -> 
    new CustomMusicDisc(1, SoundInit.NEVER_GONNA_GIVE_YOU_UP_LAZY.get(), new Item.Properties().maxStackSize(1).rarity(Rarity.RARE).group(CMiscItemGroup.instance)));
    
    public static final RegistryObject<Item> REVENGE_MUSIC_DISC = ITEMS.register("revenge_music_disc", () -> 
    new CustomMusicDisc(2, SoundInit.REVENGE_LAZY.get(), new Item.Properties().maxStackSize(1).rarity(Rarity.RARE).group(CMiscItemGroup.instance)));
   
    public static final RegistryObject<Item> VIVA_LA_VIDA_MUSIC_DISC = ITEMS.register("viva_la_vida_music_disc", () -> 
    new CustomMusicDisc(1, SoundInit.VIVA_LA_VIDA_LAZY.get(), new Item.Properties().maxStackSize(1).rarity(Rarity.RARE).group(CMiscItemGroup.instance)));
    
    public static final RegistryObject<Item> FALLEN_KINGDOM_MUSIC_DISC = ITEMS.register("fallen_kingdom_music_disc", () -> 
    new CustomMusicDisc(2, SoundInit.FALLEN_KINGDOM_LAZY.get(), new Item.Properties().maxStackSize(1).rarity(Rarity.RARE).group(CMiscItemGroup.instance)));
    
    public static final RegistryObject<Item> COUNTRY_ROADS_MUSIC_DISC = ITEMS.register("country_roads_music_disc", () -> 
    new CustomMusicDisc(2, SoundInit.COUNTRY_ROADS_LAZY.get(), new Item.Properties().maxStackSize(1).rarity(Rarity.RARE).group(CMiscItemGroup.instance)));
}

