package chapter05.type_checking

import atomictest.eq

sealed class Shape2 {
    fun draw() = "$name: Draw"
}

class Circle2 : Shape2()

class Square2 : Shape2() {
    fun rotate() = "Square2: Rotate"
}

class Triangle2 : Shape2() {
    fun rotate() = "Triangle2: Rotate"
}

fun turn(s: Shape2) = when(s) {
    is Circle2 -> ""
    is Square2 -> s.rotate()
    is Triangle2 -> s.rotate()
}

fun main() {
    val shapes = listOf(Circle2(), Square2())
    shapes.map { it.draw() } eq
            "[Circle2: Draw, Square2: Draw]"
    shapes.map { turn(it) } eq
            "[, Square2: Rotate]"
}