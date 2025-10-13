package chapter02.constructors

class Alien(name: String) {
    val greeting = "Poor $name"
}

fun main() {
    val alien = Alien("Mr. Meeseeks")
    println(alien.greeting)
    // alien.name // Error
}