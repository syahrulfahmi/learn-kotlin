package generic.app

/**
 * @star projection adalah kemampuan untuk tidak memperdulikan data dari suatu parameter
 * ketika kita hanya ingin mengambil informasi dari generic object
 */
fun displaySize(array: Array<*>) {
    println("the size of this array is ${array.size}")
}

fun main() {
    val array = arrayOf(1,2,3,4,5,6)
    displaySize(array)
}