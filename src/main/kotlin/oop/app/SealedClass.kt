package oop.app

import oop.data.Operation

fun main() {

    fun operation(a: Int, b: Int, operation: Operation): Int {
        return when (operation) {
            is Operation.Plus -> a + b
            is Operation.Minus -> a - b
        }
    }

    println(operation(1, 2, Operation.Plus()))
}