package org.bukkit.craftbukkit.v1_20_R2.block.data.type;

import org.bukkit.block.data.type.Hopper;
import org.bukkit.craftbukkit.v1_20_R2.block.data.CraftBlockData;

public abstract class CraftHopper extends CraftBlockData implements Hopper {

    private static final net.minecraft.world.level.block.state.properties.BlockStateBoolean ENABLED = getBoolean("enabled");

    @Override
    public boolean isEnabled() {
        return get(ENABLED);
    }

    @Override
    public void setEnabled(boolean enabled) {
        set(ENABLED, enabled);
    }
}
