package org.bukkit.craftbukkit.v1_20_R3.tag;

import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.core.Registry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_20_R3.util.CraftMagicNumbers;

public class CraftItemTag extends CraftTag<Item, Material> {

    public CraftItemTag(Registry<Item> registry, TagKey<Item> tag) {
        super(registry, tag);
    }

    @Override
    public boolean isTagged(Material item) {
        Item minecraft = CraftMagicNumbers.getItem(item);

        // SPIGOT-6952: A Material is not necessary an item, in this case return false
        if (minecraft == null) {
            return false;
        }

        return minecraft.builtInRegistryHolder().is(tag);
    }

    @Override
    public Set<Material> getValues() {
        return getHandle().stream().map((item) -> CraftMagicNumbers.getMaterial(item.value())).collect(Collectors.toUnmodifiableSet());
    }
}
