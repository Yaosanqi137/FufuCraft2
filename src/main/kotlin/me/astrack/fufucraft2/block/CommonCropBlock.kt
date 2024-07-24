package me.astrack.fufucraft2.block

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Blocks
import net.minecraft.block.CarrotsBlock

open class CommonCropBlock: CarrotsBlock(FabricBlockSettings.copy(Blocks.WHEAT))