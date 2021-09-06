package cn.kevyn.kvc.equipment.content.crossbows;

import cn.kevyn.kvc.equipment.content.crossbows.patches.KVCCrossbowItem;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Nullable;

public class KVCCrossbows {

    /** 原版弩 */
    public static final KVCCrossbowItem WOODEN_CROSSBOW = new KVCCrossbowItem("wooden", Ingredient.fromTag(ItemTags.PLANKS));
    /** 铁弩 */
    public static final CrossbowItem IRON_CROSSBOW = new KVCCrossbowItem("iron", Ingredient.ofItems(Items.IRON_INGOT));
    /** 金弩 */
    public static final CrossbowItem GOLDEN_CROSSBOW = new KVCCrossbowItem("golden", Ingredient.ofItems(Items.GOLD_INGOT));
    /** 钻石弩 */
    public static final CrossbowItem DIAMOND_CROSSBOW = new KVCCrossbowItem("diamond", Ingredient.ofItems(Items.DIAMOND));
    /** 绿宝石弩 */
    public static final CrossbowItem EMERALD_CROSSBOW = new KVCCrossbowItem("emerald", Ingredient.ofItems(Items.EMERALD));
    /** 青金石弩 */
    public static final CrossbowItem LAPIS_CROSSBOW = new KVCCrossbowItem("lapis", Ingredient.ofItems(Items.LAPIS_LAZULI));
    /** 红石弩 */
    public static final CrossbowItem REDSTONE_CROSSBOW = new KVCCrossbowItem("redstone", Ingredient.ofItems(Items.REDSTONE));
    /** 下界合金弩 */
    public static final CrossbowItem NETHERITE_CROSSBOW = new KVCCrossbowItem("netherite", Ingredient.ofItems(Items.NETHERITE_INGOT));
    /** 铜弩 */
    public static final CrossbowItem COPPER_CROSSBOW = new KVCCrossbowItem("copper", Ingredient.ofItems(Items.COPPER_INGOT));
    /** 紫水晶弩 */
    public static final CrossbowItem AMETHYST_CROSSBOW = new KVCCrossbowItem("amethyst", Ingredient.ofItems(Items.AMETHYST_SHARD));

    public static void doRegister() {

        /** 覆盖原版弩 */
        Registry.register(Registry.ITEM, Registry.ITEM.getRawId(Items.CROSSBOW), "crossbow", WOODEN_CROSSBOW);
        /** 铁弩 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "iron_crossbow"), IRON_CROSSBOW);
        /** 金弩 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "golden_crossbow"), GOLDEN_CROSSBOW);
        /** 钻石弩 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "diamond_crossbow"), DIAMOND_CROSSBOW);
        /** 绿宝石弩 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "emerald_crossbow"), EMERALD_CROSSBOW);
        /** 青金石弩 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "lapis_crossbow"), LAPIS_CROSSBOW);
        /** 红石弩 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "redstone_crossbow"), REDSTONE_CROSSBOW);
        /** 下界合金弩 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "netherite_crossbow"), NETHERITE_CROSSBOW);
        /** 铜弩 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "copper_crossbow"), COPPER_CROSSBOW);
        /** 紫水晶弩 */
        Registry.register(Registry.ITEM, new Identifier("minecraft", "amethyst_crossbow"), AMETHYST_CROSSBOW);

    }

    public static float crossbowPullPredicateProvider(ItemStack stack, @Nullable ClientWorld world, @Nullable LivingEntity entity, int seed) {
        if (entity == null) return 0.0F;
        float f = entity.getActiveItem() != stack ? 0.0F : (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
        return f * ((KVCCrossbowItem)(stack.getItem())).getDrawingSpeed();
    }
    public static float crossbowPullingPredicateProvider(ItemStack stack, @Nullable ClientWorld world, @Nullable LivingEntity entity, int seed) {
        if (entity == null) return 0.0F;
        return entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    }
    public static float crossbowChargedPredicateProvider(ItemStack stack, @Nullable ClientWorld world, @Nullable LivingEntity entity, int seed) {
        if (CrossbowItem.isCharged(stack))
            return 1f;
        else return 0f;
    }
    public static float crossbowFireworkPredicateProvider(ItemStack stack, @Nullable ClientWorld world, @Nullable LivingEntity entity, int seed) {
        if (CrossbowItem.hasProjectile(stack, Items.FIREWORK_ROCKET)) {
            return 1f;
        }
        return 0f;
    }
    public static void clientRegister(Item crossbowItem) {
        FabricModelPredicateProviderRegistry.register(crossbowItem, new Identifier("pull"), KVCCrossbows::crossbowPullPredicateProvider);
        FabricModelPredicateProviderRegistry.register(crossbowItem, new Identifier("pulling"), KVCCrossbows::crossbowPullingPredicateProvider);
        FabricModelPredicateProviderRegistry.register(crossbowItem, new Identifier("charged"), KVCCrossbows::crossbowChargedPredicateProvider);
        FabricModelPredicateProviderRegistry.register(crossbowItem, new Identifier("firework"), KVCCrossbows::crossbowFireworkPredicateProvider);
    }

    public static void doClientRegister() {

        /** 原版弩 */
        clientRegister(WOODEN_CROSSBOW);
        /** 铁弩 */
        clientRegister(IRON_CROSSBOW);
        /** 金弩 */
        clientRegister(GOLDEN_CROSSBOW);
        /** 钻石弩 */
        clientRegister(DIAMOND_CROSSBOW);
        /** 绿宝石弩 */
        clientRegister(EMERALD_CROSSBOW);
        /** 青金石弩 */
        clientRegister(LAPIS_CROSSBOW);
        /** 红石弩 */
        clientRegister(REDSTONE_CROSSBOW);
        /** 下界合金弩 */
        clientRegister(NETHERITE_CROSSBOW);
        /** 铜弩 */
        clientRegister(COPPER_CROSSBOW);
        /** 紫水晶弩 */
        clientRegister(AMETHYST_CROSSBOW);

    }

}
