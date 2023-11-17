package org.bukkit.craftbukkit.v1_20_R2.entity;

import net.minecraft.world.entity.monster.EntityGiantZombie;
import org.bukkit.craftbukkit.v1_20_R2.CraftServer;
import org.bukkit.entity.Giant;

public class CraftGiant extends CraftMonster implements Giant {

    public CraftGiant(CraftServer server, EntityGiantZombie entity) {
        super(server, entity);
    }

    @Override
    public EntityGiantZombie getHandle() {
        return (EntityGiantZombie) entity;
    }

    @Override
    public String toString() {
        return "CraftGiant";
    }
}
