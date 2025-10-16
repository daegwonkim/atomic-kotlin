package chapter04.local_functions

import atomictest.eq

fun main() {
    fun interesting(session: Session): Boolean {
        if (session.title.contains("Kotlin") && session.speaker in favoriteSpeakers) {
            return true
        }
        return false
    }
    sessions.any(::interesting) eq true
}