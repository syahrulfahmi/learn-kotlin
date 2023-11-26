package oop.data

abstract class Animal {
    abstract val name: String
}

class Cat: Animal() {
    override val name: String
        get() = "Kucing"

}