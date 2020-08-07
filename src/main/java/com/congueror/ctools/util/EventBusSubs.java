package com.congueror.ctools.util;

import com.congueror.ctools.ConguerorTools;
import com.congueror.ctools.entities.merchant.musicmerchant.MusicMerchantEntity;
import com.congueror.ctools.init.EntityInit;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = ConguerorTools.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class EventBusSubs {

	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void imstuff(final RegistryEvent.Register<EntityType<?>> event) {
        GlobalEntityTypeAttributes.put(EntityInit.MUSIC_MERCHANT_ENTITY.get(), MusicMerchantEntity.Attributes().create());
	}
}
