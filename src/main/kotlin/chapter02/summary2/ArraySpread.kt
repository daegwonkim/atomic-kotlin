package chapter02.summary2

import atomictest.trace

fun main() {
    val array = intArrayOf(4, 5)
    vararg("x", 1, 2, 3, *array, 6)
    val list = listOf(9, 10, 11)
    vararg("y", 7, 8, *list.toIntArray())
    trace eq "1 2 3 4 5 6 x 7 8 9 10 11 y"
}