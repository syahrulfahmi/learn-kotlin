package oop.data

open class Customer(val name: String, val type: String, val balance: Long) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String) : this(name, "standard", 0)
}

class PremiumCustomer : Customer {
    constructor(name: String, type: String) : super(name, type, 0)
    constructor(name: String) : super(name, "premium", 0)
}

class ExecutiveCustomer(name: String, balance: Long) : Customer(name, "executive", balance) {
    constructor(name: String) : this(name, 0)
}
