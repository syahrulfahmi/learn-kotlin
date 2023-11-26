package oop.data

open class Employee(val name: String) {
    open fun sayHello(name: String) {
        println("Hallo, $name. My name is ${this.name}")
    }
}

class Manager(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Hello, $name. My name is manager ${this.name}")
    }
}

class VicePresident(name: String) : Employee(name) {
    override fun sayHello(name: String) {
        println("Helo $name, my vice president is ${this.name}")
    }
}