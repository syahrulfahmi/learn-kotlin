package oop.app

import oop.data.Application

/**
 * @typealias adalah kemampuan untuk menyederhanakan pendeklarasian suatu class
 * atau fungsi yang terlalu panjang baik dari segi penamaan atau lokasi package
 */
typealias App = Application
typealias StringSupplier = () -> String

fun printSupplier(supplier: StringSupplier) {
    println("Hello, supplier ${supplier.invoke()}")
}

fun main() {
    val app = App("Syahrul")
    println(app.name)
    printSupplier { "Fahmi" }
}