package chapter06.resource_cleanup

import atomictest.eq
import chapter06.check_instructions.DataFile

/*
코틀린이 제공하는 use() 함수는 닫을 수 있는 자원을 제대로 해제해준다.
use() 자바의 AutoClosable 인터페이스를 구현하는 모든 객체에 적용할 수 있다.
use()는 인자로 받은 코드 블록을 실행하고, 그 블록을 어떻게 빠져나왔는지와 관계없이 객체의 close()를 호출한다.
use()는 모든 예외를 다시 던져주기 때문에 프로그램에서는 여전히 예외를 처리해야 한다.
 */

fun main() {
    DataFile("Results.txt")
        .bufferedReader()
        .use { it.readLines().first() } eq "Results"
}