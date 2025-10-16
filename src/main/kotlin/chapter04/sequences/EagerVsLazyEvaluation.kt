package chapter04.sequences

import atomictest.trace

/*
지연 계산은 결과가 필요할 때만 계산을 수행한다. 시퀀스에 대해 지연 계산을 수행하는 경우 수직적 평가라고도 한다.
지연 계산을 사용하면 어떤 원소와 연관된 값이 진짜 필요할 때만 그 원소와 관련된 연산을 수행한다.
원본 컬렉션의 마지막 원소를 처리하기 전에 최종 결과를 찾아내면 나머지 원소는 처리되지 않는다.
List를 asSequence()를 사용해 Sequence로 변경하면 지연 계산이 활성화된다.
 */

fun Int.isEven(): Boolean {
    trace("$this.isEven()")
    return this % 2 == 0
}

fun Int.square(): Int {
    trace("$this.square()")
    return this * this
}

fun Int.lessThanTen(): Boolean {
    trace("$this.lessThanTen()")
    return this < 10
}

fun main() {
    val list = listOf(1, 2, 3, 4)
    trace(">>> List:")
    trace(
        list.filter(Int::isEven)
            .map(Int::square)
            .any(Int::lessThanTen)
    )
    trace(">>> Sequence:")
    trace(
        list.asSequence()
            .filter(Int::isEven)
            .map(Int::square)
            .any(Int::lessThanTen)
    )
    trace eq """
        >>> List:
        1.isEven()
        2.isEven()
        3.isEven()
        4.isEven()
        2.square()
        4.square()
        4.lessThanTen()
        true
        >>> Sequence:
        1.isEven()
        2.isEven()
        2.square()
        4.lessThanTen()
        true
    """
}