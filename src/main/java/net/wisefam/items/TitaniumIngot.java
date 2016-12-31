package net.wisefam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumIngot extends Item implements NamedItem {

    private final String name = "titanium_ingot";

    public TitaniumIngot() {
        GameRegistry.register(setRegistryName(name));
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.MATERIALS);
        setUnlocalizedName(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
