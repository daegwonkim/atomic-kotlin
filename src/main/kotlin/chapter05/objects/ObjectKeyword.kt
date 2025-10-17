package chapter05.objects

import atomictest.eq

/*
object는 여러 인스턴스가 필요하지 않거나 명시적으로 인스턴스를 여러 개 생성하는 것을 막고 싶은 경우
논리적으로 한 개체 안에 속한 함수와 프로퍼티를 함께 엮는 방법이다.
object의 인스턴스를 직접 생성하는 경우는 결코 없다. object를 정의하면 그 object 인스턴스가 오직 하나만 생긴다.
 */

object JustOne {
    val n =2
    fun f() = n * 10
    fun g() = this.n * 20
}

fun main() {
    // val x = JustOne() // 오류
    JustOne.n eq 2
    JustOne.f() eq 20
    JustOne.g() eq 40
}