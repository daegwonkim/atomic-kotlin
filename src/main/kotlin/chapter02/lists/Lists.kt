package chapter02.lists

import atomictest.eq

fun main() {
    val ints = listOf(99, 3, 5, 7, 11, 13)
    ints eq "[99, 3, 5, 7, 11, 13]"

    // List의 각 원소에 대해 이터레이션하기
    var result = ""
    for (i in ints) {
        result += "$i "
    }
    result eq "99 3 5 7 11 13"

    // List 원소를 '인덱싱'하기
    ints[4] eq 11
}