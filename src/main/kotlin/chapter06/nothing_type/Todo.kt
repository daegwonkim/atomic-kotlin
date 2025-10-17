package chapter06.nothing_type

import atomictest.*

/*
코틀린 내장 함수인 TODO()는 반환 타입이 Nothing이고, 항상 NotImplementedError를 던진다.
 */

fun later(s: String): String = TODO("later()")

fun later2(s: String): Int = TODO()

fun main() {
    capture {
        later("Hello")
    } eq "NotImplementedError: An operation is not implemented: later()"
    capture {
        later2("Hello")
    } eq "NotImplementedError: An operation is not implemented."
}