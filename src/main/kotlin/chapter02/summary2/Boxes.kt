package chapter02.summary2

import atomictest.trace

private var count = 0

private class Box(val dimension: Int) {
    fun volume() =
        dimension * dimension * dimension

    override fun toString() =
        "Box volume: ${volume()}"
}

private fun countBox(box: Box) {
    trace("$box")
    count++
}

fun countBoxes() {
    countBox(Box(4))
    countBox(Box(5))
}

fun main() {
    countBoxes()
    trace("$count boxes")
    trace eq """
        Box volume: 64
        Box volume: 125
        2 boxes
    """
}