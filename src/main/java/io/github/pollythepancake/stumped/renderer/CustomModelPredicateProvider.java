package io.github.pollythepancake.stumped.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class CustomModelPredicateProvider {
    public static void registerBowPredicates(Item bow) {
        ModelPredicateProviderRegistry.register(bow, new Identifier("pull"), (itemStack, world, livingEntity, i) -> {
            if (livingEntity == null) {
                return 0.0F;
            } else {
                return livingEntity.getActiveItem() != itemStack ? 0.0F : (float) (itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) / 20.0F;
            }
        });
        ModelPredicateProviderRegistry.register(bow, new Identifier("pulling"), (itemStack, clientWorld, livingEntity, i) ->
                livingEntity != null && livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ? 1.0F : 0.0F);
    }

    public static void registerCrossbowPredicates(Item crossbow) {
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pull"), (itemStack, clientWorld, livingEntity, seed) -> {
            if (livingEntity == null) {
                return 0;
            } else
                return CrossbowItem.isCharged(itemStack) ? 0.0F : (float) (itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) / (float) CrossbowItem.getPullTime(itemStack);
        });
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("pulling"), (itemStack, clientWorld1, livingEntity, seed) ->
                livingEntity != null && livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack && !CrossbowItem.isCharged(itemStack) ? 1.0F : 0.0F);
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("charged"), (itemStack, clientWorld, livingEntity, seed) ->
                livingEntity != null && CrossbowItem.isCharged(itemStack) ? 1.0F : 0.0F);
        ModelPredicateProviderRegistry.register(crossbow, new Identifier("firework"), (itemStack, clientWorld, livingEntity, seed) ->
                livingEntity != null && CrossbowItem.isCharged(itemStack) && CrossbowItem.hasProjectile(itemStack, Items.FIREWORK_ROCKET) ? 1.0F : 0.0F);
    }
}
