package com.enderdevelopment.mjolnir;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MjolnirMod implements ModInitializer {
    public static final String MOD_ID = "mjolnir_mod";
    public static final Item MJOLNIR = new MjolnirItem(new FabricItemSettings().maxCount(1).fireproof());

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "mjolnir"), MJOLNIR);
    }
}