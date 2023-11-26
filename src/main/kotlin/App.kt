class App() {
    val greeting
        get() = "Hello world"
}

fun main() {
    println(App().greeting)
}