import java.io.*
import java.util.*
import kotlin.math.*
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val input = readLine().split(" ").map(String::toInt)
    var sum = 0L
    if(n == 1){
        println(input.sum()-input.max())
        return
    }
    val arr = ArrayList<Int>()
    arr.add(min(input[0], input[5]))
    arr.add(min(input[1], input[4]))
    arr.add(min(input[2], input[3]))
    sum += arr.sum()*4

    sum += (arr.sum()-arr.max())*((n-2L)*8+4)

    sum += arr.min()*((n-2L)*(n-1)*5-n+2)

    print(sum)
}