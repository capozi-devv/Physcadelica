package net.capozi.physcagen.physcagen.foundation;

import net.capozi.physcagen.physcagen.Physcadelica;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class EffectInit {
    public static void init() {}
    public static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Physcadelica.MOD_ID, name),statusEffect);
    }
}
