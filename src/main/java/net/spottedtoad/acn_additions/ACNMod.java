package net.spottedtoad.acn_additions;

import net.fabricmc.api.ModInitializer;
import net.spottedtoad.acn_additions.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ACNMod implements ModInitializer {
	public static final String MOD_ID = "acn_additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
