import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    println((2.0.pow(n)-1).toInt())
    val sb = StringBuilder()
    f(n, 1, 3, sb)
    print(sb)
}
fun f(board: Int, a: Int, b: Int, sb: StringBuilder){
    if(board == 1) sb.append("$a $b\n")
    else {
        f(board - 1, a, 6 - a - b, sb)
        sb.append("$a $b\n")
        f(board - 1, 6 - a - b, b, sb)
    }
}
