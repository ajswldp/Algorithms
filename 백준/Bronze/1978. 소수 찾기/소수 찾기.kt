import java.io.*
import java.util.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val input = readLine().split(" ").map { it.toInt() }
    var count = 0
    var arr = IntArray(1000){it+2}
    while(arr.isNotEmpty()) {
        val num = arr[0]
        if(input.contains(num))count++
        arr = arr.filter { it % num != 0 }.toIntArray()
    }
    println(count)
}