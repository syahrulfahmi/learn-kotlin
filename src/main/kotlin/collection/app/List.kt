package collection.app

fun main() {
    /**
     * @list merupakan struktur data yang berisikan sejumlah data
     * dan bisa memiliki data duplikat. secara default list merupakan tipe data immutable
     */
    val list = listOf("Syahrul", "Fahmi", "Budi")
    println(list)
    println(list[0])
    println(list.size)
    println(list.contains("Budi"))
    println(list.indexOf("Syahrul"))

    val mutableList = list.toMutableList()
    mutableList.add("Tom")
    mutableList[0] = "Syahrul ubah"
    mutableList.remove("Budi")
    println(mutableList)
}