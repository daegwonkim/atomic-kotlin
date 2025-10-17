package chapter05.nested_classes

fun localClasses() {
    open class Amphibian
    class Frog : Amphibian()
    val amphibian: Amphibian = Frog()
}