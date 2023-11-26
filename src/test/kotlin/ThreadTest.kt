import kotlinx.coroutines.Runnable
import org.junit.jupiter.api.Test
import java.util.Date
import kotlin.concurrent.thread

class ThreadTest {

    @Test
    fun threadTest() {
        val name = Thread.currentThread().name
        println(name)
    }

    @Test
    fun testNewThread() {
//        val runnable = Runnable {
//
//        }
//        val thread = Thread(runnable)
//        thread.start()
        thread(true) { // membuat thread baru
            println(Date()) // cetak tanggal
            Thread.sleep(2_000) // menunda selama n detik
            println("finish: ${Date()}") // cetak finish date
        }
        Thread.sleep(3_000) // menunda selama >n detik, untuk menunggu thread lain selesai dieksekusi
        println("Selesai") // print selesai
    }

    /**
     * kita dapat membuat berapapun thread dalam satu proses
     */
    @Test
    fun testMultipleThread() {
        val thread1 = Runnable {
            println(Date())
            Thread.sleep(2_000)
            println("finish thread 1: ${Date()}")
        }
        val thread2 = Runnable {
            println(Date())
            Thread.sleep(3_000)
            println("finish thread 2: ${Date()}")
        }
        Thread(thread1).start()
        Thread(thread2).start()
        Thread.sleep(4_000)
        println("Selesai")
    }
}