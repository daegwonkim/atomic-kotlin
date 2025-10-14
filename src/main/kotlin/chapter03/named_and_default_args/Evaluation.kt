package chapter03.named_and_default_args

class DefaultArg
val da = DefaultArg()

fun g(d: DefaultArg = da) = println(d)

fun h(d: DefaultArg = DefaultArg()) =
    println(d)

fun main() {
    g()
    g()
    h()
    h()
}