package chapter03.safe_cells_and_elvis

import atomictest.eq

fun checkLength(s: String?, expected: Int) {
    val length1 = if (s != null) s.length else 0
    val length2 = s?.length ?: 0
    length1 eq expected
    length2 eq expected
}

fun main() {
    checkLength("abc", 3)
    checkLength(null, 0)
}