package chapter05.type_checking

import atomictest.eq

sealed class BeverageContainer2 {
    abstract fun open(): String
    abstract fun pour(): String
}

sealed class Can2 : BeverageContainer2() {
    override fun open() = "Pop Top"
    override fun pour() = "Can: Pour"
}

class SteelCan2 : Can2()
class AluminumCan2 : Can2()

sealed class Bottle2 : BeverageContainer2() {
    override fun open() = "Remove Cap"
    override fun pour() = "Bottle: Pour"
}

class GlassBottle2 : Bottle2()
sealed class PlasticBottle2 : Bottle2()
class PETBottle2 : PlasticBottle2()
class HDPEBottle2 : PlasticBottle2()

fun BeverageContainer2.recycle() =
    when(this) {
        is Can2 -> "Recycle Can"
        is Bottle2 -> "Recycle Bottle"
    }

fun BeverageContainer2.recycle2() =
    when(this) {
        is Can2 -> when(this) {
            is SteelCan2 -> "Recycle Steel"
            is AluminumCan2 -> "Recycle Aluminum"
        }
        is Bottle2 -> when(this) {
            is GlassBottle2 -> "Recycle Glass"
            is PlasticBottle2 -> when(this) {
                is PETBottle2 -> "Recycle PET"
                is HDPEBottle2 -> "Recycle HDPE"
            }
        }
    }

fun main() {
    val refrigerator = listOf(
        SteelCan2(), AluminumCan2(),
        GlassBottle2(),
        PETBottle2(), HDPEBottle2()
    )
    refrigerator.map { it.open() } eq
            "[Pop Top, Pop Top, Remove Cap, " +
            "Remove Cap, Remove Cap]"
    refrigerator.map { it.recycle() } eq
            "[Recycle Can, Recycle Can, " +
            "Recycle Bottle, Recycle Bottle, " +
            "Recycle Bottle]"
    refrigerator.map { it.recycle2() } eq
            "[Recycle Steel, Recycle Aluminum, " +
            "Recycle Glass, " +
            "Recycle PET, Recycle HDPE]"
}