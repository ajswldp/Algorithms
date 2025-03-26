import java.io.*
import java.util.*
fun main()  = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, k) = readLine().split(" ").map { it.toInt() }
    println(f(n, k)/f(k, k))
}
fun f(num: Int, k: Int): Int {
    if (k == 0) return 1
    return f(num-1, k - 1)*num
}