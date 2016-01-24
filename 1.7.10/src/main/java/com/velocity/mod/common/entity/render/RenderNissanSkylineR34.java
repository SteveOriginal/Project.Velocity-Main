package com.velocity.mod.common.entity.render;

import com.velocity.mod.client.main.Reference;
import com.velocity.mod.common.entity.car.EntityNissanSkylineR34;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Alex on 1/24/2016.
 */
public class RenderNissanSkylineR34 extends RenderLiving {

    private static final ResourceLocation mobTextures = new ResourceLocation(Reference.MODID + ":" + "textures/entity/nissan.png");
    private static final String __OBFID = "CL_00000984";

    public RenderNissanSkylineR34(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);

    }

    protected ResourceLocation getEntityTexture(EntityNissanSkylineR34 entity){
        return mobTextures;
    }

    protected ResourceLocation getEntityTexture(Entity entity){
        return this.getEntityTexture((EntityNissanSkylineR34)entity);
    }

}
