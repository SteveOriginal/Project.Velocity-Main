package com.velocity.mod.common.entity;

import com.velocity.core.client.Main.ProjectVelocityCore;
import com.velocity.mod.common.entity.car.EntityNissanSkylineR34;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import org.lwjgl.util.glu.Project;

/**
 * Created by Alex on 1/24/2016.
 */
public class InitVelocityEntitys {


    public static void registerEntity(){


        createEntity(EntityNissanSkylineR34.class, "Nissan", 0xF20521, 0x2011CF);

    }
    public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
        int randomId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
        EntityRegistry.registerModEntity(entityClass, entityName, randomId, ProjectVelocityCore.instance, 64, 1, true);
        EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);

        createEgg(randomId, solidColor, spotColor);

    }

    private static void createEgg(int randomId, int solidColor, int spotColor){
        EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));

    }


















    public static Entity entity() {
        return entity();
    }


    public static void init(){
        registerEntity();
    }
}
