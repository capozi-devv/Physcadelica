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
    public static final Item RAW_PHTALGIA = registerItem("raw_phtalgia", new Item(new Item.Settings().maxCount(16)));
    public static final Item PURIFIED_PHTALGIA = registerItem("purified_phtalgia", new Item(new Item.Settings().maxCount(16).fireproof()));
    public static final Item CONCOCTION = registerItem("concoction", new Item(new Item.Settings().maxCount(8)));
}
