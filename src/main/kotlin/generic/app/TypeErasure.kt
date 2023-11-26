package generic.app

/**
 * @TypeErasure adalah proses pengecekan generic pada saat kompilasi kode.
 * @TypeErasure menjadikan informasi generic yg dibuat hilang dan digantikan oleh
 * object Any atau (Object kalo dijava).
 *
 * @RISK:
 * tidak direkomendasikan untuk melakukan konversi tipe generic
 * karena informasi generic nya hilang, ini akan berbahaya jika tidak
 * dilakukan dengan bijak
 */

class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T {
        return data
    }
}

fun main() {
    val typeErasure = TypeErasure("Fahmi")
    val data = typeErasure.getData()
    val a = 1 compareTo 2
    println(data)
}