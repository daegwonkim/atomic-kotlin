package chapter03.data_classes

import atomictest.eq

/*
copy()는 현재 객체의 모든 데이터를 포함하는 새 객체를 생성해준다.
또 이렇게 새 객체를 생성할 때 몇몇 값을 새로 지정할 수 있다.
 */

data class DetailedContact(
    val name: String,
    val surname: String,
    val number: String,
    val address: String
)

fun main() {
    val contact = DetailedContact(
        "Miffy",
        "Miller",
        "1-234-567890",
        "1600 Amphitheatre Parkway"
    )
    val newContact = contact.copy(
        number = "098-765-4321",
        address = "Brandschenkestrasse 110"
    )
    newContact eq DetailedContact(
        "Miffy",
        "Miller",
        "098-765-4321",
        "Brandschenkestrasse 110"
    )
}