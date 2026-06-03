package net.spottedtoad.acn_additions.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.spottedtoad.acn_additions.ACNMod;

public class ModItemGroup {
    public static final ItemGroup ADDITIONS = FabricItemGroupBuilder.build(
            new Identifier(ACNMod.MOD_ID, "additions"), () -> new ItemStack(ModItems.COPPER_COIN));
}
