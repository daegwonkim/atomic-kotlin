package chapter05.abstract_

import atomictest.eq

interface PropertyAccessor {
    val a: Int
        get() = 11
}

class Impl : PropertyAccessor

fun main() {
    Impl().a eq 11
}