package chapter05.abstract_

/*
인터페이스도 프로퍼티를 선언할 수 있지만, 데이터는 실제로 해당 인터페이스를 구현하는 클래스 안에만 저장될 수 있다.
 */

interface IntList2 {
    val name: String
    // 컴파일 되지 않는다
    // val list = listOf(0)
}