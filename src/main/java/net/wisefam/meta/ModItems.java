package net.wisefam.meta;

import net.wisefam.items.*;

public class ModItems {

    public static TitaniumAxe TITANIUM_AXE;
    public static TitaniumBoots TITANIUM_BOOTS;
    public static TitaniumChestplate TITANIUM_CHESTPLATE;
    public static TitaniumHelmet TITANIUM_HELMET;
    public static TitaniumHoe TITANIUM_HOE;
    public static TitaniumHorseArmor TITANIUM_HORSE_ARMOR;
    public static TitaniumIngot TITANIUM_INGOT;
    public static TitaniumLeggings TITANIUM_LEGGINGS;
    public static TitaniumPickaxe TITANIUM_PICKAXE;
    public static TitaniumShovel TITANIUM_SHOVEL;
    public static TitaniumSword TITANIUM_SWORD;

    public static void createItems() {
        TITANIUM_AXE = new TitaniumAxe();
        TITANIUM_BOOTS = new TitaniumBoots();
        TITANIUM_CHESTPLATE = new TitaniumChestplate();
        TITANIUM_HELMET = new TitaniumHelmet();
        TITANIUM_HOE = new TitaniumHoe();
        TITANIUM_HORSE_ARMOR = new TitaniumHorseArmor();
        TITANIUM_INGOT = new TitaniumIngot();
        TITANIUM_LEGGINGS = new TitaniumLeggings();
        TITANIUM_PICKAXE = new TitaniumPickaxe();
        TITANIUM_SHOVEL = new TitaniumShovel();
        TITANIUM_SWORD = new TitaniumSword();
    }

}
