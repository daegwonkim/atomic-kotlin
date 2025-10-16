package chapter04.folding_lists

import atomictest.eq

/*
fold()는 리스트의 모든 원소를 순서대로 조합해 결괏값을 하나 만들어낸다.
 */

fun main() {
    val list = listOf(1, 10, 100, 1000)
    list.fold(0) { sum, n ->
        sum + n
    } eq 1111
}