package cn.kevyn.kvc.equipment.content.tools.patches;

import cn.kevyn.kvc.equipment.content.tools.KVCToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class KVCPickaxeItem extends PickaxeItem {
    public KVCPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    public KVCPickaxeItem(KVCToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, toolMaterial.getPickaxeAttackDamagePlus(), toolMaterial.getPickaxeAttackSpeed(), settings);
    }
}
