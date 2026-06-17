package net.spottedtoad.acn_additions.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.spottedtoad.acn_additions.ACNMod;
import net.spottedtoad.acn_additions.item.ModItemGroup;

public class ModBlocks {

    public static final Block IRIDIAN_CRYSTAL_BLOCK = registerBlock("iridian_crystal_block",
            new OreBlock(FabricBlockSettings.of(Material.AMETHYST).strength(3f).requiresTool(),
                    UniformIntProvider.create(3,6)), ModItemGroup.ADDITIONS);
    public static final Block STROMATOLITE = registerBlock("stromatolite",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ADDITIONS);
    public static final Block SCORCHED_STROMATOLITE = registerBlock("scorched_stromatolite",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.ADDITIONS);


    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ACNMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(ACNMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        ACNMod.LOGGER.debug("Registering ModBlocks for" + ACNMod.MOD_ID);
    }
}
