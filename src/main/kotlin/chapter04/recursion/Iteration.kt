package chapter04.recursion

import atomictest.eq

fun sum2(n: Long): Long {
    var accumulator = 0L
    for (i in 1..n) {
        accumulator += i
    }
    return accumulator
}

fun main() {
    sum2(10000) eq 50005000
    sum2(100000) eq 5000050000
}