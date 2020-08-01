package com.congueror.ctools.init;

import com.congueror.ctools.ConguerorTools;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit 
{
	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ConguerorTools.MOD_ID);
		
	public static final Lazy<SoundEvent> NEVER_GONNA_GIVE_YOU_UP_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(ConguerorTools.MOD_ID, "item.never_gonna_give_you_up_disc")));
	public static final RegistryObject<SoundEvent> NEVER_GONNA_GIVE_YOU_UP_DISC = SOUNDS.register("item.never_gonna_give_you_up_disc.disc", NEVER_GONNA_GIVE_YOU_UP_LAZY);
	
	public static final Lazy<SoundEvent> REVENGE_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(ConguerorTools.MOD_ID, "item.revenge_disc")));
	public static final RegistryObject<SoundEvent> REVENGE_DISC = SOUNDS.register("item.revenge_disc.disc", REVENGE_LAZY);
	
	public static final Lazy<SoundEvent> VIVA_LA_VIDA_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(ConguerorTools.MOD_ID, "item.viva_la_vida_disc")));
	public static final RegistryObject<SoundEvent> VIVA_LA_VIDA_DISC = SOUNDS.register("item.viva_la_vida_disc.disc", VIVA_LA_VIDA_LAZY);
	
	public static final Lazy<SoundEvent> FALLEN_KINGDOM_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(ConguerorTools.MOD_ID, "item.fallen_kingdom_disc")));
	public static final RegistryObject<SoundEvent> FALLEN_KINGDOM_DISC = SOUNDS.register("item.fallen_kingdom_disc.disc", FALLEN_KINGDOM_LAZY);
	
	public static final Lazy<SoundEvent> COUNTRY_ROADS_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(ConguerorTools.MOD_ID, "item.country_roads_disc")));
	public static final RegistryObject<SoundEvent> COUNTRY_ROADS_DISC = SOUNDS.register("item.country_roads_disc.disc", COUNTRY_ROADS_LAZY);
}
