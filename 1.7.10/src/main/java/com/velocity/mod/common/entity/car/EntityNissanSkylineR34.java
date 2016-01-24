package com.velocity.mod.common.entity.car;

import com.velocity.mod.client.main.Reference;
import com.velocity.mod.common.items.init.InitVelocityItems;
import net.MagikVehicleHelper.api.LandVehicleHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

/**
 * Created by Alex on 1/24/2016.
 */
public class EntityNissanSkylineR34 extends LandVehicleHelper
{
    public EntityNissanSkylineR34(World par1World)
    {
        super(par1World);
        setSize(0.9F, 0.9F);

        vehicYOffset = -0.3F;

        moveModifier = 2.6F;

        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1.0D);
    }

    public void dropFewItems(boolean par1, int par2)
    {
        dropItem(InitVelocityItems.NissanEngineNew, 1);
    }

    public String getCommandSenderName()
    {
        if (hasCustomNameTag())
        {
            return getCustomNameTag();
        }
        else
        {
            return "1999 Nissan GT-R R34 Supercharged";
        }
    }

    public String getMovingSound()
    {
        return "";
    }

    protected String getLivingSound()
    {
        return Reference.MODID + ":engine_rev";
    }
}