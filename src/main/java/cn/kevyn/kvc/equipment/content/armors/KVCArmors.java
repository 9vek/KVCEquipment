package cn.kevyn.kvc.equipment.content.armors;

import cn.kevyn.kvc.equipment.content.armors.patches.KVCArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static cn.kevyn.kvc.equipment.content.KVCGroups.KVC_COMBAT;

public class KVCArmors {

    /** 绿宝石套 */
    public static final KVCArmorMaterial EMERALD_ARMOR_MATERIAL = new KVCArmorMaterial("emerald", Ingredient.ofItems(Items.EMERALD), SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND);
    public static final Item EMERALD_MATERIAL_HELMET = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(KVC_COMBAT));
    public static final Item EMERALD_MATERIAL_CHESTPLATE = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(KVC_COMBAT));
    public static final Item EMERALD_MATERIAL_LEGGINGS = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(KVC_COMBAT));
    public static final Item EMERALD_MATERIAL_BOOTS = new ArmorItem(EMERALD_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(KVC_COMBAT));
    /** 红石套 */
    public static final KVCArmorMaterial REDSTONE_ARMOR_MATERIAL = new KVCArmorMaterial("redstone", Ingredient.ofItems(Items.REDSTONE), SoundEvents.ITEM_ARMOR_EQUIP_GOLD);
    public static final Item REDSTONE_MATERIAL_HELMET = new ArmorItem(REDSTONE_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(KVC_COMBAT));
    public static final Item REDSTONE_MATERIAL_CHESTPLATE = new ArmorItem(REDSTONE_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(KVC_COMBAT));
    public static final Item REDSTONE_MATERIAL_LEGGINGS = new ArmorItem(REDSTONE_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(KVC_COMBAT));
    public static final Item REDSTONE_MATERIAL_BOOTS = new ArmorItem(REDSTONE_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(KVC_COMBAT));
    /** 青金石套 */
    public static final KVCArmorMaterial LAPIS_ARMOR_MATERIAL = new KVCArmorMaterial("lapis", Ingredient.ofItems(Items.LAPIS_LAZULI), SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND);
    public static final Item LAPIS_MATERIAL_HELMET = new ArmorItem(LAPIS_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(KVC_COMBAT));
    public static final Item LAPIS_MATERIAL_CHESTPLATE = new ArmorItem(LAPIS_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(KVC_COMBAT));
    public static final Item LAPIS_MATERIAL_LEGGINGS = new ArmorItem(LAPIS_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(KVC_COMBAT));
    public static final Item LAPIS_MATERIAL_BOOTS = new ArmorItem(LAPIS_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(KVC_COMBAT));
    /** 铜套 */
    public static final KVCArmorMaterial COPPER_ARMOR_MATERIAL = new KVCArmorMaterial("copper", Ingredient.ofItems(Items.COPPER_INGOT), SoundEvents.ITEM_ARMOR_EQUIP_IRON);
    public static final Item COPPER_MATERIAL_HELMET = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(KVC_COMBAT));
    public static final Item COPPER_MATERIAL_CHESTPLATE = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(KVC_COMBAT));
    public static final Item COPPER_MATERIAL_LEGGINGS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(KVC_COMBAT));
    public static final Item COPPER_MATERIAL_BOOTS = new ArmorItem(COPPER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(KVC_COMBAT));
    /** 紫水晶套 */
    public static final KVCArmorMaterial AMETHYST_ARMOR_MATERIAL = new KVCArmorMaterial("amethyst", Ingredient.ofItems(Items.AMETHYST_SHARD), SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND);
    public static final Item AMETHYST_MATERIAL_HELMET = new ArmorItem(AMETHYST_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(KVC_COMBAT));
    public static final Item AMETHYST_MATERIAL_CHESTPLATE = new ArmorItem(AMETHYST_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(KVC_COMBAT));
    public static final Item AMETHYST_MATERIAL_LEGGINGS = new ArmorItem(AMETHYST_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(KVC_COMBAT));
    public static final Item AMETHYST_MATERIAL_BOOTS = new ArmorItem(AMETHYST_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(KVC_COMBAT));

    public static void doRegister() {

        /** 绿宝石套 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_helmet"), EMERALD_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_chestplate"), EMERALD_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_leggings"), EMERALD_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_boots"), EMERALD_MATERIAL_BOOTS);
        /** 红石套 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_helmet"), REDSTONE_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_chestplate"), REDSTONE_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_leggings"), REDSTONE_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_boots"), REDSTONE_MATERIAL_BOOTS);
        /** 青金石套 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_helmet"), LAPIS_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_chestplate"), LAPIS_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_leggings"), LAPIS_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_boots"), LAPIS_MATERIAL_BOOTS);
        /** 铜套 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_helmet"), COPPER_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_chestplate"), COPPER_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_leggings"), COPPER_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_boots"), COPPER_MATERIAL_BOOTS);
        /** 紫水晶套 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_helmet"), AMETHYST_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_chestplate"), AMETHYST_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_leggings"), AMETHYST_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_boots"), AMETHYST_MATERIAL_BOOTS);

    }
}
