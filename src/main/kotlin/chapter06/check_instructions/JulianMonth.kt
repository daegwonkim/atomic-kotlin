package chapter06.check_instructions

import atomictest.*

/*
코틀린의 require()는 보통 함수 인자를 검증하기 위해 사용되며, 함수 본문 맨 앞에 위치하는 경우가 많다.
require()는 조건을 만족하지 못하면 IllegalArgumentException을 반환한다.
IllegalArgumentException 예외를 던지는 대신 항상 require()를 사용할 수 있다.
 */

data class Month(val monthNumber: Int) {
    init {
        require(monthNumber in 1..12) {
            "Month out of range: $monthNumber"
        }
    }
}

fun main() {
    Month(1) eq "Month(monthNumber=1)"
    capture { Month(13) } eq
            "IllegalArgumentException: Month out of range: 13"
}