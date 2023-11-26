package fundamental

fun main() {
    /**
     * higher order function adalah lambda yang dibuat sebagai
     * parameter fungsi
     */
    fun hello(name: String, transformer: (String) -> String): String {
        val transform = transformer(name)
        return "Hallo $transform"
    }

    val lambdaTransformToUpper = { value: String -> value.uppercase() }
    println(hello("Fahmi", lambdaTransformToUpper))

    println(hello("Fahmi") { it.lowercase() })
}