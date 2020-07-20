package com.congueror.ctools.enums;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

import com.congueror.ctools.ConguerorTools;
import com.congueror.clib.init.ItemInit;

public enum ModArmorMaterial implements IArmorMaterial
{
	
	TIN(ConguerorTools.MOD_ID + ":tin", 10, new int[] {2, 3, 4, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.TIN_INGOT.get());
	}),
	
	COPPER(ConguerorTools.MOD_ID + ":copper", 14, new int[] {2, 4, 5, 2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.COPPER_INGOT.get());
	}),
	
	STEEL(ConguerorTools.MOD_ID + ":steel", 16, new int[] {3, 5, 7, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5f, 0.0f, () -> {
		return Ingredient.fromItems(ItemInit.STEEL_INGOT.get());
	});
	
	private static int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16};
	private final String name;
	private final int maxDamageFactor;
	private final int[] damageReductionAmountArray;
	private final int enchantibility;
	private final SoundEvent soundEvent;
	private final float toughness;
	private final float field_234660_o_;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn, int enchantiblityIn, SoundEvent soundEventIn, float toughnessIn, float knockbackResistance, Supplier<Ingredient> repairMaterialIn) {
		this.name = nameIn;
		this.maxDamageFactor = maxDamageFactorIn;
		this.damageReductionAmountArray = damageReductionAmountIn;
		this.enchantibility = enchantiblityIn;
		this.soundEvent = soundEventIn;
		this.toughness = toughnessIn;
		this.field_234660_o_ = knockbackResistance;
		this.repairMaterial = new LazyValue<>(repairMaterialIn);
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}
	
	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
	
	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public String getName() {
		return this.name;
	}


	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float func_230304_f_() {
		return this.field_234660_o_;
	}
}
