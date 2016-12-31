package net.wisefam.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wisefam.meta.ModBlocks;
import net.wisefam.meta.ModItems;

public class ModCrafting {
    private String[][] armorRecipePatterns = new String[][]{{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Item[][] armorRecipeItems = new Item[][]{{ModItems.TITANIUM_INGOT}, {ModItems.TITANIUM_HELMET}, {ModItems.TITANIUM_CHESTPLATE}, {ModItems.TITANIUM_LEGGINGS}, {ModItems.TITANIUM_BOOTS}};
    private String[][] toolRecipePatterns = new String[][]{{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Item[][] toolRecipeItems = new Item[][]{{ModItems.TITANIUM_INGOT}, {ModItems.TITANIUM_PICKAXE}, {ModItems.TITANIUM_SHOVEL}, {ModItems.TITANIUM_AXE}, {ModItems.TITANIUM_HOE}};
    private String[][] weaponRecipePatterns = new String[][]{{"X", "X", "#"}};
    private Item[][] weaponRecipeItems = new Item[][]{{ModItems.TITANIUM_INGOT}, {ModItems.TITANIUM_SWORD}};

    public void initCrafting() {
        addIngotRecipes();
        addArmorRecipes();
        addToolRecipes();
        addWeaponRecipes();
        addHorseArmorRecipes();
    }

    public void addIngotRecipes() {
        GameRegistry.addSmelting(ModBlocks.TITANIUM_ORE, new ItemStack(ModItems.TITANIUM_INGOT), 1.0f);
        final ItemStack titaniumIngots = new ItemStack(ModItems.TITANIUM_INGOT, 9);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.TITANIUM_BLOCK), "###", "###", "###", '#', titaniumIngots);
        GameRegistry.addShapelessRecipe(titaniumIngots, ModBlocks.TITANIUM_BLOCK);
    }

    public void addArmorRecipes() {
        for (int i = 0; i < armorRecipeItems[0].length; ++i) {
            Item inputItem = armorRecipeItems[0][i];

            for (int j = 0; j < armorRecipeItems.length - 1; ++j) {
                Item outputItem = armorRecipeItems[j + 1][i];
                GameRegistry.addRecipe(new ItemStack(outputItem), armorRecipePatterns[j], 'X', inputItem);
            }
        }
    }

    public void addToolRecipes() {
        for (int i = 0; i < toolRecipeItems[0].length; ++i) {
            Item inputItem = toolRecipeItems[0][i];

            for (int j = 0; j < toolRecipeItems.length - 1; ++j) {
                Item outputItem = toolRecipeItems[j + 1][i];
                GameRegistry.addRecipe(new ItemStack(outputItem), toolRecipePatterns[j], '#', Items.STICK, 'X', inputItem);
            }
        }
    }
    public void addWeaponRecipes() {
        for (int i = 0; i < weaponRecipeItems[0].length; ++i) {
            Object inputItem = weaponRecipeItems[0][i];

            for (int j = 0; j < weaponRecipeItems.length - 1; ++j) {
                Item outputItem = weaponRecipeItems[j + 1][i];
                GameRegistry.addRecipe(new ItemStack(outputItem), weaponRecipePatterns[j], '#', Items.STICK, 'X', inputItem);
            }
        }
    }

    public void addHorseArmorRecipes() {
        String[] horseArmorPattern = new String[]{"  #", "###", "# #"};
        GameRegistry.addRecipe(new ItemStack(ModItems.TITANIUM_HORSE_ARMOR), horseArmorPattern, '#', ModItems.TITANIUM_INGOT);
        GameRegistry.addRecipe(new ItemStack(Items.IRON_HORSE_ARMOR), horseArmorPattern, '#', Items.IRON_INGOT);
        GameRegistry.addRecipe(new ItemStack(Items.GOLDEN_HORSE_ARMOR), horseArmorPattern, '#', Items.GOLD_INGOT);
        GameRegistry.addRecipe(new ItemStack(Items.DIAMOND_HORSE_ARMOR), horseArmorPattern, '#', Items.DIAMOND);
    }

}