package collection.app

/**
 * @iterable adalah super type dari collection
 * @iterable merupakan operasi general ketika melakukan iterasi pada seluruh data collection
 */

fun <T> displayIterable(iterable: Iterable<T>) {
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}
fun main() {
    displayIterable(listOf("Syahrul", "Fahmi"))
    displayIterable(arrayListOf("Syahrul", "Fahmi"))
    displayIterable(setOf("Syahrul", "Fahmi"))
}