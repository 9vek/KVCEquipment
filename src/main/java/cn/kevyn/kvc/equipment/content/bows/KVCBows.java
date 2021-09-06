package cn.kevyn.kvc.equipment.content.bows;

import cn.kevyn.kvc.equipment.content.bows.patches.KVCBowItem;
import cn.kevyn.kvc.equipment.content.bows.patches.KVCFireBowItem;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Nullable;



public class KVCBows {

    /** 原版弓 */
    public static final KVCBowItem WOODEN_BOW_ITEM = new KVCBowItem("wooden", Ingredient.fromTag(ItemTags.PLANKS));
    /** 铁弓 */
    public static final Item IRON_BOW = new KVCBowItem("iron", Ingredient.ofItems(Items.IRON_INGOT));
    /** 黄金弓 */
    public static final Item GOLDEN_BOW = new KVCBowItem("golden", Ingredient.ofItems(Items.GOLD_INGOT));
    /** 钻石弓 */
    public static final Item DIAMOND_BOW = new KVCBowItem("diamond", Ingredient.ofItems(Items.DIAMOND));
    /** 绿宝石弓 */
    public static final Item EMERALD_BOW = new KVCBowItem("emerald", Ingredient.ofItems(Items.EMERALD));
    /** 红石弓 */
    public static final Item REDSTONE_BOW = new KVCBowItem("redstone", Ingredient.ofItems(Items.REDSTONE));
    /** 青金石弓 */
    public static final Item LAPIS_BOW = new KVCBowItem("lapis", Ingredient.ofItems(Items.LAPIS_LAZULI));
    /** 下界合金弓 */
    public static final Item NETHERITE_BOW = new KVCBowItem("netherite", Ingredient.ofItems(Items.NETHERITE_INGOT));
    /** 铜弓 */
    public static final Item COPPER_BOW = new KVCBowItem("copper", Ingredient.ofItems(Items.COPPER_INGOT));
    /** 紫水晶弓 */
    public static final Item AMETHYST_BOW = new KVCBowItem("amethyst", Ingredient.ofItems(Items.AMETHYST_SHARD));
    /** 烈焰棒弓 */
    public static final Item FIRE_BOW = new KVCFireBowItem("fire", Ingredient.ofItems(Items.BLAZE_ROD));

    public static void doRegister() {

        /** 覆盖原版弓 */
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.BOW), "bow", WOODEN_BOW_ITEM);
        /** 铁弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "iron_bow"), IRON_BOW);
        /** 黄金弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "golden_bow"), GOLDEN_BOW);
        /** 钻石弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "diamond_bow"), DIAMOND_BOW);
        /** 绿宝石弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_bow"), EMERALD_BOW);
        /** 红石弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_bow"), REDSTONE_BOW);
        /** 青金石弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_bow"), LAPIS_BOW);
        /** 下界合金弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "netherite_bow"), NETHERITE_BOW);
        /** 铜弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_bow"), COPPER_BOW);
        /** 紫水晶弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_bow"), AMETHYST_BOW);
        /** 烈焰棒弓 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "fire_bow"), FIRE_BOW);

    }

    public static float bowPullPredicateProvider(ItemStack stack, @Nullable ClientWorld world, @Nullable LivingEntity entity, int seed) {
        if (entity == null) return 0.0F;
        float f = entity.getActiveItem() != stack ? 0.0F : (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
        return f * ((KVCBowItem)(stack.getItem())).getDrawingSpeed();
    }
    public static float bowPullingPredicateProvider(ItemStack stack, @Nullable ClientWorld world, @Nullable LivingEntity entity, int seed) {
        if (entity == null) return 0.0F;
        return entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    }
    public static void clientRegister(Item bowItem) {
        FabricModelPredicateProviderRegistry.register(bowItem, new Identifier("pull"), KVCBows::bowPullPredicateProvider);
        FabricModelPredicateProviderRegistry.register(bowItem, new Identifier("pulling"), KVCBows::bowPullingPredicateProvider);
    }
    public static void doClientRegister() {

        /** 原版弓 */
        clientRegister(WOODEN_BOW_ITEM);
        /** 铁弓 */
        clientRegister(IRON_BOW);
        /** 黄金弓 */
        clientRegister(GOLDEN_BOW);
        /** 钻石弓 */
        clientRegister(DIAMOND_BOW);
        /** 绿宝石弓 */
        clientRegister(EMERALD_BOW);
        /** 红石弓 */
        clientRegister(REDSTONE_BOW);
        /** 青金石弓 */
        clientRegister(LAPIS_BOW);
        /** 下界合金弓 */
        clientRegister(NETHERITE_BOW);
        /** 铜弓 */
        clientRegister(COPPER_BOW);
        /** 紫水晶弓 */
        clientRegister(AMETHYST_BOW);
        /** 火焰弓 */
        clientRegister(FIRE_BOW);

    }

}
