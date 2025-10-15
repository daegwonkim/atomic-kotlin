package chapter04.member_references

import atomictest.eq

data class Message2(
    val sender: String,
    val text: String,
    val isRead: Boolean,
    val attachments: List<Attachment>
)

data class Attachment(
    val type: String,
    val name: String
)

fun Message2.isImportant(): Boolean =
    text.contains("Salary increase") ||
            attachments.any {
                it.type == "image" && it.name.contains("cat")
            }

fun main() {
    val message = listOf(Message2("Boss", "Let's discuss goals for next year", false,
        listOf(Attachment("image", "cute cats"))))
    message.any(Message2::isImportant) eq true
}