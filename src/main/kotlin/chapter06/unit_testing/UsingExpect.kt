package chapter06.unit_testing

import atomictest.*
import kotlin.test.assertFails
import kotlin.test.assertFailsWith
import kotlin.test.expect

/*
expect() 함수는 코드 블록을 실행하고 그 결과를 예상값과 비교한다.
 */

fun testFortyTwo2(n: Int = 42) {
    expect(n, "Incorrect,") { fortyTwo() }
}

fun main() {
    testFortyTwo2()
    capture {
        testFortyTwo2(43)
    } contains
            listOf("expected:",
                "<43> but was:", "<42>")
    assertFails { testFortyTwo2(43) }
    capture {
        assertFails { testFortyTwo2() }
    } contains
            listOf("Expected an exception",
                "to be thrown",
                "but was completed successfully.")
    assertFailsWith<AssertionError> {
        testFortyTwo2(43)
    }
    capture {
        assertFailsWith<AssertionError> {
            testFortyTwo2()
        }
    } contains
            listOf("Expected an exception",
                "to be thrown",
                "but was completed successfully.")
}