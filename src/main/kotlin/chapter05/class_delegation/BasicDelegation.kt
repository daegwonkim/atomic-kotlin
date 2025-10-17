package chapter05.class_delegation

/*
코틀린은 클래스 위임 과정을 자동화해준다.
클래스를 위임하려면 by 키워드를 인터페이스 이름 뒤에 넣고 by 뒤에 위임할 멤버 프로퍼티의 이름을 넣는다.
 */

interface AI
class A : AI

class B(val a: A) : AI by a