package chapter06.logging

import chapter06.check_instructions.DataFile

val logFile = // reset()은 파일이 비어 있게 만든다
    DataFile("simpleLogFile.txt").reset()

fun debug(msg: String) =
    System.err.println("Debug: $msg")
// 비활성화하고 싶으면 다음과 같이 바꿔라
// fun.debug(msg: String) = Unit

fun trace(msg: String) =
    logFile.appendText("Trace: $msg\n")

fun main() {
    debug("Simple Logging Strategy")
    trace("Line 1")
    trace("Line 2")
    println(logFile.readText())
}