package chapter05.down_casting

import atomictest.eq

val group: List<Creature> = listOf(
    Human(), Human(), Dog(), Alien(), Dog()
)

fun main() {
    val dog = group.find { it is Dog } as Dog?
    dog?.bark() eq "Yip!"
}