package com.congueror.ctools.enums;

import java.util.function.Supplier;

import com.congueror.clib.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum ModItemTier implements IItemTier
{
	//HarvestLvl, Durability, Efficiency(Wood = 2.0, Diamond = 10.0), Attack Damage(Wood = 0), Enchantibility(Wood = 15), RepairMat
	TIN(1, 31, 2.5f, 1.0f, 13, () -> {
		return Ingredient.fromItems(ItemInit.TIN_INGOT.get());
	}),
	
	COPPER(2, 134, 3.0f, 1.0f, 11, () -> {
		return Ingredient.fromItems(ItemInit.COPPER_INGOT.get());
	}),
	
	STEEL(2, 1306, 7.0f, 3.0f, 8, () -> {
		return Ingredient.fromItems(ItemInit.STEEL_INGOT.get());
	});
	
	private final int harvestLevel;
	private final int maxUses;
	private final float efficiency;
	private final float attackDamage;
	private final int enchantibility;
	private final LazyValue<Ingredient> repairMaterial;
	
	private ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial) 
	{
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.attackDamage = attackDamage;
		this.enchantibility = enchantibility;
		this.repairMaterial = new LazyValue<>(repairMaterial);
	}

	@Override
	public int getMaxUses() {
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {
		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		return this.attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return this.harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return this.enchantibility;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return this.repairMaterial.getValue();
	}
}
