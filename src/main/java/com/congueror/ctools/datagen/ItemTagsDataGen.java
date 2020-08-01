package com.congueror.ctools.datagen;

/*import com.congueror.clib.init.ItemInit;
import com.congueror.ctools.ConguerorTools;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ItemTagsDataGen extends ItemTagsProvider
{
    public ItemTagsDataGen(net.minecraft.data.DataGenerator generatorIn, BlockTagsProvider blockDataGen)
    {
        super(generatorIn, blockDataGen);
    }

    @Override
    protected void registerTags()
    {    
        //ingots
        addForgeTag("ingots/aluminum", ItemInit.ALUMINUM_INGOT.get());
        addForgeTag("ingots/copper", ItemInit.COPPER_INGOT.get());
    }
    
   public static final Tag<Item> TAG = makeWrapperTag("name");
    
   private static Tag<Item> makeWrapperTag(String name) {
       return ItemTags.makeWrapperTag("");
   }
    
   private void addForgeTag(String name, Item... items)
   {
       ConguerorTools.LOGGER.debug("Creating item tag for forge:" + name);
       ResourceLocation loc = new ResourceLocation("forge", name);
       getBuilder(new Tag<Item>(loc)).replace(false).add(items).build(loc);
   }

   @Override
   public String getName()
   {
       return "Item Tags";
   }
}*/