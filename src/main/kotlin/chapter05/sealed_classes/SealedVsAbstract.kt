package chapter05.sealed_classes

/*
sealed 클래스는 기본적으로 하위 클래스가 모두 같은 파일 안에 정의되어야 한다는 제약이 가해진 abstract 클래스다.
 */

abstract class Abstract(val av: String) {
    open fun concreteFunction() {}
    open val concreteProperty = ""
    abstract fun abstractFunction(): String
    abstract val abstractProperty: String
    init {}
    constructor(c: Char) : this(c.toString())
}

open class Concrete() : Abstract("") {
    override fun concreteFunction() {}
    override val concreteProperty = ""
    override fun abstractFunction() = ""
    override val abstractProperty = ""
}

sealed class Sealed(val av: String) {
    open fun concreteFunction() {}
    open val concreteProperty = ""
    abstract fun abstractFunction(): String
    abstract val abstractProperty: String
    init {}
    constructor(c: Char) : this(c.toString())
}

open class SealedSubclass() : Sealed("") {
    override fun concreteFunction() {}
    override val concreteProperty = ""
    override fun abstractFunction() = ""
    override val abstractProperty = ""
}

fun main() {
    Concrete()
    SealedSubclass()
}