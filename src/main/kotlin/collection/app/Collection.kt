package collection.app

/**
 * semua struktur data list di kotlin hampir semua nya merupakan turunan dari
 * @collection kecuali Map
 */

fun <T> displayCollection(collection: Collection<T>) {
    collection.forEach { item -> println(item) }
}

fun main() {
    displayCollection(arrayListOf("Syahrul", "Fahmi"))
    displayCollection(listOf("Syahrul", "Fahmi"))
    displayCollection(setOf("Syahrul", "Fahmi"))
    displayCollection(mapOf("Syahrul" to "Fahmi").entries)
}