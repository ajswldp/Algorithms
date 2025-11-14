import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    val arr = Array(n){readLine().split(" ").map { it.toInt() }}
    val dp = IntArray(k + 1)
    for((w, v) in arr){
        for(j in k downTo w){
            dp[j] = maxOf(dp[j], dp[j - w] + v)
        }
    }
    print(dp[k])
}