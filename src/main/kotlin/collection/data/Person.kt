package collection.data

data class Person(val name: String) {
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Person -> name == other.name
            else -> true
        }
    }
}