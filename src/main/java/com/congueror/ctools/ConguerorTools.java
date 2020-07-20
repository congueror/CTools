package com.congueror.ctools;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.congueror.ctools.init.BlockInit;
import com.congueror.ctools.init.ItemInit;

@Mod("ctools")
@Mod.EventBusSubscriber(modid = ConguerorTools.MOD_ID, bus = Bus.MOD)
public class ConguerorTools
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID= "ctools";
    public static ConguerorTools instance;

    public ConguerorTools() 
    {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::clientRegistries);
    	modEventBus.addListener(this::doClientStuff);
        instance=this;
        
        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) 
    {
        final IForgeRegistry<Item> registry = event.getRegistry();
        
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> 
        {
            final Item.Properties properties = new Item.Properties().group(CtoolsItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
        
		LOGGER.debug("Registered BlockItems!");
     }

    private void setup(final FMLCommonSetupEvent event)
    {
    	
    }
    
    private void clientRegistries(final FMLClientSetupEvent event) 
    {
    	
    }

    @SuppressWarnings("resource")
	private void doClientStuff(final FMLClientSetupEvent event) 
    {
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) 
    {
    	
    }
}
