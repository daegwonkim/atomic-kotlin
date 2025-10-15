package chapter03.nullable_types

import atomictest.eq

/*
코틀린에서는 null이 될 수 있는 타입을 단순히 역참조 할 수 없다.
 */

fun main() {
    val s1: String = "abc"
    val s2: String? = s1

    s1.length eq 3
    // 컴파일되지 않는다
    // s2.length
}