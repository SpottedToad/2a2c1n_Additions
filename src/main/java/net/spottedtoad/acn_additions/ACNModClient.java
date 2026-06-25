package net.spottedtoad.acn_additions;

import mod.azure.azurelib.render.armor.AzArmorRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.spottedtoad.acn_additions.block.ModBlocks;
import net.spottedtoad.acn_additions.item.ModItems;
import net.spottedtoad.acn_additions.item.armor.IridianArmorRenderer;

public class ACNModClient implements ClientModInitializer {
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRANGE_ICE,RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FROZEN_CREATURE_AXOLOTL,RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FROZEN_CREATURE_FROG,RenderLayer.getTranslucent());

        AzArmorRendererRegistry.register(IridianArmorRenderer::new,
                ModItems.IRIDIANITE_HELMET,
                ModItems.IRIDIANITE_CHESTPLATE,
                ModItems.IRIDIANITE_LEGGINGS,
                ModItems.IRIDIANITE_BOOTS);

        ModelPredicateProviderRegistry.register(Items.AXOLOTL_BUCKET, new Identifier("acn_additions", "space_variant"),
                (stack, world, entity, seed) -> {
                    if (stack.hasNbt() && stack.getNbt().contains("SpaceVariant", 3)) {
                        return (float) stack.getNbt().getInt("SpaceVariant");
                    }
                    return 0.0F; // Return 0 (default texture) if the tag is missing
                });
    }
}
