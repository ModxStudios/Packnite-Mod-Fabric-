package modxvoldhunter.packnite.item;

import modxvoldhunter.packnite.packnite;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Moditems {
        public static final Item RAW_PACKNITE = registerItem("raw_packnite",
                new Item(new FabricItemSettings()));
        public static final Item PACKNITE = registerItem("packnite_block",
                new Item(new FabricItemSettings()));
        public static final Item PACKNITE_SWORD = registerItem("packnite_sword",
                new Item(new FabricItemSettings()));
        public static final Item PACKNITE_PICKAXE = registerItem("packnite_pickaxe",
                new Item(new FabricItemSettings()));
        public static final Item PACKNITE_AXE = registerItem("packnite_axe",
                new Item(new FabricItemSettings()));
        public static final Item PACKNITE_SHOVEL = registerItem("packnite_shovel",
                new Item(new FabricItemSettings()));
        public static final Item PACKNITE_HOE = registerItem("packnite_hoe",
                new Item(new FabricItemSettings()));

        private static Item registerItem(String name, Item item) {
                return Registry.register(Registries.ITEM, new Identifier(packnite.MOD_ID, name), item);
        }
    /* this registers for items */
        public static void registerModitems() {
        packnite.LOGGER.debug("Registering items for" + packnite.MOD_ID);
        }
}
