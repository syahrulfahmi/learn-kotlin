package fundamental

/**
 * closure adalah sebuah kemampuan pada fungsi, lambda dan sejenisnya
 * dalam berinteraksi dengan data sekitar
 *
 * NOTES: Harap hati-hati dalam menggunakan closure!
 */
fun main() {
    var counter = 0

    val lambdaIncrement = {
        println("lambda increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("anonymous increment")
        counter++
    }

    fun funcIncrement() {
        println("fun increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    funcIncrement()
    lambdaIncrement()
    anonymousIncrement()
    funcIncrement()
    println(counter)
}