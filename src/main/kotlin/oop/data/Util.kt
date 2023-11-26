package oop.data

/**
 * @singleton object adalah object yang hanya dibuat satu kali
 * pada suatu lifecycle aplikasi.
 *
 * biasanya digunakan sebagai class helper/util dari project aplikasi yang akan dibuat
 */
object Util {
    const val name: String = "Utilities Object"
    fun toUpper(value: String): String = value.uppercase()
}