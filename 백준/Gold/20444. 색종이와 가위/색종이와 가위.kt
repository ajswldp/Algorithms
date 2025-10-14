import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k) = readLine().split(" ").map { it.toLong() }
    var min = 0L
    var max = n/2
    while (min <= max) {
        val num = (min + max) / 2
        val ans = (num+1) * (n+1 - num)
        if(ans == k){
            print("YES")
            return
        }
        else if(ans >= k) {
            max = num - 1
        }
        else{
            min = num + 1
        }
    }
    print("NO")
}