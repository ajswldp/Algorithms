import java.io.*
import java.util.*
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val num = readLine()
        if(num.toInt() == 0) break
        println(if(num == num.reversed())"yes" else "no")
    }
}