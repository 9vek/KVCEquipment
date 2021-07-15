package cn.kevyn.kvc.equipment.mixins;

import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin {

    @Shadow public abstract Item getItem();

    @Inject(at = @At("TAIL"), method = "isOf", cancellable = true)
    public void bowOrCrossbow(Item item, CallbackInfoReturnable<Boolean> cir) {
        if (item == Items.BOW) {
            if (this.getItem() instanceof BowItem)
                cir.setReturnValue(true);
        }
        else if (item == Items.CROSSBOW) {
            if (this.getItem() instanceof CrossbowItem) {
                cir.setReturnValue(true);
            }
        }
    }

}
