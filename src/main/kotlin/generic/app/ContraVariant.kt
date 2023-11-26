package generic.app

/**
 * @contravariant secara sederhananya adalah kebalikan dari
 * @covariant.
 */
class ContraVariant<in T> {
    fun <T> sayHello(param: T) {
        println("Hello. My name is $param")
    }
}

fun main() {
    val contraVariant = ContraVariant<Any>()
    val contraVariantString: ContraVariant<String> = contraVariant
    contraVariantString.sayHello("Fahmi")

}