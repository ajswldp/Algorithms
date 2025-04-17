import java.io.*

fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = IntArray(n+1)
    println(dp(n, arr))
}
fun dp(n:Int, arr: IntArray) : Int {
    if(n<0)return 0
    if(n==0)return 1
    if(arr[n]==0) arr[n] = (dp(n-2, arr)*2 + dp(n-1, arr))%10007
    return arr[n]
}