package oop.data

/**
 * @sealed class merupakan sebuah class yang khusus digunakan untuk pewarisan,
 * @sealed class biasanya digunakan pada operasi when karena bertujuan hanya untuk mengecek
 * kondisi dari class childnya
 */

sealed class Operation (val name: String) {
    class Plus() : Operation("plus")
    class Minus(): Operation("minus")
}