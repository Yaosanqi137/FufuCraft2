package me.astrack.fufucraft2.client

import me.astrack.fufucraft2.registry.BlockRegistry
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.render.RenderLayer

class Fufucraft2Client : ClientModInitializer {

    override fun onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BlockRegistry.RiceCrop, BlockRegistry.SpringOnionCrop)
    }
}
