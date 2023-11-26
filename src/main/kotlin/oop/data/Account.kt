package oop.data

import kotlin.properties.Delegates

class Account(var description: String = "") {
    /**
     * [lazy] properties adalah kemampuan di kotlin agar suatu properties
     * diinisialisasikan hanya pada saat dipanggil.
     */
    val name: String by lazy {
        println("lazy name is called")
        "fahmi"
    }

    /**
     * [observable] properties adalah kemampuan untuk mengamati perubahan sebelum dan sesudah
     * suatu property diinisialisasi nilainya.
     */
    var desc: String by Delegates.observable(description) { property, oldValue, newValue ->
        println("${property.name} is change from $oldValue to $newValue")
    }
}