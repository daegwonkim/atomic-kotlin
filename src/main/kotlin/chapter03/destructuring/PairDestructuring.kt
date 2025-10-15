package chapter03.destructuring

import atomictest.eq

fun main() {
    val (value, description) = compute(7)
    value eq 14
    description eq "High"
}