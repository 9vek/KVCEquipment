package cn.kevyn.kvc.equipment.content.armors.patches;

import cn.kevyn.kvc.equipment.KVCEquipment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class KVCArmorMaterial implements ArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};

    private String materialName;
    private int durability;
    private int[] protection;
    private int enchantability;
    private float toughness;
    private float knockbackResistance;
    private Ingredient repairIngredient;
    private SoundEvent equipSound;

    public KVCArmorMaterial(String materialName, Ingredient repairIngredient, SoundEvent equipSound) {

        this.materialName = materialName;
        this.repairIngredient = repairIngredient;
        this.equipSound = equipSound;

        durability = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-armor-durability");
        protection = (int[]) KVCEquipment.CONFIG.getOfType("int[]", materialName+"-armor-protection");
        enchantability = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-armor-enchantability");
        toughness = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-armor-toughness");
        knockbackResistance = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-armor-knockback-resistance");

    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * durability;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return protection[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }

    @Override
    public String getName() {
        return materialName + "_armor_material";
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}
