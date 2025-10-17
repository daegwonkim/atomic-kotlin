package chapter05.abstract_

import atomictest.eq

/*
인터페이스는 추상 클래스와 비슷하지만, 인터페이스에는 추상 클래스와 달리 상태가 없다.
상태란 프로퍼티 안에 저장된 데이터를 뜻한다.
 */

class IntList(val name: String) {
    val list = mutableListOf<Int>()
}

fun main() {
    val ints = IntList("numbers")
    ints.name eq "numbers"
    ints.list += 7
    ints.list eq listOf(7)
}