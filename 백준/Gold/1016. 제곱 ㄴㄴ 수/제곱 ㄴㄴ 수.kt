import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (min, max) = readLine().split(" ").map { it.toLong() }
    val arr = BooleanArray((max-min + 1).toInt()){true}
    for(i in 2..sqrt(max.toDouble()).toInt()){
        val r = i*i.toLong()
        var num = ((r-min%r)%r)
        if(num<0)num += r
        while(arr.size>num){
            arr[num.toInt()] = false
            num += r
        }
    }
    println(arr.count { it })
}