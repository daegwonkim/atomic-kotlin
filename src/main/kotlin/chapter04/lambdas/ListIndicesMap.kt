package chapter04.lambdas

import atomictest.eq
import chapter03.extension_properties.indices

fun main() {
    val list = listOf('a', 'b', 'c')
    list.indices.map {
        "[$it]"
    } eq listOf("[0]", "[1]", "[2]")
}