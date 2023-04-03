package test.lol;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final String MOD_ID = "lol";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    

    public static final Block PACKNITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    public static final Block PACKNITE_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));

    public static final Block PACKNITE_DEEPSLATE_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));


    public static final Item PACKNITE =
      Registry.register(Registries.ITEM, new Identifier(MOD_ID, "packnite"),
        new Item(new FabricItemSettings()));

    public static final Item RAW_PACKNITE =
      Registry.register(Registries.ITEM, new Identifier(MOD_ID, "raw_packnite"),
        new Item(new FabricItemSettings()));

    public static final Item PACKNITE_SWORD =
      Registry.register(Registries.ITEM, new Identifier(MOD_ID, "packnite_sword"),
        new Item(new FabricItemSettings()));

    public static final Item PACKNITE_PICKAXE =
      Registry.register(Registries.ITEM, new Identifier(MOD_ID, "packnite_pickaxe"),
        new Item(new FabricItemSettings()));

    public static final Item PACKNITE_AXE =
      Registry.register(Registries.ITEM, new Identifier(MOD_ID, "packnite_axe"),
        new Item(new FabricItemSettings()));

    public static final Item PACKNITE_SHOVEL =
      Registry.register(Registries.ITEM, new Identifier(MOD_ID, "packnite_shovel"),
        new Item(new FabricItemSettings()));

    public static final Item PACKNITE_HOE =
      Registry.register(Registries.ITEM, new Identifier(MOD_ID, "packnite_hoe"),
        new Item(new FabricItemSettings()));

    @Override
    public void onInitialize() {

        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "packnite_block"), PACKNITE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "packnite_block"), new BlockItem(PACKNITE_BLOCK, new FabricItemSettings()));

	}
}