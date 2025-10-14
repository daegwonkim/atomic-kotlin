package chapter03.extension_functions

import atomictest.eq

fun main() {
    "Single".singleQuote() eq "'Single'"
    "Double".doubleQuote() eq "\"Double\""
}