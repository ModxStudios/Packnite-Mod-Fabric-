package modxvoldhunter.packnite;

import org.slf4j.LoggerFactory;

import modxvoldhunter.packnite.block.ModBlock;
import modxvoldhunter.packnite.item.Moditems;
import net.fabricmc.api.ClientModInitializer;

public class PackniteClient implements ClientModInitializer {
	public static final String MOD_ID = "packnite";
	public static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	@Override
	public void onInitializeClient() {
		Moditems.registerModitems();
		ModBlock.registerModBlock();
	}
}