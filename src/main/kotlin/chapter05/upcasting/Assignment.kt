package chapter05.upcasting

fun main() {
    val shape1: Shape = Square()
    val shape2: Shape = Triangle()
    // 컴파일 되지 않는다
    // shape1.color()
    // shape2.rotate()
}