package net.wisefam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wisefam.WisePlusMod;
import net.wisefam.materials.TitaniumMaterial;

public abstract class TitaniumArmor extends ItemArmor {

    private final String name;

    private final TitaniumItemRegenerator itemRegenerator = new TitaniumItemRegenerator(this);

    protected TitaniumArmor(String name, int armorType) {
        super(TitaniumMaterial.ARMOR, 5, armorType);

        GameRegistry.registerItem(this, name);
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabCombat);
        setUnlocalizedName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return WisePlusMod.MODID + ":textures/models/armor/titanium_layer_" + (this.armorType == 2 ? "2" : "1") + ".png";
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        itemRegenerator.onUpdate(stack, worldIn, entityIn);
    }

}
