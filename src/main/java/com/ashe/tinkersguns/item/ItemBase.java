package com.ashe.tinkersguns.item;

import net.minecraft.item.Item;
import com.ashe.tinkersguns.TinkersGuns;

public class ItemBase extends Item {

    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setCreativeTab(TinkersGuns.creativeTab);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    public void registerItemModel() {
        TinkersGuns.proxy.registerItemRenderer(this, 0, name);
    }
}