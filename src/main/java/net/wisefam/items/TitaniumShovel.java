package net.wisefam.items;

import net.wisefam.materials.TitaniumMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumShovel extends ItemSpade {

    private final String name = "titaniumShovel";

    public TitaniumShovel() {
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
