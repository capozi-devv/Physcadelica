package net.capozi.physcagen;

import net.capozi.physcagen.common.block.fluid.PhtalgiaFluid;
import net.capozi.physcagen.foundation.BlockInit;
import net.capozi.physcagen.foundation.EffectInit;
import net.capozi.physcagen.foundation.ItemInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Physcadelica implements ModInitializer {
    public static final String MOD_ID = "physcadelica";
    public static FlowableFluid STILL_PHTALGIA;
    public static FlowableFluid FLOWING_PHTALGIA;
    @Override
    public void onInitialize() {
        STILL_PHTALGIA = Registry.register(Registries.FLUID, new Identifier(MOD_ID, "phtalgia"), new PhtalgiaFluid.Still());
        FLOWING_PHTALGIA = Registry.register(Registries.FLUID, new Identifier(MOD_ID, "flowing_phtalgia"), new PhtalgiaFluid.Flowing());
        ItemInit.init();
        BlockInit.init();
        EffectInit.init();
    }
}
