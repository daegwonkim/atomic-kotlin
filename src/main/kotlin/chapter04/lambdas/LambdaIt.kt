package chapter04.lambdas

import atomictest.eq

/*
파라미터가 하나일 경우 코틀린은 자동으로 파라미터 이름을 it으로 만든다.
 */

fun main() {
    val list = listOf(1, 2, 3, 4)
    val result = list.map({ "[$it]" })
    result eq listOf("[1]", "[2]", "[3]", "[4]")
}