package chapter03.extension_functions

import atomictest.eq

/*
코틀린 확장 함수는 기존 클래스에 멤버 함수를 추가하는 것과 같은 효과를 낸다
 */
fun String.singleQuote() = "'$this'"
fun String.doubleQuote() = "\"$this\""

fun main() {
    "Hi".singleQuote() eq "'Hi'"
    "Hi".doubleQuote() eq "\"Hi\""
}