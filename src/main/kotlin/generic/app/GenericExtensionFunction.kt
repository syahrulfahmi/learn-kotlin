package generic.app

class Data<T>(val data: T)

fun Data<String>.print() {
    println(this.data)
}

fun Data<Int>.printInt() {
    println(this.data)
}

fun main() {
    val data = Data("Fahmi")
    val data2 = Data(1)
    data.print()
    data2.printInt()
}