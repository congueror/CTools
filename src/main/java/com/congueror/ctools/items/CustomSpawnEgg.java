package com.congueror.ctools.items;

/*import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Direction;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

public class CustomSpawnEgg extends SpawnEggItem
{
	
	protected static final List<CustomSpawnEgg> UNADDED_EGGS = new ArrayList<CustomSpawnEgg>();
	private final Lazy<? extends EntityType<?>> entityTypeSupplier;

	public CustomSpawnEgg(final NonNullSupplier<? extends EntityType<?>> entityTypeSupplier, final int primaryColour, final int secondaryColour, final Item.Properties properties) {
		super(null, primaryColour, secondaryColour, properties);
		this.entityTypeSupplier = Lazy.of(entityTypeSupplier::get);
		UNADDED_EGGS.add(this);
	}
	
	public CustomSpawnEgg(final RegistryObject<? extends EntityType<?>> entityTypeSupplier, final int primaryColour, final int secondaryColour, final Item.Properties properties) {
		super(null, primaryColour, secondaryColour, properties);
		this.entityTypeSupplier = Lazy.of(entityTypeSupplier::get);
		UNADDED_EGGS.add(this);
	}
	
	private static void InitSpawnEggs() {
		final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class, null, "field_195987_b");
		DefaultDispenseItemBehavior dispenseBehavior = new DefaultDispenseItemBehavior() {
			@Override
			protected ItemStack dispenseStack(IBlockSource p_82487_1_, ItemStack p_82487_2_) {
				Direction direction = .getBlockState().get(DispenserBlock.FACING);
			}
		};
	}
}*/
