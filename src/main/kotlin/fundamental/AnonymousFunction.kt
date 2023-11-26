package fundamental

fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val transform = transformer(name)
        return "Hallo $transform"
    }

    /**
     * anonymous function digunakan untuk operasi yang lebih
     * kompleks daripada lambda
     */
    val upper = fun(value: String): String {
        return if (value.isEmpty()) {
            "UPS"
        } else {
            value.uppercase()
        }
    }

    println(hello("Fahmi", upper))
}