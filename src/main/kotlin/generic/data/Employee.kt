package generic.data

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

/**
 * @generic constraint adalah kemampuan untuk membatasi suatu parameter type
 * bahwa hanya boleh di masukan suatu tipe parameter atau turunannya.
 */
class Company<T : Employee>(val employee: T)

/**
 * terkadang kita ingin melakukan pembatasan hanya boleh diisi oleh
 * beberapa parameter type tertentu. Hal ini bisa dilakukan
 * dengan menggunaakan kata kunci
 * @where
 */
//class Company<T>(val employee: T) where T : Employee, T : CanSayHello