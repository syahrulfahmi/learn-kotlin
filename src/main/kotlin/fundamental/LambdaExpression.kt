package fundamental

/**
 * first class citizen : fungsi yang dianggap seperti tipe data yang lainnya
 * lammbda expression : fungsi yang tidak memiliki nama
 */

fun tambah(a: Int, b: Int): String = "$a + $b = ${a + b}"

fun main() {

    val kurang: (Int, Int) -> String = { a: Int, b: Int -> "$a - $b = ${a - b}" }
    val contohLambdaKurang = kurang(5, 2)

    // methode reference
    val contohLambdaTambah: (Int, Int) -> String = ::tambah
    println(contohLambdaTambah(5, 2))
    println(contohLambdaKurang)
}