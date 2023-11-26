package oop.data

open class Shape {
    val corner : Int = 5

    open fun printName() {
        println("this is shape")
    }
}

class Rectangle : Shape() {
    val parentCorner = super.corner
    override fun printName() {
        println("this is rectangle")
        super.printName()
    }
}