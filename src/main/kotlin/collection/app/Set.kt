package collection.app

import collection.data.Person

fun main() {
    /**
     * @set merupakan struktur data yang berisi sejumlah data unique atau tidak boleh sama dengan data yang lain.
     */
    val set = setOf(Person("Fahmi"), Person("Budi"), Person("Tom"), Person("Budi"))

    println(set.size)

    val mutableSet = set.toMutableSet()
    mutableSet.add(Person("Jery"))
    println(mutableSet)
}