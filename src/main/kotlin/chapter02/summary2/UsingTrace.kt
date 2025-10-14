package chapter02.summary2

import atomictest.trace

fun main() {
    trace("Hello,")
    trace(47)
    trace("World!")
    trace eq """
        Hello,
        47
        World!
    """
}