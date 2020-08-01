package com.congueror.ctools.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.config.ModConfig;

public class CToolsConfig 
{
    public static final String CATEGORY_GENERAL = "General";
    public static final String CATEGORY_WEAPONS = "Weapons";
    public static final String CATEGORY_TOOLS = "Tools";
    public static final String CATEGORY_ARMOR = "Armor";
    
    public static final String SUBCATEGORY_TIN = "Tin";
    public static final String SUBCATEGORY_ALUMINUM = "Aluminum";
    public static final String SUBCATEGORY_COPPER = "Copper";
    public static final String SUBCATEGORY_OTHER = "Other";
    
    public static ForgeConfigSpec spec;
    
    public static ForgeConfigSpec.IntValue tinsword_damage;
    public static ForgeConfigSpec.IntValue coppersword_damage;
    public static ForgeConfigSpec.IntValue steelsword_damage;


    static 
    {
        ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
        
        BUILDER.comment("General Config").push(CATEGORY_GENERAL);
        BUILDER.pop();
        
        BUILDER.comment("Weapons Settings").push(CATEGORY_WEAPONS);
   			tinsword_damage = BUILDER
   					.comment("Attack damage of weapons (1 + 1.0 + YourValue = InGameAttackDamage) [Default = 3]")
   					.translation("tinsword_damage_comment")
   					.defineInRange("tinsword_damage", 3, 1, 9999);
   			coppersword_damage = BUILDER
   					.comment("Attack damage of weapons (1 + 1.0 + YourValue = InGameAttackDamage) [Default = 3]")
   					.translation("coppersword_damage_comment")
   					.defineInRange("coppersword_damage", 3, 1, 9999);
   			steelsword_damage = BUILDER
   					.comment("Attack damage of weapons (1 + 3.0 + YourValue = InGameAttackDamage) [Default = 3]")
   					.translation("steelsword_damage_comment")
   					.defineInRange("steelsword_damage", 3, 1, 9999);
        BUILDER.pop();
        
        spec = BUILDER.build();
    }
    
    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }

    @SubscribeEvent
    public static void onReload(final ModConfig.Reloading configEvent) {
    }
}
