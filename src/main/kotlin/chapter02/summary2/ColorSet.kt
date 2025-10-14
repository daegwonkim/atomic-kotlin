package chapter02.summary2

import atomictest.eq

val colors = "Yellow Green Green Blue"
    .split(Regex("""\W+""")).sorted()

fun main() {
    colors eq listOf("Blue", "Green", "Green", "Yellow")
    val colorSet = colors.toSet()
    colorSet eq setOf("Yellow", "Green", "Blue")
    (colorSet + colorSet) eq colorSet
    val mSet = colorSet.toMutableSet()
    mSet -= "Blue"
    mSet += "Red"
    mSet eq setOf("Yellow", "Green", "Red")
    // 집합 원소인지 확인
    ("Green" in colorSet) eq true
    colorSet.contains("Red") eq false
}