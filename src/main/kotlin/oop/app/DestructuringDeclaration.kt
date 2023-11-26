package oop.app

import oop.data.Login
import oop.data.Product

fun isLogin(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {
    /**
     * @destructuring adalah kemampuan untuk membuat multiple variable
     * dari suatu objek. Dan syarat agar suatu objek dapat di destructuring
     * harus memiliki fungsi @see componentX()
     */
    // destructuring pada data class
    val product = Product("supermie", 3_500, "food")
    val (name, price, category) = product
    println(name)
    println(price)
    println(category)

    /** destructuring pada lambda */
    /**
     * lambda tanpa destructuring
     */
//    isLogin(login) { data ->
//        data.username == "fahmi" && data.password == "123"
//    }
    val login = Login("fahmi", "123")
    isLogin(login) { (username, password) ->
        username == "fahmi" && password == "123"
    }
}