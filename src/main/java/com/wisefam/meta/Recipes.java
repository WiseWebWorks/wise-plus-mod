package com.wisefam.meta;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;

public class Recipes {
    private String[][] armorRecipePatterns = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Item[][] armorRecipeItems = new Item[][]{{Items.titaniumIngot}, {Items.titaniumHelmet}, {Items.titaniumChestplate}, {Items.titaniumLeggings}, {Items.titaniumBoots}};

    public void addRecipes() {
        CraftingManager craftingManager = CraftingManager.getInstance();
        addIngotRecipes(craftingManager);
        addArmorRecipes(craftingManager);
    }

    public void addIngotRecipes(CraftingManager craftingManager) {
        ItemStack titaniumIngotStack = new ItemStack(Items.titaniumIngot);

        FurnaceRecipes.instance().addSmeltingRecipeForBlock(Blocks.titaniumOre, titaniumIngotStack, 1.0f);

        craftingManager.addRecipe(new ItemStack(Blocks.titaniumBlock), "###", "###", "###", '#', titaniumIngotStack);
        craftingManager.addRecipe(new ItemStack(Items.titaniumIngot, 9), "#", '#', Blocks.titaniumBlock);
    }

    public void addArmorRecipes(CraftingManager craftingManager) {
        for (int i = 0; i < armorRecipeItems[0].length; ++i) {
            Item item = armorRecipeItems[0][i];

            for (int j = 0; j < armorRecipeItems.length - 1; ++j) {
                Item item1 = armorRecipeItems[j + 1][i];
                craftingManager.addRecipe(new ItemStack(item1), armorRecipePatterns[j], 'X', item);
            }
        }
    }
}