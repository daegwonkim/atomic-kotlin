package chapter04.recursion

import atomictest.eq

/*
호출 스택 넘침을 막기 위해 함수형 언어들은 꼬리 재귀라는 기법을 사용한다.
꼬리 재귀의 목표는 호출 스택의 크기를 줄이는 것으로, tailrec 키워드를 사용해 만든다.
이 키워드는 올바른 조건하에서 재귀 호출을 이터레이션으로 변환해 함수 호출 스택 비용을 제거해준다.
꼬리 재귀가 되려면 재귀 호출이 함수의 마지막 연산이어야 한다. 즉, 재귀 호출이 반환된 이후에 추가적인 연산이 있어서는 안되며, 이를 위해서 누적값(accumulator)을 사용한다.
 */

private tailrec fun sum3(
    n: Long,
    accumulator: Long
): Long =
    if (n == 0L) accumulator
    else sum3(n - 1, accumulator + n)

fun sum3(n: Long) = sum3(n, 0)

fun main() {
    sum3(2) eq 3
    sum3(10000) eq 50005000
    sum3(100000) eq 5000050000
}