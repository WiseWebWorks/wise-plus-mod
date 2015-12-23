package com.wisefam.meta;

import com.wisefam.blocks.TitaniumBlock;
import com.wisefam.blocks.TitaniumOre;

public class Blocks {

    public static TitaniumOre titaniumOre;
    public static TitaniumBlock titaniumBlock;

    public static void initialize() {
        titaniumOre = new TitaniumOre();
        titaniumBlock = new TitaniumBlock();
    }
}
