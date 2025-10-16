package chapter04.local_functions

import atomictest.eq

fun main() {
    sessions.any { session ->
        if (session.title.contains("Kotlin") && session.speaker in favoriteSpeakers) {
            return@any true
        }
        false
    } eq true
}