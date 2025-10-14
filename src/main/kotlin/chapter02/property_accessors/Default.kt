package chapter02.property_accessors

import atomictest.trace

/*
get()과 set()은 그들이 연결된 프로퍼티보다 더 안쪽으로 들여 쓴다.
이는 언어 설계 차원에서 "프로퍼티의 일부"임을 명확히 하기 위해서이다.
 */
class Default {
    var i: Int = 0
        get() {
            trace("get()")
            return field
        }
        set(value) {
            trace("set($value)")
            field = value
        }
}

fun main() {
    val d = Default()
    d.i = 2
    trace(d.i)
    trace eq """
        set(2)
        get()
        2
    """
}