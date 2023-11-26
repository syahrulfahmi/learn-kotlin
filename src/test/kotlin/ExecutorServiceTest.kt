import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import java.util.*
import java.util.concurrent.Executors

class ExecutorServiceTest {

    @Test
    fun testSingleThreadPool() {
        val executorService = Executors.newSingleThreadExecutor()
        repeat(10) {
            val runnable = Runnable {
                Thread.sleep(500)
                println("Thread execute with date: ${Date()}")
            }
            executorService.execute(runnable)
            println("succes input thread to threadpool $it")
        }
        Thread.sleep(6_000)
        println("SELESAI")
    }

    @Test
    fun testFixThreadPool() {
        val executorService = Executors.newFixedThreadPool(3) // n harus berdasarkan kemampuan hardware
        repeat(10) {
            val runnable = Runnable {
                Thread.sleep(1_000)
                println("Thread execute with date: ${Date()}")
            }
            executorService.execute(runnable)
            println("succes input thread to threadpool $it")
        }
        Thread.sleep(10_000)
        println("SELESAI")
    }
}