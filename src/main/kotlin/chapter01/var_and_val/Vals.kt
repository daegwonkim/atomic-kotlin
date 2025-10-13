package chapter01.var_and_val

/*
val: 값(value)의 약자로, 식별자의 값을 단 한 번만 초기화할 수 있다. 일단 값을 초기화하고 나면 내용을 변경할 수 없다.
 */
fun main() {
    val whole = 11
    // whole = 15 // 오류
    val fractional = 1.4
    val words = "Twas Brilling"
    println(whole)
    println(fractional)
    println(words)
}