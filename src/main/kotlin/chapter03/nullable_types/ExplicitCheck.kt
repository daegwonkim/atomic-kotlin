package chapter03.nullable_types

import atomictest.eq

fun main() {
    val s: String? = "abc"
    if (s != null) {
        s.length eq 3
    }
}