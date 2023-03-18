package modxvoldhunter.packnite;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import modxvoldhunter.packnite.block.ModBlock;
import modxvoldhunter.packnite.item.Moditems;

public class Packnite implements ModInitializer {
	public static final String MOD_ID = "packnite";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Moditems.registerModitems();
		ModBlock.registerModBlock();
	}
}