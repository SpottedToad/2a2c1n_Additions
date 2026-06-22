package net.spottedtoad.acn_additions.item.armor;

import net.minecraft.util.Identifier;
import net.spottedtoad.acn_additions.ACNMod;
import net.spottedtoad.acn_additions.item.custom.IridianArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IridianArmorModel extends AnimatedGeoModel<IridianArmorItem> {
    @Override
    public Identifier getModelResource(IridianArmorItem object) {
        return new Identifier(ACNMod.MOD_ID, "geo/iridian_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(IridianArmorItem object) {
        return new Identifier(ACNMod.MOD_ID, "textures/armor/iridian_armor.png");
    }

    @Override
    public Identifier getAnimationResource(IridianArmorItem animatable) {
        return new Identifier(ACNMod.MOD_ID, "animations/iridian_armor.animation.json");
    }
}
