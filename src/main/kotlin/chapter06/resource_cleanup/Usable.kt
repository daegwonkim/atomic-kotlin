package chapter06.resource_cleanup

import atomictest.trace

/*
AutoClosable 인터페이스를 구현하면 use()에 사용할 수 있는 자신만의 클래스를 만들 수 있다.
AutoClosable 인터페이스 안에는 close() 함수만 들어있다.
 */

class Usable() : AutoCloseable {
    fun func() = trace("func()")
    override fun close() = trace("close()")
}

fun main() {
    Usable().use { it.func() }
    trace eq "func() close()"
}