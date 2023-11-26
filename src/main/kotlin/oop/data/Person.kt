package oop.data

/**
 * class adalah cetakan dari objek yang akan dibuat
 */
class Person(
    firstName: String,
    middleName: String,
    lastName: String
) {

    constructor(firstName: String, lastName: String) : this(firstName, "", lastName)
    constructor(firstName: String) : this(firstName, "")

    var firstName = firstName
    var middleName = middleName
    var lastName = lastName
}