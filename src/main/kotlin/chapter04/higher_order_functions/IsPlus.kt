package chapter04.higher_order_functions

import atomictest.eq

/*
함수 타입은 0개 이상의 파라미터 타입 목록을 둘러싼 괄호로 시작하며, 화살표(->)가 따라오고 화살표 뒤에 반환 타입이 온다.
 */

val isPlus: (Int) -> Boolean = { it > 0 }

fun main() {
    listOf(1, 2, -3).any(isPlus) eq true
}