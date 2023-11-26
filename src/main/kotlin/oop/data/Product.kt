package oop.data

/**
 * data class merupakan class yang biasanya digunakan hanya untuk
 * merepresentasikan sebuah data atau table dari database.
 */
data class Product(
    var name: String,
    var price: Int,
    var category: String
)
