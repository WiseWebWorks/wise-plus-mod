package net.wisefam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wisefam.materials.TitaniumMaterial;

public class TitaniumSword extends ItemSword {

    private final String name = "titaniumSword";

    private final TitaniumItemRegenerator itemRegenerator = new TitaniumItemRegenerator(this);

    public TitaniumSword() {
        super(TitaniumMaterial.TOOL);

        GameRegistry.registerItem(this, name);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        itemRegenerator.onUpdate(stack, worldIn, entityIn);
    }

}
