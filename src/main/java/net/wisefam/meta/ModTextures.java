package net.wisefam.meta;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.wisefam.WisePlusMod;
import net.wisefam.items.NamedItem;

@SideOnly(Side.CLIENT)
public class ModTextures {

    public static void registerTextures() {
        ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        // Items
        registerItem(itemModelMesher, ModItems.TITANIUM_AXE);
        registerItem(itemModelMesher, ModItems.TITANIUM_BOOTS);
        registerItem(itemModelMesher, ModItems.TITANIUM_CHESTPLATE);
        registerItem(itemModelMesher, ModItems.TITANIUM_HELMET);
        registerItem(itemModelMesher, ModItems.TITANIUM_HOE);
        registerItem(itemModelMesher, ModItems.TITANIUM_HORSE_ARMOR);
        registerItem(itemModelMesher, ModItems.TITANIUM_INGOT);
        registerItem(itemModelMesher, ModItems.TITANIUM_LEGGINGS);
        registerItem(itemModelMesher, ModItems.TITANIUM_PICKAXE);
        registerItem(itemModelMesher, ModItems.TITANIUM_SHOVEL);
        registerItem(itemModelMesher, ModItems.TITANIUM_SWORD);

        // Blocks
        registerBlock(itemModelMesher, ModBlocks.TITANIUM_ORE);
        registerBlock(itemModelMesher, ModBlocks.TITANIUM_BLOCK);
    }

    private static void registerBlock(ItemModelMesher itemModelMesher, Block block) {
        itemModelMesher.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(WisePlusMod.MODID + ":" + ((NamedItem) block).getName(), "inventory"));
    }

    private static void registerItem(ItemModelMesher itemModelMesher, Item item) {
        itemModelMesher.register(item, 0, new ModelResourceLocation(WisePlusMod.MODID + ":" + ((NamedItem) item).getName(), "inventory"));
    }

}
