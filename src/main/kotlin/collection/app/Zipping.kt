package collection.app

fun main() {
    /**
     * @zip adalah operasi untuk menggabungkan data dari dua list berbeda
     */
    val list1 = listOf("Syahrul", "Fahmi", "Budi")
    val list2 = listOf("Tom", "Jerry")
    val zipList = list1.zip(list2)
    val zipList2 = list1.zip(list2) { item1, item2 -> "$item1 $item2" }
    println(zipList)
    println(zipList2)

    /**
     * @unzip adalah kebalikan dari operasi zip
     */
    val listOfPair = listOf(
        "Syahrul" to "Tom",
        "Jerry" to "Fahmi"
    )
    val unzipList = listOfPair.unzip()
    val (unzipList1, unzipList2) = unzipList
    println(listOfPair)
    println(unzipList)
    println(unzipList1)
    println(unzipList2)
}