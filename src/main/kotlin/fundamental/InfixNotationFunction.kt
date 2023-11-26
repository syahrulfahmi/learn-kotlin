package fundamental

fun main() {
    val name = "fahmi" to "UP"
    println(name)
}

/**
 * infix notation biasanya digunakan untuk operasi matematika,
 * yang bertujuan untuk melakukan operasi pada dua data.
 * Secara konsep mirip dengan extension function hanya saja
 * pada infix notation pendeklarasian fungsi tidak harus
 * menggunakan tanda titik.
 */
infix fun String.to(type: String): String {
    return when (type) {
        "UP" -> this.uppercase()
        else -> this.lowercase()
    }
}