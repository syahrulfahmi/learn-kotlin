package oop.app

/**
 * secara default setiap kelas yang ada dikotlin akan mewarisi kelas any
 */
class Hp(var name: String)  {
    override fun toString(): String {
        return "Ini objek hp $name"
    }
}

fun main() {
    val hp = Hp("samsung")
    println(hp)
}