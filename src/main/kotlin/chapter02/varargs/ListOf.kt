package chapter02.varargs

import atomictest.eq

fun main() {
    listOf(1) eq "[1]"
    listOf("a", "b") eq "[a, b]"
}