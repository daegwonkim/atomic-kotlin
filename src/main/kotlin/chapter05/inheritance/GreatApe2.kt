package chapter05.inheritance

import atomictest.eq

open class GreatApe2 {
    protected var energy = 0
    open fun call() = "Hoo!"
    open fun eat() {
        energy += 10
    }
    fun climb(x: Int) {
        energy -= x
    }
    fun energyLevel() = "Energy: $energy"
}

class Bonobo2 : GreatApe2() {
    override fun call() = "Eep!"
    override fun eat() {
        // Modify the base-class var:
        energy += 10
        // Call the base-class version:
        super.eat()
    }
    // Add a function:
    fun run() = "Bonobo run"
}

class Chimpanzee2 : GreatApe2() {
    // New property:
    val additionalEnergy = 20
    override fun call() = "Yawp!"
    override fun eat() {
        energy += additionalEnergy
        super.eat()
    }
    // Add a function:
    fun jump() = "Chimp jump"
}

fun talk(ape: GreatApe2): String {
    // ape.run()  // Not an ape function
    // ape.jump() // Nor this
    ape.eat()
    ape.climb(10)
    return "${ape.call()} ${ape.energyLevel()}"
}

fun main() {
    // Cannot access 'energy':
    // GreatApe().energy
    talk(GreatApe2()) eq "Hoo! Energy: 0"
    talk(Bonobo2()) eq "Eep! Energy: 10"
    talk(Chimpanzee2()) eq "Yawp! Energy: 20"
}