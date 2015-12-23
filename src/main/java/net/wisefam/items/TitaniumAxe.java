package net.wisefam.items;

import net.wisefam.materials.TitaniumMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumAxe extends ItemAxe {

    private final String name = "titaniumAxe";

    public TitaniumAxe() {
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
