package generic.app

class Container<T>(var data: T)

/**
 * secara default generic di kotlin adalah invariant
 * kita bisa memaksa suatu parameter generic apakah akan menjadi covariant atau contravariant
 * dengan menggunakan
 * @type projection
 */
fun copyData(from: Container<out Any>, to: Container<Any>) {
    to.data = from.data
}

fun main() {
    val container1 = Container("Syahrul")
    val container2: Container<Any> = Container("Fahmi")
    copyData(container1, container2)
    println(container2.data)
}