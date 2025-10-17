package chapter05.inheritance_extensions

class Z(var i: Int = 0) {
    private var j = 0
    fun increment() {
        i++
        j++
    }
}

fun Z.decrement() {
    i--
    // j-- // 접근할 수 없음
}