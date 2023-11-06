package net.DanonyThePro.hell_vs_heaven.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.DanonyThePro.hell_vs_heaven.Hell_vs_Heaven;
import net.DanonyThePro.hell_vs_heaven.entity.custom.BaphometEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BaphometRenderer extends MobRenderer<BaphometEntity, BaphometModel<BaphometEntity>> {
    public BaphometRenderer(EntityRendererProvider.Context context) {
        super(context, new BaphometModel<>(context.bakeLayer(ModModelLayers.BAPHOMET_LAYER)), 1.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(BaphometEntity entity) {
        return new ResourceLocation(Hell_vs_Heaven.MOD_ID, "textures/entity/baphomet.png");
    }

    @Override
    public void render(BaphometEntity entity, float entityYaw, float partialTick, PoseStack p_115458_,
                       MultiBufferSource bufferSource, int render) {
        if (entity.isBaby()) {
            p_115458_.scale(0.5f,0.5f,0.5f);
        }
        super.render(entity, entityYaw, partialTick, p_115458_, bufferSource, render);
    }
}
