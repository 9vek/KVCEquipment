package cn.kevyn.kvc.equipment.content.bows.patches;

import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;

public class KVCFireBowItem extends KVCBowItem {

    public KVCFireBowItem(String materialName, Ingredient repairIngredient) {
        super(materialName, repairIngredient);
    }

    @Override
    public void checkEnchantFlame(PersistentProjectileEntity persistentProjectileEntity, ItemStack stack) {
        persistentProjectileEntity.setOnFireFor(100);
    }

}
