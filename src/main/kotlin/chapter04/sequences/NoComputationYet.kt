package chapter04.sequences

import atomictest.eq

/*
Sequence 연산에는 중간 연산과 최종 연산, 두 가지가 있다.
- 중간 연산은 결과로 다른 Sequence를 내놓는다. 아래 예제에서 filter()와 map()은 중간 연산이다.
- 최종 연산은 Sequence가 아닌 값을 내놓는다. 결괏값을 얻기 위해 최종 연산은 저장된 모든 계산을 수행한다.
  any()는 Sequence를 받아 Boolean을 내놓기 때문에 최종 연산이다.
 */

fun main() {
    val r = listOf(1, 2, 3, 4)
        .asSequence()
        .filter(Int::isEven)
        .map(Int::square)
    r.toString().substringBefore("@") eq
            "kotlin.sequences.TransformingSequence"
}