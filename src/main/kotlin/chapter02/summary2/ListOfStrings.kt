package chapter02.summary2

import atomictest.trace

fun main() {
    val wocky = """
        Twas brilling, and the slithy toves
        Did gyre and gimble in the wabe:
        All mimsy were the borogoves,
        And the mome raths outgrabe.
    """.trim().split(Regex("\\W+"))
    trace(wocky.take(5))
    trace(wocky.slice(6..12))
    trace(wocky.slice(6..18 step 2))
    trace(wocky.sorted().takeLast(5))
    trace(wocky.sorted().distinct().takeLast(5))
    trace eq """
        [Twas, brilling, and, the, slithy]
        [Did, gyre, and, gimble, in, the, wabe]
        [Did, and, in, wabe, mimsy, the, And]
        [the, the, toves, wabe, were]
        [slithy, the, toves, wabe, were]
    """
}