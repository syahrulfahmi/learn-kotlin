import kotlinx.coroutines.*
import org.junit.jupiter.api.Test
import java.util.Date
import kotlin.concurrent.thread

class CoroutineTest {

    private suspend fun hello() {
        delay(1_000)
        println("Hello world")
    }

    @OptIn(DelicateCoroutinesApi::class)
    @Test
    fun testCoroutine() {
        GlobalScope.launch {
            hello()
        }
        runBlocking {
            delay(1_500)
        }
        println("SELESAI")
    }

    @Test
    fun testThread() {
        repeat(10_000) {
            thread {
                Thread.sleep(1_000)
                println("Done: $it : ${Date()}")
            }
        }
        Thread.sleep(5_000)
        println("SELESAI")
    }

    @OptIn(DelicateCoroutinesApi::class)
    @Test
    fun testCoroutineMany() {
        repeat(100_000) {
            GlobalScope.launch {
                delay(1_000)
                println("Done: $it : ${Date()} ${Thread.currentThread().name}")
            }
        }
        runBlocking { delay(2_000) }
        println("SELESAI")
    }
}