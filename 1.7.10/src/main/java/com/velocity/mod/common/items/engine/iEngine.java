package com.velocity.mod.common.items.engine;

import net.minecraft.item.Item;

/**
 * Created by Alex on 1/21/2016.
 */
public interface iEngine {

    int topSpeed();

    int horsePower();

    int Cylinders();

   // String getEngineSound();

    Boolean supercharged();

    Item getGas();
}
