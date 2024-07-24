package me.astrack.fufucraft2.block

import me.astrack.fufucraft2.registry.ItemRegistry
import net.minecraft.item.ItemConvertible

class RiceCrop: CommonCropBlock() {
    override fun getSeedsItem(): ItemConvertible {
        return ItemRegistry.RiceSeed
    }
}