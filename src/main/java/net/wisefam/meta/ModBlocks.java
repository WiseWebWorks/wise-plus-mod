package net.wisefam.meta;

import net.wisefam.blocks.TitaniumBlock;
import net.wisefam.blocks.TitaniumOre;

public class ModBlocks {

    public static TitaniumOre TITANIUM_ORE;
    public static TitaniumBlock TITANIUM_BLOCK;

    public static void createBlocks() {
        TITANIUM_ORE = new TitaniumOre();
        TITANIUM_BLOCK = new TitaniumBlock();
    }

}
