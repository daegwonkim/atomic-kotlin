package chapter06.check_instructions

import atomictest.*

/*
check()는 require()와 동일하지만 IllegalStatueException을 던진다는 차이가 있다.
일반적으로 check()는 함수의 맨 끝에서 함수 결과(또는 함수가 반환하는 객체의 필드)가 올바른지 검증하기 위해 사용한다.
 */

val resultFile = DataFile("Result.txt")

fun createResultFile(create: Boolean) {
    if (create)
        resultFile.writeText("Result\n# ok")
    // ... 다른 실행 경로들
    check(resultFile.exists()) {
        "${resultFile.name} doesn't exist!"
    }
}

fun main() {
    resultFile.erase()
    capture {
        createResultFile(false)
    } eq "IllegalArgumentException: Results.txt doesn't exist!"
    createResultFile(true)
}