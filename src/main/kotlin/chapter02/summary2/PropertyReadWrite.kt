package chapter02.summary2

import atomictest.eq

class Holder(var i: Int)

fun main() {
    val holder = Holder(10)
    holder.i eq 10 // 'i' 프로퍼티를 읽는다
    holder.i = 20  // 'i' 프로퍼티에 값을 쓴다
}