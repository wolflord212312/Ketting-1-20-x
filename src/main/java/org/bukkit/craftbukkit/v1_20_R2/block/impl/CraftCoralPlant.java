/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_20_R2.block.impl;

public final class CraftCoralPlant extends org.bukkit.craftbukkit.v1_20_R2.block.data.CraftBlockData implements org.bukkit.block.data.Waterlogged {

    public CraftCoralPlant() {
        super();
    }

    public CraftCoralPlant(net.minecraft.world.level.block.state.IBlockData state) {
        super(state);
    }

    // org.bukkit.craftbukkit.v1_20_R2.block.data.CraftWaterlogged

    private static final net.minecraft.world.level.block.state.properties.BlockStateBoolean WATERLOGGED = getBoolean(net.minecraft.world.level.block.BlockCoralPlant.class, "waterlogged");

    @Override
    public boolean isWaterlogged() {
        return get(WATERLOGGED);
    }

    @Override
    public void setWaterlogged(boolean waterlogged) {
        set(WATERLOGGED, waterlogged);
    }
}
