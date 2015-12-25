package net.wisefam.items;

import net.wisefam.materials.TitaniumMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumHoe extends ItemHoe {

    private final String name = "titaniumHoe";

    public TitaniumHoe() {
        super(TitaniumMaterial.TOOL);

        GameRegistry.registerItem(this, name);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName(name);
    }

    public String getName() {
        return name;
    }
}
