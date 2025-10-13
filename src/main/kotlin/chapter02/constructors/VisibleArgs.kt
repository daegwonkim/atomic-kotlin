package chapter02.constructors

/*
클래스 본문 밖에서도 생성자 파라미터에 접근할 수 있게 하려면 파라미터 목록에 var나 val을 지정한다
 */
class MutableNameAlien(var name: String)

class FixedNameAlien(val name: String)

fun main() {
    val alien1 = MutableNameAlien("Reverse Giraffe")
    val alien2 = FixedNameAlien("Krombopolis Michael")
    alien1.name = "Parasite"
    // 다음과 같이는 할 수 없다
    // alien2.name = "Parasite"
}