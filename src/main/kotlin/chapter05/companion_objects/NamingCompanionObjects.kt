package chapter05.companion_objects

import atomictest.eq

class WithNamed {
    companion object Named {
        fun s() = "from Named"
    }
}

class WithDefault {
    companion object {
        fun s() = "from Default"
    }
}

fun main() {
    WithNamed.s() eq "from Named"
    WithNamed.Named.s() eq "from Named"
    WithDefault.s() eq "from Default"
    // 디폴트 이름은 Companion이다
    WithDefault.Companion.s() eq "from Default"
}