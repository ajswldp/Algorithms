import java.io.*
import kotlin.math.pow

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val input = readLine()
    var sum = 0L
    for(i in input.indices){
        sum = (sum+(input[i].code-'a'.code+1)* 31.0.pow(i.toDouble()).toLong())%1234567891
    }
    print(sum)
}