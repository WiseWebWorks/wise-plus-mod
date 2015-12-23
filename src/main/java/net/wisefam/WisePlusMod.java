package net.wisefam;

import net.wisefam.materials.TitaniumMaterial;
import net.wisefam.meta.Blocks;
import net.wisefam.meta.Items;
import net.wisefam.meta.Recipes;
import net.wisefam.meta.Textures;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = WisePlusMod.MODID, name = WisePlusMod.MODNAME, version = WisePlusMod.MODVERSION)
public class WisePlusMod {

    //Set the ID of the mod (Should be lower case).
    public static final String MODID = "wisefamilyplusmod";

    //Set the "Name" of the mod.
    public static final String MODNAME = "Wise Family Plus";

    public static final String MODVERSION = "1.0.0";

    @Mod.Instance(value = WisePlusMod.MODID) //Tell Forge what instance to use.
    public static WisePlusMod instance = new WisePlusMod();

    public static final Material titanium = new TitaniumMaterial();

    /**
     * The preInit Handler is called at the very beginning of the startup routine. In this method we should read your config file,
     * create Blocks, Items, etc. and register them with the GameRegistry.
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Blocks
        Blocks.initialize();

        // Items
        Items.initialize();
    }

    /**
     * The init Handler is called after the preInit Handler. In this method we can build up data structures, add Crafting Recipes and register new handler.
     */
    @EventHandler
    public void init(FMLInitializationEvent event) {
        new Recipes().addRecipes();

        if (event.getSide() == Side.CLIENT) {
            new Textures().registerTextures(MODID);
        }
    }

    /**
     * The postInit Handler is called at the very end. Its used to communicate with other mods and adjust your setup based on this.
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }

}
