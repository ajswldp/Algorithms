import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    readLine()
    val arr = (readLine()+ " 0").split(" ").map { it.toInt() }
    val k = readLine().toInt()
    val max = arr.filter { it >= k }.min() - k
    val min = k - arr.filter { it <= k }.max()
    if(max == 0) print(0)
    else print(max * min-1)
}