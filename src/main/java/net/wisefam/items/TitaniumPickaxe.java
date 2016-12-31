package net.wisefam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wisefam.materials.TitaniumMaterial;

public class TitaniumPickaxe extends ItemPickaxe implements NamedItem {

    private final String name = "titanium_pickaxe";

    private final TitaniumItemRegenerator itemRegenerator = new TitaniumItemRegenerator(this);

    public TitaniumPickaxe() {
        super(TitaniumMaterial.TOOL);

        GameRegistry.register(setRegistryName(name));
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.TOOLS);
        setUnlocalizedName(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        itemRegenerator.onUpdate(stack, worldIn, entityIn);
    }

}
