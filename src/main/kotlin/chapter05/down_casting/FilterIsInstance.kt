package chapter05.down_casting

import atomictest.eq

fun main() {
    val human1: List<Creature> = group.filter { it is Human }
    human1.size eq 2
    val human2: List<Human> = group.filterIsInstance<Human>()
    human2 eq human1
}