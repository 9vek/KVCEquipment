package cn.kevyn.kvc.equipment.mixins;

import cn.kevyn.kvc.equipment.content.armors.patches.KVCArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import static cn.kevyn.kvc.equipment.content.armors.VanillaArmorMaterialsOverride.getMaterialByName;

@Mixin(ArmorMaterials.class)
public class ArmorMaterialsMixin {

    @Shadow @Final private String name;

    @Inject(
            at = @At("HEAD"),
            method = "getDurability",
            cancellable = true
    )
    public void getDurability(EquipmentSlot slot, CallbackInfoReturnable<Integer> cir) {
        KVCArmorMaterial material = getMaterialByName(this.name);
        if (material != null) {
            cir.setReturnValue(material.getDurability(slot));
        }
    }

    @Inject(
            at = @At("HEAD"),
            method = "getProtectionAmount",
            cancellable = true)
    public void getProtectionAmount(EquipmentSlot slot, CallbackInfoReturnable<Integer> cir) {
        KVCArmorMaterial material = getMaterialByName(this.name);
        if (material != null) {
            cir.setReturnValue(material.getProtectionAmount(slot));
        }
    }

    @Inject(
            at = @At("HEAD"),
            method = "getEnchantability",
            cancellable = true
    )
    public void getEnchantability(CallbackInfoReturnable<Integer> cir) {
        KVCArmorMaterial material = getMaterialByName(this.name);
        if (material != null) {
            cir.setReturnValue(material.getEnchantability());
        }
    }

    @Inject(
            at = @At("HEAD"),
            method = "getToughness",
            cancellable = true
    )
    public void getToughness(CallbackInfoReturnable<Float> cir) {
        KVCArmorMaterial material = getMaterialByName(this.name);
        if (material != null) {
            cir.setReturnValue(material.getToughness());
        }
    }

    @Inject(
            at = @At("HEAD"),
            method = "getKnockbackResistance",
            cancellable = true
    )
    public void getKnockbackResistance(CallbackInfoReturnable<Float> cir) {
        KVCArmorMaterial material = getMaterialByName(this.name);
        if (material != null) {
            cir.setReturnValue(material.getKnockbackResistance());
        }
    }

}
