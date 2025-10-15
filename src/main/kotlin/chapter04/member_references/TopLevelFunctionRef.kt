package chapter04.member_references

import atomictest.eq

fun ignore(message: Message2) =
    !message.isImportant() && message.sender in setOf("Boss", "Mom")

fun main() {
    val text = "Let's discuss goals for the next year"
    val msgs = listOf(
        Message2("Boss", text, false, listOf()),
        Message2("Boss", text, false, listOf(Attachment("image", "cute cat")))
    )
    msgs.filter(::ignore).size eq 1
    msgs.filterNot(::ignore).size eq 1
}