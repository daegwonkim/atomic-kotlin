package chapter05.inheritance

/*
코틀린에서 클래스는 기본적으로 상속에 대해 닫혀있다.
open으로 지정하지 않은 클래스는 상속을 허용하지 않는다.
 */

open class Base

class Derived : Base()