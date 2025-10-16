package chapter04.member_references

import atomictest.eq

fun main() {
    val messages = listOf(
        Message("Kitty", "Hey!", true),
        Message("Kitty", "Where are you?", false),
        Message("Boss", "Meeting today", false)
    )
    messages.sortedWith(compareBy(Message::isRead, Message::sender)) eq
            listOf(
                // 우선은 읽지 않은 메시지가 보낸 사람 순서로 정렬된다
                Message("Boss", "Meeting today", false),
                Message("Kitty", "Where are you?", false),
                // 그 후 읽은 메시지가 역시 보낸 사람 순서로 정렬된다
                Message("Kitty", "Hey!", true)
            )
}