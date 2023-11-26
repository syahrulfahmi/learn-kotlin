package generic.data

class Function(private val name: String) {

    fun <T> sayHello(param: T) {
        println("Hello, $param my name is ${this.name}")
    }
}