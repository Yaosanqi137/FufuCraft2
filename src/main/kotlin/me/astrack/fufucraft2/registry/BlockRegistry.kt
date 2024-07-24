package me.astrack.fufucraft2.registry

import me.astrack.fufucraft2.Fufucraft2.Companion.MOD_ID
import me.astrack.fufucraft2.block.RiceCrop
import me.astrack.fufucraft2.block.SpringOnionCrop
import net.minecraft.block.Block
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object BlockRegistry {
    val RiceCrop = RiceCrop()
    val SpringOnionCrop = SpringOnionCrop()

    fun register(){
        register(RiceCrop, "rice_crop")
        register(SpringOnionCrop, "spring_onion_crop")
    }

    private fun register(block: Block, id: String){
        Registry.register(
            Registries.BLOCK,
            Identifier.of(MOD_ID, id),
            block
        )
    }
}