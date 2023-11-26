package collection.app

fun main() {
    /**
     * @mapping adalah operasi untuk merubah bentuk list menjadi tipe list yang lain
     */
    val listOf = listOf("Syahrul", "Fahmi", "Budi")
    val listOfUppercase = listOf.map { it.uppercase() }
    val listOfMapIndexed = listOf.mapIndexed { index, s -> if (index % 2 == 0) s.uppercase() else s.lowercase() }
    val listOfMapNotNull = listOf.mapNotNull { if (it == "Budi") null else it }
    println(listOf)
    println(listOfUppercase)
    println(listOfMapIndexed)
    println(listOfMapNotNull)

    val map = mapOf(
        1 to "Syahrul",
        2 to "Fahmi"
    )
    val mapKey = map.mapKeys { it.key * 10 }
    val mapValues = map.mapValues { it.value.uppercase()}
    println(mapKey.entries)
    println(mapValues.entries)
}