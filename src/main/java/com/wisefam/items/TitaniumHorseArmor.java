package com.wisefam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumHorseArmor extends Item {

    private final String name = "titaniumHorseArmor";

    public TitaniumHorseArmor() {
        GameRegistry.registerItem(this, name);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName(name);
    }

    public String getName() {
        return name;
    }
}
