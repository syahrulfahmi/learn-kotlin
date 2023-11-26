package oop

fun main() {
    val gedung = Gedung()
//    print(gedung.name)
    gedung.let {
        println(it.name)
    }

    with(gedung) {
        print(name)
        "asdas"
    }

    val gedung2 = gedung.apply {
        print(this.name)
    }
    print(gedung2.name)

    gedung.run {
        print(this.name)
    }
}

class Gedung {
    var name: String = "Gedung VIX"
    var ruangan: Int = 2
}