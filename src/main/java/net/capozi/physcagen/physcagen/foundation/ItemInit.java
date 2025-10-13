package net.capozi.physcagen.physcagen.foundation;

import net.capozi.physcagen.physcagen.Physcadelica;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    public static void init() {}
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Physcadelica.MOD_ID, name), item);
    }
}
