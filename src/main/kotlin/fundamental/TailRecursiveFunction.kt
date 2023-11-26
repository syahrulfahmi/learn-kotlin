package fundamental

fun main() {
//    display(10000)
    println(factorialTailRecursive(5))
}

/**
 * tail recursive adalah sebuah fungsi yang mengubah fungsi recursive menjadi
 * loop biasa pada saat kompilasi, dan ini hanya tersedia di kotlin
 *
 * syarat tail recursive hanya boleh memanggil dirinya sendiri tanpa ada
 * operasi apapun dan harus menggunakan kata kunci tailrec
 */
tailrec fun display(value: Int) {
    println("recursive : $value")
    if (value > 0) display(value - 1)
}