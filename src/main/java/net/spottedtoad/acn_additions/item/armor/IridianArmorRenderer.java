package net.spottedtoad.acn_additions.item.armor;

import mod.azure.azurelib.render.armor.AzArmorRenderer;
import mod.azure.azurelib.render.armor.AzArmorRendererConfig;
import net.minecraft.util.Identifier;
import net.spottedtoad.acn_additions.ACNMod;

public class IridianArmorRenderer extends AzArmorRenderer {
    private static final Identifier MODEL = new Identifier(
            ACNMod.MOD_ID,
            "geo/iridian_armor.geo.json"
    );

    private static final Identifier TEXTURE = new Identifier(
            ACNMod.MOD_ID,
            "textures/armor/iridian_armor.png"
    );

    public IridianArmorRenderer() {
        super(AzArmorRendererConfig.builder(MODEL, TEXTURE)
                .setBoneProvider(new IridianArmorBoneProvider())
                .build()
        );
    }

}