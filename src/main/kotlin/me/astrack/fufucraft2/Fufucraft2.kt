package me.astrack.fufucraft2

import me.astrack.fufucraft2.registry.BlockRegistry
import me.astrack.fufucraft2.registry.ItemRegistry
import net.fabricmc.api.ModInitializer

class Fufucraft2 : ModInitializer {
    companion object {
        const val MOD_ID = "fufucraft2"
    }

    override fun onInitialize() {
        ItemRegistry.register()
        BlockRegistry.register()
    }
}
