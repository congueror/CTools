package com.congueror.ctools.entities.merchant;

import java.util.Random;

import com.congueror.clib.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.util.IItemProvider;

@SuppressWarnings("unused")
public class RubyVillagerTrades {
	
	// starts with what the villager gives
	public static class RubiesForItemsTrade implements VillagerTrades.ITrade {
      private final Item tradeItem;
      private final int count;
      private final int maxUses;
      private final int xpValue;
      private final float priceMultiplier;
      private final int emeralds;

      public RubiesForItemsTrade(IItemProvider tradeItemIn, int countIn, int emeraldsIn, int maxUsesIn, int xpValueIn) {
         this.tradeItem = tradeItemIn.asItem();
         this.count = countIn;
         this.maxUses = maxUsesIn;
         this.xpValue = xpValueIn;
         this.priceMultiplier = 0.05F;
         this.emeralds = emeraldsIn;
      }

      public MerchantOffer getOffer(Entity trader, Random rand) {
         ItemStack itemstack = new ItemStack(this.tradeItem, this.count);
         return new MerchantOffer(itemstack, new ItemStack(ItemInit.RUBY.get(), this.emeralds), this.maxUses, this.xpValue, this.priceMultiplier);
      }
   }
	
	public static class ItemsForRubiesTrade implements VillagerTrades.ITrade {
      private final ItemStack field_221208_a;
      private final int price;
      private final int count;
      private final int field_221211_d;
      private final int field_221212_e;
      private final float field_221213_f;

      public ItemsForRubiesTrade(Item itemIn, int price, int countIn, int p_i50530_4_, int p_i50530_5_) {
         this(new ItemStack(itemIn), price, countIn, p_i50530_4_, p_i50530_5_);
      }

      public ItemsForRubiesTrade(ItemStack itemIn, int price, int countIn, int p_i50531_4_, int p_i50531_5_) {
         this(itemIn, price, countIn, p_i50531_4_, p_i50531_5_, 0.05F);
      }

      public ItemsForRubiesTrade(ItemStack itemIn, int price, int countIn, int p_i50532_4_, int p_i50532_5_, float p_i50532_6_) {
         this.field_221208_a = itemIn;
         this.price = price;
         this.count = countIn;
         this.field_221211_d = p_i50532_4_;
         this.field_221212_e = p_i50532_5_;
         this.field_221213_f = p_i50532_6_;
      }

      public MerchantOffer getOffer(Entity trader, Random rand) {
         return new MerchantOffer(new ItemStack(ItemInit.RUBY.get(), this.price), new ItemStack(this.field_221208_a.getItem(), this.count), this.field_221211_d, this.field_221212_e, this.field_221213_f);
      }
   }
}
