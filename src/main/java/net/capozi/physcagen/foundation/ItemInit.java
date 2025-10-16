package net.capozi.physcagen.foundation;

import net.capozi.physcagen.Physcadelica;
import net.capozi.physcagen.common.item.PurifiedPhtalgiaItem;
import net.capozi.physcagen.common.item.RawPhtalgiaItem;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    public static void init() {}
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Physcadelica.MOD_ID, name), item);
    }
    public static final Item RAW_PHTALGIA = registerItem("raw_phtalgia", new RawPhtalgiaItem(new Item.Settings().maxCount(16).food(FoodComponentInit.RAW_PHTALGIA)));
    public static final Item PHTALGIA_FLASK = registerItem("flask_of_raw_phtalgia", new Item(new Item.Settings()));
    public static final Item IMPURE_PHTALGIA = registerItem("impure_phtalgia", new Item(new Item.Settings()));
    public static final Item PURIFIED_PHTALGIA = registerItem("purified_phtalgia", new PurifiedPhtalgiaItem(new Item.Settings().maxCount(16).fireproof().food(FoodComponentInit.PHTALGIA)));
    public static final Item CONCOCTION = registerItem("concoction", new Item(new Item.Settings().maxCount(8)));
    public static final Item PHTALGIA_BUCKET = registerItem("phtalgia_bucket", new BucketItem(Physcadelica.STILL_PHTALGIA, new Item.Settings().maxCount(1).recipeRemainder(net.minecraft.item.Items.BUCKET).fireproof()));
}
