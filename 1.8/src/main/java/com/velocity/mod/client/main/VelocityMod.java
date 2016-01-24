package com.velocity.mod.client.main;

import com.velocity.core.common.CommonProxy;
import com.velocity.mod.common.entity.InitVelocityEntitys;
import com.velocity.mod.common.items.init.InitVelocityItems;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = VelocityMod.MODID, version = VelocityMod.VERSION)
public class VelocityMod {
    public static final String MODID = "velocity-main";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.velocity.core.client.ClientProxy", serverSide = "com.velocity.core.common.ClientProxy")

    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        InitVelocityItems.init();
        InitVelocityEntitys.init();
        proxy.registerRenders();
    }
}