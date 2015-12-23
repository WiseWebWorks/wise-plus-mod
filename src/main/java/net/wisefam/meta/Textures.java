package net.wisefam.meta;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Textures {

    public void registerTextures(String MODID) {
        ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        // Blocks
        itemModelMesher.register(Item.getItemFromBlock(Blocks.titaniumOre), 0, new ModelResourceLocation(MODID + ":" + Blocks.titaniumOre.getName(), "inventory"));
        itemModelMesher.register(Item.getItemFromBlock(Blocks.titaniumBlock), 0, new ModelResourceLocation(MODID + ":" + Blocks.titaniumBlock.getName(), "inventory"));

        // Items
        itemModelMesher.register(Items.titaniumAxe, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumAxe.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumBoots, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumBoots.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumChestplate, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumChestplate.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumHelmet, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumHelmet.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumHoe, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumHoe.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumHorseArmor, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumHorseArmor.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumIngot, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumIngot.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumLeggings, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumLeggings.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumPickaxe, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumPickaxe.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumShovel, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumShovel.getName(), "inventory"));
        itemModelMesher.register(Items.titaniumSword, 0, new ModelResourceLocation(MODID + ":" + Items.titaniumSword.getName(), "inventory"));
    }
}
