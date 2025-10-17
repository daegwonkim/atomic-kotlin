package chapter05.sealed_classes

import atomictest.eq

sealed class Transport2

data class Train2(
    val line: String
): Transport2()

data class Bus2(
    val number: String,
    val capacity: Int
): Transport2()

fun travel(transport: Transport2) =
    when (transport) {
        is Train2 -> "Train ${transport.line}"
        is Bus2 -> "Bus ${transport.number}: size ${transport.capacity}"
    }

fun main() {
    listOf(Train2("S1"), Bus2("11", 90))
        .map(::travel) eq "[Train S1, Bus 11: size 90]"
}