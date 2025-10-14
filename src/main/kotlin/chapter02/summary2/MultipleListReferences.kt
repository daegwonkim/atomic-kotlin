package chapter02.summary2

import atomictest.eq

fun main() {
    val first = mutableListOf(1)
    val second: List<Int> = first
    second eq listOf(1)
    first += 2
    // second에서도 변경된 내용을 볼 수 있다
    second eq listOf(1, 2)
}