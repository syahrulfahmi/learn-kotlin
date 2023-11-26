package oop.data

class Car(paramBrand: String, paramYear: Int = 2020) {
    var brand = paramBrand
    var year = paramYear

    init {
        println("car $brand dibuat")
    }
}