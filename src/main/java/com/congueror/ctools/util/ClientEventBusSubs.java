package com.congueror.ctools.util;

import com.congueror.ctools.ConguerorTools;
import com.congueror.ctools.entities.musicmerchant.MusicMerchantRenderer;
import com.congueror.ctools.init.EntityInit;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ConguerorTools.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubs 
{
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityInit.MUSIC_MERCHANT_ENTITY.get(), MusicMerchantRenderer::new);
	}
}
