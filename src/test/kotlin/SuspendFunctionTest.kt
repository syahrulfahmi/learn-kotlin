import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Test
import java.util.Date

class SuspendFunctionTest {

    private suspend fun helloWorld() {
        println("Hello: ${Date()}")
        delay(2_000)
        println("World: ${Date()}")
    }

    @Test
    fun testSuspendFunction() {
        runBlocking {
            helloWorld()
        }
    }
}