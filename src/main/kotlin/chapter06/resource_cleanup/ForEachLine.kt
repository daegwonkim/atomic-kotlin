package chapter06.resource_cleanup

import atomictest.trace
import chapter06.check_instructions.DataFile

/*
forEachLine()에 전달된 람다는 Unit을 반환한다. 즉, 해당 람다 안에서 원하는 일을 부수 효과를 통해 달성해야 한다는 뜻이다.
함수형 프로그래밍에서는 부수 효과보다는 결과를 반환하는 쪽을 더 선호하기 때문에, useLines()가 forEachLine()보다 더 함수형인 접근 방법이다.
하지만 간단한 처리를 해야 하는 경우 forEachLine()이 더 빠른 해법이 될 수 있다.
 */

fun main() {
    DataFile("Results.txt").forEachLine {
        if (it.startsWith("#")) {
            trace("$it")
        }
    }
    trace eq "# ok"
}