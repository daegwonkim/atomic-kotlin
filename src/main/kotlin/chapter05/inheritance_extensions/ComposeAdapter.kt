package chapter05.inheritance_extensions

import atomictest.trace

class MyClass2 {
    fun g() = trace("g()")
    fun h() = trace("h()")
}

fun useMyClass2(mc: MyClass2) {
    mc.g()
    mc.h()
}

class MyClassAdapterForLib2 : LibType {
    val field = MyClass2()
    override fun f1() = field.h()
    override fun f2() = field.g()
}

fun main() {
    val mc = MyClassAdapterForLib2()
    utility1(mc)
    utility2(mc)
    useMyClass2(mc.field)
    trace eq "h() g() g() h() g() h()"
}