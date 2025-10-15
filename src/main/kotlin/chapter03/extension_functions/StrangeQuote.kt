package chapter03.extension_functions

import atomictest.eq

/*
this 키워드를 사용해 멤버 함수나 다른 확장에 접근할 수 있다
 */
fun String.strangeQuote() =
    this.singleQuote().singleQuote()

/*
this 키워드는 생략 가능하다
 */
fun String.tooManyQuotes() =
    doubleQuote().doubleQuote()

fun main() {
    "Hi".strangeQuote() eq "''Hi''"
    "Hi".tooManyQuotes() eq "\"\"Hi\"\""
}

