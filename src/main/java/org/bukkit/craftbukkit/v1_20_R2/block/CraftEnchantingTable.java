package org.bukkit.craftbukkit.v1_20_R2.block;

import net.minecraft.world.level.block.entity.TileEntityEnchantTable;
import org.bukkit.World;
import org.bukkit.block.EnchantingTable;
import org.bukkit.craftbukkit.v1_20_R2.util.CraftChatMessage;

public class CraftEnchantingTable extends CraftBlockEntityState<TileEntityEnchantTable> implements EnchantingTable {

    public CraftEnchantingTable(World world, TileEntityEnchantTable tileEntity) {
        super(world, tileEntity);
    }

    protected CraftEnchantingTable(CraftEnchantingTable state) {
        super(state);
    }

    @Override
    public String getCustomName() {
        TileEntityEnchantTable enchant = this.getSnapshot();
        return enchant.hasCustomName() ? CraftChatMessage.fromComponent(enchant.getCustomName()) : null;
    }

    @Override
    public void setCustomName(String name) {
        this.getSnapshot().setCustomName(CraftChatMessage.fromStringOrNull(name));
    }

    @Override
    public void applyTo(TileEntityEnchantTable enchantingTable) {
        super.applyTo(enchantingTable);

        if (!this.getSnapshot().hasCustomName()) {
            enchantingTable.setCustomName(null);
        }
    }

    @Override
    public CraftEnchantingTable copy() {
        return new CraftEnchantingTable(this);
    }
}
