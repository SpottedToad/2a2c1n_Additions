package net.spottedtoad.acn_additions.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.spottedtoad.acn_additions.ACNMod;
import net.minecraft.item.Item;

public class ModItems {
    public static final Item COPPER_COIN = registerItem("copper_coin",
            new Item(new FabricItemSettings().group(ModItemGroup.ADDITIONS)));
    public static final Item SILVER_COIN = registerItem("silver_coin",
            new Item(new FabricItemSettings().group(ModItemGroup.ADDITIONS)));
    public static final Item GOLD_COIN = registerItem("gold_coin",
            new Item(new FabricItemSettings().group(ModItemGroup.ADDITIONS)));
    public static final Item IRIDIAN_CRYSTAL = registerItem("iridian_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.ADDITIONS)));
    public static final Item IRIDIANITE = registerItem("iridianite",
            new Item(new FabricItemSettings().group(ModItemGroup.ADDITIONS)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ACNMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ACNMod.LOGGER.debug("Registering Mod Items for " + ACNMod.MOD_ID);
    }
}
