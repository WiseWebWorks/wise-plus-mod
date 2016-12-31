package net.wisefam;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.wisefam.meta.ModTextures;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

    /**
     * The preInit Handler is called at the very beginning of the startup routine. In this method we should read your config file,
     * create Blocks, Items, etc. and register them with the GameRegistry.
     */
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    /**
     * The init Handler is called after the preInit Handler. In this method we can build up data structures, add Crafting Recipes and register new handler.
     */
    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ModTextures.registerTextures();
    }

    /**
     * The postInit Handler is called at the very end. Its used to communicate with other mods and adjust your setup based on this.
     */
    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

}
