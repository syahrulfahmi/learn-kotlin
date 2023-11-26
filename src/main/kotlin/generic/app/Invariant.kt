package generic.app

class Invariant<T>(val data: T)

/**
 * secara default generic di kotlin adalah invariant
 * @invariant berarti sebuah parameter type di generic tidak dapat di substitusi
 * dari child type ke super type begitupun sebaliknya.
 * @sample
 * val invariantString = Invariant<String>("invariant")
 * val invariantAny: Invariant<Any> = invariantString
 */
fun main() {
//    val invariantString = Invariant<String>("invariant")
//    val invariantAny: Invariant<Any> = invariantString
}