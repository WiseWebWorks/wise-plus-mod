package net.wisefam.meta;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Textures {

    public void registerTextures(String MODID) {
        ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        // Blocks
        itemModelMesher.register(Item.getItemFromBlock(ModBlocks.titaniumOre), 0, new ModelResourceLocation(MODID + ":" + ModBlocks.titaniumOre.getName(), "inventory"));
        itemModelMesher.register(Item.getItemFromBlock(ModBlocks.titaniumBlock), 0, new ModelResourceLocation(MODID + ":" + ModBlocks.titaniumBlock.getName(), "inventory"));

        // Items
        itemModelMesher.register(ModItems.titaniumAxe, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumAxe.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumBoots, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumBoots.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumChestplate, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumChestplate.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumHelmet, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumHelmet.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumHoe, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumHoe.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumHorseArmor, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumHorseArmor.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumIngot, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumIngot.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumLeggings, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumLeggings.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumPickaxe, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumPickaxe.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumShovel, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumShovel.getName(), "inventory"));
        itemModelMesher.register(ModItems.titaniumSword, 0, new ModelResourceLocation(MODID + ":" + ModItems.titaniumSword.getName(), "inventory"));
    }
}
