package collection.app

fun main() {
    /**
     * @map adalah struktur data yang berbentuk key-value
     * @key harus unik
     */
    val map = mapOf(
        "a" to "Syahrul",
        "b" to "Fahmi",
        "c" to "Budi"
    )

    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.entries)

    val mutableMap = map.toMutableMap()
    mutableMap.remove("c")
    mutableMap["d"] = "Jery"
    mutableMap["e"] = "Kane"
    println(mutableMap.entries)
}