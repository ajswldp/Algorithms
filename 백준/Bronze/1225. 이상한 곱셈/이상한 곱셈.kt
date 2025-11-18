import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    print(readLine().split(" ").map { it.sumOf { it.code.toLong() - '0'.code }}.reduce { acc, i -> acc * i })
}