package io.github.pollythepancake.stumped.items.custom.weapons;

import com.github.crimsondawn45.fabricshieldlib.initializers.FabricShieldLibClient;
import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricBannerShieldItem;
import io.github.pollythepancake.stumped.items.custom.CustomItem;
import io.github.pollythepancake.stumped.ModInit;
import io.github.pollythepancake.stumped.util.ModGroups;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.ShieldEntityModel;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.ArrayList;

public class CustomShield extends CustomItem {

    public static ArrayList<CustomShield> items = new ArrayList<>();
    private final String shieldTexturePath;
    @Environment(EnvType.CLIENT)
    private EntityModelLayer entityModelLayer;
    @Environment(EnvType.CLIENT)
    private ShieldEntityModel shieldEntityModel;
    @Environment(EnvType.CLIENT)
    private SpriteIdentifier shieldBaseSprite;
    @Environment(EnvType.CLIENT)
    private SpriteIdentifier shieldNoPatternSprite;

    public CustomShield(String id) {
        super(id, new FabricBannerShieldItem(new FabricItemSettings().group(ModGroups.STUMPED_WEAPONS).maxCount(1).maxDamage(336), 100, 9, ItemTags.PLANKS));
        this.shieldTexturePath = "entity/" + id + "_base";
        items.add(this);
    }

    @Environment(EnvType.CLIENT)
    public String getBaseTexturePath() {
        return this.shieldTexturePath;
    }

    @Environment(EnvType.CLIENT)
    public String getNoPatternTexturePath() {
        return this.shieldTexturePath + "_nopattern";
    }

    @SuppressWarnings("deprecation")
    @Environment(EnvType.CLIENT)
    public void clientShieldInit() {
        this.entityModelLayer = new EntityModelLayer(new Identifier(ModInit.MOD_ID, this.getId()), "main");
        this.shieldBaseSprite = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier(ModInit.MOD_ID, this.getBaseTexturePath()));
        this.shieldNoPatternSprite = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier(ModInit.MOD_ID, this.getNoPatternTexturePath()));
    }

    public SpriteIdentifier getBaseSpriteIdentifier() {
        return this.shieldBaseSprite;
    }

    public SpriteIdentifier getNoPatternSpriteIdentifier() {
        return this.shieldNoPatternSprite;
    }

    @Environment(EnvType.CLIENT)
    public EntityModelLayer getEntityModelLayer() {
        return this.entityModelLayer;
    }

    @SuppressWarnings("deprecation")
    @Environment(EnvType.CLIENT)
    public void RegisterModelLayer() {

        EntityModelLayerRegistry.registerModelLayer(this.getEntityModelLayer(), ShieldEntityModel::getTexturedModelData);

        ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier(ModInit.MOD_ID, this.getBaseTexturePath()));
            registry.register(new Identifier(ModInit.MOD_ID, this.getNoPatternTexturePath()));
        });
    }

    @Environment(EnvType.CLIENT)
    public ShieldEntityModel getShieldEntityModel() {
        return this.shieldEntityModel;
    }

    @Environment(EnvType.CLIENT)
    public void setShieldEntityModel(EntityModelLoader modelLoader) {
        this.shieldEntityModel = new ShieldEntityModel(modelLoader.getModelPart(this.getEntityModelLayer()));
    }

    @Environment(EnvType.CLIENT)
    public void renderBanner(ItemStack stack, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {

        if (stack.isOf(this.getItem())) {
            FabricShieldLibClient.renderBanner(stack, matrices, vertexConsumers, light, overlay, this.getShieldEntityModel(), this.getBaseSpriteIdentifier(), this.getNoPatternSpriteIdentifier());
        }
    }
}