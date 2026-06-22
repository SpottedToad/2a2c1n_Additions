package net.spottedtoad.acn_additions;

import mod.azure.azurelib.render.armor.AzArmorRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;
import net.spottedtoad.acn_additions.block.ModBlocks;
import net.spottedtoad.acn_additions.item.ModItems;
import net.spottedtoad.acn_additions.item.armor.IridianArmorBoneProvider;
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
    }
}
