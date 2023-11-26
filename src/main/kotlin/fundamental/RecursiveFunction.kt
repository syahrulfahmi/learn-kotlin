package fundamental

fun main() {
    fun factorialLoop(value: Int) : Int {
        var result = 1
        for (i in value downTo 1) {
            result *= i
        }
        return result
    }
    println(factorialLoop(5))

    /**
     * recursive function adalah sebuah fungsi yang memanggil
     * dirinya sendiri
     */
    fun factorialRecursive(value: Int): Int {
        return when(value) {
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }

    println(factorialRecursive(5))
}

tailrec fun factorialTailRecursive(value: Int, total: Int = 1): Int {
    return when(value) {
        1 -> total
        else -> factorialTailRecursive(value - 1, total * value)
    }
}