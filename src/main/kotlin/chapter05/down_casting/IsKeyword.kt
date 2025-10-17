package chapter05.down_casting

/*
코틀린의 스마트 캐스트는 자동 다운캐스트이다. is 키워드는 어떤 객체가 특정 타입인지 검사한다.
이 검사 영역 안에서는 해당 객체를 검사에 성공한 타입이라고 간주한다.
 */

fun main() {
    val b1: Base = Derived1() // 업캐스트
    if (b1 is Derived1)
        b1.g() // 'is' 검사의 영역 내부
    val b2: Base = Derived2() // 업캐스트
    if (b2 is Derived2)
        b2.h() // 'is' 검사의 영역 내부
}