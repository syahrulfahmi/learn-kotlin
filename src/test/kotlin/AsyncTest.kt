import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import kotlin.system.measureTimeMillis

class AsyncTest {
    /**
     * [async] akan mengembalikan [Deferred]. dimana [Deferred] merupakan
     * turunan dari [Job] yang mengembalikan suatu nilai. Jika ingin
     * menunggu data dari [Deferred] sampai ada bisa dengan menggunakan method [await]
     */

    private suspend fun getFoo(): Int {
        delay(1000)
        return 10
    }

    private suspend fun getBar(): Int {
        delay(1000)
        return 10
    }

    @Test
    fun testAsync() {
        runBlocking {
            val time = measureTimeMillis {
                val foo = async { getFoo() }
                val bar = async { getBar() }

                val total = foo.await() + bar.await()
                println("total : $total")
            }
            println("time $time")
        }
    }
}