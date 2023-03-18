package modxvoldhunter.packnite.block;

import modxvoldhunter.packnite.Packnite;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlock {
    public static final Block PACKNITE_ORE = registerBlock("packnite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool(),
                UniformIntProvider.create(3, 7)), null);
    public static final Block PACKNITE_BLOCK = registerBlock("packnite_block",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool(),
                UniformIntProvider.create(3, 7)), null);
    public static final Block RAW_PACKNITE_BLOCK = registerBlock("raw_packnite_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), null);
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(Packnite.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Packnite.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlock() {
        Packnite.LOGGER.debug("Registering items for" + Packnite.MOD_ID);
    }
}
