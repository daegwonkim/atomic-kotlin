package chapter05.abstract_

interface Animal2
interface Mammal2 : Animal2
interface AquaticAnimal2 : Animal2

class Dolphin : Mammal2, AquaticAnimal2