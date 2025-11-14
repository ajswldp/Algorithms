import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    for(i in 1..n) println(readLine().split(" ").sumOf { it.toLong() })
}