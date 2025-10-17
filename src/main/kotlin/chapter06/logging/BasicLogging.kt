package chapter06.logging

import io.github.oshai.kotlinlogging.KotlinLogging

private val log = KotlinLogging.logger {}

fun main() {
    val msg = "Hello, Kotlin Logging!"
    log.trace { msg }
    log.debug { msg }
    log.info { msg }
    log.warn { msg }
    log.error { msg }
}

