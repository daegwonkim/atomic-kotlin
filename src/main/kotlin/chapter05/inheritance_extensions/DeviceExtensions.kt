package chapter05.inheritance_extensions

import atomictest.eq

interface Device2 {
    val model: String
    val productionYear: Int
}

fun Device2.overpriced() =
    model.startsWith("i")

fun Device2.outdated() =
    productionYear < 2050

class MyDevice2(
    override val model: String,
    override val productionYear: Int
): Device2

fun main() {
    val gadget: Device2 = MyDevice2("my first phone", 2000)
    gadget.outdated() eq true
    gadget.overpriced() eq false
}