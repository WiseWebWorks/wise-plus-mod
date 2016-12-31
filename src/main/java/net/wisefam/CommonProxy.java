package net.wisefam;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.wisefam.crafting.ModCrafting;
import net.wisefam.materials.TitaniumMaterial;
import net.wisefam.meta.ModBlocks;
import net.wisefam.meta.ModItems;

public class CommonProxy {

    /**
     * The preInit Handler is called at the very beginning of the startup routine. In this method we should read your config file,
     * create Blocks, Items, etc. and register them with the GameRegistry.
     */
    public void preInit(FMLPreInitializationEvent e) {
        ModItems.createItems();
        ModBlocks.createBlocks();
        new TitaniumMaterial();
        new ModWorldGenerator();
    }

    /**
     * The init Handler is called after the preInit Handler. In this method we can build up data structures, add Crafting Recipes and register new handler.
     */
    public void init(FMLInitializationEvent e) {
        new ModCrafting().initCrafting();
    }

    /**
     * The postInit Handler is called at the very end. Its used to communicate with other mods and adjust your setup based on this.
     */
    public void postInit(FMLPostInitializationEvent e) {

    }

}
