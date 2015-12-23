package net.wisefam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumBlock extends Block {

    private final String name = "titaniumBlock";

    public TitaniumBlock() {
        super(Material.iron, MapColor.ironColor);

        GameRegistry.registerBlock(this, name);
        setHardness(5.0F);
        setResistance(10.0F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName(name);
        setCreativeTab(CreativeTabs.tabBlock);
        setHarvestLevel("pickaxe", 1);
    }

    public String getName() {
        return name;
    }
}
