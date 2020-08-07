package com.congueror.ctools.entities.merchant.rubymerchant;

import com.congueror.ctools.entities.merchant.AbstractWanderer;
import com.congueror.ctools.entities.merchant.RubyVillagerTrades;
import com.congueror.ctools.init.ItemInit;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;
import net.minecraft.entity.merchant.villager.VillagerTrades;

public class RubyMerchantEntity extends AbstractWanderer {
    public RubyMerchantEntity(EntityType<? extends RubyMerchantEntity> type, World worldIn) {
        super(type, worldIn);
        this.sells = new VillagerTrades.ITrade[]{
                // item, num emeralds to input, num items to output, max uses, priceMultiplierIn
                //new RubyVillagerTrades.ItemsForRubiesTrade(ItemInit.GRAVITY_FALLS_MUSIC_DISC.get(), 40, 1, 1, 1),
        };

        this.buys = new VillagerTrades.ITrade[]{
                // item, num items to input, num emeralds to output, max uses, ex given
                new RubyVillagerTrades.RubiesForItemsTrade(ItemInit.COUNTRY_ROADS_MUSIC_DISC.get(), 1, 1, 1, 5),
        };
    }
    
	public static AttributeModifierMap.MutableAttribute Attributes() {
		return MobEntity.func_233666_p_()
				.createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
				.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.7D);
	}
}