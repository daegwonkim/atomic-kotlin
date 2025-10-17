package chapter05.down_casting

import atomictest.eq

/*
안전한 캐스트인 as?는 실패해도 예외를 던지지 않는 대신 null을 반환한다.
때문에 나중에 NPE을 방지하려면 뭔가 적절한 조치를 취해야 한다.
 */

fun dogBarkSafe(c: Creature) =
    (c as? Dog)?.bark() ?: "Not a Dog"

fun main() {
    dogBarkSafe(Dog()) eq "Yip!"
    dogBarkSafe(Human()) eq "Not a Dog"
}