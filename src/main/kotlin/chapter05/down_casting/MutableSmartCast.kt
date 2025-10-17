package chapter05.down_casting

/*
자동 다운캐스트는 대상이 상수여야만 제대로 동작한다.
 */

class SmartCast1(val c: Creature) {
    fun contact() {
        when (c) {
            is Human -> c.greeting()
            is Dog -> c.bark()
            is Alien -> c.mobility()
        }
    }
}

class SmartCast2(var c: Creature) {
    fun contact() {
        when (val c = c) {
            is Human -> c.greeting()
            is Dog -> c.bark()
            is Alien -> c.mobility()
        }
    }
}