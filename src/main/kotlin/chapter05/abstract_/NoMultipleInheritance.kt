package chapter05.abstract_

open class Animal
open class Mammal : Animal()
open class AquaticAnimal : Animal()

// 기반 클래스가 둘 이상이면 컴파일 되지 않는다
// class Dolphin : Mammal(), AquaticAnimal()