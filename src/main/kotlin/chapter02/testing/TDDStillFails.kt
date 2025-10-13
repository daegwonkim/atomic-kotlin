package chapter02.testing

import atomictest.eq

fun main() {
    // 모든 테스트가 실패함
    // calculateBMI2(160, 68) eq "Normal weight"
    // calculateBMI2(100, 68) eq "Underweight"
    // calculateBMI2(200, 68) eq "Overweight"
}

fun calculateBMI2(weight: Int, height: Int): String {
    val bmi = weight / (height * height) * 703.07
    return if (bmi < 18.5) "Underweight"
        else if (bmi < 25) "Normal weight"
        else "Overweight"
}