package org.bukkit.craftbukkit.v1_20_R2.entity;

import com.google.common.base.Preconditions;
import net.minecraft.world.entity.monster.EntitySkeleton;
import org.bukkit.craftbukkit.v1_20_R2.CraftServer;
import org.bukkit.entity.Skeleton;

public class CraftSkeleton extends CraftAbstractSkeleton implements Skeleton {

    public CraftSkeleton(CraftServer server, EntitySkeleton entity) {
        super(server, entity);
    }

    @Override
    public boolean isConverting() {
        return this.getHandle().isFreezeConverting();
    }

    @Override
    public int getConversionTime() {
        Preconditions.checkState(this.isConverting(), "Entity is not converting");
        return this.getHandle().conversionTime;
    }

    @Override
    public void setConversionTime(int time) {
        if (time < 0) {
            this.getHandle().conversionTime = -1;
            this.getHandle().getEntityData().set(EntitySkeleton.DATA_STRAY_CONVERSION_ID, false);
        } else {
            this.getHandle().startFreezeConversion(time);
        }
    }

    @Override
    public EntitySkeleton getHandle() {
        return (EntitySkeleton) entity;
    }

    @Override
    public String toString() {
        return "CraftSkeleton";
    }

    @Override
    public SkeletonType getSkeletonType() {
       return SkeletonType.NORMAL;
    }
}
