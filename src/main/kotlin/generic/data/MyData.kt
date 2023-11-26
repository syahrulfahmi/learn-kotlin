package generic.data

class MyData<T, U>(private val firstData: T, private val secondData: U) {

    fun printData() {
        println("Data is ${getData()} and second data is ${getSecondData()}")
    }

    private fun getData(): T {
        return firstData
    }

    private fun getSecondData(): U {
        return secondData
    }
}