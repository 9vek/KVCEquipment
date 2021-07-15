package cn.kevyn.kvc.equipment.content.armors;

import cn.kevyn.kvc.equipment.content.armors.patches.KVCArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;



public class VanillaArmorMaterialsOverride {

    /** 皮革套 */
    private static final KVCArmorMaterial LEATHER_ARMOR_MATERIAL = new KVCArmorMaterial("leather", Ingredient.ofItems(Items.LEATHER), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER);
    /** 链甲 */
    private static final KVCArmorMaterial CHAINMAIL_ARMOR_MATERIAL = new KVCArmorMaterial("chainmail", Ingredient.ofItems(Items.IRON_INGOT), SoundEvents.ITEM_ARMOR_EQUIP_CHAIN);
    /** 铁套 */
    private static final KVCArmorMaterial IRON_ARMOR_MATERIAL = new KVCArmorMaterial("iron", Ingredient.ofItems(Items.IRON_INGOT), SoundEvents.ITEM_ARMOR_EQUIP_IRON);
    /** 金套 */
    private static final KVCArmorMaterial GOLD_ARMOR_MATERIAL = new KVCArmorMaterial("gold", Ingredient.ofItems(Items.GOLD_INGOT), SoundEvents.ITEM_ARMOR_EQUIP_GOLD);
    /** 钻石套 */
    private static final KVCArmorMaterial DIAMOND_ARMOR_MATERIAL = new KVCArmorMaterial("diamond", Ingredient.ofItems(Items.DIAMOND), SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND);
    /** 海龟壳 */
    private static final KVCArmorMaterial TURTLE_ARMOR_MATERIAL = new KVCArmorMaterial("turtle", Ingredient.ofItems(Items.SCUTE), SoundEvents.ITEM_ARMOR_EQUIP_TURTLE);
    /** 下界合金套 */
    private static final KVCArmorMaterial NETHERITE_ARMOR_MATERIAL = new KVCArmorMaterial("netherite", Ingredient.ofItems(Items.NETHERITE_INGOT), SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE);

    public static KVCArmorMaterial getMaterialByName(String name) {
        KVCArmorMaterial material = switch (name) {
            case "leather" -> LEATHER_ARMOR_MATERIAL;
            case "chainmail" -> CHAINMAIL_ARMOR_MATERIAL;
            case "iron" -> IRON_ARMOR_MATERIAL;
            case "gold" -> GOLD_ARMOR_MATERIAL;
            case "diamond" -> DIAMOND_ARMOR_MATERIAL;
            case "turtle" -> TURTLE_ARMOR_MATERIAL;
            case "netherite" -> NETHERITE_ARMOR_MATERIAL;
            default -> null;
        };
        return material;
    }

}
