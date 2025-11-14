import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = IntArray(3)
    for(i in arr.indices) arr[i] = readLine().toInt()
    arr.sort()
    println(arr[1])
}