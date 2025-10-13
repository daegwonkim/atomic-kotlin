package chapter02.varargs

/*
vararg는 가변 인자 목록(variable argument list)의 약자이다
vararg 키워드를 사용하면 listOf처럼 임의의 길이로 인자를 받을 수 있는 함수를 정의할 수 있다
함수 정의에는 vararg로 선언된 인자가 최대 하나만 있어야 한다
 */
fun v(s: String, vararg d: Double) {}

fun main() {
    v("abc", 1.0, 2.0)
    v("def", 1.0, 2.0, 3.0, 4.0)
    v("ghi", 1.0, 2.0, 3.0, 4.0, 5.0, 6.0)
}