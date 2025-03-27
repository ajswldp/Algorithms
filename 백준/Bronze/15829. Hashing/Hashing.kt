
import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val input = readLine()
    var sum = 0L
    for(i in 1 .. input.length){
        sum = (input[input.length-i].code-'a'.code+1+ sum*31)%1234567891
    }
    print(sum)
}