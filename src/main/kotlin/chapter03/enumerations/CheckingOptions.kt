package chapter03.enumerations

import atomictest.trace
import chapter03.enumerations.Level.*

fun checkLevel(level: Level) {
    when (level) {
        Overflow -> trace(">>> Overflow!")
        Empty -> trace("Alert: Empty")
        else -> trace("Level $level OK")
    }
}

fun main() {
    checkLevel(Empty)
    checkLevel(Low)
    checkLevel(Overflow)
    trace eq """
       Alert: Empty
       Level Low OK
       >>> Overflow!
    """
}