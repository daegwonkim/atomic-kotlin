package chapter03.enumerations

import chapter03.enumerations.Direction.*
import atomictest.eq

/*
enum은 인스턴스 개수가 미리 정해져 있고 클래스 본문 안에 이 모든 인스턴스가 나열되어 있는 특별한 종류의 클래스다.
이 점을 제외하면 enum은 일반 클래스와 똑같이 동작한다. 따라서 멤버 함수나 멤버 프로퍼티를 이넘에 정의할 수도 있다.
이러한 추가 멤버를 정의하고 싶다면, 마지막 이넘 값 다음에 세미콜론을 추가한 후 정의를 포함시켜야 한다.
 */
enum class Direction(val notation: String) {
    North("N"), South("S"),
    East("E"), West("W");
    val opposite: Direction
        get() = when (this) {
            North -> South
            South -> North
            West -> East
            East -> West
        }
}

fun main() {
    North.notation eq "N"
    North.opposite eq South
    West.opposite.opposite eq West
    North.opposite.notation eq "S"
}