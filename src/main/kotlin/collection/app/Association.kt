package collection.app

fun main() {
    /**
     * @association adalah operasi perubahan collection menjadi sebuah map
     */

    val list = listOf("Syahrul", "Fahmi")
    val associate = list.associate { Pair(it, it.length) }
    val associateWith = list.associateWith { it.length }
    val associateBy = list.associateBy { it.length }

    println(associate)
    println(associateWith)
    println(associateBy)
}