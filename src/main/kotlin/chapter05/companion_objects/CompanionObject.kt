package chapter05.companion_objects

import atomictest.eq

/*
companion object(동반 객체)안에 있는 함수와 필드는 클래스에 대한 함수와 필드다.
일반 클래스의 원소는 동반 객체의 원소에 접근할 수 있지만, 동반 객체의 원소는 일반 클래스의 원소에 접근할 수 없다.
 */

class WithCompanion {
    companion object {
        val i = 3
        fun f() = i * 3
    }
    fun g() = i + f()
}

fun WithCompanion.Companion.h() = f() * i

fun main() {
    val wc = WithCompanion()
    wc.g() eq 12
    WithCompanion.i eq 3
    WithCompanion.f() eq 9
    WithCompanion.h() eq 27
}