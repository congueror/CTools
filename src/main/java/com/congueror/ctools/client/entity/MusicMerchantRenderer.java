package com.congueror.ctools.client.entity;

import com.congueror.ctools.ConguerorTools;
import com.congueror.ctools.entities.musicmerchant.MusicMerchantEntity;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.layers.HeadLayer;
import net.minecraft.client.renderer.entity.model.VillagerModel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MusicMerchantRenderer extends MobRenderer<MusicMerchantEntity, VillagerModel<MusicMerchantEntity>> {
	   private static final ResourceLocation field_217780_a = new ResourceLocation(ConguerorTools.MOD_ID, "textures/entity/music_merchant.png");

	   public MusicMerchantRenderer(EntityRendererManager renderManagerIn) {
	      super(renderManagerIn, new VillagerModel<>(0.0F), 0.5F);
	      this.addLayer(new HeadLayer<>(this));
	      this.addLayer(new CrossedArmsItemLayer<>(this));
	   }

	   /**
	    * Returns the location of an entity's texture.
	    */
	   public ResourceLocation getEntityTexture(MusicMerchantEntity entity) {
	      return field_217780_a;
	   }

	   protected void preRenderCallback(MusicMerchantEntity entitylivingbaseIn, MatrixStack matrixStackIn, float partialTickTime) {
	      @SuppressWarnings("unused")
		float f = 0.9375F;
	      matrixStackIn.scale(0.9375F, 0.9375F, 0.9375F);
	   }
	}