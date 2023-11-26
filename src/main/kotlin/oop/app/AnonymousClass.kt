package oop.app

import oop.data.Action
import oop.data.fireAction

fun main() {
    /**
     * @anonymous class adalah kemampuan untuk membuat objek dari pendeklarasian yang belum lengkap
     * seperti @interface atau @abstract class
     */
    fireAction(object : Action {
        override fun action() {
            println("fire action")
        }
    })
}