package com.velocity.mod.common.items.engine;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Alex on 1/21/2016.
 */
public class ItemNewDodgeEngineHellCat extends Item implements iEngine {

    public ItemNewDodgeEngineHellCat(iEngine iengine) {
        super();

    }

    @Override
    public int topSpeed()
    {
        return 45;
    }

    @Override
    public int horsePower()
    {
        return 707;
    }

    @Override
    public int Cylinders()
    {
        return 8;
    }

    @Override
    public Boolean supercharged()
    {
        return true;
    }

    @Override
    public Item getGas()
    {
        return Items.cake;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List info, boolean p_77624_4_)
    {
        info.add("Engine Type: 2016 Dodge HellCat Supercharged");
        info.add("§4 *** Specs ***");
        info.add("");
        info.add("§a  v" + Cylinders());
        info.add("§a  HP: 707");
        info.add("§a  Supercharged");
        info.add("§9 Top Speed 45");
    }
}


