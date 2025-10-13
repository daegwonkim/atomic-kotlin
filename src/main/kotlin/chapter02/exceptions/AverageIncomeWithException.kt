package chapter02.exceptions

import atomictest.*

fun averageIncomeWithException(income: Int, months: Int) =
    if (months == 0)
        throw IllegalArgumentException("Months can't be zero")
    else income / months

fun main() {
    averageIncomeWithException(3300, 3) eq 1100
    capture {
        averageIncomeWithException(5000, 0)
    } eq "IllegalArgumentException: Months can't be zero"
}