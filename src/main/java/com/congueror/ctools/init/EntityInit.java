package com.congueror.ctools.init;

import com.congueror.ctools.ConguerorTools;
import com.congueror.ctools.entities.merchant.musicmerchant.MusicMerchantEntity;
import com.congueror.ctools.entities.merchant.rubymerchant.RubyMerchantEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit 
{
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ConguerorTools.MOD_ID);
	
	public static final RegistryObject<EntityType<MusicMerchantEntity>> MUSIC_MERCHANT_ENTITY = 
			ENTITY_TYPES.register("music_merchant_entity", () -> EntityType.Builder.<MusicMerchantEntity>create(MusicMerchantEntity::new, 
					EntityClassification.CREATURE).size(0.6f, 1.95f).build(new ResourceLocation(ConguerorTools.MOD_ID, "music_merchant_entity").toString()));
	
	public static final RegistryObject<EntityType<RubyMerchantEntity>> RUBY_MERCHANT_ENTITY = 
			ENTITY_TYPES.register("ruby_merchant_entity", () -> EntityType.Builder.<RubyMerchantEntity>create(RubyMerchantEntity::new, 
					EntityClassification.CREATURE).size(0.6f, 1.95f).build(new ResourceLocation(ConguerorTools.MOD_ID, "ruby_merchant_entity").toString()));
}
