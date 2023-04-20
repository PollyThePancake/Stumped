package io.github.pollythepancake.stumped.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import io.github.pollythepancake.stumped.items.custom.weapons.CustomBowItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Environment(EnvType.CLIENT)
@Mixin(AbstractClientPlayerEntity.class)
public class BowFOVMixin {
    @WrapOperation(
            method = "getFovMultiplier",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z")
    )
    private boolean Stumped$useBowFOV(ItemStack stack, Item item, Operation<Boolean> original) {
        return original.call(stack, item) || stack.getItem() instanceof CustomBowItem;
    }
}