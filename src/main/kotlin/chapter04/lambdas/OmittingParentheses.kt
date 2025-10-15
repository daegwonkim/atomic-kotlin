package chapter04.lambdas

import atomictest.eq

/*
함수의 파라미터가 람다뿐이면 람다 주변의 괄호를 없앨 수 있으므로, 더 깔끔하게 코드를 적을 수 있다.
 */

fun main() {
    val list = listOf('a', 'b', 'c', 'd')
    val result = list.map { "[${it.uppercase()}]" }
    result eq listOf("[A]", "[B]", "[C]", "[D]")
}