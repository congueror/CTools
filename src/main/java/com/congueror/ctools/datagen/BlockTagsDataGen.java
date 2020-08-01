package com.congueror.ctools.datagen;

/*import com.congueror.clib.init.BlockInit;
import com.congueror.clib.init.ItemInit;
import com.congueror.ctools.ConguerorTools;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class BlockTagsDataGen extends BlockTagsProvider{

	public BlockTagsDataGen(DataGenerator generatorIn) 
	{
		super(generatorIn);
	}
	
	@Override
	protected void registerBlockTags() {
        addForgeTag("ingots/aluminum", BlockInit.ALUMINUM_ORE.get());
	}
	
	private void addForgeTag(String name, Block block)
	{
        ConguerorTools.LOGGER.debug("Creating item tag for forge:" + name);
        ResourceLocation loc = new ResourceLocation("forge", name);
	    getBuilder(new Tag<Block>(loc)).replace(false).add(block).build(loc);
	}
	 
	@Override
    public String getName()
	{
		
	return "Block Tags";
	
	}

}*/
