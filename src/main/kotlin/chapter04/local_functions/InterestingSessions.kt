package chapter04.local_functions

import atomictest.eq

fun main() {
    sessions.any(
        fun(session: Session): Boolean {
            if (session.title.contains("Kotlin") && session.speaker in favoriteSpeakers) {
                return true
            }
            return false
        }
    ) eq true
}