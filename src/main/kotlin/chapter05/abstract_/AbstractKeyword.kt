package chapter05.abstract_

/*
추상 클래스는 하나 이상의 프로퍼티나 함수가 불완전하다는 점을 제외하면 일반 클래스와 같다.
본문이 없는 함수 정의나 초깃값 대입을 하지 않는 프로퍼티 정의가 불완전한 정의다.
 */

abstract class WithProperty {
    abstract val x: Int
}

abstract class WithFunctions {
    abstract fun f(): Int
    abstract fun g(m: Double)
}