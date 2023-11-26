package oop.data

interface Action {
    fun action()
}

fun fireAction(action: Action) {
    action.action()
}