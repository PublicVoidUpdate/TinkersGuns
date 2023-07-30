package com.ashe.tinkersguns.block;


import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockOre blockGunmetal = new BlockOre("block_gunmetal", "blockGunmetal");

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                blockGunmetal
        );
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                blockGunmetal.createItemBlock()
        );
    }

    public static void registerModels() {
        blockGunmetal.registerItemModel(Item.getItemFromBlock(blockGunmetal));
    }

}