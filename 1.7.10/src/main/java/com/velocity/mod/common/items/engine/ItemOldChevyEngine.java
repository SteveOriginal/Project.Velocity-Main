package com.velocity.mod.common.items.engine;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Alex on 1/21/2016.
 */
public class ItemOldChevyEngine extends Item implements iEngine {

    public ItemOldChevyEngine(iEngine iengine) {
        super();

    }

    @Override
    public int topSpeed()
    {
        return 30;
    }

    @Override
    public int horsePower()
    {
        return 375;
    }

    @Override
    public int Cylinders()
    {
        return 8;
    }

    @Override
    public Boolean supercharged()
    {
        return false;
    }

    @Override
    public Item getGas()
    {
        return Items.apple;
    }
}


