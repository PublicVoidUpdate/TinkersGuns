package com.ashe.tinkersguns.item;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemOre ingotGunmetal = (ItemOre) new ItemOre("ingot_gunmetal", "ingotGunmetal");
    public static ItemBase spring = new ItemBase("spring");
    public static ItemBase gunFrame = new ItemBase("gun_frame");
    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
            ingotGunmetal,
                gunFrame,
                spring
        );
    }

    public static void registerModels() {
        ingotGunmetal.registerItemModel();
        spring.registerItemModel();
        gunFrame.registerItemModel();
    }

}