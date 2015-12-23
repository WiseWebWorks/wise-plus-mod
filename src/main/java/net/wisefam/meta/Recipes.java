package net.wisefam.meta;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;

public class Recipes {
    private String[][] armorRecipePatterns = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Item[][] armorRecipeItems = new Item[][]{{ModItems.titaniumIngot}, {ModItems.titaniumHelmet}, {ModItems.titaniumChestplate}, {ModItems.titaniumLeggings}, {ModItems.titaniumBoots}};

    public void addRecipes() {
        CraftingManager craftingManager = CraftingManager.getInstance();
        addIngotRecipes(craftingManager);
        addArmorRecipes(craftingManager);
        addToolRecipes(craftingManager);
        addWeaponRecipes(craftingManager);
    }

    public void addIngotRecipes(CraftingManager craftingManager) {
        ItemStack titaniumIngotStack = new ItemStack(ModItems.titaniumIngot);

        FurnaceRecipes.instance().addSmeltingRecipeForBlock(ModBlocks.titaniumOre, titaniumIngotStack, 1.0f);

        craftingManager.addRecipe(new ItemStack(ModBlocks.titaniumBlock), "###", "###", "###", '#', titaniumIngotStack);
        craftingManager.addRecipe(new ItemStack(ModItems.titaniumIngot, 9), "#", '#', ModBlocks.titaniumBlock);
    }

    public void addArmorRecipes(CraftingManager craftingManager) {
        for (int i = 0; i < armorRecipeItems[0].length; ++i) {
            Item inputItem = armorRecipeItems[0][i];

            for (int j = 0; j < armorRecipeItems.length - 1; ++j) {
                Item outputItem = armorRecipeItems[j + 1][i];
                craftingManager.addRecipe(new ItemStack(outputItem), armorRecipePatterns[j], 'X', inputItem);
            }
        }
    }

    private String[][] tooRecipePatterns = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Item[][] toolRecipeItems = new Item[][]{{ModItems.titaniumIngot}, {ModItems.titaniumPickaxe}, {ModItems.titaniumShovel}, {ModItems.titaniumAxe}, {ModItems.titaniumHoe}};

    public void addToolRecipes(CraftingManager craftingManager) {
        for (int i = 0; i < toolRecipeItems[0].length; ++i) {
            Item inputItem = toolRecipeItems[0][i];

            for (int j = 0; j < toolRecipeItems.length - 1; ++j) {
                Item outputItem = toolRecipeItems[j + 1][i];
                craftingManager.addRecipe(new ItemStack(outputItem), tooRecipePatterns[j], '#', Items.stick, 'X', inputItem);
            }
        }
    }

    private String[][] weaponRecipePatterns = new String[][]{{"X", "X", "#"}};
    private Item[][] weaponRecipeItems = new Item[][]{{ModItems.titaniumIngot}, {ModItems.titaniumSword}};

    public void addWeaponRecipes(CraftingManager craftingManager) {
        for (int i = 0; i < weaponRecipeItems[0].length; ++i) {
            Object inputItem = weaponRecipeItems[0][i];

            for (int j = 0; j < weaponRecipeItems.length - 1; ++j) {
                Item outputItem = weaponRecipeItems[j + 1][i];
                craftingManager.addRecipe(new ItemStack(outputItem), weaponRecipePatterns[j], '#', Items.stick, 'X', inputItem);
            }
        }
    }

}