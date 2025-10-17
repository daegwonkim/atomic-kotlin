package chapter06.nothing_type

import atomictest.eq

fun main() {
    val none: Nothing? = null

    var nullableString: String? = null
    nullableString = "abc"
    nullableString = none
    nullableString eq null

    val nullableInt: Int? = none
    nullableInt eq null

    val listNone: List<Nothing?> = listOf(null)
    val ints: List<Int?> = listOf(null)
    ints eq listNone
}