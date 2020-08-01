package com.congueror.ctools.entities.musicmerchant;

import com.congueror.ctools.entities.AbstractWanderer;
import com.congueror.ctools.entities.ModVillagerTrades;
import com.congueror.ctools.init.ItemInit;

import net.minecraft.entity.EntityType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraft.entity.merchant.villager.VillagerTrades;

public class MusicMerchantEntity extends AbstractWanderer {
    public MusicMerchantEntity(EntityType<? extends MusicMerchantEntity> type, World worldIn) {
        super(type, worldIn);
        this.setCustomName(new StringTextComponent("Music Merchant"));

        this.sells = new VillagerTrades.ITrade[]{
                // item, num emeralds to input, num items to output, max uses, priceMultiplierIn
                new ModVillagerTrades.ItemsForEmeraldsTrade(ItemInit.COUNTRY_ROADS_MUSIC_DISC.get(), 64, 1, 1, 1)
        };

        this.buys = new VillagerTrades.ITrade[]{
                // item, num items to input, num emeralds to output, max uses, ex given
                //new ModVillagerTrades.EmeraldsForItemsTrade(ItemInit.COUNTRY_ROADS_MUSIC_DISC.get(), 1, 1, 1, 5),
        };
    }
}