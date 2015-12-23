package com.wisefam.meta;

import com.wisefam.items.*;

public class Items {

    public static TitaniumAxe titaniumAxe;
    public static TitaniumBoots titaniumBoots;
    public static TitaniumChestplate titaniumChestplate;
    public static TitaniumHelmet titaniumHelmet;
    public static TitaniumHoe titaniumHoe;
    public static TitaniumHorseArmor titaniumHorseArmor;
    public static TitaniumIngot titaniumIngot;
    public static TitaniumLeggings titaniumLeggings;
    public static TitaniumPickaxe titaniumPickaxe;
    public static TitaniumShovel titaniumShovel;
    public static TitaniumSword titaniumSword;

    public static void initialize() {
        titaniumAxe = new TitaniumAxe();
        titaniumBoots = new TitaniumBoots();
        titaniumChestplate = new TitaniumChestplate();
        titaniumHelmet = new TitaniumHelmet();
        titaniumHoe = new TitaniumHoe();
        titaniumHorseArmor = new TitaniumHorseArmor();
        titaniumIngot = new TitaniumIngot();
        titaniumLeggings = new TitaniumLeggings();
        titaniumPickaxe = new TitaniumPickaxe();
        titaniumShovel = new TitaniumShovel();
        titaniumSword = new TitaniumSword();
    }

}
