package chapter03.overloading

import atomictest.eq

fun f2(n: Int = 0) = n + 373

fun main() {
    f2() eq 373
}