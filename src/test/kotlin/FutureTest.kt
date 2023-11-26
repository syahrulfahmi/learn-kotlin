import org.junit.jupiter.api.Test
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import kotlin.system.measureTimeMillis

class FutureTest {
    private val executorService = Executors.newFixedThreadPool(10)
    private fun getFoo(): Int {
        Thread.sleep(1000)
        return 10
    }

    private fun getBar(): Int {
        Thread.sleep(1000)
        return 10
    }

    @Test
    fun testFuture() {
        val time = measureTimeMillis {
            val foo = executorService.submit(Callable { getFoo() })
            val bar = executorService.submit(Callable { getBar() })
            val result = foo.get() + bar.get()
            println("Total: $result")
        }
        println("time: $time")
    }
}