package chapter05.interfaces

/*
fun interface는 정확히 하나의 추상 메서드만 가질 수 있다.
 */

fun interface ZeroArg {
    fun f(): Int
}

fun interface OneArg {
    fun g(n: Int): Int
}

fun interface TwoArg {
    fun h(i: Int, j: Int): Int
}