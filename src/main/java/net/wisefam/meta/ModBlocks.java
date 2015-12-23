package net.wisefam.meta;

import net.wisefam.blocks.TitaniumBlock;
import net.wisefam.blocks.TitaniumOre;

public class ModBlocks {

    public static TitaniumOre titaniumOre;
    public static TitaniumBlock titaniumBlock;

    public static void initialize() {
        titaniumOre = new TitaniumOre();
        titaniumBlock = new TitaniumBlock();
    }
}
