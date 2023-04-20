package io.github.pollythepancake.stumped.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomCrossbowItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Environment(EnvType.CLIENT)
@Mixin(HeldItemRenderer.class)
public class CrossbowHoldMixin {
    @WrapOperation(
            method = "renderFirstPersonItem",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z")
    )
    private boolean Stumped$crossbowFirstPerson(ItemStack stack, Item item, Operation<Boolean> original) {
        if (item == Items.CROSSBOW) {
            return original.call(stack, item) || stack.getItem() instanceof CustomCrossbowItem;
        } else {
            return original.call(stack, item);
        }
    }
}
