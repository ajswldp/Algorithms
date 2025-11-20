import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val arr = readLine().split(" ").map { it.toInt() }.toIntArray()
    val m = readLine().toInt()
    var count = m
    for(i in arr.indices){
        var max = i
        for(j in i until min(arr.size, count+i+1)){
            if(arr[max] < arr[j])max = j
        }
        val num = arr[max]
        for(j in max downTo i+1){
            arr[j] = arr[j-1]
        }
        arr[i] = num
        count -= max-i
        if(count == 0)break
    }
    println(arr.joinToString(" "))
}