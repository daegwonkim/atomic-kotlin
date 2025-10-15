package chapter03.non_null_assertions

import atomictest.capture
import atomictest.eq

/*
null이 될 수 없다고 주장하기 위해 느낌표 두 개(!!)를 쓴다. 이를 널 아님 단언이라고 한다.
즉, x!!는 'x가 null일 수도 있다는 사실을 무시하라, x가 null이 아니라는 점을 보증한다'라는 뜻이다.
이때 x가 null이 아니면 x를 내놓고, x가 null이면 오류를 발생시킨다.
 */

fun main() {
    var x: String? = "abc"
    x!! eq "abc"
    x = null
    capture {
        val s: String = x!!
    } eq "NullPointerException"
}