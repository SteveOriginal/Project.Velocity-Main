package com.velocity.mod.common.items.init;

import com.velocity.mod.client.main.Reference;
import com.velocity.mod.common.items.engine.ItemNewNissanEngine;
import com.velocity.mod.common.items.engine.iEngine;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Alex on 1/24/2016.
 */
public class InitVelocityItems {

    public static void init() {
        register();

    }


    public static Item NissanEngineNew;
    public static iEngine iengine;


    public static void register() {


        NissanEngineNew = new ItemNewNissanEngine(iengine);
        registerItem(NissanEngineNew, "engine");
    }



    private static void registerItem(Item item, String name)
    {
        String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
        item.setUnlocalizedName(unlocalizedName);
            item.setTextureName(Reference.MODID + ":" + unlocalizedName);
       // item.setCreativeTab(VelocityMod.tabvelocity);

        GameRegistry.registerItem(item, unlocalizedName);
    }



}