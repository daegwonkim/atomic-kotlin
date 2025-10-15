package chapter03.data_classes

import atomictest.eq

/*
데이터를 저장하는 게 주목적인 클래스를 정의하려면 여전히 반복적인 코드를 꽤 많이 작성해야 한다.
데이터 저장만 담당하는 클래스가 필요하면 data 클래스를 사용해 코드양을 줄이면서 여러 가지 공통 작업을 편하게 수행할 수 있다.

data 클래스를 정의할 때는 data 키워드를 사용한다.
data 키워드는 몇 가지 기능을 클래스에 추가하라고 코틀린에게 지시한다.
이때 모든 생성자 파라미터를 var나 val로 선언해야 한다.
 */

data class Simple(
    val arg1: String,
    val arg2: Int
)

fun main() {
    val s1 = Simple("Hi", 29)
    val s2 = Simple("Hi", 29)
    s1 eq "Simple(arg1=Hi, arg2=29)"
    s1 eq s2
}