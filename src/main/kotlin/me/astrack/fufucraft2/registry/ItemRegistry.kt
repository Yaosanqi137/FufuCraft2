package me.astrack.fufucraft2.registry

import me.astrack.fufucraft2.Fufucraft2.Companion.MOD_ID
import me.astrack.fufucraft2.item.FufuFoodItem
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.*
import net.minecraft.recipe.Ingredient
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ItemRegistry {
    val SmallBowlOfRice = Item(FabricItemSettings().food(FoodComponent.Builder().hunger(1).build()))
    val LargeBowlOfRice = Item(FabricItemSettings().food(FoodComponent.Builder().hunger(9).build()))

    val SpringOnion = SwordItem(SpringMaterial(), 3, 6.0f, FabricItemSettings())
    val SaucedSpringOnion = Item(FabricItemSettings().food(FoodComponent.Builder().hunger(2).build()))

    val LargePackOfRice = FufuFoodItem(FabricItemSettings(), 0.0)
    val SmallPackOfRice = FufuFoodItem(FabricItemSettings(), 0.0)

    val RiceSeed = AliasedBlockItem(BlockRegistry.RiceCrop, FabricItemSettings())
    val SpringOnionSeed = AliasedBlockItem(BlockRegistry.SpringOnionCrop, FabricItemSettings())

    fun register() {
        register(SmallBowlOfRice, "small_bowl_of_rice")
        register(LargeBowlOfRice, "large_bowl_of_rice")

        register(SaucedSpringOnion, "sauced_spring_onion")
        register(SpringOnion, "spring_onion")

        register(LargePackOfRice, "large_pack_of_rice")
        register(SmallPackOfRice, "small_pack_of_rice")

        register(RiceSeed, "rice_seed")
        register(SpringOnionSeed, "spring_onion_seed")
    }

    private fun register(item: Item, id: String){
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, id), item)
    }

    class SpringMaterial : ToolMaterial {
        override fun getDurability(): Int {
            return 131
        }

        override fun getMiningSpeedMultiplier(): Float {
            return 4.0f
        }

        override fun getAttackDamage(): Float {
            return 1.0f
        }

        override fun getMiningLevel(): Int {
            return 1
        }

        override fun getEnchantability(): Int {
            return 0
        }

        override fun getRepairIngredient(): Ingredient {
            return Ingredient.EMPTY
        }
    }
}