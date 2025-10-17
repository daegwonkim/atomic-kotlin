package chapter05.objects

import atomictest.eq

fun g() {
    Shard.i += 7
}

fun main() {
    f()
    g()
    Shard.i eq 12
}