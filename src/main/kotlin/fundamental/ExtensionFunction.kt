package fundamental

fun main() {
    val name = "Fahmi"
    println(name.sayHello())
}

fun String.sayHello(): String {
    return "Hallo $this"
}