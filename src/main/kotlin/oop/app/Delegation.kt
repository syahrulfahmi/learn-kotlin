package oop.app

import oop.data.Delegate
import oop.data.MyBase

fun main() {
    val base = MyBase()
    val delegate = Delegate(base)
    delegate.sayHello("Syahrul")
    delegate.sayGoodBye("Fahmi")
}