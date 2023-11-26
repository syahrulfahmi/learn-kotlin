package generic.app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class LogUser(param: String) : ReadWriteProperty<Any, String> {
    private var userName = param
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        return userName.uppercase()
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        userName = value
    }

}

class UserLog(param: String) {
    var name: String by LogUser(param)
}

fun main() {
    val userLog = UserLog("fahmi")
    println(userLog.name)
    userLog.name = "fahmi diubah"
    println(userLog.name)
}