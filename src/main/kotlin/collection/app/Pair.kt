package collection.app

fun main() {
    /**
     * @pair merupakan struktur data yang merepresentasikan data yang berpasangan.
     */
    val pair = Pair("Budi", "Tom")
    println(pair.first)
    println(pair.second)

    val pair2: Pair<String, String> = "Syahrul" to "Fahmi"
    println(pair2.first)
    println(pair2.second)
}