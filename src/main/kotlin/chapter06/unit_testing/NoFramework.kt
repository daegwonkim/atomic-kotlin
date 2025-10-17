package chapter06.unit_testing

import atomictest.*
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/*
assertEquals()는 실제 값과 예상값을 비교한다.
assertTrue()는 첫 번째 파라미터로 들어온 Boolean 식이 참인지 검증한다.
 */

fun fortyTwo() = 42

fun testFortyTwo(n: Int = 42) {
    assertEquals(
        expected = n,
        actual = fortyTwo(),
        message = "Incorrect,")
}

fun allGood(b: Boolean = true) = b

fun testAllGood(b: Boolean = true) {
    assertTrue(allGood(b), "Not good")
}

fun main() {
    testFortyTwo()
    testAllGood()
    capture {
        testFortyTwo(43)
    } contains
            listOf("expected:", "<43>",
                "but was", "<42>")
    capture {
        testAllGood(false)
    } contains listOf("Error", "Not good")
}