package io.github.pollythepancake.stumped.mixin;

import io.github.pollythepancake.stumped.items.custom.weapons.CustomShield;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BuiltinModelItemRenderer.class)
public class ShieldMixin {

    @Final
    @Shadow
    private EntityModelLoader entityModelLoader;

    @Inject(method = "reload", at = @At("HEAD"))
    private void Stumped$setModels(CallbackInfo ci) {

        for (CustomShield shield : CustomShield.items) {

            shield.setShieldEntityModel(entityModelLoader);
        }
    }

    @Inject(method = "render", at = @At("HEAD"))
    private void Stumped$mainRender(ItemStack stack, ModelTransformation.Mode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, CallbackInfo ci) {

        for (CustomShield shield : CustomShield.items) {

            shield.renderBanner(stack, matrices, vertexConsumers, light, overlay);
        }
    }
}