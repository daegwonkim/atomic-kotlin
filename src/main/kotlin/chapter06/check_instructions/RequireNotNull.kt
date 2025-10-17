package chapter06.check_instructions

import atomictest.*

/*
requireNotNull()은 첫 번째 인자가 null인지 검사해 널이 아니면 그 값을 돌려준다. 그리고 자동으로 널이 아닌 타입으로 스마트 캐스트된다.
하지만 널이면 IllegalArgumentException을 발생시킨다.
 */

fun notNull(n: Int?): Int {
    requireNotNull(n) {
        "notNull() argument cannot be null"
    }
    return n * 9
}

fun main() {
    val n: Int? = null
    capture {
        notNull(n)
    } eq "IllegalArgumentException: notNull() argument cannot be null"
    capture {
        requireNotNull(n)
    } eq "IllegalArgumentException: Required value was null."
    notNull(11) eq 99
}