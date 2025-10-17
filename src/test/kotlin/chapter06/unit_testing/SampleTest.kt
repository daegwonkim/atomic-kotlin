package chapter06.unit_testing

import kotlin.test.*

class SampleTest {
    @Test
    fun testFortyTwo() {
        expect(42, "Incorrect,") { fortyTwo() }
    }
    @Test
    fun testAllGood() {
        assertTrue(allGood(), "Not good")
    }
}