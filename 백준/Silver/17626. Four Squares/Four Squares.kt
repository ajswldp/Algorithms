import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = IntArray(n+1)
    for(i in 1 .. n){
        arr[i] = arr[i-1] +1
        for(j in 1 .. sqrt(i.toDouble()).toInt()){
            arr[i] = minOf(arr[i],arr[i-j*j] + 1)
        }
    }
    print(arr[n])
}