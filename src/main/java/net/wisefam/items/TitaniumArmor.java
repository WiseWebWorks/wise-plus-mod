package net.wisefam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.wisefam.WisePlusMod;
import net.wisefam.materials.TitaniumMaterial;

import javax.annotation.Nullable;

public abstract class TitaniumArmor extends ItemArmor implements NamedItem {

    private final String name;

    private final TitaniumItemRegenerator itemRegenerator = new TitaniumItemRegenerator(this);

    protected TitaniumArmor(String name, EntityEquipmentSlot armorType) {
        super(TitaniumMaterial.ARMOR, 5, armorType);

        GameRegistry.register(setRegistryName(name));
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.COMBAT);
        setUnlocalizedName(name);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Nullable
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot armorType, String type) {
        return WisePlusMod.MODID + ":textures/models/armor/titanium_layer_" + (this.armorType == EntityEquipmentSlot.LEGS ? "2" : "1") + ".png";
    }

    @Override
    public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        itemRegenerator.onUpdate(stack, worldIn, entityIn);
    }

}
