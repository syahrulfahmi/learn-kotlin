package generic.app

import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

class LogObservableProperty<T>(data: T) : ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("data before change in property ${property.name} from $oldValue to $newValue")
        return oldValue != newValue
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        super.afterChange(property, oldValue, newValue)
        println("data after change in propery ${property.name} from $oldValue to $newValue")
    }
}

class Car(brand: String) {
    var brand: String by LogObservableProperty(brand)
}

fun main() {
    val car = Car("Honda")
    println(car.brand)
    car.brand = "Wuling"
    println(car.brand)
}