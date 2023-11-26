package oop.data

interface Base {
    fun sayHello(name: String)
    fun sayGoodBye(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("hello, $name")
    }

    override fun sayGoodBye(name: String) {
        println("goodbye, $name")
    }
}

/**
 * @delegation adalah kemampuan untuk meneruskan fungsi atau properti keobjek tertentu
 */
class Delegate(base: Base) : Base by base