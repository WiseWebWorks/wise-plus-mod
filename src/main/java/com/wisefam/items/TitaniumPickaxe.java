package com.wisefam.items;

import com.wisefam.materials.TitaniumMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumPickaxe extends ItemPickaxe {

    private final String name = "titaniumPickaxe";

    public TitaniumPickaxe() {
        super(TitaniumMaterial.TOOL);

        GameRegistry.registerItem(this, name);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName(name);
    }

    public String getName() {
        return name;
    }
}
