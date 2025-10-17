package chapter06.resource_cleanup

import atomictest.eq
import chapter06.check_instructions.DataFile

/*
useLines()는 File 객체를 열고, 파일에서 모든 줄을 읽은 다음, 대상 함수(보통은 람다)에 모든 줄을 전달한다.
 */

fun main() {
    DataFile("Results.txt").useLines {
        it.filter { "#" in it }.first()
    } eq "# ok"
    DataFile("Results.txt").useLines { lines ->
        lines.filter { line ->
            "#" in line
        }.first()
    } eq "# ok"
}