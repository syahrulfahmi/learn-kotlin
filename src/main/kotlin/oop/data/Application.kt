package oop.data

class Application(val name: String) {
    /**
     * @companion object adalah kemampuan untuk membuat @inner object dengan tidak mendeklarasikan
     * nama dari object tersebut.
     */
    companion object {
        fun hello(name: String) {
            println("Hello, $name")
        }
    }
}