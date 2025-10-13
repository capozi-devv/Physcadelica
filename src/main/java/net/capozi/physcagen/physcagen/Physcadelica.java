package net.capozi.physcagen.physcagen;

import net.capozi.physcagen.physcagen.foundation.BlockInit;
import net.capozi.physcagen.physcagen.foundation.EffectInit;
import net.capozi.physcagen.physcagen.foundation.ItemInit;
import net.fabricmc.api.ModInitializer;

public class Physcadelica implements ModInitializer {
    public static final String MOD_ID = "physcadelica";
    @Override
    public void onInitialize() {
        ItemInit.init();
        BlockInit.init();
        EffectInit.init();
    }
}
