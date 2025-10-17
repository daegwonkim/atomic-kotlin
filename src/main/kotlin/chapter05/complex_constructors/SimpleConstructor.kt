package chapter05.complex_constructors

import atomictest.eq

class Alien(val name: String)

fun main() {
    val alien = Alien("Pencilvester")
    alien.name eq "Pencilvester"
}