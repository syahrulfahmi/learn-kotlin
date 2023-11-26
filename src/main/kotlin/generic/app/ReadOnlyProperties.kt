package generic.app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogNames(val data: String) : ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("access property delegation ${property.name} with value $data")
        return data.uppercase()
    }
}

class NameWithLog(param: String) {
    val name: String by LogNames(param)
}

fun main() {
    val data = NameWithLog("fahmi")
    println(data.name)
}