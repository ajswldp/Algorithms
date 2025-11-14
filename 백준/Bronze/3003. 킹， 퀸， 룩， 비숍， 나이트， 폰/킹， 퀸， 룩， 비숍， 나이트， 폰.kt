import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = arrayOf(1, 1, 2, 2, 2, 8)
    val input = readLine().split(" ").map { it.toInt() }
    print(input.mapIndexed { index, i -> arr[index] - i }.joinToString(" "))
}