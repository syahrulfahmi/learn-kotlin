package oop.app

import oop.data.ExecutiveCustomer
import oop.data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Syahrul")
    println(premiumCustomer.name)
    println(premiumCustomer.type)

    val executiveCustomer = ExecutiveCustomer("Fahmi", 1_000_000)
    println(executiveCustomer.name)
    println(executiveCustomer.type)
    println(executiveCustomer.balance)
}