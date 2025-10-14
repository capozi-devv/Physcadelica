package net.capozi.physcagen.physcagen.foundation;

import net.minecraft.item.FoodComponent;

public class FoodComponentInit {
    public static final FoodComponent PHTALGIA = (new FoodComponent.Builder()).hunger(2).saturationModifier(0F).build();
    public static final FoodComponent RAW_PHTALGIA = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.3F).build();
}
