package cn.kevyn.kvc.equipment.content.tools;

import cn.kevyn.kvc.equipment.KVCEquipment;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class KVCToolMaterial implements ToolMaterial {

    private String materialName;
    private int durability;
    private int miningLevel;
    private float miningSpeed;
    private float attackDamage;
    private int enchantability;
    private float axeAttackDamagePlus;
    private float axeAttackSpeed;
    private int hoeAttackDamagePlus;
    private float hoeAttackSpeed;
    private int pickaxeAttackDamagePlus;
    private float pickaxeAttackSpeed;
    private float shovelAttackDamagePlus;
    private float shovelAttackSpeed;
    private int swordAttackDamagePlus;
    private float swordAttackSpeed;
    private Ingredient repairIngredient;

    public KVCToolMaterial(String materialName, Ingredient repairIngredient) {

        this.materialName = materialName;
        this.repairIngredient = repairIngredient;

        durability = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-tool-durability");
        miningLevel = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-tool-mining-level");
        miningSpeed = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-tool-mining-speed");
        attackDamage = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-tool-attack-damage");
        enchantability = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-tool-enchantability");
        axeAttackDamagePlus = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-axe-attack-damage-plus");
        axeAttackSpeed = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-axe-attack-speed");
        hoeAttackDamagePlus = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-hoe-attack-damage-plus");
        hoeAttackSpeed = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-hoe-attack-speed");
        pickaxeAttackDamagePlus = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-pickaxe-attack-damage-plus");
        pickaxeAttackSpeed = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-pickaxe-attack-speed");
        shovelAttackDamagePlus = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-shovel-attack-damage-plus");
        shovelAttackSpeed = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-shovel-attack-speed");
        swordAttackDamagePlus = (int) KVCEquipment.CONFIG.getOfType("int", materialName+"-sword-attack-damage-plus");
        swordAttackSpeed = (float) KVCEquipment.CONFIG.getOfType("float", materialName+"-sword-attack-speed");
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }

    public String getMaterialName() {
        return materialName;
    }

    public float getMiningSpeed() {
        return miningSpeed;
    }

    public float getAxeAttackDamagePlus() {
        return axeAttackDamagePlus;
    }

    public float getAxeAttackSpeed() {
        return axeAttackSpeed;
    }

    public int getHoeAttackDamagePlus() {
        return hoeAttackDamagePlus;
    }

    public float getHoeAttackSpeed() {
        return hoeAttackSpeed;
    }

    public int getPickaxeAttackDamagePlus() {
        return pickaxeAttackDamagePlus;
    }

    public float getPickaxeAttackSpeed() {
        return pickaxeAttackSpeed;
    }

    public float getShovelAttackDamagePlus() {
        return shovelAttackDamagePlus;
    }

    public float getShovelAttackSpeed() {
        return shovelAttackSpeed;
    }

    public int getSwordAttackDamagePlus() {
        return swordAttackDamagePlus;
    }

    public float getSwordAttackSpeed() {
        return swordAttackSpeed;
    }
}
