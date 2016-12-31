package net.wisefam;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = WisePlusMod.MODID, name = WisePlusMod.MODNAME, version = WisePlusMod.MODVERSION)
public class WisePlusMod {

    //Set the ID of the mod (Should be lower case).
    public static final String MODID = "wisefamilyplusmod";

    //Set the "Name" of the mod.
    public static final String MODNAME = "Wise Family Plus";

    public static final String MODVERSION = "1.0.0";

    @Instance(value = WisePlusMod.MODID) //Tell Forge what instance to use.
    public static WisePlusMod instance = new WisePlusMod();

    @SidedProxy(clientSide = "net.wisefam.ClientProxy", serverSide = "net.wisefam.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        this.proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        this.proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        this.proxy.postInit(event);
    }

}
