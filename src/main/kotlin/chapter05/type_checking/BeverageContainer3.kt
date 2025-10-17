package chapter05.type_checking

import atomictest.eq

interface BeverageContainer3 {
    fun open(): String
    fun pour() = "$name: Pour"
    fun recycle(): String
}

abstract class Can3 : BeverageContainer3 {
    override fun open() = "Pop Top"
}

class SteelCan3 : Can3() {
    override fun recycle() = "Recycle Steel"
}

class AluminumCan3 : Can3() {
    override fun recycle() = "Recycle Aluminum"
}

abstract class Bottle3 : BeverageContainer3 {
    override fun open() = "Remove Cap"
}

class GlassBottle3 : Bottle3() {
    override fun recycle() = "Recycle Glass"
}

abstract class PlasticBottle3 : Bottle3()

class PETBottle3 : PlasticBottle3() {
    override fun recycle() = "Recycle PET"
}

class HDPEBottle3 : PlasticBottle3() {
    override fun recycle() = "Recycle HDPE"
}

fun main() {
    val refrigerator = listOf(
        SteelCan3(), AluminumCan3(),
        GlassBottle3(),
        PETBottle3(), HDPEBottle3()
    )
    refrigerator.map { it.open() } eq
            "[Pop Top, Pop Top, Remove Cap, " +
            "Remove Cap, Remove Cap]"
    refrigerator.map { it.recycle() } eq
            "[Recycle Steel, Recycle Aluminum, " +
            "Recycle Glass, " +
            "Recycle PET, Recycle HDPE]"
}