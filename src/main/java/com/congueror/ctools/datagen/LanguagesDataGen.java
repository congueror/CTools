package com.congueror.ctools.datagen;

import com.congueror.ctools.ConguerorTools;

import net.minecraftforge.common.data.LanguageProvider;

public class LanguagesDataGen extends LanguageProvider
{
    public LanguagesDataGen(net.minecraft.data.DataGenerator gen, String locale)
    {
        super(gen, ConguerorTools.MOD_ID, locale);
    }

    @Override
    protected void addTranslations()
    {
        add("item.ctools.tin_sword", "Tin Sword");
        add("item.ctools.tin_pickaxe", "Tin Pickaxe");
        add("item.ctools.tin_axe", "Tin Axe");
        add("item.ctools.tin_shovel", "Tin Shovel");
        add("item.ctools.tin_hoe", "Tin Hoe");
        
        add("item.ctools.tin_helmet", "Tin Helmet");
        add("item.ctools.tin_chestplate", "Tin Chestplate");
        add("item.ctools.tin_leggings", "Tin Leggings");
        add("item.ctools.tin_boots", "Tin Boots");

        add("item.ctools.copper_sword", "Copper Sword");
        add("item.ctools.copper_pickaxe", "Copper Pickaxe");
        add("item.ctools.copper_axe", "Copper Pickaxe");
        add("item.ctools.copper_shovel", "Copper Shovel");
        add("item.ctools.copper_hoe", "Copper Hoe");
        
        add("item.ctools.copper_helmet", "Copper Helmet");
        add("item.ctools.copper_chestplate", "Copper Chestplate");
        add("item.ctools.copper_leggings", "Copper Leggings");
        add("item.ctools.copper_boots", "Copper Boots");

        add("item.ctools.steel_sword", "Steel Sword");
        add("item.ctools.steel_pickaxe", "Steel Pickaxe");
        add("item.ctools.steel_axe", "Steel Axe");
        add("item.ctools.steel_shovel", "Steel Shovel");
        add("item.ctools.steel_hoe", "Steel Hoe");
        
        add("item.ctools.steel_helmet", "Steel Helmet");
        add("item.ctools.steel_chestplate", "Steel Chestplate");
        add("item.ctools.steel_leggings", "Steel Leggings");
        add("item.ctools.steel_boots", "Steel Boots");
        
        add("item.ctools.never_gonna_give_you_up_music_disc", "Music Disc");
        add("item.ctools.never_gonna_give_you_up_music_disc.desc", "Rick Astley - Never Gonna Give You Up");
        add("item.never_gonna_give_you_up_disc.sub", "Playing Never Gonna Give You Up");
        
        add("item.ctools.revenge_music_disc", "Music Disc");
        add("item.ctools.revenge_music_disc.desc", "Captain Sparklez - Revenge");
        add("item.revenge_disc.sub", "Playing Revenge");
        
        add("itemGroup.ctoolstab", "Congueror's Tools");
        add("itemGroup.cmisctab", "Congueror's Miscellaneous");
        add("yes", "yes");
    }
    
    @Override
    public String getName()
    {
        return "Congueror's Additions Languages";
    }
}