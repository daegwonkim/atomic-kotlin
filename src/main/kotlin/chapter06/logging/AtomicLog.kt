package chapter06.logging

import chapter06.check_instructions.DataFile

class Logger(fileName: String) {
    val logFile = DataFile(fileName).reset()
    private fun log(type: String, msg: String) =
        logFile.appendText("$type: $msg\n")
    fun trace(msg: String) = log("Trace", msg)
    fun debug(msg: String) = log("Debug", msg)
    fun info(msg: String) = log("Info", msg)
    fun warn(msg: String) = log("Warn", msg)
    fun error(msg: String) = log("Error", msg)
    // 기본 테스트를 위한 함수
    fun report(msg: String) {
        trace(msg)
        debug(msg)
        info(msg)
        warn(msg)
        error(msg)
    }
}