package chapter05.composition

interface Building
interface Kitchen

interface House1 : Building {
    val kitchen: Kitchen
}