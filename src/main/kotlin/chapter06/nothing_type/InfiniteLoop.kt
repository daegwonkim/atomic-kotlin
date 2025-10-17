package chapter06.nothing_type

/*
항상 예외를 던지는 함수의 반환 타입이 Nothing이다.
Nothing은 함수가 결코 반환되지 않는다는 사실을 표현하는 반환 타입이다.
 */

fun infinite(): Nothing {
    while(true) {}
}