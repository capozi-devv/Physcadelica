package net.capozi.physcagen.foundation;

import net.capozi.physcagen.Physcadelica;
import net.capozi.physcagen.common.effect.PhotophobiaEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class EffectInit {
    public static void init() {}
    public static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Physcadelica.MOD_ID, name),statusEffect);
    }
    public static final StatusEffect PHOTOPHOBIA = new PhotophobiaEffect(StatusEffectCategory.NEUTRAL, 0x00FF99);
    public static final RegistryEntry<StatusEffect> PHOTOPHOBIA_EFFECT = registerStatusEffect("photophobia", PHOTOPHOBIA);
}
