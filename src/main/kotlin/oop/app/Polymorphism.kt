package oop.app

import oop.data.Employee
import oop.data.Manager
import oop.data.VicePresident

fun main() {
    /**
     * @polymorphism adalah kemampuan untuk merubah bentuk dari satu objek ke objek yang lain
     * @polymorphism sangat erat kaitannya dengan inheritance
     */
    var employee = Employee("Fahmi")
    employee.sayHello("Syahrul")

    employee = Manager("Steve")
    employee.sayHello("Tom")

    employee = VicePresident("Kurniawan")
    callVicePresident("Budi", employee)
}

fun callVicePresident(name:String, vicePresident: VicePresident) {
    vicePresident.sayHello(name)
}