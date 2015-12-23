package com.wisefam.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TitaniumOre extends BlockOre {

    private final String name = "titaniumOre";

    public TitaniumOre() {
        super();

        GameRegistry.registerBlock(this, name);
        setHardness(3.0F);
        setResistance(5.0F);
        setStepSound(Block.soundTypePiston);
        setUnlocalizedName(name);
        setHarvestLevel("pickaxe", 1);
    }

    public String getName() {
        return name;
    }

}
