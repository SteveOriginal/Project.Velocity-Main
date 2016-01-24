package com.velocity.core.client;

import com.velocity.core.common.CommonProxy;
import com.velocity.mod.common.entity.car.EntityNissanSkylineR34;
import com.velocity.mod.common.entity.model.ModelNissan;
import com.velocity.mod.common.entity.render.RenderNissanSkylineR34;
import cpw.mods.fml.client.registry.RenderingRegistry;

/**
 * Created by Alex on 1/20/2016.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenders()
    {

        RenderingRegistry.registerEntityRenderingHandler(EntityNissanSkylineR34.class, new RenderNissanSkylineR34(new ModelNissan(), 0));


    }
}
