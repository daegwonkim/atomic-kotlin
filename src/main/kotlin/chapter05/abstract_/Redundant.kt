package chapter05.abstract_

interface Redundant {
    abstract val x: Int
    abstract fun f(): Int
    abstract fun g(n: Double)
}

interface Removed {
    val x: Int
    fun f(): Int
    fun g(n: Double)
}