package chapter06.exception_handling

import atomictest.eq

/*
finally 절은 항상 실행된다.
 */

data class Switch(
    var on: Boolean = false,
    var result: String = "OK"
)

fun testFinally(i: Int): Switch {
    val sw = Switch()
    try {
        sw.on = true
        when (i) {
            0 -> throw IllegalStateException()
            1 -> return sw
        }
    } catch (e: IllegalStateException) {
        sw.result = "exception"
    } finally {
        sw.on = false
    }
    return sw
}

fun main() {
    testFinally(0) eq
            "Switch(on=false, result=exception)"
    testFinally(1) eq
            "Switch(on=false, result=OK)"
    testFinally(2) eq
            "Switch(on=false, result=OK)"
}