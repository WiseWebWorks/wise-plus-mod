package com.wisefam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumIngot extends Item {

    private final String name = "titaniumIngot";

    public TitaniumIngot() {
        GameRegistry.registerItem(this, name);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMaterials);
        setUnlocalizedName(name);
    }

    public String getName() {
        return name;
    }
}
