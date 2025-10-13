package chapter02.objects_every_where

fun fraction(numerate: Long, denom: Long) =
    numerate.toDouble() / denom

fun main() {
    val num = 1
    val den = 2
    val f = fraction(num.toLong(), den.toLong())
    println(f)
}