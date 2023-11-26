import kotlinx.coroutines.*
import org.junit.jupiter.api.Test

class TestJob {
    @OptIn(DelicateCoroutinesApi::class)
    @Test
    fun testJob() = runBlocking {
        val job = GlobalScope.launch(start = CoroutineStart.DEFAULT) {
            delay(1_000)
            println("Coroutine Done: ${Thread.currentThread().name}")
        }

        delay(2_000)
    }
}