package oop.data

class Television {
    /**
     * secara default di kotlin harus di inisialisasikan nilai pada saat pendeklarasian suatu variabel.
     * namun dengan menggunakan late init kita bisa menunda penginisiaslisasian nilai saat mendeklaraasikan suatu
     * variable
     */
    lateinit var brand: String

    fun initTv(brand: String) {
        this.brand = brand
    }
}