package fundamental

/**
 * inline function adalah kemampuan menduplikasi higher order func
 * pada saat runtime, agar tidak terus membuat objek untuk performance improvement
 */
inline fun hello(name: () -> String): String {
    return "Hallo ${name.invoke()}"
}

fun main() {
    println(hello { "Fahmi" })

    repeat(10) {
        println(hello { "Syahrul" })
    }
}