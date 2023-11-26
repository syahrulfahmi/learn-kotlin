package generic.app

/**
 * @covariant adalah kemampuan untuk dapat mensubstitue child type ke super type pada suatu class generic
 * syarat covariant, parameter type hanya boleh di jadikan sebagai return value pada suatu fungsi
 * dan tidak boleh dijadikan sebagai input parameter.
 */
class Covariant<out T>(val data: T) {
    fun sayHello(): T {
        return data
    }
}

fun main() {
    val data1: Covariant<String> = Covariant("Fahmi")
    val data2: Covariant<Any> = data1

    println(data2.sayHello())
}